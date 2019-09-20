package Methods;


public class RandomExamples {


    public static int createRandomPassword() {
        //Math.random() (max -min)+min;
        double randomNumber = Math.random() * (1000000 - 100000) + 100000;
        int result = (int) randomNumber;
        return result;
    }
    public static String createRandomPassString(){
        String password=""; //string container created
        double rand;  //variable for random number
        for (int i=1; i<7; i++){
            rand= Math.random()*10; //produce random number 0-9
            int randInt =(int) rand; //type casting double to int
            rand= Math.random();
            password = password +randInt; //concat


        }
        return password;

    }
    public static String passwordRandomChar() {
        String password = "";
        double rand; // to store double value;
        int randInt;
        char randChar;
        for (int i=6; i>=1; i--){

            rand = Math.random()*(122-97)+97;
            randInt = (int) rand;
            randChar= (char) randInt;
            password = password + randChar;





        }
        return password;
    }

    public static String passwordRandomChar1() {
        String password = "";
        double rand; // to store double value;
        int randInt;
        char randChar;

        for (int i = 1; i < 4; i++) {
            rand = Math.random() * (122 - 97) + 97;
            randInt = (int) rand;
            randChar = (char) randInt;

            password = password +  randChar;
        }

            for (int j = 1; j < 4; j++) {
                rand = Math.random() * 10;
                randInt = (int) rand;

                password = password +  randInt ;

            }


            return password;
        }

    public static void main(String[] args) {
        System.out.print(passwordRandomChar1());
    }


    }




