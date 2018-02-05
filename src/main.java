/**
 * Created by DufVi1731300 on 2018-01-29.
 */
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String position = "premier";
        int entree = 0;
        boolean fin = false;

        Scanner sc = new Scanner(System.in);
        Personnage j1 = null;
        Personnage j2 = null;

        position = "premier";
        System.out.print("Bienvenue dans RPG Simulator!\n\n");
        for (int i = 0; i < 2; i++) {
            System.out.print("Veuillez choisir le " + position + " personnage\n" +
                    " 1- Barbare\n" +
                    " 2- Paladin\n" +
                    " 3- Magicien noir\n" +
                    " 4- Magicien rouge\n" +
                    "> ");
            entree = sc.nextInt();
            System.out.println();
            switch (entree) {
                case 1:
                    if (position.equals("premier")) j1 = new Barbare();
                    else j2 = new Barbare();
                    break;
                case 2:
                    if (position.equals("premier")) j1 = new Paladin();
                    else j2 = new Paladin();
                    break;
                case 3:
                    if (position.equals("premier")) j1 = new MagicienNoir();
                    else j2 = new MagicienNoir();
                    break;
                case 4:
                    if (position.equals("premier")) j1 = new MagicienRouge();
                    else j2 = new MagicienRouge();
            }
            position = "deuxième";
        }
        combat(j1, j2);

        sc.close();
    }

    public static void combat(Personnage premier, Personnage deuxieme) {
        while (true) {
            premier.attaque(deuxieme, premier);
            System.out.print("\n");
            if (deuxieme.getPointsDeVie() <= 0) {
                System.out.print("Le " + premier.getNom() + " gagne la partie!");
                return;
            }
            deuxieme.attaque(premier, deuxieme);
            System.out.print("\n");
            if (premier.getPointsDeVie() <= 0) {
                System.out.print("Le " + deuxieme.getNom() + " gagne la partie!");
                return;
            }
        }
    }
}
