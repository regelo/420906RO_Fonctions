package autreprojet;

import java.util.ArrayList;

public class FctsExeSup4 {

	public static void main(String[] args) {
		ArrayList<Integer> premier_tableau = genererTableau();
		ArrayList<Integer> deuxieme_tableau = genererTableau();

		ArrayList<Integer> troisieme_tableau = faireTableauDesCommunsSansDoublons(premier_tableau, deuxieme_tableau);

		// Affichage des trois tableaux.
		System.out.println(premier_tableau);
		System.out.println(deuxieme_tableau);
		System.out.println(troisieme_tableau);
	}

	public static ArrayList<Integer> faireTableauDesCommunsSansDoublons(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
		ArrayList<Integer> valeurs_communes = new ArrayList<Integer>();

		for (int valeur_tab1 : tab1) {
			if (tab2.contains(valeur_tab1)) {
				// valeur_tab1 se trouve donc dans les deux tableaux.
				// Mais on ne l'ajoute dans valeurs_communes que si
				// ce tableau n'a pas déjà cette valeur.
				if (!valeurs_communes.contains(valeur_tab1)) {
					// Ok, c'est bien une nouvelle valeur commune.
					valeurs_communes.add(valeur_tab1);
				}
			}
		}

		return valeurs_communes;
	}

	public static ArrayList<Integer> genererTableau() {
		ArrayList<Integer> tableau = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			// Génère une valeur aléatoire entre 1 et 10.
			int valeur = (int) (1 + Math.random() * 10);

			// Assignation de la valeur générée dans le tableau
			tableau.add(valeur);
		}

		return tableau;
	}

}
