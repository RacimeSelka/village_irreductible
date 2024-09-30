package personnages;

public enum equipement {
	CASQUE("casque"),BOUCLIER("bouclier");
	String nom;

	private equipement(String nom) {
		this.nom = nom;
	}
	public String toString() {
		return nom;
	}
	public String getNom() {
		return nom;
	}
	
	

} 
 