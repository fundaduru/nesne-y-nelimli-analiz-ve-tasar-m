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
public class YuksekSicaklik implements InterfaceSicaklik{
    private double sicaklik;
    Random rastgele=new Random();
    YuksekSicaklik()
    {
        sicaklik =rastgele.nextInt(20)+10;
    }
    public void sicaklikUret()
    {
        if(sicaklik>20)
            JOptionPane.showMessageDialog(null,"Sıcaklık: "+sicaklik+" °C (Sıcaklık 20 derecenin üstünde lütfen soğutucuyu açınız.)");
        else
            JOptionPane.showMessageDialog(null,"Sıcaklık: "+sicaklik+" °C");
    }
}
