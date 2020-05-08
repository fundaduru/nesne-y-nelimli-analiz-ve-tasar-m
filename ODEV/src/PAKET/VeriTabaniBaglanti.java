/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAKET;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Funda DURU
 */
public class VeriTabaniBaglanti implements InterfaceObserver{
    @Override
    public void update()
    {
        JOptionPane.showMessageDialog(null,"Üyeliğiniz onaylanmıştır.");
    }
    
    Connection con=null;
    public void close() {
         try{
              con.close();
         }
         catch(Exception e){}
    }
    public VeriTabaniBaglanti(){
     try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/nyatOdev", "postgres", " ");
            System.out.println("Bağlantı başarılı.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void yetkisiVarmi(YetkiliKisi yetKisi) throws SQLException 
    {
        Statement statement = con.createStatement();
        String komut = "select * from yetkilikisi";
        ResultSet result =  statement.executeQuery(komut);
        while (result.next()) {
            String ad = result.getString("ad");
            String parola = result.getString("parola");
           if(ad.equals(yetKisi.getAd()) && parola.equals(yetKisi.getParola()))
           {
               update();
               MENU menu = new MENU();
               GIRIS giris = new GIRIS();
               giris.setVisible(false);
               menu.setVisible(true);
               
           }
            else
            {
                JOptionPane.showMessageDialog(null,"Ad veya parola hatalı.");
            }
        }
        
    }
        
}
