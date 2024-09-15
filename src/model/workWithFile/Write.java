package model.workWithFile;

import model.human.Human;
import model.tree.FamilyTree;

import java.io.IOException;




public interface Write {

    boolean saveFamilyTree(String nameFile, FamilyTree<Human> familyTree) throws IOException;
    FamilyTree downloadFamilyTree(String nameFile) throws IOException, ClassNotFoundException;

}