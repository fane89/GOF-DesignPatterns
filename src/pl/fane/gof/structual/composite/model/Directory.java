package pl.fane.gof.structual.composite.model;

import java.util.List;

public class Directory extends AbstractFileSystemNode {

    private final List<AbstractFileSystemNode> list;
    private final String name;

    public Directory(List<AbstractFileSystemNode> list, String name) {
        this.list = list;
        this.name = name;
    }

    @Override
    public void ls() {
        System.out.println(name);
        list.stream().forEach(abstractFileSystemNode -> abstractFileSystemNode.ls());
    }
}
