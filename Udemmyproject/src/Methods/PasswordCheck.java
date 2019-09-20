package Methods;

public class PasswordCheck {


     public static String passwordCheck(String password){
        String answer="";

        if (password.length()>=6){
            answer="Password is ok";

        }
        else{

        answer="Password should be at least 6 character";
        }
        return answer;
    }

    public static void main(String[] args) {
         String qanswer= PasswordCheck.passwordCheck("456");
        System.out.println(qanswer);




    }
}
