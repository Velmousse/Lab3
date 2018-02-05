/**
 * Created by DufVi1731300 on 2018-01-29.
 */
public class Barbare extends Guerrier {
    public Barbare() {
        pointsDeForce = 10;
        pointsDeDefense = 3;
        pointsDeVie = 100;
        nom = "barbare";
    }

    public void attaque(Personnage persoAttaque, Personnage persoQuiAttaque) {
        int degats = (this.pointsDeForce * 2 - persoAttaque.getPointsDeDefense());
        super.attaque(persoAttaque, this, degats);
    }
}
