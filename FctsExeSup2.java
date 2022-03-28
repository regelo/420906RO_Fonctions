package fctsexesup2;

import java.util.Scanner;

public class FctsExeSup2 {

	public static void main(String[] args) {
		Scanner lecteur = new Scanner(System.in);
		
		System.out.println("== RANGÉE == ");
		int rangee = obtenirValeur(lecteur);

		System.out.println("== COLONNE == ");
		int colonne = obtenirValeur(lecteur);
		
		boolean est_valide = verifierCoordonnes(rangee, colonne);
		
		if (est_valide) {
			System.out.println("La coordonnée (" + rangee + ", " + colonne + ") est valide pour un jeu d'échecs.");
		}
		else {
			System.out.println("La coordonnée (" + rangee + ", " + colonne + ") n'est pas valide pour un jeu d'échecs.");			
		}
		
		lecteur.close();

	}
	
	public static boolean verifierCoordonnes(int une_rangee, int une_colonne) {
		
		// On vérifie si la rangée est bonne.
		if (une_rangee<1 || une_rangee>8) return false;
		
		// On vérifie si la colonne est bonne. On aurait pu mettre un
		// "else if" ici, mais ça ne change rien : si la première condition
		// est vraie, nous avons déjà quitté la fonction de toute manière.
		if (une_colonne<1 || une_colonne>8) return false;
		
		// Si le code se rend jusqu'ici, cela veut dire que les deux
		// "return" précédents ne se sont pas exécutés, et donc que 
		// les deux conditions n'étaient pas vraies.
		return true;
	}
	
	public static int obtenirValeur(Scanner clavier) {
		System.out.println("Entrez une valeur entière entre 1 et 8 : ");
		if (clavier.hasNextInt()) {
			int valeur = clavier.nextInt();
			// Vider le tampon du '\n' qui traîne
			clavier.nextLine();
			
			// On retourne la valeur lue.
			return valeur;
		}
		else {
			// Vider le tampon des caractères incorrects.
			clavier.nextLine();
			
			// On retourne zéro
			return 0;
		}
		
		// Notez qu'on n'a pas besoin de "return" ici parce que
		// le compilateur est assez intelligent pour voir qu'il
		// y a un "return" pour toutes les branches de notre
		// code et que le déroulement ne se rendra jamais
		// jusqu'ici.
	}

}
