import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {//mysql bağlantısı için gerekli olan url,username ve password bilgisi sabit olarak set edildi.
    public static final String DB_URL = "jdbc:mysql://localhost/employees";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        Connection connect = null;
        try {
            // db bağlantısı yapıldı.
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            // query çalıştırıldı ve Resultset nesnesine atandı.
            ResultSet result = connect.createStatement().executeQuery("select * from employees");
            // while döngüsü ile dbden okunan bilgiler print edildi.
            while (result.next()) {

                System.out.println("ID : " + result.getInt("employees_id"));
                System.out.println("Name : " + result.getString("employees_name"));
                System.out.println("Position : " + result.getString("employees_position"));
                System.out.println("Salary : " + result.getString("employees_salary") + " TL");
                System.out.println("********************************");

            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
