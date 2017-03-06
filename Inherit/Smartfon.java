
public class Smartfon extends Telefon
{
	protected double przek¹tna;
	
	public Smartfon()
	{
		this(5.0);
	}
	
	public Smartfon(double p)
	{
		this("Samsung", "GalaxyS5", 249.99, 12, p);
		//wa¿na jest kolejnoœæ, je¿eli zmienna p w konstruktorze by³a na koñcu,
		//to tu te¿ musi byc na koñcu!
	}
	
	public Smartfon(String _nazwa_firmy, String _nazwa_w³asna, double _cena, int _rok, double p)
	{
		super(_nazwa_firmy, _nazwa_w³asna, _cena, _rok);
		przek¹tna = p;
	}
	
	public String toString()
	{
		return "Nazwa: " + getClass().getName() + ", nazwa firmy: " + nazwa_firmy + ", nazwa w³asna to: " + nazwa_w³asna + ", cena to: " + cena + ", rok to: " + rok + ", przek¹tna to: " + przek¹tna;
	}

	public static void main(String[] args) 
	{
		Smartfon s = new Smartfon();
		System.out.println(s);
		
		System.out.println();
		
		Smartfon ss = new Smartfon(70);
		System.out.println(ss);
		
		System.out.println();
		
		Smartfon sss = new Smartfon("Dupcia", "Biskupcia", 11, 343, 9494);
		System.out.println(sss);
		
	}

}
