package Personnages;

public class Musee {
	private Trophee[] trophees=new Trophee[200];
	private int nbTrophee;
	public void donnerTrophee(Gaulois gauloi,Equipement equipement) {
		new Trophee(gauloi,equipement);
		nbTrophee+=1;
	}
	
	public String[] extraireInstructionsOCaml() {
		String[] liste= new String[400];
		for (int i = 0; i < nbTrophee; i++) {
			liste[i]=trophees[i].donnerNom();
			liste[i+1]=trophees[i].getEquipement().nom;
		}
		return liste;
	}
}
