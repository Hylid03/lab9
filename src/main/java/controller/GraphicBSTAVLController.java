package controller;

import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class GraphicBSTAVLController {
    public RadioButton rbt_AVL;
    public RadioButton rbt_BST;
    public Label lbl_IsBalanced;

    public void isBalancedInAction(){
        if (){

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
    public void tourInfoInAction(){
        //TODO dar la información del tour
    }
    public void bstSelectedOnAction(){
        //TODO asignarlo su evento
    }
    public void avlSelectedOnAction(){
        //TODO asignarlo su evento
    }

}
