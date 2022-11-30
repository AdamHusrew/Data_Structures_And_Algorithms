package org.cydeo;

public class MySinglyLinkedList {

    private Node head;
    private Node tail;
    private int size = 0;

    public void add(int data){
        Node node = new Node(data);

        if (isEmpty()){
            head = node;
            tail = node;
            size += 1;
        }else{
            tail.next = node;
            tail = tail.next;
            size += 1;
        }


    }

    public void addFirst(int data){
        Node node = new Node(data);

        node.next = head;
        head = node;
        size++;
    }
    public int indexOf(int id){
        if (isEmpty())
            return -1;

        int pos = 0;
        Node current = head;

        while (current != null){
            if (id == current.id)
                return pos;
            current = current.next;
            pos++;
        }

        return -1;

    }

    public void deleteById(int id){

       Node current = head;
       Node prev = head;

       while (current != null){
           if (current.id == id){
               if (current.id == head.id){
                   head = head.next;
                   current.next = null;
               } else if (current.id == tail.id) {
                   prev.next = null;
                   tail = prev;
               }else{
                   prev.next = current.next;
                   current.next = null;
               }
               size--;
           }

           prev = prev.next;
           current = current.next;
       }





    }

    public int size() {
        return size;
    }
    public void printNodes(){
        Node current = head;
        while (current != null){
            System.out.println("Current id is -> " + current.id );
            current = current.next;
        }

    }
    public boolean isEmpty(){
        return head == null;
    }



}