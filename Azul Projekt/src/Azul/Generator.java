package Azul;

import java.util.Random;

public class Generator {

	int maxColor = 20;
	
	public Fließen[] erzeugeFließen()		//Methode, erzeugt fließen, kein void weil ich etwas zurückgebe
	{
		Fließen[] liste = new Fließen[100];

		int Rot = 0;
		int Blau = 0;
		int Gelb = 0;
		int Schwarz = 0;
		int Weiss = 0;
		Random r = new Random();
		
		for(int i = 0; i < liste.length; i++)
		{
			int farbe = r.nextInt(5);		//zufallszahl zwischen 0-4 um schon vorab zu mischen
			if(farbe == 0 && Weiss < 20)
			{
				liste[i] = new Fließen(Fließen.Farbe.Weiss);
				Weiss++;			
			}
			else if(farbe == 1 && Blau < 20)
			{
				liste[i] = new Fließen(Fließen.Farbe.Blau);
				Blau++;				
			}
			else if(farbe == 2 && Gelb < 20)
			{
				liste[i] = new Fließen(Fließen.Farbe.Gelb);
				Gelb++;				
			}
			else if(farbe == 3 && Schwarz < 20)
			{
				liste[i] = new Fließen(Fließen.Farbe.Schwarz);
				Schwarz++;				
			}
			else if(farbe == 4 && Rot < 20)
			{
				liste[i] = new Fließen(Fließen.Farbe.Rot);
				Rot++;				
			}
			else
			{
				i--;
			}
		}
	
		
		
		System.out.println(Gelb);
		System.out.println(Weiss);
		System.out.println(Rot);
		System.out.println(Blau);
		System.out.println(Schwarz);
		
		
		
		
		
		return liste;
	}
}
