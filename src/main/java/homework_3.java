package src.main.java;

public class homework_3 {
    public static void main(String[] args) {
        int a = 0;
        a = new A().increment(a);
        if (a != 1) {
            throw new RuntimeException("Expected a to be 1");
        }
    }
    private static class A {
        public int increment(int a) {
            return ++a;
        }
    }
}
