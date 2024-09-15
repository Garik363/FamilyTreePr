package model.human;

import model.tree.GeneralTree;

import java.util.Iterator;
import java.util.List;



public class HumanIterator<G extends GeneralTree<G>> implements Iterator<G> {
    private int curIndex;
    private List<G> humanList;

    public HumanIterator(List<G> humanList) {
        this.humanList = humanList;
    }

    @Override
    public boolean hasNext() {
        return humanList.size()>curIndex;
    }

    @Override
    public G next() {
        return humanList.get(curIndex++);
    }


}
