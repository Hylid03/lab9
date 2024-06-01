package controller;

import domain.AVL;
import domain.BST;
import domain.TreeException;
import javafx.scene.control.RadioButton;

public class BstAVLOperationsController {

    public RadioButton rbt_BST;
    public RadioButton rbt_AVL;
    BST bst= new BST();
    AVL avl= new AVL();
    Object object= new Object();
    //TODO B

    public void bstSelectedOnAction(){
        if (rbt_BST.isPressed()){

        }
    }
    public void avlSelectedOnAction(){
        if (rbt_AVL.isPressed()){

        }
    }

    public void addOnAction() {
        if (rbt_BST.isPressed()){
            bst.add(object);
        }else if (rbt_AVL.isPressed()){
            avl.add(object);
        }
        //TODO A
    }

    public void randomizeOnAction(){
        //TODO randomizarlo
    }
    public void containsOnAction() throws TreeException {
        if (rbt_BST.isPressed()){
            bst.contains(object);
        }else if (rbt_AVL.isPressed()){
            avl.contains(object);
        }
    }
    public void removeOnAction() throws TreeException {
        if (rbt_BST.isPressed()){
            bst.remove(object);
        }else if (rbt_AVL.isPressed()){
            avl.remove(object);
        }
    }
    public void nodeHeightOnAction(){
        //TODO darle funcionalidad
    }
    public void treeHeightOnAction(){
        //TODO darle funcionalidad
    }
}
