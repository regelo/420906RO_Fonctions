package fctsexesup5;

import java.util.ArrayList;

public class FctsExeSup5 {

	public static void main(String[] args) {
		ArrayList<String> jeu = genererJeu();

		System.out.println("Le jeu original : ");
		System.out.println(jeu);
		
		ArrayList<String> joueur1 = new ArrayList<String>();
		ArrayList<String> joueur2 = new ArrayList<String>();
		ArrayList<String> joueur3 = new ArrayList<String>();
		ArrayList<String> joueur4 = new ArrayList<String>();
		
		separerJeu(jeu, joueur1, joueur2, joueur3, joueur4);
		
		System.out.println("Le jeu final : ");
		System.out.println(jeu);
		
		System.out.println("Main du Joueur #1");
		System.out.println(joueur1);
		System.out.println("Main du Joueur #2");
		System.out.println(joueur2);
		System.out.println("Main du Joueur #3");
		System.out.println(joueur3);
		System.out.println("Main du Joueur #4");
		System.out.println(joueur4);
	}

	// Rappelez-vous que les objets sont passés par référence. Ainsi les
	// modifications faites à j1, j2, j3 et j4 affectent le jeu original
	// créé dans le "main()"
	public static void separerJeu(
			ArrayList<String> jeu_original,
			ArrayList<String> j1,
			ArrayList<String> j2,
			ArrayList<String> j3,
			ArrayList<String> j4
			) {
		
		int joueur_courant = 1;
		
		// Tant qu'il reste des cartes à séparer. J'utilise un "while" ici
		// au cas où on recevrait un jeu vide. Ce qui n'arrivera pas avec
		// notre code actuel, mais je veux prévenir des bogues futurs.
		while(jeu_original.size()>0) {
			int position_carte = (int) (Math.random()*jeu_original.size());
			
			String une_carte = jeu_original.get(position_carte);
			jeu_original.remove(position_carte);
			
			switch(joueur_courant) {
			case 1:
				j1.add(une_carte);
				break;
			case 2:
				j2.add(une_carte);
				break;
			case 3:
				j3.add(une_carte);
				break;
			case 4:
				j4.add(une_carte);
				break;
			}
			
			// On passe au joueur suivant, en bouclant au premier si nécessaire.
			joueur_courant++;
			if (joueur_courant>4) joueur_courant = 1;
		}
		
		// C'est une procédure, donc on ne retourne rien.
	}
	
	public static ArrayList<String> genererJeu() {
		ArrayList<String> le_jeu = new ArrayList<String>();
		
		for (int i = 0; i < 52; i++) {
			int valeur = i % 13;
			int suite = i / 13;

			String nom_carte = "";

			switch (valeur) {
			case 0:
				nom_carte += "A";
				break;
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				nom_carte += (valeur+1);
				break;
			case 10:
				nom_carte += "V";
				break;
			case 11:
				nom_carte += "D";
				break;
			case 12:
				nom_carte += "R";
				break;
			}
			
			switch (suite) {
			case 0:
				nom_carte += "♠";
				break;
			case 1:
				nom_carte += "♣";
				break;
			case 2:
				nom_carte += "♢";
				break;
			case 3:
				nom_carte += "♡";
				break;
			}
			
			// Ajout au jeu
			le_jeu.add(nom_carte);
		}
		
		return le_jeu;
	}

}
