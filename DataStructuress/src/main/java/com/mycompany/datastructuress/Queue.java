package com.mycompany.datastructuress;

public class Queue {
    private int[] values;
    private int front, rear;
    
    public Queue(int size) {
        front = -1;
        rear = -1;
        values = new int[size];
    }
    
    public void append(int num) {
        int element;
        if(isFull()) {
            element = values[front];
            System.out.printf("Dequeued value: %d%n", element);
            front = (front + 1) % values.length;
            rear = (rear + 1) % values.length;
            values[rear] = num;
        } else {
            if(front == -1) {
                front = 0;
            }
            rear = (rear + 1) % values.length;
            values[rear] = num;
            throw new QueueException("Stack is full");
        }
    }
    
    public void get() {
        for (int i = 0; i < values.length; i++) {
            System.out.printf("%d ", values[i]);
        }
        throw new QueueException("Stack is empty"); 
    }
    
    public boolean isEmpty() {
        if (front == -1) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean isFull() {
        if (front == 0 && rear == values.length-1) {
            return true;
        }
        if(front == rear + 1) {
            return true;
        } else {
            return false;
        }
    }
}
