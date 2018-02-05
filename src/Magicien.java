/**
 * Created by DufVi1731300 on 2018-01-29.
 */
public abstract class Magicien extends Personnage {
    protected int pointsDeMagie = 0;
    protected Sort tabSorts[] = new Sort[2];

    public Magicien() {
        pointsDeMagie = 50;
        pointsDeDefense = 1;
        pointsDeVie = 60;
    }

    public int getPointsDeMagie() {
        return pointsDeMagie;
    }

    public void setPointsDeMagie(int pointsDeMagie) {
        this.pointsDeMagie = pointsDeMagie;
    }

    public void attaque(Personnage persoAttaque, Magicien persoQuiAttaque, int degats, Sort sort) {
        persoAttaque.setPointsDeVie(persoAttaque.getPointsDeVie() - degats);
        System.out.print("Le " + persoQuiAttaque.getNom() + " attaque!\n" +
                "Le " + persoQuiAttaque + " utilise " + sort.getNom() + ", ce qui lui coûte " + sort.getCout() + " points de magie.\n" +
                "Il lui reste " + persoQuiAttaque.getPointsDeMagie() + " points de magie.\n" +
                "Le " + persoAttaque.getNom() + " perd " + degats + " points de vie. Il lui en reste " + persoAttaque.getPointsDeVie());
    }
}
