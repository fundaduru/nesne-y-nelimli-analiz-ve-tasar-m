/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAKET;

/**
 *
 * @author Funda DURU
 */
public class YetkiliKisi{
    private String ad;
    private String parola;
    private int id;
    
    SogutucuDurum durum=new SogutucuDurum();
    
    YetkiliKisi()
    {
        ad="";
        parola="";
        id=0;
    }
   
    public SogutucuDurum getSogutucu()
    {
        return durum;
    }
    
   
    public void setAd(String kullaniciAdi)
    {
        this.ad=kullaniciAdi;
    }

    public String getAd()
    {
        return ad;
    }

    public void setParola(String parola)
    {
        this.parola=parola;
    }
    public String getParola()
    {
        return parola;
    }
}
