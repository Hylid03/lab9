package domain;

import static org.junit.jupiter.api.Assertions.*;

class AVLTest {
    void test() throws TreeException {
        AVL avl = new AVL();
        for (int i = 0; i < 30; i++)
            avl.add(util.Utility.getRandom(100-1));
        System.out.println(avl);
        System.out.println(avl.size()+"\n"+avl.min()+"\n"+avl.max());
        avl.isBalanced();
        avl.getSequence();
        //TODO terminar el método "isBalanced()"
        //TODO terminar el método getSequence(BTreeNode node)

     }

}