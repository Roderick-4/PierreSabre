package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;

	public Yakuza(String nom, String boisson, int argent, String clan, int reputation) {
        super(nom, "thé", argent);
        this.clan = clan;
        this.reputation = reputation;
    }
	
	public String getClan() {
		return clan;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	public void extroquer(Commercant commercant) {
		
	}
	
}
