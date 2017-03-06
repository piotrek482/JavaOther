
public class Smartfon extends Telefon
{
	protected double przek�tna;
	
	public Smartfon()
	{
		this(5.0);
	}
	
	public Smartfon(double p)
	{
		this("Samsung", "GalaxyS5", 249.99, 12, p);
		//wa�na jest kolejno��, je�eli zmienna p w konstruktorze by�a na ko�cu,
		//to tu te� musi byc na ko�cu!
	}
	
	public Smartfon(String _nazwa_firmy, String _nazwa_w�asna, double _cena, int _rok, double p)
	{
		super(_nazwa_firmy, _nazwa_w�asna, _cena, _rok);
		przek�tna = p;
	}
	
	public String toString()
	{
		return "Nazwa: " + getClass().getName() + ", nazwa firmy: " + nazwa_firmy + ", nazwa w�asna to: " + nazwa_w�asna + ", cena to: " + cena + ", rok to: " + rok + ", przek�tna to: " + przek�tna;
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
