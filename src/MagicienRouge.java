/**
 * Created by DufVi1731300 on 2018-01-29.
 */
public class MagicienRouge extends Magicien {
    public MagicienRouge() {
        tabSorts[0] = new Empoisonnement();
        tabSorts[1] = new MortSubite();
        nom = "magicien rouge";
    }
}
