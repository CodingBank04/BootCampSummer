package Methods;

public class MethodClasswork {
    public static void main(String[] args) {

        //double circlePerimeter = calculatePerimeterCircle(15);
        if ( calculatePerimeterCircle(15)>= 20) {
            System.out.println("Large Circle");
        } else {
            System.out.println("small circle");
        }
    }

           public static double calculatePerimeterCircle(int radius){
        double perimeter=1;
        perimeter=2*3.14*radius;
        return perimeter;
    }
}
