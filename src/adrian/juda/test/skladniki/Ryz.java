/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adrian.juda.test.skladniki;

/**
 *
 * @author lab
 */
public class Ryz implements Skladnik{

    @Override
    public String toString() {
        return "ryz";
    }

    public void gotuj() {
        System.out.println("Gotowanie ryzu");
    }
    
    @Override
    public void doZrobienia() {
        gotuj();
    }
    
}
