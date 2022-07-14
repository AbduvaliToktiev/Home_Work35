package task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            numbers.add(i + 1);
        }
        for (Integer i : numbers) {
            if (i % 2 == 0) {
                List<Integer> honest = new ArrayList<>();
                honest.add(i);
                System.out.print(honest + " \n");
            }
            if (i % 2 != 0) {
                List<Integer> odd = new ArrayList<>();
                odd.add(i);
                System.out.print(odd + " ");
            }
        }
    }
}
