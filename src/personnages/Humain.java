package personnages;

public class Humain {
	private String nom;
	private String boissonFav;
	private int quantiteArgent;
	
	public Humain(String nom, String boissonFav, int quantiteArgent) {
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.quantiteArgent = quantiteArgent;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getBoissonFav() {
		return boissonFav;
	}
	
	public int getQuantiteArgent() {
		return quantiteArgent;
	}
	
	private String parler() {
		return "(" + nom + ") - ";
	}
	
	public void direBonjour() {
		System.out.println(parler() + "Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boissonFav);;
	}
	
	public void boire() {
		System.out.println(parler() + "Mmmm, un bon verre de " + boissonFav + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (prix > quantiteArgent) {
			System.out.println(parler() + "Je n'ai plus que " + quantiteArgent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
		} else {
			System.out.println(parler() + "J'ai " + quantiteArgent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
			perdreArgent(prix);
			
		}
	}
	
	protected void gagnerArgent(int gain) {
		quantiteArgent += gain;
	}
	
	protected void perdreArgent(int perte) {
		quantiteArgent -= perte;
	}
}
