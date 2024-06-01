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
    BST bst=new BST();
    AVL avl= new AVL();

    public void isBalancedInAction(){
        if (avl.isBalanced()){
            lbl_IsBalanced.setText("The tree is balanced");
            lbl_IsBalanced.setVisible(true);
        }else{
            lbl_IsBalanced.setText("The tree is not balanced");
            lbl_IsBalanced.setVisible(true);
        }
        //TODO encontrar manera de verificar si esta balanceado
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
        }
        //TODO dar la información del tour
    }
    public void bstSelectedOnAction(){
        //TODO asignarlo su evento
    }
    public void avlSelectedOnAction(){
        //TODO asignarlo su evento
    }

}
