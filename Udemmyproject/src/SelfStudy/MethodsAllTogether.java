package SelfStudy;

public class MethodsAllTogether {

    static int balance= 2000000; //attributes or property

    public static void main(String[] args) {
        int number= MethodsAllTogether.balance;
        System.out.println(number);
    }

     void printNumbers(){ //methods

        int start =1;
        while(start<100){
            System.out.println(start);
            start++;

        }

    }
    public static void printMultipicationTable(){
        for(int i=1 ; i<11; i++){
            for(int j=1 ; j<11; j++){
                System.out.println(i + "x" + j + "=" + i*j);
            }
        }
    }
    public void printOddNumbers(int start, int stop) {
        if (start >= stop) {
            int number = start;
            do {
                System.out.println(number);
                number++;

            } while (number < stop);


            }
            else{
                System.out.println("start should be smaller than stop");
            }
        }
    }

