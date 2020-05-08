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
public class SogutucuDurum {
    private boolean fonk;
    SogutucuDurum()
    {
        fonk=false;
    }
    public void sogutucuyuAc()
    {
        fonk=true;
    }
    public void sogutucuyuKapat()
    {
        fonk=false;
    }
    public boolean getDurum()
    {
        return fonk;
    }
}
