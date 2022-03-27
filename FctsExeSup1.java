package fctsexesup1;

import java.util.Scanner;

public class FctsExeSup1 {

	public static void main(String[] args) {
		Scanner lecteur = new Scanner(System.in);

		int choix;
		do {
			choix = -1;
			System.out.println("  1. Afficher texte français");
			System.out.println("  2. Afficher texte anglais");
			System.out.println("  3. Afficher texte espagnol");
			System.out.println("  4. Quitter");
			System.out.print("Choix : ");
			if (lecteur.hasNextInt()) {
				choix = lecteur.nextInt();
				// Vider le tampon du '\n' qui traîne
				lecteur.nextLine();
			} else {
				// Vider le tampon des caractères incorrects
				lecteur.nextLine();
			}

			switch (choix) {
			case 1:
				String message_fr = "Les autochtones, peuples et individus, sont libres et égaux à tous les autres et ont le droit de ne faire l’objet, dans l’exercice de leurs droits, d’aucune forme de discrimination fondée, en particulier, sur leur origine ou leur identité autochtones : https://www.un.org/development/desa/indigenouspeoples/wp-content/uploads/sites/19/2018/11/UNDRIP_F_web.pdf";
				afficherTexte(message_fr);
				break;
			case 2:
				String message_en = "Indigenous peoples and individuals are free and equal to all other peoples and individuals and have the right to be free from any kind of discrimination, in the exercise of their rights, in particular that based on their indigenous origin or identity: https://www.un.org/development/desa/indigenouspeoples/wp-content/uploads/sites/19/2018/11/UNDRIP_E_web.pdf";
				afficherTexte(message_en);
				break;
			case 3:
				String message_es = "Los pueblos y los individuos indígenas son libres e iguales a todos los demás pueblos y personas y tienen derecho a no ser objeto de ningún tipo de discriminación en el ejercicio de sus derechos, en particular la fundada en su origen o identidad indígenas: https://www.un.org/development/desa/indigenouspeoples/wp-content/uploads/sites/19/2018/11/UNDRIP_S_web.pdf";
				afficherTexte(message_es);
				break;
			case 4:
				System.out.println("Au revoir !");
				break;
			default:
				System.out.println("Entrée erronée !");
			}

		} while (choix != 4);

		lecteur.close();
	}

	public static void afficherTexte(String le_texte) {
		System.out.println(le_texte);
	}

}
