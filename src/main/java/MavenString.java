import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input here: ");
        String input = scanner.nextLine();

        if(StringUtils.isNumeric(input)) {
            System.out.println("You entered " + input);
            System.out.println(input + " is a number");
        } else {
            System.out.println("You entered " + input);
            System.out.println(input + " is not a number");
        }

        String string = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("swapCase example: " + StringUtils.swapCase(string));
        System.out.println("reverse example: " + StringUtils.reverse(string));

    }

}
