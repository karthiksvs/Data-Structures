package Randomized_Q;

import java.util.*;
public class RandomizedQueue<Item> implements Iterable<Item>
	{
	    private Item[] q;
	    private int N;
	    public RandomizedQueue()
	    {
	        q = (Item[]) new Object[2];
	        N = 0;
	    }
	    
	    public boolean isEmpty()
	    {
	        return N == 0;
	    }
	    
	    public int size()
	    {
	        return N;
	    }
	    
	    private void resize(int capacity)
	    {
	        Item[] copy = (Item[]) new Object[capacity];
	        for(int i = 0; i < N; i++)
	        {
	            copy[i] = q[i];
	        }
	        q = copy;
	    }
	    
	    public void enqueue(Item item)
	    {
	        if(item == null)
	        {
	            throw new NullPointerException();
	        }
	        if( N == q.length)
	        {
	            resize(2*q.length);
	        }
	        q[N++] = item;
	    }
	    
	    public Item dequeue()
	    {
	        if(size() == 0)
	        {
	            throw new NoSuchElementException();
	        }
	        int rand = generateRandomInt(N);
	        Item value = q[rand];
	        //q[rand] = null;
	        if(rand != N-1) {q[rand] = q[N-1];}
	        q[N-1] = null;
	        N--;
	        if(N > 0 && N <= q.length/4)
	        {
	            resize(q.length/2);
	        }
	        return value;
	    }
	    public static int generateRandomInt(int upperRange){
	        Random random = new Random();
	        return random.nextInt(upperRange);
	    }
	    public Item sample()
	    {
	        if(size() == 0)
	        {
	            throw new NoSuchElementException();
	        }
	        int rand = generateRandomInt(N);
	        Item value = q[rand];
	        if(N > 0 && N == q.length/4)
	        {
	            resize(q.length/2);
	        }
	        return value;
	    }
	    	    
	    public Iterator<Item> iterator()
	    {
	        return new RandomIterator();
	    }
	    
	    private class RandomIterator implements Iterator<Item>
	    {
	        private int randLoc = 0;
	        //private int covered = 0;
	        private int copySize = N;
	        private Item[] copy = (Item[]) new Object[copySize];
	        
	        private RandomIterator()
	        {
	            for(int i = 0; i<copySize;i++)
	            {
	                copy[i] = q[i];
	            }
	        }
	        
	        public boolean hasNext()
	        {
	            return copySize > 0;
	        }
	        
	        public void remove()
	        {
	            throw new UnsupportedOperationException();
	        }
	        
	        public Item next()
	        {
	            if(copySize == 0)
	            {
	                throw new NoSuchElementException();
	            }
	            randLoc = generateRandomInt(copySize);
	            Item currentItem = copy[randLoc];
	            if(randLoc != copySize-1)
	            {
	                copy[randLoc] = copy[copySize-1];
	            }
	            copy[copySize-1] = null;
	            copySize--;
	            return currentItem;
	        }
	    }
	    
	    public static void main(String[] args)
	    {      
	         RandomizedQueue<String> test2 = new RandomizedQueue<String>();
	         test2.enqueue("to");
	         test2.enqueue("be");
	         test2.enqueue("or");
	         test2.enqueue("not");
	         test2.enqueue("aman");
	         test2.enqueue("agra");
	         test2.enqueue("cool");
	         for(String s: test2)
	         {
	             for(String s2: test2)
	             {
	                 System.out.println(s2 += " ");
	             }
	             System.out.print("  "+s +"="+" ");
	         }
	         
	    }
	}