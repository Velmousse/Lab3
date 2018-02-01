/**
 * Created by DufVi1731300 on 2018-01-29.
 */
public class BouleDeFeu extends Sort {

    public BouleDeFeu() {
        cout = 5;
    }

    public boolean lancerSort(Personnage persoAttaque, Magicien persoQuiAttaque) {
        boolean mort = false;
        if (persoQuiAttaque.getPointsDeMagie() <= cout) {
            persoAttaque.setPointsDeVie(persoAttaque.getPointsDeVie() - 5);
            persoQuiAttaque.setPointsDeMagie(persoQuiAttaque.getPointsDeMagie() - cout);
        }
        if (persoAttaque.getPointsDeVie() <= 0) mort = true;
        return mort;
    }
}
