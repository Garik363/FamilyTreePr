package presenter;

import model.human.Gender;
import model.human.Human;
import model.tree.FamilyTree;
import model.tree.Service;
import view.View;

import java.time.LocalDate;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void addHuman(String name, Gender gender, LocalDate birthDate) {
        service.addHuman(name, gender, birthDate);
        getFamilyTreeInfo();
    }

    public void addParent(String childName, String parentName) {
        service.addParent(childName, parentName);
    }

    public void addParent(int childId, int parentId) {
        service.addParent(childId, parentId);
    }

    public void addChild(String parentName, String childName) {
        service.addChild(parentName, childName);
    }

    public void addChild(int parentId, int childId) {
        service.addChild(parentId, childId);
    }

    public void sortByAge() {
        service.sortByAge();
        getFamilyTreeInfo();
    }

    public void sortByName() {
        service.sortByName();
        getFamilyTreeInfo();
    }

    public void getFamilyTreeInfo() {
        FamilyTree<Human> familyTree = service.getFamilyTree();
        view.printAnswer(familyTree.toString());
    }
}
