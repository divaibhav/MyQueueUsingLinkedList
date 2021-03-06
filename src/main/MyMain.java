/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 19-Feb-20
 *  Time: 2:49 AM
 */
package main;

import myqueue.MyQueue;

public class MyMain {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(1000);
        System.out.println(queue.getSize());
        System.out.println(queue.peek().getData() + " element at front");
        queue.enqueue(300);
        queue.enqueue(400);
        queue.enqueue(200);
        System.out.println(queue.dequeue().getData() + " element deleted from queue");
        System.out.println("the size queue is = " + queue.getSize());

    }
}
