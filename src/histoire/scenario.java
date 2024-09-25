package histoire;

import personnages.Druides;
import personnages.Gaulois;
import personnages.Romains;

public class scenario {

	public static void main(String[] args) {
		
		Gaulois asterix=new Gaulois("Asterix",8);
		Gaulois obelix=new Gaulois("Obelix",25);
		Romains minus=new Romains("minus",6);
		Druides panoramix=new Druides("panoramix",5,10);
		panoramix.parler("je vais aller preparer une petite potion...");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("par belenos ce n'est pas juste");
		panoramix.booster(asterix);
		asterix.parler("bonjour");
		minus.parler("UN GAU...UN GAUGAU...");
		asterix.frapper(minus);
		
		
		
		
		
		
		
		
		
		
		

	}

}
