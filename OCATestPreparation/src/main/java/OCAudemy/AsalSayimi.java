package OCAudemy;

public class AsalSayimi {

    public static void main(String[] args) {
        int num=19;
        int remainder=num % 2;
        //System.out.println(remainder);

        boolean isPrime=true;

        if(num==1){
            System.out.println("sayi asal degildir");
            return;

        }
        if(num<1){
            System.out.println("Gecersiz sayi");
        }

        for(int i=2; i<num ; i++){
            if(num % i==0){
                isPrime=false;
            }


            }
        if (isPrime){
            System.out.println("sayi asaldir");
        }
        else {
            System.out.println("sayi asal degildir");
        }
        }
    }

