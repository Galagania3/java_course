package src.main.java;

public class homework_2 {
    public static void main(String[] args) {
        //задание 1
        int a = 2;
        int b = a++ + (--a * ++a);
        System.out.println("Значение переменной b: " + b);

        //задание 2
        int c = 256;
        int d = c >> 7;
        System.out.println("Значение переменной d: " + d);
    }
}