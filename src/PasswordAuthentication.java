import java.util.Scanner;

public class PasswordAuthentication {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int meetsConditions = 0;
        final String specialCharsRegex = ".*[~!@#$%^&*()\\-=+_].*";

        while ((meetsConditions < 3)){
            System.out.print("\nEnter a password: ");
            String password = input.nextLine();

            if ((password.length() >= 8) && (password.length() <= 16)) {
                System.out.println("Length = YES");
            } else {
                System.out.println("Password does not meet the minimum length requirement.");
                System.out.print("Re-");
                continue;
            }
            
            if (password.toLowerCase() != password){
                System.out.println("Lowercase = YES");
                meetsConditions++;
            } else {    System.out.println("Lowercase = NO");   } 
            if (password.toUpperCase() != password){
                System.out.println("Uppercase = YES");
                meetsConditions++;
            } else {    System.out.println("Uppercase = NO");   }

            if (password.matches(specialCharsRegex)){
                System.out.println("Special characters = YES");
                meetsConditions++;
            } else {    System.out.println("Special characters = NO");   }

            if (password.matches(".*[0-9].*")){
                System.out.println("Numbers = YES");
                meetsConditions++;
            } else {    System.out.println("Numbers = NO");   }

            if (meetsConditions >= 3) {
                System.out.println("Password meets requirements.");
            } else {
                System.out.println("Password does not meet all requirements.");
            }
        }
        input.close();
    }
}
