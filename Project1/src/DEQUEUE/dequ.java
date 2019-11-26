package DEQUEUE;

import java.util.*;

public class dequ<Item> implements Iterable<Item> {
    private Node first;
    private Node last;
    private int count;

    private class Node {
        private Item item;
        private Node next;
        private Node prev;
    }
    private class ListIterator implements Iterator<Item> {
        private Node current;
        public ListIterator(Node initialNode) {
            current = initialNode;
        }
        public boolean hasNext() {
            return current != null;
        }
        public Item next() {
            if (!hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            Item item = current.item;
            current = current.next;
            return item;
        }
        public void remove() {
            throw new java.lang.UnsupportedOperationException();
        }
    }
    public dequ() {
        // construct an empty dequ
        count = 0;
        first = null;
        last = null;
    }
    public boolean isEmpty() {
        // is the dequ empty?
        return first == null;
    }
    public int size() {
        // return the number of items on the dequ
        return count;
    }
    public void addFirst(Item item) {
        // add the item to the front
        if (item == null) {
            throw new java.lang.NullPointerException();
        }
        if (count == 0) {
            first = new Node();
            first.item = item;
            last = first;
        } else {
            Node oldfirst = first;
            first = new Node();
            first.item = item;
            first.next = oldfirst;
            oldfirst.prev = first;
        }
        count++;
    }
    public void addLast(Item item) {
        // add the item to the end
        if (item == null) {
            throw new java.lang.NullPointerException();
        }
        Node newnode = new Node();
        newnode.item = item;
        if (last != null) {
            newnode.prev = last;
            last.next = newnode;
        }
        last = newnode;
        if (first == null) {
            first = last;
        }
        count++;
    }
    public Item removeFirst() {
        // remove and return the item from the front
        if (isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        Item item = first.item;
        if (count == 1) {
            last = null;
            first = null;
        } else {
            first.next.prev = null;
            first = first.next;
        }
        count--;
        return item;
    }
    public Item removeLast() {
        // remove and return the item from the end
        if (isEmpty()) {
            throw new java.util.NoSuchElementException();
        }
        Item item = last.item;
        if (last.prev == null) {
            last = null;
            first = null;
        } else {
            last.prev.next = null;
            last = last.prev;
        }
        count--;
        return item;
    }
    public Iterator<Item> iterator() {
        // return an iterator over items in order from front to end
        return new ListIterator(first);
    }
    public static void main(String args[]) {
    	LinkedList<Integer> DQ = new LinkedList<Integer>(); 
DQ.addFirst(7855642); 
    DQ.addLast(35658786); 
    DQ.addLast(5278367); 
    DQ.addFirst(74381793); 
    Iterator iteratorVals = DQ.iterator(); 
    System.out.println("The iterator values"+ " of dequ are:"); 
    while (iteratorVals.hasNext()) { 
        System.out.println(iteratorVals.next()); 
    }
    DQ.iterator();
    DQ.removeFirst();
    DQ.removeLast();
    DQ.iterator();
    DQ.size();
     iteratorVals = DQ.iterator(); 
    System.out.println("The iterator values"+ " of dequ are:"); 
    while (iteratorVals.hasNext()) { 
        System.out.println(iteratorVals.next()); 
    } 

    }
}