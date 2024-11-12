package personnages;

public class Humain {
	protected String nom;
	protected String boisson;
	private int argent;

	public Humain(String nom, String boissonFav, int argent) {
		this.nom = nom;
		this.boisson = boissonFav;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public String getBoissonFav() {
		return boisson;
	}

	public int getQuantiteArgent() {
		return argent;
	}

	protected String parler() {
		return "(" + nom + ") - ";
	}

	public void direBonjour() {
		System.out.println(parler() + "Bonjour ! Je m'appelle " + nom + " et j'aime boire du " + boisson);;
	}

	public void boire() {
		System.out.println(parler() + "Mmmm, un bon verre de " + boisson + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (prix > getQuantiteArgent()) {
			System.out.println(parler() + "Je n'ai plus que " + getQuantiteArgent() + " sous en poche. Je ne peux m�me pas m'offrir " + bien + " � " + prix + " sous.");
		} else {
			System.out.println(parler() + "J'ai " + getQuantiteArgent() + " sous en poche. Je vais pouvoir m'offrir " + bien +  " a " + prix + " sous");
			perdreArgent(prix);

		}
	}

	protected void gagnerArgent(int gain) {
		argent += gain;
	}

	protected void perdreArgent(int perte) {
		argent -= perte;
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(null);
		memoriser(autreHumain);
	}
	
	private void repondre(Humain premierHumain) {
		direBonjour();
		memoriser(premierHumain);
	}

	private void memoriser(Humain humain) {
		// TODO Auto-generated method stub
		
	}
}
