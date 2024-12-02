package Personnages;


public class Village {
private String nom;

private Chef chef;
private int nbVillageois =0;
private Gaulois[] villageois;
	

	public Village(String nom,int nbVillageoisMax) {
		this.nom = nom;
		villageois=new Gaulois[nbVillageoisMax];
	}


	public String getNom() {
		return nom;
	}


	public void setChef(Chef chef) {
		this.chef = chef;
		
	}
	public void ajouterHabitant(Gaulois gauloi) {
		villageois[nbVillageois] = gauloi;
		nbVillageois+=1;
		
		
	}
	public Gaulois trouverHabitant(int nbHabitant) {
		return villageois[nbHabitant];
		
	}
	public void afficherVillageois() {
		
		System.out.println("dans le village du chef "+chef.getNom()+" vivent les legendaire gaulois:\n");
		for (int i = 0; i <nbVillageois ; i++) {
			System.out.println("- "+villageois[i].getNom());
		}
	}
	
	public static void main(String[] args) {
		Village village=new Village("Village des Irréductibles",30);
		
		Chef abraracourcix=new Chef("abraracourcix",6,village);
		village.setChef(abraracourcix);
		
		Gaulois asterix=new Gaulois("asterix",8);
		village.ajouterHabitant(asterix);
		Gaulois obelix=new Gaulois("obelix",25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
		
		
		
		
		
	}
	
	
	
	
}
