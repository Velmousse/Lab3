/**
 * Created by DufVi1731300 on 2018-01-29.
 */
public abstract class Personnage {
    protected int pointsDeVie = 0, pointsDeDefense = 0;
    protected String nom = "";

    public abstract void attaque(Personnage persoAttaque, Personnage persoQuiAttaque);

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public int getPointsDeDefense() {
        return pointsDeDefense;
    }

    public String getNom() {
        return nom;
    }
}
