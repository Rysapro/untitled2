public class Main {

    static int func(int a, int b, int c){
        int x = (int) ((b + Math.sqrt(b*b + 4*a*c)/2*a) - (a*a*a*c) + (b*(-b)));
        System.out.println(x);
        return x;

    }

    public static void main(String[] args) {
        func(1,3,2);
    }
}