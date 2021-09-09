package com.mycompany.datastructuress;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue(3);
        int m = sc.nextInt();
        while (m != 0) {
            queue.append(m);
            m = sc.nextInt();
        }
        queue.get();
    }
}
