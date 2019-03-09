/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adrian.juda.test.podanie;

/**
 *
 * @author lab
 */
public class Kurier implements Zamowienie{

    private String adres;
    
    @Override
    public void podaj(Object zupa) {
        System.out.println("Zanieś " + zupa + " \nna adres: " + adres);
    }

    @Override
    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override
    public void nakryjStol() {
        
    }

    @Override
    public void zbierzNaczynia() {
        
    }
}
