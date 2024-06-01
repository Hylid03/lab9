package controller;

import domain.AVL;
import domain.BST;
import domain.TreeException;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class GraphicBSTAVLController {
    public RadioButton rbt_AVL;
    public RadioButton rbt_BST;
    public Label lbl_IsBalanced;
    BST bst = new BST();
    AVL avl = new AVL();
    boolean avlSelected = false;

    public void isBalancedInAction() {
        boolean isBalanced;
        if (avlSelected) {
            isBalanced = avl.isBalanced();
        } else {
            isBalanced = false; //TODO este es el isBalanced del BST pero se usa asi por su "inexistencia"
        }
        if (isBalanced) {
            lbl_IsBalanced.setText("The tree is balanced");
        } else {
            lbl_IsBalanced.setText("The tree is not balanced");
        }
        lbl_IsBalanced.setVisible(true);
    }
    public void randomizeOnAction(){
        //TODO randomizarlo
    }
    public void levelsOnAction(){
        //TODO hacer los niveles
    }
    public void tourInfoInAction() throws TreeException {
        if (rbt_BST.isPressed()){
            bst.height();
            bst.inOrder();
            bst.preOrder();
            bst.postOrder();
        }else if (rbt_AVL.isPressed()){
            avl.height();
            avl.inOrder();
            avl.preOrder();
            avl.postOrder();
            //TODO no sé si funciona asi
        }
    }
    public void bstSelectedOnAction(){
        //TODO asignarlo su evento
    }
    public void avlSelectedOnAction(){
        //TODO asignarlo su evento
    }
}