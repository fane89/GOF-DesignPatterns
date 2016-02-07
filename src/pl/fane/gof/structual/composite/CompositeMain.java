package pl.fane.gof.structual.composite;

import pl.fane.gof.structual.composite.model.AbstractFileSystemNode;
import pl.fane.gof.structual.composite.model.Directory;
import pl.fane.gof.structual.composite.model.File;

import java.util.ArrayList;
import java.util.List;

public class CompositeMain {
    public static void main(String[] args) {
        List<AbstractFileSystemNode> listA = new ArrayList<>();
        listA.add(new File("A"));
        listA.add(new File("B"));
        listA.add(new File("C"));
        listA.add(new File("D"));
        listA.add(new File("E"));
        listA.add(new File("F"));
        List<AbstractFileSystemNode> listN = new ArrayList<>();
        listN.add(new File("1"));
        listN.add(new File("2"));
        listN.add(new File("3"));
        listN.add(new Directory(listA,"dir4"));
        listN.add(new File("5"));
        listN.add(new File("6"));
        Directory dir = new Directory(listN,"dir1");
        dir.ls();

    }
}
