package pl.fane.gof.behavioural.iterator.model;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends AbstractAggregate<String> {

    private final List<String> agg;

    public ConcreteAggregate(String... strings) {
        agg = new ArrayList<>();
        for (String string : strings) {
            agg.add(string);
        }
    }

    @Override
    public AbstractIterator createIterator() {
        return new ConcreteIterator(this);
    }

    @Override
    public int count() {
        return agg.size();
    }

    @Override
    public String get(int index) {
        return agg.get(index);
    }

}
