package personnages;

public class Humain {
	private String nom;
	private String boisson_fav;
	private int quantite_argent;
	
	public Humain(String nom, String boisson_fav, int quantite_argent) {
		this.nom = nom;
		this.boisson_fav = boisson_fav;
		this.quantite_argent = quantite_argent;
	}
	
	public String getNom() {
		return nom;
	}
	
	public String getBoissonFav() {
		return boisson_fav;
	}
	
	public int getQuantiteArgent() {
		return quantite_argent;
	}
	
	private String parler() {
		return "(" + nom + ") - ";
	}
	
	public void direBonjour() {
		System.out.println(parler() + "Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson_fav);;
	}
	
	public void boire() {
		System.out.println(parler() + "Mmmm, un bon verre de " + boisson_fav + " ! GLOUPS !");
	}
	
	public void acheter(String bien, int prix) {
		if (prix > quantite_argent) {
			System.out.println(parler() + "Je n'ai plus que " + quantite_argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous.");
		} else {
			System.out.println(parler() + "J'ai " + quantite_argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
			perdreArgent(prix);
			
		}
	}
	
	public void gagnerArgent(int gain) {
		quantite_argent += gain;
	}
	
	public void perdreArgent(int perte) {
		quantite_argent -= perte;
	}
}
