package com.fourthset.specialprog;

import java.util.PriorityQueue;
import java.util.Queue;

import org.testng.annotations.Test;

public class QueueMethods {
	
	@Test(enabled=false)
	public void priorityQueueMethods()
	{
		Queue<Integer> q = new PriorityQueue<Integer>();
		for (int i=10; i>=0; i--)
		{
			q.offer(i);
		}
		System.out.println(q);
		q.add(12);
		System.out.println(q);
		q.poll();
		System.out.println(q);
		q.remove();
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q);
		q.remove(10);
		System.out.println(q);
	}
	@Test(enabled=false)
	public void priorityQueueConsWithInteger()
	{
		Queue<Integer> q = new PriorityQueue<Integer>(12, new IntegerMyComparator());
		for (int i=0; i<=10; i++)
		{
			q.offer(i);
		}
		System.out.println(q);
	}
	@Test
	public void priorityQueueConsWithString()
	{
		Queue<String> q = new PriorityQueue<String>(12, new StringMyComparator());
		q.add("Adhitya");
		q.offer("Deepthi");
		q.offer("Naveena");
		q.add("Shaalu");
		q.offer("Maria");
		System.out.println(q);
	}
	@Test
	public void priorityQueueString()
	{
		Queue<String> q = new PriorityQueue<String>();
		q.add("Adhitya");
		q.offer("Deepthi");
		q.offer("Naveena");
		q.add("Shaalu");
		q.offer("Maria");
		System.out.println(q);
	}

}
