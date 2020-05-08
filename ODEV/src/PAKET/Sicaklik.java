/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAKET;

import java.util.Random;
import javax.swing.JOptionPane;


/**
 *
 * @author Funda DURU
 */
public class Sicaklik implements InterfaceSicaklik{
    private static Sicaklik sicaklik;
    private double sicaklikDeger;
    Random rastgele=new Random();
    private Sicaklik()
    {
        sicaklikDeger =rastgele.nextInt(20)+10;
    }
    
    /*public void setSicaklikDeger()
    {
        sicaklikDeger =rastgele.nextInt(20)+10;
    }*/
    public static Sicaklik getSicaklik()
    {
        if(sicaklik==null)
            sicaklik=new Sicaklik();
        return sicaklik;
    }
    
    
    public void sicaklikUret()
    {
        JOptionPane.showMessageDialog(null,"Sıcaklık: "+sicaklikDeger+" °C");
    }
}
