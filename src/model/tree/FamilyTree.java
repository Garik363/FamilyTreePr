package model.tree;

import model.human.HumanIterator;
import model.human.comparators.HumanComparatorByAge;
import model.human.comparators.HumanComparatorByName;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class FamilyTree<E extends GeneralTree<E>> implements Serializable, Iterable<E> {
    private List<E> familyTree;

    public FamilyTree() {
        this.familyTree = new ArrayList<>();
    }

    public void add(E human) {

        this.familyTree.add(human);
    }

    public E getByName(String name) {
        for (E human :familyTree) {
            if (human.getName().equals(name)) {
                return human;
            }
        }
        return null;

    }
    public E getById(int id){
        for(E human :familyTree){
            if (human.getId() == id){
                return human;
            }
        }
        return null;
    }

    public List<E> getTree() {
        return familyTree;
    }

    public String toString() {
        return familyTree.toString();
    }
    public void sortByName() {
        familyTree.sort(new HumanComparatorByName());
    }

    public void sortByAge() {
        familyTree.sort(new HumanComparatorByAge());
    }
    @Override
    public Iterator<E> iterator() {
        return (Iterator<E>) new HumanIterator(familyTree);
    }
}
