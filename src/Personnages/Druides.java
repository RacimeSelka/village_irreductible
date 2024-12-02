package Personnages;
import java.util.Random;


public class Druides {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	public int forcePotion =1;

	public int getForcePotion() {
		return forcePotion;
	}

	public Druides(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "
				+ effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	public void preparerPotion() {
		Random random=new Random();
		
		forcePotion=random.nextInt(effetPotionMax-effetPotionMin+1)+effetPotionMin;
		 
			
		
		if (forcePotion>7) {
			parler("J'ai préparé une super potion de force "+forcePotion);
		} else {
			parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force "+forcePotion);
		}
		
	}
	public void booster(Gaulois gauloi) {
		
		if (gauloi.getNom()=="Obélix") {
			parler("Non, Obélix !... Tu n’auras pas de potion magique !");
		} else {
			gauloi.boirePotion(forcePotion);
		}
	}
	
	
		
	
	
}
