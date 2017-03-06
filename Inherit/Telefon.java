
public class Telefon extends Produkt
{
	protected String nazwa_firmy;
	protected String nazwa_w³asna;
	
	public Telefon()
	{
		this("Nokia", "E52");
	}
	
	public Telefon(String _nazwa_firmy, String _nazwa_w³asna)
	{
		this(_nazwa_firmy, _nazwa_w³asna, 2499.99, 12);
	}
	
	public Telefon(String _nazwa_firmy, String _nazwa_w³asna, double _cena, int _rok)
	{
		super(_cena, _rok);
		nazwa_firmy = _nazwa_firmy;
		nazwa_w³asna = _nazwa_w³asna;
	}
	
	public String toString()
	{
		return "Nazwa: " + getClass().getName() + ", nazwa firmy: " + nazwa_firmy + ", nazwa w³asna to: " + nazwa_w³asna + ", cena to: " + cena + ", rok to: " + rok;
	
	}

	public static void main(String[] args) 
	{
		Telefon t = new Telefon("Nokia", "dupa");
		System.out.println(t);

	}

}
