package com.itsc.toDoListApp;
public class Node {
     Task task;
     Node next;

    Node(Task task) {
        this.task = task;
        next = null;
    }
}
