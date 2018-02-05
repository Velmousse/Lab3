/**
 * Created by DufVi1731300 on 2018-01-29.
 */
public class MagicienRouge extends Magicien {

    public MagicienRouge() {
        tabSorts[0] = new Empoisonnement();
        tabSorts[1] = new MortSubite();
        nom = "magicien noir";
    }

    public void attaque(Personnage persoAttaque, Personnage persoQuiAttaque) {
        int sortEmploye = (int)((Math.random()*3) - 1);
        int degats = (this.tabSorts[sortEmploye].lancerSort(persoAttaque, this));
        super.attaque(persoAttaque, this, degats, this.tabSorts[sortEmploye]);
    }
}
