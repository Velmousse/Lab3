/**
 * Created by DufVi1731300 on 2018-01-29.
 */
public abstract class Guerrier extends Personnage {
    protected int pointsDeForce = 0;

    public void attaque(Personnage persoAttaque) {
        int degats = (this.pointsDeForce * 2 - persoAttaque.getPointsDeDefense());

        persoAttaque.setPointsDeVie(persoAttaque.getPointsDeVie() - degats);
        if (persoAttaque.getPointsDeVie() <= 0) persoAttaque.setPointsDeVie(0);
        System.out.print("Le " + this.getNom() + " attaque!\n" +
                "Le " + persoAttaque.getNom() + " perd " + degats + " points de vie. Il lui en reste " + persoAttaque.getPointsDeVie() + ".\n");
    }
}
