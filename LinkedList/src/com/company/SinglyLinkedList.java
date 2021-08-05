package com.company;

import java.util.Scanner;

public class SinglyLinkedList {
    public Node start = null;

    class Node {
        private int data;
        private Node next;

        public Node(int d) {
            this.data = d;
            this.next = null;
        }
    }

    public void createNode(int d) {
        Node newNode = new Node(d);
        if (start == null) {
            start = newNode;
        } else {
            Node ptr = start;
            while (ptr.next != null)
                ptr = ptr.next;
            ptr.next = newNode;
            ptr = newNode;
        }
    }

    public void insertAtStart(int d) {
        Node newNode = new Node(d);
        newNode.next = start;
        start = newNode;
    }

    public void insertAtEnd(int d) {
        Node newNode = new Node(d);
        Node ptr = start;
        while (ptr.next != null)
            ptr = ptr.next;
        ptr.next = newNode;
        ptr = newNode;
    }

    public void insertAfterANode(int d,int num) {
        Node newNode = new Node(d);
        Node ptr = start;
        Node prePtr = ptr;
        while (prePtr.data!=num){
            prePtr = ptr;
            ptr = ptr.next;
        }
        prePtr.next = newNode;
        newNode.next = ptr;
    }

    public void insertBeforeNode(int d,int num) {
        Node newNode = new Node(d);
        Node ptr = start;
        Node prePtr = ptr;
        while (ptr.data!=num){
            prePtr = ptr;
            ptr = ptr.next;
        }
        prePtr.next = newNode;
        newNode.next = ptr;
    }

    public void deleteFromStart() {
        Node ptr = start;
        start = start.next;
    }

    public void deleteFromEnd() {
        Node ptr = start;
        Node prePtr = ptr;
        while (ptr.next != null) {
            prePtr = ptr;
            ptr = ptr.next;
        }
        prePtr.next = null;
    }

    public void deleteAfterNode(int num) {
        Node ptr = start;
        Node prePtr = ptr;
        while (prePtr.data!=num){
            prePtr = ptr;
            ptr = ptr.next;
        }
        prePtr.next = ptr.next;
    }

    public void deleteBeforeNode(int num) {
        Node ptr = start;
        Node prePtr = ptr;
        while (ptr != null){
            prePtr = ptr;
            ptr = ptr.next;
            if(ptr.next != null && ptr.next.data == num)
                break;
        }
        prePtr.next = ptr.next;
    }

    public void display() {
        if (this.start == null) {
            System.out.println("List is empty.");
        } else {
            System.out.println("Nodes of singly linked list: ");
            Node ptr = this.start;
            while (ptr != null) {
                System.out.print(ptr.data + " ");
                ptr = ptr.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sl = new SinglyLinkedList();
        int option = 0;
        while (option != 11) {
            System.out.println("----- Menu -----");
            System.out.println("1. Create a node in the list: ");
            System.out.println("2. Display the list: ");
            System.out.println("3. Insert at start: ");
            System.out.println("4. Insert at end: ");
            System.out.println("5. Insert after a node: ");
            System.out.println("6. Insert before a node: ");
            System.out.println("7. Delete from start: ");
            System.out.println("8. Delete from End: ");
            System.out.println("9. Delete after a node: ");
            System.out.println("10. Delete before a node: ");
            System.out.println("11. Exit");
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the option: ");
            option = s.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Enter the data: ");
                    int d = s.nextInt();
                    sl.createNode(d);
                    break;
                case 2:
                    System.out.println("The linked list is : ");
                    sl.display();
                    break;
                case 3:
                    System.out.println("The number you want to insert at start: ");
                    int d1 = s.nextInt();
                    sl.insertAtStart(d1);
                    break;
                case 4:
                    System.out.println("The number you want to insert at end: ");
                    int d2 = s.nextInt();
                    sl.insertAtEnd(d2);
                    break;
                case 5: System.out.println("Enter the value of the node after which you want to insert the new node:");
                    int p = s.nextInt();
                    System.out.println("The number you want to insert after a node: ");
                    int d3 = s.nextInt();
                    sl.insertAfterANode(d3,p);
                    break;
                case 6: System.out.println("Enter the value of the node before which you want to insert the new node:");
                    int p1 = s.nextInt();
                    System.out.println("The number you want to insert after a node: ");
                    int d4 = s.nextInt();
                    sl.insertBeforeNode(d4,p1);
                    break;
                case 7:
                    System.out.println("After deleting a node from start : ");
                    sl.deleteFromStart();
                    break;
                case 8:
                    System.out.println("After deleting a node from end : ");
                    sl.deleteFromEnd();
                    break;
                case 9:
                    System.out.println("Enter the value of the node after which you want to delete a node:");
                    int p3 = s.nextInt();
                    System.out.println("Deletion after a node  : ");
                    sl.deleteAfterNode(p3);
                    break;
                case 10:
                    System.out.println("Enter the value of the node before which you want to delete a node:");
                    int p4 = s.nextInt();
                    System.out.println("Deletion before a node : ");
                    sl.deleteBeforeNode(p4);
                    break;
                case 11:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");

            }
        }
    }
}
