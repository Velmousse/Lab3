/**
 * Created by DufVi1731300 on 2018-01-29.
 */
import java.util.Scanner;

public class main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Personnage j1 = null;
        Personnage j2 = null;

        j1 = choixPersonnages("premier");
        j2 = choixPersonnages("deuxieme");

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

    public static Personnage choixPersonnages(String position) {
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
            case 4: return new MagicienRouge();
        }
        return null;
    }
}
