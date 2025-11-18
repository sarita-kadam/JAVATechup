package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class CREATETable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String url = "jdbc:postgresql://localhost:5432/postgres";
        String username = "postgres";
        String password = "root";

        System.out.println("Enter District Name: ");
        String dist_name = sc.next();

        System.out.println("Enter Population: ");
        int population = sc.nextInt();

        System.out.println("Enter Sub District No: ");
        int sub_dist = sc.nextInt();

        String sql = "INSERT INTO MAHARASHTRA (DIST_NAME,POPULATION,SUB_DIST_NO) VALUES (? ? ?)";

        try{

            Class.forName("org.postgresql.Driver");

            Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","root");

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1,dist_name);
            ps.setInt(2,population);
            ps.setInt(3,sub_dist);

            int row = ps.executeUpdate();
            if (row > 0) {
                System.out.println("Data inserted successfully ! ");
            }

            con.close();


        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}

