package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BSTTest {
    @Test
    void test() throws TreeException {
        BST bst =new BST();
        BST name =new BST();
        BST numbers =new BST();
        BST alphabet =new BST();

        char[] spanishAlphabet = {
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
        };
        String[] names = {
                "Olivia", "Liam", "Emma", "Noah", "Ava", "Oliver", "Sophia", "Elijah", "Isabella", "James"};
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
            if (i<spanishAlphabet.length)
                alphabet.add(spanishAlphabet[i]);
            if (i<names.length)
                name.add(names[i]);
        }

        bst.add(numbers);
        bst.add(alphabet);
        bst.add(names);

        System.out.println(bst);

        System.out.println(bst.size()+"\n"+bst.min()+"\n"+bst.max());
        BST aux;
        aux= (BST)bst.find(numbers);
        BST aux2;
        aux2= (BST)bst.find(alphabet);
        BST aux3;
        aux3= (BST)bst.find(names);

        for (int i = 0; i < 5; i++) {
            int num = util.Utility.getRandom(100);
            System.out.println(aux.contains(num)?"The number was found":"The number is not in the tree");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(aux2.contains(i+4)?"The number was found":"The number is not in the tree");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(aux3.contains(i+2)?"The number was found":"The number is not in the tree");
        }
    }
}