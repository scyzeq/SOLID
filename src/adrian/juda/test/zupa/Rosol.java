/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adrian.juda.test.zupa;

import adrian.juda.test.skladniki.Makaron;
import adrian.juda.test.skladniki.Marchewka;
import adrian.juda.test.skladniki.Ryz;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lab
 */
public class Rosol implements Zupa{
    
    private List<Object> skladniki = new ArrayList<>();
    
    @Override
    public void przygotuj() {
        System.out.println("Przygotowanie zupy ze skladnikow: "+skladniki);
        System.out.println("Nalewam wody do garnka");
        System.out.println("Wrzucam kostke rosolowa");
        for(Object skladnik:skladniki) {
            if(skladnik instanceof Marchewka) {
                    Marchewka marchewka = (Marchewka)skladnik;
                    marchewka.doZrobienia();
            }
            if(skladnik instanceof Makaron) {
                    Makaron makaron = (Makaron)skladnik;
                    makaron.doZrobienia();
            }
            if(skladnik instanceof Ryz) {
                    Ryz ryz = (Ryz)skladnik;
                    ryz.doZrobienia();
            }
        }
    }
        
    @Override
    public void dodaj(Object skladnik)
    {
        skladniki.add(skladnik);
    }

    @Override
    public String toString() {
        return "rosol";
    }
    
    public void podaj() {
            System.out.println("Podaj rosol do stolu");
    }
}
