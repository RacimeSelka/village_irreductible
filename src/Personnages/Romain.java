package Personnages;



public class Romain {
	private String nom;
	private int nbEquipement = 0;
	private Equipement[] equipements = new Equipement[2];
	

	private int force;

	public Romain(String nom, int force) {
		this.nom = nom;
		assert force > 0;
		this.force = force;
	}

	public int getForce() {
		return force;
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

//	public void recevoirCoup(int forceCoup) {
//		assert force>0;
//		int nvForce=force;
//		force -= forceCoup;
//		if (force > 0) {
//			parler("aie");
//		} else {
//			parler("j'abandonne...");
//		}
//		assert force<nvForce;
//	}
	
	
	
	
	private int calculResistanceEquipement(int forceCoup) {
        
		String texte = "Ma force est  de " + this.force + ", et la force du coup est de " + forceCoup;
        
		int resistanceEquipement = 0;
        
		if (nbEquipement != 0) {
             
			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
             
			for (int i = 0; i < nbEquipement;i++) {
                  
				if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER))) {
                       
                	  resistanceEquipement += 8;
                  
				} else {
                      
					System.out.println("Equipement casque");
                       
					resistanceEquipement += 5;
                  }
				
				
            }
			if (resistanceEquipement<forceCoup) {
				texte += resistanceEquipement + "!";
			} else {
				texte += forceCoup + "!";
			}
             
			
        }
        
		parler(texte);
		if (resistanceEquipement<forceCoup) {
			forceCoup -= resistanceEquipement;
		} else {
			forceCoup=0;
		}
        
		
        
		return forceCoup;
}
	
	
	
	private Equipement[] ejecterEquipement() {
		
		Equipement[] equipementEjecte = new Equipement[nbEquipement]; System.out.println("L'équipement de " + nom + "s'envole sous la force du coup.");
		          
		int nbEquipementEjecte = 0;
		          
		for (int i = 0; i < nbEquipement; i++) {
			
			if (equipements[i] != null) {
				equipementEjecte[nbEquipementEjecte] =equipements[i];
		        nbEquipementEjecte++;
		        equipements[i] = null;
				
			} 
		}
		return equipementEjecte;
	}

		          
	
	
	

	public Equipement[] recevoirCoup(int forceCoup) {
       
		Equipement[] equipementEjecte = null;
        
        assert force > 0;
        
        
        
        forceCoup = calculResistanceEquipement(forceCoup);
        
        force -= forceCoup;
        
        if (force > 0) {
        	parler("Aïe");
        
        } else {
        	
        	equipementEjecte = ejecterEquipement();
            
        	parler("J'abandonne...");
        }
        
        
           
			

		
        
       
       return equipementEjecte;
	}

	
	
	
	private void rep(Equipement nvequipement) {
		equipements[nbEquipement] = nvequipement;
		nbEquipement += 1;
	}

	public void sEquiper(Equipement nvequipement) {

		switch (nbEquipement) {

		case 2:
			System.out.println("Le soldat " + nom + " est déjà bien protégé !");
			break;
		case 1:
			if (equipements[0] == nvequipement) {
				System.out.println("le soldat " + nom + " possede deja un " + nvequipement);
			} else {
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

	

}
