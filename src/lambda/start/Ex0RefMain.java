package lambda.start;

public class Ex0RefMain {


    public static void program(String hello) {
        System.out.println("프로그램 시작");
        System.out.println("Hello " + hello);
        System.out.println("프로그램 종료");
    }
    public static void main(String[] args) {
        program("Java");
        program("Spring");
    }

}
