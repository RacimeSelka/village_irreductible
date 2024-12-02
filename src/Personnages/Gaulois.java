package Personnages;




public class Gaulois {
	private String nom;
	private int effetPotion=1;
	private int force;
	private int nbTrophees;
    private Equipement[] trophees = new Equipement[100];
	
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
        return "Le gaulois " + nom + " : ";
        
        
}
	
	
	
	
//	public void frapper(Romain romain) {
//		System.out.println(nom+" donne un grand coup dans la machoire de "+romain.getNom());
//		romain.recevoirCoup(force / 3*effetPotion );
//	}
	
	
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		trophees = romain.recevoirCoup((force / 3) *effetPotion);
		for (int i = 0; trophees != null && i < nbTrophees; i++,nbTrophees++) {
			this.trophees[nbTrophees] = trophees[i];
		}
		
	}
	
	
	public void faireUneDonnation(Musee musee) {
		parler("Je donne au musee tous mes trophees");
		for (int i = 0; i < nbTrophees; i++) {
			System.out.println("aa");
			System.out.println(trophees[i]);
			musee.donnerTrophee(this,trophees[i]);
		}
	}
	
	
	
	
	
	
	

	public void boirePotion(int forcePotion) {
		effetPotion=forcePotion;
		parler("merci druide je sens que ma force est "+effetPotion+" fois decuplée");
	}
	
	
	
}


