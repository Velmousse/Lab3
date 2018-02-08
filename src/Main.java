/**
 * Created by DufVi1731300 on 2018-01-29.
 */
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Personnage j1 = null;
        Personnage j2 = null;

        j1 = choixPersonnage("premier");
        j2 = choixPersonnage("deuxieme");

        combat(j1, j2);

        sc.close();
    }

    public static void combat(Personnage premier, Personnage deuxieme) {
        while (true) {
            if (!matchNul(premier, deuxieme)) {
                premier.attaque(deuxieme);
                if (deuxieme.getPointsDeVie() <= 0) {
                    System.out.print("Le " + premier.getNom() + " gagne la partie!");
                    return;
                }
                System.out.println();
                deuxieme.attaque(premier);
                System.out.print("\n");
                if (premier.getPointsDeVie() <= 0) {
                    System.out.print("Le " + deuxieme.getNom() + " gagne la partie!");
                    return;
                }
            }
            else {
                System.out.print("Match nul!");
                return;
            }
        }
    }

    public static Personnage choixPersonnage(String position) {
        int entree = 0;
        System.out.print("Veuillez choisir le " + position + " personnage\n" +
                " 1- Barbare\n" +
                " 2- Paladin\n" +
                " 3- Magicien noir\n" +
                " 4- Magicien rouge\n" +
                "> ");
        entree = sc.nextInt();
        System.out.println();
        switch (entree) {
            case 1: return new Barbare();
            case 2: return new Paladin();
            case 3: return new MagicienNoir();
            case 4: default: return new MagicienRouge();
        }
    }

    public static boolean matchNul(Personnage premier, Personnage deuxieme) {
        if (premier instanceof Magicien && deuxieme instanceof Magicien) {
            if (((Magicien) premier).getPointsDeMagie() <= 0 && ((Magicien) deuxieme).getPointsDeMagie() <= 0)
                return true;
        }
        return false;
    }
}
