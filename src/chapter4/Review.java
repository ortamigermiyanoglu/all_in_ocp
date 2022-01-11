package chapter4;

import java.util.ArrayList;

public class Review {

    public static void main(String[] args) {
        for (int i = 0; i > 100; i--) {
            System.out.println(i);
        }

        boolean cc;
        if (cc = true) System.out.println();

        final var one = 1;
        final var two = 2;
        switch (one) {
            case 1:
            case two:
            default:
            case 3:
                break;
        }

        int height = 1;

        L1:
        while (height++ < 10) {
            long humidity = 12;
            L2:
            do {
                if (humidity-- % 12 == 0) break L2;
                int temperature = 30;
                L3:
                for (; ; ) {
                    temperature++;
                    if (temperature > 50) break L2;
                }
            } while (humidity > 4);
        }


        var myList = new ArrayList<Integer>();
        myList.add(8);

        for (Object i : myList) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 2; j++) {
                System.out.println();
            }
        System.out.println(i);
        System.out.println(i);

        }

    }
}
