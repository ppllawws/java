package test;

import java.sql.*;

public class main {
    public static void main(String[] args) {
        try {
            // подключаю драйвер
            Class.forName("com.mysql.cj.jdbc.Driver");

            // подключаю бд
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bi242", "root", "2dT#k9H!mQvL7pZ&bR1aWf");

            //  SQL-запрос на вывод бд
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("show databases;");

            // вывод
            System.out.println("Соединено");

        } catch (Exception e) {
            System.out.println(e); // чтобы выводилась диагностика ошибки
        }
    }
}

