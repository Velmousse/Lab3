/**
 * Created by DufVi1731300 on 2018-01-29.
 */
public class Empoisonnement extends Sort {
    private int cumulDegats = 0;

    public Empoisonnement() {
        cout = 2;
        nom = "Empoisonnement";
    }

    public int lancerSort(Personnage persoAttaque, Magicien persoQuiAttaque) {
        int  degats = 0;
        if (persoQuiAttaque.getPointsDeMagie() >= cout) {
            persoQuiAttaque.setPointsDeMagie(persoQuiAttaque.getPointsDeMagie() - cout);
            cumulDegats += 2;
            degats = cumulDegats;
        }
        return degats;
    }
}
