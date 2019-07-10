package Azul;


public class Flieﬂen {

	public static enum Farbe{
		Rot,
		Blau,
		Gelb,
		Schwarz,
		Weiss,
		sack
		
	}

	public Farbe farbe;
	
	public Flieﬂen(Farbe neueFarbe){
		farbe = neueFarbe;
	
		 
	}
	
	
	public String getPathToImage()
	{
		if(this.farbe == Farbe.Rot)
			return "H:\\Users\\Admin\\eclipse-workspace\\Azul mit Spielbrett\\Texturen\\texturestein rot 40x40.PNG";
		else if(this.farbe == Farbe.Blau)
			return "H:\\Users\\Admin\\eclipse-workspace\\Azul mit Spielbrett\\Texturen\\texturestein blau 40x40.PNG";
		else if(this.farbe == Farbe.Gelb)
			return "H:\\Users\\Admin\\eclipse-workspace\\Azul mit Spielbrett\\Texturen\\texturestein gelb 40x40.PNG";
		else if(this.farbe == Farbe.Schwarz)
			return "H:\\Users\\Admin\\eclipse-workspace\\Azul mit Spielbrett\\Texturen\\texturestein schwarz 40x40.PNG";
		else
			return "H:\\Users\\Admin\\eclipse-workspace\\Azul mit Spielbrett\\Texturen\\texturestein weiss 40x40.PNG";
	}
}
