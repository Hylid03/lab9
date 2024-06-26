package util;

import domain.BST;
import domain.BTree;
import domain.BTreeNode;


import java.text.DecimalFormat;
import java.util.Random;

public class Utility {

    //static init
    static {
    }

    public static String format(double value){
        return new DecimalFormat("###,###,###.##").format(value);
    }
    public static String $format(double value){
        return new DecimalFormat("$###,###,###.##").format(value);
    }
    public static String show(int[] a, int size) {
        String result="";
        for (int i = 0; i < size; i++) {
            result+= "a[i] ";
        }
        return result;
    }

    public static void fill(int[] a, int bound) {
        for (int i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt(bound);
        }
    }

    public static int getRandom(int bound) {
        return new Random().nextInt(bound)+1;
    }
    public static int getRandom(int inicio, int fin) {

        return new Random().nextInt(fin-inicio+1)+inicio;
    }

    public static int compare(Object a, Object b) { //TODO make this compatible with the work on hand

        switch (instanceOf(a, b)){
            case "Integer":
                Integer int1 = (Integer)a; Integer int2 = (Integer)b;
                return int1.compareTo(int2); //0 == equal
            case "String":
                String st1 = (String)a; String st2 = (String)b;
                return Integer.compare(st1.compareTo(st2), 0);
            case "Character":
                Character c1 = (Character)a; Character c2 = (Character)b;
                return Integer.compare(c1.compareTo(c2), 0);
            case "BTree":
                BTree bt1 = (BTree)a; BTree Bt2 = (BTree)b;
                return bt1==Bt2?0:-1;
            case "BTreeNode":
                BTreeNode btn1 = (BTreeNode) a;BTreeNode btn2 = (BTreeNode) b;
                return btn1==btn2?0:-1;
            case "BST":
                BST bst1 = (BST) a;BST bst2 = (BST) b;
                return bst1==bst2?0:-1;
        }
        return 2; //Unknown
    }

    private static String instanceOf(Object a, Object b) {
        if(a instanceof Integer && b instanceof Integer) return "Integer";
        if(a instanceof String && b instanceof String) return "String";
        if(a instanceof Character && b instanceof Character) return "Character";
        if(a instanceof BTree && b instanceof BTree) return "BTree";
        if(a instanceof BTreeNode && b instanceof BTreeNode) return "BTreeNode";
        if(a instanceof BST && b instanceof BST) return "BST";
        return "Unknown";
    }
}

