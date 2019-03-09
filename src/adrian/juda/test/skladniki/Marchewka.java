package adrian.juda.test.skladniki;

public class Marchewka implements Skladnik{
        
    public String toString() {
            return "marchewka";
    }
    public void obierz() {
            System.out.println("Obieranie marchewki");
    }
    public void pokroj() {
            System.out.println("Krojenie marchewki");
    }
    @Override
    public void doZrobienia() {
        obierz();
        pokroj();
    }
}
