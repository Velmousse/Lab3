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
}
