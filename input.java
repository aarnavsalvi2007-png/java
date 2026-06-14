import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.nextLine();


        System.out.println("enter the number to check even or odd = ");
        int num = sc.nextInt();

        String result = num % 2 == 0 ? "even" : "odd";
        System.out.println("Hey "+ name +", Your result is "+ result);
        

        
    }
}