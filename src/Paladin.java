/**
 * Created by DufVi1731300 on 2018-01-29.
 */
public class Paladin extends Guerrier {
    public Paladin() {
        pointsDeForce = 5;
        pointsDeDefense = 5;
        pointsDeVie = 80;
        nom = "paladin";
    }

    public void attaque(Personnage persoAttaque, Personnage persoQuiAttaque) {
        int degats = (this.pointsDeForce * 2 - persoAttaque.getPointsDeDefense());
        super.attaque(persoAttaque, this, degats);
    }
}
