package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion=1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}

	private String prendreParole() {

		return "le gaulois " + nom + ":";
	}
	public void frapper(Romains romain) {
		System.out.println(nom+" donne un grand coup dans la machoire de "+romain.getNom());
		romain.recevoirCoup(force / 3*effetPotion );
	}
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	public void boirePotion(int forcePotion) {
		effetPotion=forcePotion;
		parler("merci druide je sens que ma force est "+effetPotion+" fois decuplée");
	}
	
	
	
}


