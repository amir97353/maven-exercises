import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;
public class mavenExercises {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String");
        String userInput = sc.nextLine();

        if((StringUtils.isNumeric(userInput))){
            System.out.println("It is a number");
        }else{
            System.out.println("It is not a number");
        }

        String Swapped = StringUtils.swapCase(userInput);
        System.out.println(Swapped);
        String Reverse = StringUtils.reverse(Swapped);
        System.out.println(Reverse);
    }
}
