package model.workWithFile;

import model.human.Human;
import model.tree.FamilyTree;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;




public class FileHandler implements Write {
    @Override
    public boolean saveFamilyTree(String nameFile, FamilyTree<Human> familyTree) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nameFile))) {
            oos.writeObject(familyTree);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    @Override
    public FamilyTree downloadFamilyTree(String nameFile) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nameFile));
        ois.close();
        FamilyTree downloadTree = new FamilyTree();
        return downloadTree;

    }

}
