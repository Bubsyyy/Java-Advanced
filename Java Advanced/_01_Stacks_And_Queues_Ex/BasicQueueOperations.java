package _01_Stacks_And_Queues_Ex;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int x = scanner.nextInt();

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int count = 1; count <= n; count++) {
            queue.offer(scanner.nextInt());
        }

        for (int count = 1; count <= s; count++) {
            queue.poll();
        }

        if (queue.contains(x)) {
            System.out.println("true");
        } else {
            if (!queue.isEmpty()) {
                System.out.println(Collections.min(queue));
            } else {
                System.out.println("0");
            }
        }

    }
}