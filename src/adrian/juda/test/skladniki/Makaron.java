package adrian.juda.test.skladniki;

public class Makaron implements Skladnik{
    
    @Override
    public String toString() {
            return "makaron";
    }

    public void gotuj() {
            System.out.println("Gotowanie makaronu");
    }
    
    @Override
    public void doZrobienia() {
        gotuj();
    }
	
}
