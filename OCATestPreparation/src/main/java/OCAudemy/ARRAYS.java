package OCAudemy;

public class ARRAYS {
    public static void main(String[] args) {

        String stdnt1 = "engin";
        String stdnt2 = "derin";
        String stdnt3 = "salih";
        String stdnt4 = "ahmet";
        String stdnt5 = "mehmet";
        System.out.println("++++++++++++++++++++++++++++++");

        String[] students = new String[3];
        students[0]= "ali";
        students[1]= "veli";
        students[2]= "ahmet";

        for(int i=0 ; i< students.length; i++){
            System.out.println(students[i]);
        }
        System.out.println("++++++++++++++++++++++++++++++++++++");
        for (String student:students){
            System.out.println(student);
        }
    }
}