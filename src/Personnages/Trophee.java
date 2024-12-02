package Personnages;

public class Trophee {
	private Gaulois gauloi;
	private Equipement equipement;
	
	public Trophee(Gaulois gauloi, Equipement equipement) {
		this.gauloi = gauloi;
		this.equipement = equipement;
	}
	
	public Gaulois getGauloi() {
		return gauloi;
	}

	public Equipement getEquipement() {
		return equipement;
	}

	public String donnerNom() {
		return gauloi.getNom();
	}
	
}
