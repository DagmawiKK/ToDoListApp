package com.itsc.toDoListApp;
public class toDoList {
    private Node head;

    void addToDo(Task task) {
        Node newNode = new Node(task);

        if (head == null) {
            head = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    void markToDoAsCompleted(String title) {
        Node current = head;

        while (current != null) {
            if (current.task.getTitle().equals(title)) {
                current.task.markCompleted();
                return;
            }
            current = current.next;
        }
        System.out.println("Task not found");
    }
    void viewToDoList() {
        Node current = head;
        while (current != null) {
            System.out.println("Title: "+ current.task.title);
            System.out.println("Description: " + current.task.description);
            System.out.println("Is Completed: " + current.task.isCompleted());
            System.out.println("-----------------------------------");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        toDoList listOfThingsToDo = new toDoList();

        listOfThingsToDo.addToDo(new Task("DSA Project", "Completed DSA Assignment"));
        listOfThingsToDo.addToDo(new Task("Networking Exam", "Networking Final exam is tomorrow"));
        listOfThingsToDo.addToDo(new Task("Math exam", "Study for finals"));

        listOfThingsToDo.markToDoAsCompleted("DSA Project");

        listOfThingsToDo.viewToDoList();

    }
}
