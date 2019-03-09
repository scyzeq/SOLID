package adrian.juda.test;

import adrian.juda.test.podanie.Kelner;
import adrian.juda.test.podanie.Kurier;
import adrian.juda.test.skladniki.Makaron;
import adrian.juda.test.skladniki.Marchewka;
import adrian.juda.test.skladniki.Ryz;
import adrian.juda.test.zupa.Pomidorowa;
import adrian.juda.test.zupa.Rosol;

public class Test {
public static void main(String[] args) {
//	przygotujZupe();
//        przygotujZupePomidorowaZRyzemNaWynos();
        przygotujZupePomidorowaZMakaronem();
}
public static void przygotujZupe() {	
	Rosol rosol = new Rosol();
	rosol.dodaj(new Marchewka());
	rosol.dodaj(new Makaron());
	rosol.przygotuj();
	rosol.podaj();
        System.out.println("*********************************************");
        Kelner naMiejscu = new Kelner();
        Kurier naWynos = new Kurier();
        System.out.println("*********************************************");
        naMiejscu.podaj(rosol);
        naWynos.setAdres("XY Street");
        naWynos.podaj(rosol);
}

public static void przygotujZupePomidorowaZRyzemNaWynos()
{
    Pomidorowa pomidorowa = new Pomidorowa();
    pomidorowa.dodaj(new Ryz());
    pomidorowa.przygotuj();
    Kurier naWynos = new Kurier();
    naWynos.setAdres("XY Street");
    naWynos.podaj(pomidorowa);
}

public static void przygotujZupePomidorowaZMakaronem()
{
    Pomidorowa pomidorowa = new Pomidorowa();
    pomidorowa.dodaj(new Makaron());
    pomidorowa.przygotuj();
    Kelner naMiejscu = new Kelner();
    naMiejscu.podaj(pomidorowa);
}
}
