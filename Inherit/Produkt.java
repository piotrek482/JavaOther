
public class Produkt 
{
	protected double cena;
	protected int rok;
	
	public Produkt()
	{
		this(2499.99, 12);
	}
	
	public Produkt(double _cena, int _rok)
	{
		cena = _cena;
		rok = _rok;		
	}
	
	public String toString()
	{
		return "Nazwa: " + getClass().getName() + ", cena to: " + cena + ", rok to: " + rok;
	}

	public static void main(String[] args) 
	{
		Produkt p = new Produkt(500, 11);
		System.out.println(p);

	}

}
