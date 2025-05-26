package lambda.start;

import java.util.Random;
//내코드
public class Ex1RefMain {

    public static class HelloDice extends checkTime {
        @Override
        public void task() {
            int randomValue = new Random().nextInt(6) + 1;
            System.out.println("주사위 = " + randomValue);
        }

    }

    public static class HelloSum extends checkTime {
        @Override
        void task() {
            for (int i = 1; i <= 3; i++) {
                System.out.println("i = " + i);
            }
        }
    }

    public static void main(String[] args) {
        checkTime helloDice = new HelloDice();
        helloDice.run();

        HelloSum helloSum = new HelloSum();
        helloSum.run();



    }

}
