/**
 * Created by DufVi1731300 on 2018-01-29.
 */
public class MortSubite extends Sort {
    public MortSubite() {
        cout = 10;
        nom = "Mort Subite";
    }

    public int lancerSort(Personnage persoAttaque, Magicien persoQuiAttaque) {
        int degats = 0;
        if (persoQuiAttaque.getPointsDeMagie() >= cout) {
            persoQuiAttaque.setPointsDeMagie(persoQuiAttaque.getPointsDeMagie() - cout);
            if (Math.random() * 11 == 1) degats = persoAttaque.getPointsDeVie();
        }
        return degats;
    }
}
