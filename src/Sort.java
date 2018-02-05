/**
 * Created by DufVi1731300 on 2018-01-29.
 */
public abstract class Sort {
    protected int cout = 0;
    protected String nom = "";

    public abstract int lancerSort(Personnage persoAttaque, Magicien persoQuiAttaque);

    public String getNom() {
        return nom;
    }

    public int getCout() {
        return cout;
    }
}
