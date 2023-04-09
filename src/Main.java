import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter a number in base 2, 8, 10 or 16: ");
        Scanner temp = new Scanner(System.in);
        String Number = temp.nextLine();

        System.out.println("Which base is your number?");
        temp = new Scanner(System.in);
        int Base = temp.nextInt();

        Number c = new Number(Number, Base);
        System.out.println(c.toString());
    }
}
