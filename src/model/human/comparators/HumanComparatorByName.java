package model.human.comparators;

import model.tree.GeneralTree;

import java.util.Comparator;


public class HumanComparatorByName<G extends GeneralTree<G>> implements Comparator<G> {

    @Override
    public int compare(G o1, G o2) {
        return o1.getName().compareTo(o2.getName());
    }

}