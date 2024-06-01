package controller;

import domain.AVL;
import domain.BST;
import domain.TreeException;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class BstAVLTourController {
    public RadioButton rbt_AVLTour;
    public RadioButton rbt_BSTTour;
    public Label lbl_Tour;
    BST bst= new BST();
    AVL avl=new AVL();

    public void randomizeOnAction(){
        //TODO randomizarlo
    }

    public void preOrderOnAction() throws TreeException {
        if (rbt_AVLTour.isPressed()){
            avl.preOrder();
        }else if (rbt_BSTTour.isPressed()){
            bst.preOrder();
        }
    }

    public void inOrderOnAction() throws TreeException {
        if (rbt_AVLTour.isPressed()){
            avl.inOrder();
        }else if (rbt_BSTTour.isPressed()){
            bst.inOrder();
        }
    }

    public void postOrderOnAction() throws TreeException {
        if (rbt_AVLTour.isPressed()){
            avl.postOrder();
        }else if (rbt_BSTTour.isPressed()){
            bst.postOrder();
        }
    }

    public void bstSelectedOnAction(){
        lbl_Tour.setVisible(true);
        //TODO asignarlo su evento
    }

    public void avlSelectedOnAction(){
        //TODO asignarlo su evento
        lbl_Tour.setVisible(true);
    }
}
