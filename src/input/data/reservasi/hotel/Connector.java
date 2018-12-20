/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input.data.reservasi.hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ALAN
 */
public class Connector {
    static Connection con;
    
    public static Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tugas_besar_pbo", "root", "");
        }
        catch(Exception e) {
            System.out.println("Koneksi gagal!");
        }
        return con;
    }
}