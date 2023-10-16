import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Soruda sadece okuma tarafıyla ilgili ipuçları verildiği için yazdırma işlemlerimi yorum satırına aldım.
        /*int num1 =Integer.parseInt("5");
        int num2 = Integer.parseInt("10");
        int num3 = Integer.parseInt("20");
        int num4 = Integer.parseInt("12");
        int num5 = Integer.parseInt("33");

        String s = "Patika Pratik";*/
        File file = new File("Patika Pratik.txt");
        /*if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        FileWriter fWriter = new FileWriter(file, false);
        BufferedWriter bWriter = new BufferedWriter(fWriter);

        bWriter.write(String.valueOf(num1)); bWriter.newLine();
        bWriter.write(String.valueOf(num2));bWriter.newLine();
        bWriter.write(String.valueOf(num3));bWriter.newLine();
        bWriter.write(String.valueOf(num4));bWriter.newLine();
        bWriter.write(String.valueOf(num5));bWriter.newLine();
       // bWriter.write("Toplam =" +String.valueOf(total));bWriter.newLine();
        bWriter.close();*/
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        int total=0;
        while ((line=bufferedReader.readLine())!=null){ //döngü oluştuldu her döndüğünde alt satırdaki değer toplama eklenecek.

            total=total+Integer.parseInt(line);
        }
        bufferedReader.close();
        System.out.println(total); //çıktı=80.

    }


}




