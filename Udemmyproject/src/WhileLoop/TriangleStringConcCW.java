package WhileLoop;

public class TriangleStringConcCW {
    public static void main(String[] args) {
        /*String star="*";

        for(int i=0; i<=5;i++){
            star=star+ " * ";
            System.out.println(star);


        }
    }
}

         */
        String star =("1*");
        int count=0;
        do{

            System.out.println(star);
            star =star + "*";
            count++ ;
        }
        while(count<4);
    }
}
