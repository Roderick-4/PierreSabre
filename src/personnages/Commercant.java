package personnages;

public class Commercant extends Humain {
    
    public Commercant(String nom, int argent) {
        super(nom, "thé", argent);
    }

    public int seFaireExtorquer() {
        int argentExtorque = 0; 
        argentExtorque += getQuantiteArgent();
        perdreArgent(getQuantiteArgent());
        System.out.println(parler() + "J'ai tout perdu c'est vraiment trop injuste...");
        return argentExtorque;
    }

    public void recevoir(int argent) {
    	gagnerArgent(argent);
        System.out.println(parler() + argent + " sous ! Je te remercie généreux donateur!");
    }
}

