package histoire;

import personnages.Commercant;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
//		Humain prof = new Humain("Prof","kombucha",54);
//		prof.direBonjour();
//		prof.acheter("une boisson", 12);
//		prof.boire();
//		prof.acheter("un jeu", 2);
//		prof.acheter("un kimono", 50);
		Commercant marco = new Commercant("Marco", 15);
//		marco.direBonjour();
//		marco.recevoir(15);
//		marco.boire();
		Yakuza yakuzalenoir = new Yakuza("Yakuza Le Noir", "Whisky", 30, "Warsong", 1);
		yakuzalenoir.direBonjour();
		yakuzalenoir.extroquer(marco);
		System.out.println(marco.getQuantiteArgent());
		Ronin roro = new Ronin("roro", "shochu", 60);
//		roro.direBonjour();
//		roro.donner(marco);
		roro.provoquer(yakuzalenoir);
		
	}

}
