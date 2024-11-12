package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;

	public Yakuza(String nom, String boisson, int argent, String clan, int reputation) {
		super(nom, boisson, argent);
		this.clan = clan;
		this.reputation = reputation;
	}

	public String getClan() {
		return clan;
	}

	public int getReputation() {
		return reputation;
	}

	public void extroquer(Commercant beneficiaire) {
		int argentCommercant = 0;
		System.out.println(parler() + "Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		System.out.println(parler() + beneficiaire.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		argentCommercant += beneficiaire.seFaireExtorquer();
		this.gagnerArgent(argentCommercant);
		reputation++;
		System.out.println(parler() + "- J’ai piqué les " + argentCommercant + " sous de " + beneficiaire.getNom() + ", ce qui me fait " + getQuantiteArgent() + " sous dans ma poche. Hi ! Hi !");
	}

	public void perdre() {
		reputation--;
		int ancienArgent = getQuantiteArgent();
		this.perdreArgent(ancienArgent);
		System.out.println(parler() + "J'ai perdu mon duel et mes " + ancienArgent + " sous, snif... J'ai déshonoré le clan de " + clan);
	}

	public void gagner(int sousgagner) {
		reputation++;
		this.gagnerArgent(sousgagner);
		System.out.println(parler() + "Ce ronin pensait vraiment battre " + nom + " du clan de " + clan + ". Je l'ai dépouillé de ses " + sousgagner + " sous.");
	}

}
