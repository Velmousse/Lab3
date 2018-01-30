/**
 * Created by DufVi1731300 on 2018-01-29.
 */
public abstract class Personnage {
    protected int pointsDeVie = 0, pointsDeDefense = 0;
    protected String nom = "";

    public abstract void attaque(Personnage persoAttaque);
}
