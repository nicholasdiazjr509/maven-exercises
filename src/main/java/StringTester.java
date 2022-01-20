import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class StringTester {
    //public static void main(String[] args) {
    //Scanner sc = new Scanner(System.in);

    private static void isNumber(String str) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter a string: ");

        System.out.println("Enter something.");
        String userInfo = sc.nextLine();
//    if(StringUtils.isNumeric(userInfo)){
//        System.out.printf("%s is numeric!", userInfo);
//    }else {
//        System.out.printf("%s is not numeric!", userInfo);
//    }
//    String flippedCase = StringUtils.swapCase(userInfo);
//        System.out.printf("Did you know if you swap the case of %s you ge5t %s?", userInfo, flippedCase);
//    String reversedIn = StringUtils.reverse(userInfo);
//        System.out.printf("Did you know if you reverse %s you get %s?%n", userInfo, reversedIn);
        if (StringUtils.isNumeric(userInfo)) {
            System.out.println(userInfo + " is a Number!");
        }else{
            System.out.println(userInfo + " is Not a Number.");
        }
    }

    public static String flipCase(String input) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter something.");
        String userInfo = sc.nextLine();

              return StringUtils.swapCase("Flipcase of what you entered: " + userInfo);
    }

    public static String reverseCase(String input) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter something.");
        String userInfo = sc.nextLine();
        System.out.println("Reversecase of what you entered: " + userInfo);

        return StringUtils.reverse(userInfo);
    }

    public static void main(String[] args) {
        isNumber("");

        System.out.println(reverseCase(""));
        System.out.println(flipCase(""));

    }
}


