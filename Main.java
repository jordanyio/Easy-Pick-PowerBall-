package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class Main {
    static Random rand = new Random();
    public static void main(String[] args) {
        drawLotteryTicket();
    }

    public static void drawLotteryTicket() {
        List<Integer> nums = new ArrayList<>();
        int upperbound;
        int int_random;
        int i = 0;
        // Draw 5!
        while (i < 5) {
            upperbound = 70;
            int_random = rand.nextInt(upperbound);

            if (!nums.contains(int_random) && int_random > 0) {
                nums.add(int_random);
                i++;
            }
        }
        Collections.sort(nums);
        System.out.println(nums);
        // Bonus Number!
        upperbound = 26;
        int_random = rand.nextInt(upperbound);
        System.out.println("Bonus Number!: " +int_random);
    }
}
