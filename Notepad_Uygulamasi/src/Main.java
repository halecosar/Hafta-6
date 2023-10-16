
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String s = "Notlar.txt";
        File file = new File(s);

        if (!file.exists()) {
            try {
                file.createNewFile(); //dosya daha önce eklenmediyse dosya oluşturuldu.
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println();
            System.out.println(s + " Dosyası Açıldı.");
            fileReader(file); // dosya daha önce oluşturulmuşsa direkt okuma metodu çağırıldı.
        }

        fileWriter(file); // dosya yazma işlemlerini yapan metot çağırıldı.
    }

    public static void fileReader(File file) throws IOException {
        FileReader fileReader = null;
        String line;

        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);

        }
        bufferedReader.close();
        System.out.println();
    }

    public static void fileWriter(File file) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("===Lütfen Metin Giriniz===");
        System.out.println("===========================");
        String text = scan.nextLine();

        FileWriter fWriter = new FileWriter(file, true);
        BufferedWriter bWriter = new BufferedWriter(fWriter);

        bWriter.write(text);
        bWriter.newLine();
        bWriter.close();
    }
}



