import java.util.Scanner;

public class voting {
    public static String elgible(int age){
        if (age > 18){
            return "elgible to vote";
        }
        else{
            return "Not elgible to vote";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.err.println(elgible(age));
    }

}
