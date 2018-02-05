/**
 * Created by DufVi1731300 on 2018-01-29.
 */
public class MagicienNoir extends Magicien{
    public MagicienNoir() {
        tabSorts[0] = new BouleDeFeu();
        tabSorts[1] = new PicDeGlace();
        nom = "magicien noir";
    }
}
