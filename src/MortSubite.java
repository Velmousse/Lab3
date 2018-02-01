/**
 * Created by DufVi1731300 on 2018-01-29.
 */
public class MortSubite extends Sort {
    public MortSubite() {
        cout = 10;
    }

    public boolean lancerSort(Personnage persoAttaque, Magicien persoQuiAttaque) {
        boolean mort = false;
        if (persoQuiAttaque.getPointsDeMagie() <= cout) {
            if (Math.random() * 11 == 1) mort = true;
        }
        return mort;
    }
}
