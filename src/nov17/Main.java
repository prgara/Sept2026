package nov17;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Stack<String> history  = new Stack<>();
        history.push("Google");
        history.push("big O Notation");
        history.push("Time & Space Complexity");
        history.push("GFG");

//        System.out.println(history.peek());
//        System.out.println(history.pop());
//        System.out.println(history.pop());
//        System.out.println(history.peek());
//        System.out.println(history.peek());
//        System.out.println(history.pop());
//        System.out.println(history.pop());
//        System.out.println(history.isEmpty());


        Queue<String> printerjobs = new LinkedList<>();
        printerjobs.offer("Doc A");
        printerjobs.offer("Doc B");
        printerjobs.offer("Doc C");
        printerjobs.add("Doc D");



//        System.out.println(printerjobs.peek());
//        System.out.println(printerjobs.poll());
//        System.out.println(printerjobs.poll());
//        System.out.println(printerjobs.poll());
//        System.out.println(printerjobs.isEmpty());


        Deque<String> deque = new ArrayDeque<>();

        //STACK
//        deque.push("A");
//        deque.push("B");
//
//        System.out.println(deque.pop());
//        System.out.println(deque.pop());

        //Queue
        deque.offerLast("Job 1");
        deque.offerLast("Job 2");

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());


    }
}
