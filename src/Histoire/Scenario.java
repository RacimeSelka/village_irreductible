package Histoire;

import Personnages.*;


public class Scenario {

	public static void main(String[] args) {
		
		Gaulois asterix = new Gaulois("Astérix", 8);
		Musee musee = new Musee();
		asterix.faireUneDonnation(musee);

	}

}