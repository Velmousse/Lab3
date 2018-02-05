/**
 * Created by DufVi1731300 on 2018-01-29.
 */
public abstract class Magicien extends Personnage {
    protected int pointsDeMagie = 0;
    protected Sort tabSorts[] = new Sort[2];

    public Magicien() {
        pointsDeMagie = 10;
        pointsDeDefense = 1;
        pointsDeVie = 60;
    }

    public int getPointsDeMagie() {
        return pointsDeMagie;
    }

    public void setPointsDeMagie(int pointsDeMagie) {
        this.pointsDeMagie = pointsDeMagie;
    }

    public void attaque(Personnage persoAttaque) {
        Sort sortEmploye = this.tabSorts[(int) ((Math.random() * 3) - 1)];
        int degats = sortEmploye.lancerSort(persoAttaque, this);

        persoAttaque.setPointsDeVie(persoAttaque.getPointsDeVie() - degats);
        if (persoAttaque.getPointsDeVie() <= 0) persoAttaque.setPointsDeVie(0);
        System.out.print("Le " + this.getNom() + " attaque!\n" +
                "Le " + this.getNom() + " utilise " + sortEmploye.getNom() + ", ce qui lui coûte " + sortEmploye.getCout() + " points de magie.\n" +
                "Il lui reste " + this.getPointsDeMagie() + " points de magie.\n" +
                "Le " + persoAttaque.getNom() + " perd " + degats + " points de vie. Il lui en reste " + persoAttaque.getPointsDeVie() + ".\n");

    }
}
