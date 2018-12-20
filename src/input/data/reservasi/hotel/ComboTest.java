/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input.data.reservasi.hotel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author ALDO
 */
public class ComboTest {
    public void ComboExample() {
        final JComboBox comboRoom = new JComboBox();
        
        try {
            Connection con = Connector.getConnection();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from kamar");
            
            while (rs.next()) {
                String name = rs.getString("tipe_kamar");
                if (name.equals("")) {
                    comboRoom.addItem("");
                    comboRoom.setVisible(false);
                }
                else {
                    comboRoom.addItem(rs.getString("tipe_kamar"));
                    System.out.println(rs.getString("tipe_kamar"));
                    comboRoom.setVisible(true);
                }
            }
            
        }
        catch(Exception e) {
            System.out.println("asdqweasd");
        }
    }
}
