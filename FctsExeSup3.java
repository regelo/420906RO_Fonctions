package fctsexesup3;

import java.util.Scanner;

public class FctsExeSup3 {

	public static void main(String[] args) {
		Scanner lecteur = new Scanner(System.in);
		
		int iterations = obtenirIterations(lecteur);
		
		double approximation = calculerSerie(iterations);
		
		System.out.println("Avec " + iterations + " itérations, l'approximation qui s'approche de 4 donne " + approximation);
		
		lecteur.close();
	}
	
	public static double calculerSerie(int les_iterations) {
		double valeur_x = 3/4.0;
		double resultat = 0;
		
		for(int i=0 ; i<les_iterations ; i++) {
			double terme = Math.pow(valeur_x, i);
			resultat = resultat + terme;
		}
		
		return resultat;
	}
	
	public static int obtenirIterations(Scanner clavier) {
		
		// On fait volontairement une boucle infinie
		while (true) {
			System.out.print("Entrez une valeur entière entre 1 et 500 : ");
			if (clavier.hasNextInt()) {
				int nb_iterations = clavier.nextInt();
				
				// Vider le tampon du '\n' qui traîne.
				clavier.nextLine();
				
				if (nb_iterations>=1 && nb_iterations<=500) {
					// C'est le seul cas où la valeur est valide.
					// Et c'est donc le seul point de sortie de
					// la fonction.
					return nb_iterations;
				}
			}
			else {
				// Vider le tampon des caractères incorrects.
				clavier.nextLine();
			}
		}
	}

}
