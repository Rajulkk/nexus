package collections.impl;

import collections.core.List;

public class SingleLinkedList implements List {

    Node first = null;

    public void add(String n) {
        Node newNode = new Node(n, null);
        Node curr = first;
        if (first == null) {
            first = newNode;
        } else {
            while(curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    public void remove(String n) {
    }

    public void removeLast() {
        Node curr = first;
        if (first == null) {
            System.out.print("Empty list");
        } else {
            while(curr.next != null) {
                curr = curr.next;
            }
            curr = null;
        }
    }

    public void get(String n) {
    }

    public void show() {
        Node curr = first;
        System.out.println("--------------------------");
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println(" " + size());
    }

    private int size()
    {
        int count = 0;
        Node curr = first;
        if(curr != null)
        {
            count++;
            while(curr.next != null)
            curr = curr.next;
        }

        return count;
    }

    @Override
    public void addAt(int i, String d) {
        Node curr = first;
        Node prev = first;
        int index = 0;
        if(i > size()){
            System.out.print("Error: Index out of bound");
            return;
        }

        Node newNode = new Node(d, null);
        if(curr == null){
            first = newNode;
        }
        else{
            while(curr.next != null)
            {

                if(index == i)
                {

                }
                prev = curr;
                curr = curr.next;
            }
        }
    }

    @Override
    public void remove(int i) {

    }

    @Override
    public void get(int i) {

    }

    @Override
    public boolean isEmpty() {
        return (first == null);
    }

    class Node {
        Object data;
        Node next;

        Node(Object d, Node n) {
            data = d;
            next = n;
        }
    }
}
