package Methods;

public class MethodExample1 {
    //f(x)= 5x+10
    static int f(int x){
        return 5*x+10;

    }
    //g(x)=y+2x
    static int g(int x, int y){
        return y+2*x;
    }

    public static void main(String[] args) {
        System.out.println(f(10));
        System.out.println(g(10,20));
    }
}
