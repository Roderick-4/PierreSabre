package personnages;

public class Ronin extends Humain {
	private int attributHonneur = 1;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom,boisson,argent);
		//this.attributHonneur = attributHonneur;
	}
	
	public void donner(Commercant commercant) {
		int argentADonner = (int) (0.1*argent);
		System.out.println(parler() + commercant.getNom() + "prends ces " + argentADonner + " sous.");
		commercant.recevoir(argentADonner);
		argent -= argentADonner;
	}
	
	public void provoquer(Yakuza yakuza) {
		System.out.println(parler() + "Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		int forceRonin = 2*attributHonneur;
		if (forceRonin >= yakuza.getReputation()) {
			gagnerArgent(yakuza.getQuantiteArgent());
			System.out.println(parler() + "Je t’ai eu petit yakusa!");
			yakuza.perdre();
			attributHonneur ++;
		} else {
			attributHonneur --;
			System.out.println(parler() + "J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup");
			yakuza.gagner(argent);
			argent=0;
		}
	}
	
}
