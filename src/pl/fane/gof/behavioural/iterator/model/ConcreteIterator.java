package pl.fane.gof.behavioural.iterator.model;

public class ConcreteIterator extends AbstractIterator<String> {

    private ConcreteAggregate concreteAggregate;
    private int position;

    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
        position = 0;
    }

    @Override
    public String first() {
        position = 0;
        return currentItem();
    }

    @Override
    public String next() {
        String s = currentItem();
        position++;
        return s;
    }

    @Override
    public String currentItem() {
        if (position < concreteAggregate.count())
            return concreteAggregate.get(position);
        else
            return null;
    }

    @Override
    public boolean isDone() {
        return position >= concreteAggregate.count();
    }
}
