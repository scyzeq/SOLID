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
public class Kelner implements Zamowienie{

    @Override
    public void podaj(Object zupa) {
        System.out.println("Podaj do stolu " + zupa);
    }

    @Override
    public void setAdres(String adres) {
        
    }

    @Override
    public void nakryjStol() {
        System.out.println("Nakryj stól");
    }

    @Override
    public void zbierzNaczynia() {
        System.out.println("Zbierz naczynia");
    }
    
}
