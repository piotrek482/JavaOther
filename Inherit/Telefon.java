
public class Telefon extends Produkt
{
	protected String nazwa_firmy;
	protected String nazwa_w�asna;
	
	public Telefon()
	{
		this("Nokia", "E52");
	}
	
	public Telefon(String _nazwa_firmy, String _nazwa_w�asna)
	{
		this(_nazwa_firmy, _nazwa_w�asna, 2499.99, 12);
	}
	
	public Telefon(String _nazwa_firmy, String _nazwa_w�asna, double _cena, int _rok)
	{
		super(_cena, _rok);
		nazwa_firmy = _nazwa_firmy;
		nazwa_w�asna = _nazwa_w�asna;
	}
	
	public String toString()
	{
		return "Nazwa: " + getClass().getName() + ", nazwa firmy: " + nazwa_firmy + ", nazwa w�asna to: " + nazwa_w�asna + ", cena to: " + cena + ", rok to: " + rok;
	
	}

	public static void main(String[] args) 
	{
		Telefon t = new Telefon("Nokia", "dupa");
		System.out.println(t);

	}

}
