/**
 * Created by DufVi1731300 on 2018-01-29.
 */
public class BouleDeFeu extends Sort {
    public BouleDeFeu() {
        cout = 5;
        nom = "Boule de Feu";
    }

    public int lancerSort(Personnage persoAttaque, Magicien persoQuiAttaque) {
        int degats = 0;
        if (persoQuiAttaque.getPointsDeMagie() >= cout) {
            persoQuiAttaque.setPointsDeMagie(persoQuiAttaque.getPointsDeMagie() - cout);
            degats = 5;
        }
        return degats;
    }
}
