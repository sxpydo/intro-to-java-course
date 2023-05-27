package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // create an empty linked list
        LinkedList<Integer> integers = new LinkedList<>();

        //  - add 4 as the first element of the list
        integers.addFirst(4);

        //  - then add 5, 6, 8, 2, 9 to the the list
        integers.add(5);
        integers.add(6);
        integers.add(8);
        integers.add(2);
        integers.add(9);

        //  - add another 2 as the last element of the list
        integers.addLast(2);

        //  - add 4 as the 3rd element of the list
        integers.add(2, 4);

        //  - invoke the method element() on the list and print the result on the screen
        System.out.println(integers.element());

        //  - return the list
        return integers;
    }

    public Stack<Integer> useStack() {
        // create an empty stack
        Stack<Integer> integersStack = new Stack<>();

        //  - add 5, 6, 8, 9 to the the stack
        integersStack.add(5);
        integersStack.add(6);
        integersStack.add(8);
        integersStack.add(9);

        //  - print the first element of the stack on the screen
        System.out.print(integersStack.firstElement());

        //  - print the last element of the stack on the screen
        System.out.print(integersStack.lastElement());

        //  - invoke the method pop() on the stack and print the result on the screen
        System.out.print(integersStack.pop());

        //  - invoke the push(4) method on the stack
        integersStack.push(4);

        //  - return the stack
        return integersStack;
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // create an empty arrayDeque
        ArrayDeque<Integer> intDeque = new ArrayDeque<>();

        //  - add 5, 6, 8, 9 to the the stack
        intDeque.add(5);
        intDeque.add(6);
        intDeque.add(8);
        intDeque.add(9);

        //  - print the first element of the queue on the screen
        System.out.print(intDeque.getFirst());

        //  - print the last element of the queue on the screen
        System.out.print(intDeque.getLast());

        //  - invoke the method poll() on the queue and print the result on the screen
        System.out.print(intDeque.poll());

        //  - invoke the element() method on the queue and print the result on the screen
        System.out.print(intDeque.element());

        //  - return the queue
        return intDeque;
        
    }

    public HashMap<Integer, String> useHashMap() {
        // create an empty hash map
        HashMap<Integer, String> langHashMap = new HashMap<>();

        //  - add {1, TypeScript} entry to the map
        langHashMap.put(1, "TypeScript");
        //  - add {2, Kotlin} entry to the map
        langHashMap.put(2, "Kotlin");
        //  - add {3, Python} entry to the map
        langHashMap.put(3, "Python");
        //  - add {4, Java} entry to the map
        langHashMap.put(4, "Java");
        //  - add {5, JavaScript} entry to the map
        langHashMap.put(5, "JavaScript");
        //  - add {6, Rust} entry to the map
        langHashMap.put(6, "Rust");

        //  - determine the set of keys from the map and print it on the screen
        System.out.print(langHashMap.keySet());
        //  - determine the set of keys from the map and print it on the screen
        System.out.print(langHashMap.values());
        //  - determine whether the map contains "English" as a language and print the result on the screen
        System.out.print(langHashMap.containsValue("English"));
        
        //  - return the map
        return langHashMap;
    }

    public String getName() {
        return "Collections Exercises";
    }
}
