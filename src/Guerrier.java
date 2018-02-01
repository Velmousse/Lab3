/**
 * Created by DufVi1731300 on 2018-01-29.
 */
public abstract class Guerrier extends Personnage {
    protected int pointsDeForce = 0;

    public boolean attaque(Personnage persoAttaque) {
        return false; //À modifier avec l'état de santé de l'ennemi
    }
}
