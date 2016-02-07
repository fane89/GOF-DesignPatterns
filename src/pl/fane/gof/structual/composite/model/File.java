package pl.fane.gof.structual.composite.model;

public class File extends AbstractFileSystemNode {

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void ls() {
        System.out.println(name);
    }
}
