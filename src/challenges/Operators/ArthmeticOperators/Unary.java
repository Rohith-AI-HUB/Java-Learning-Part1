package src.Challenges.Operators.ArthmeticOperators;

public class Unary {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);
        int x = a++;
        System.out.println(x);
        int y = ++x;
        System.out.println(y);
        int z = --y;
        System.out.println(z);
        int w = z--;
        System.out.println(w);
        System.out.println(-a);
    }
}
