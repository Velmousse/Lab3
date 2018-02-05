/**
 * Created by DufVi1731300 on 2018-01-29.
 */
public abstract class Guerrier extends Personnage {
    protected int pointsDeForce = 0;

    public void attaque(Personnage persoAttaque, Personnage persoQuiAttaque, int degats) {
        persoAttaque.setPointsDeVie(persoAttaque.getPointsDeVie() - degats);
        System.out.print("Le " + persoQuiAttaque.getNom() + " attaque!\n" +
                "Le " + persoAttaque.getNom() + " perd " + degats + " points de vie. Il lui en reste " + persoAttaque.getPointsDeVie() + ".\n");
    }
}
