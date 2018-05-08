package by.bntu.fitr.povt.coffeebaby.model;

import java.util.Collections;


public class StonesCalc implements Calculator {


    public void sortStonesByWeigth(Necklace necklace) {
        Collections.sort(necklace.getNecklace(), new SortWeightByDefaultCompare());
    }


    public void sortStonesByPrice(Necklace necklace) {
        Collections.sort(necklace.getNecklace(), new SortPriceByDefaultCompare());

    }

}
