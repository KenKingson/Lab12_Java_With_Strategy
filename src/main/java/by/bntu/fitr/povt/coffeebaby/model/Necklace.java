package by.bntu.fitr.povt.coffeebaby.model;



import java.util.ArrayList;


public class Necklace<T extends ArrayList> {
    private T container;

    public Necklace(T containers) {
        this.container = containers;
    }


    public T getNecklace() {
        return container;
    }

    public Object getStone(int index) {
        return container.get(index);
    }

    public void delStone(int index) {
        container.remove(index);
    }

    public void addStone(Stone stone) {
        container.add(stone);
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < container.size(); i++) {

            builder.append(container.get(i).toString());

        }
        return "Necklace{" + builder + " }";


    }
}