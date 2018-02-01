/**
 * Created by DufVi1731300 on 2018-01-29.
 */
public class Empoisonnement extends Sort {
    private int cumulDegats = 0;

    public Empoisonnement() {
        cout = 2;
    }

    public boolean lancerSort(Personnage persoAttaque, Magicien persoQuiAttaque) {
        boolean mort = false;
        if (persoQuiAttaque.getPointsDeMagie() <= cout) {
            cumulDegats += 2;
            persoAttaque.setPointsDeVie(persoAttaque.getPointsDeVie() - cumulDegats);
            persoQuiAttaque.setPointsDeMagie(persoQuiAttaque.getPointsDeMagie() - cout);
        }
        if (persoAttaque.getPointsDeVie() <= 0) mort = true;
        return mort;
    }
}
