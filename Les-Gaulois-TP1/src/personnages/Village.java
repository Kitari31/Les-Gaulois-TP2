package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	public Village(String nom, int nbVillageoisMax) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMax];
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public Chef getChef() {
		return chef;
	}

	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant (Gaulois gaulois) {
		if (this.nbVillageois<this.villageois.length) {
			this.villageois[this.nbVillageois]=gaulois;
			this.nbVillageois++;
		}else {
			System.err.println("Le village n'a plus de place");
		}
	}
	
	public Gaulois trouverHabitant(int numero) {
		return this.villageois[numero];
	}
	
	public void afficherVillageois() {
		String texte = "Dans le village du chef ";
		texte += getChef().getNom();
		texte += " vivent les légendaires gaulois :";
		for (int i = 0; i < nbVillageois; i++) {
			texte += "\n - ";
			texte += this.villageois[i].getNom();
		}
		System.out.println(texte);
	}
	
	public static void main(String[] args) {
		Village village = new Village ("Village des Irréductibles",30);
		//Gaulois gaulois = village.trouverHabitant(30);
		Chef chef = new Chef ("Abraracourcix",6,village);
		Gaulois Asterix = new Gaulois ("Asterix",8);
		Gaulois Obelix = new Gaulois ("Obelix",25);
		village.ajouterHabitant(Asterix);
		village.ajouterHabitant(Obelix);
		village.afficherVillageois();
	}
}

