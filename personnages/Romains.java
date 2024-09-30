package personnages;



public class Romains {
	private String nom;
	private int nbEquipement=0;
	private equipement[] Equipement=new equipement[2];
	
	private int force;

	public Romains(String nom, int force) {
		this.nom = nom;
		assert force>0;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}

	private String prendreParole() {

		return "le romain " + nom + ":";
	}

	public void recevoirCoup(int forceCoup) {
		assert force>0;
		int nvForce=force;
		force -= forceCoup;
		if (force > 0) {
			parler("aie");
		} else {
			parler("j'abandonne...");
		}
		assert force<nvForce;
	}
	private void rep(equipement nvequipement) {
		Equipement[nbEquipement]=nvequipement;
	    nbEquipement+=1;
	}
	public void sEquiper(equipement nvequipement) {
		
		switch (nbEquipement) {
	
		case 2:
			System.out.println("Le soldat "+nom+" est déjà bien protégé !");
			break;
		case 1:
			if (Equipement[0]==nvequipement) {
				System.out.println("le soldat "+nom+" possede deja un "+nvequipement);
			}else {
				rep(nvequipement);
			}
			break;
		case 0:
			rep(nvequipement);
			break;

		default:
			break;
		}
	}
	
	public static void main(String[] args) {
		Romains minus=new Romains("minus",6);
		minus.sEquiper(equipement.CASQUE);
		
		minus.sEquiper(equipement.BOUCLIER);
		minus.sEquiper(equipement.CASQUE);
		
		
		
		
	}
	

}
