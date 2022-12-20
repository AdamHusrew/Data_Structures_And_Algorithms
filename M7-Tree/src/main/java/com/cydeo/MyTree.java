package com.cydeo;

public class MyTree {

    TNode root;

    public MyTree() {}

    public void insert(int value){
        TNode newNode = new TNode(value);

        if (root == null){
            root = newNode;
            return;
        }


        TNode current = root;

        while (true){

            if (value <= current.value){

                if (current.left == null){
                    current.left = newNode;
                    break;
                }

                current = current.left;

            }else {

                if (current.right == null){
                    current.right = newNode;
                    break;
                }

                current = current.right;
            }

        }
    }


}
