package model.human.comparators;

import model.tree.GeneralTree;

import java.util.Comparator;



public class HumanComparatorByAge<G extends GeneralTree<G>> implements Comparator<G> {

    @Override
    public int compare(G o1, G o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }

}