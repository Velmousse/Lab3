/**
 * Created by DufVi1731300 on 2018-01-29.
 */
public class PicDeGlace extends Sort {
    public PicDeGlace() {
        cout = 5;
        nom = "Pic de Glace";
    }

    public int lancerSort(Personnage persoAttaque, Magicien persoQuiAttaque) {
        int degats = 0;
        if (persoQuiAttaque.getPointsDeMagie() >= cout) {
            persoQuiAttaque.setPointsDeMagie(persoQuiAttaque.getPointsDeMagie() - cout);
            degats = (7 - persoAttaque.getPointsDeDefense());
        }
        return degats;
    }
}
