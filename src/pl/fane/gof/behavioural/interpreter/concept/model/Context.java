package pl.fane.gof.behavioural.interpreter.concept.model;

public class Context {
    private String name;

    public Context(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Context{" +
                "name='" + name + '\'' +
                '}';
    }
}
