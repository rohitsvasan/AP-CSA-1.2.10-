import java.util.Scanner;

public class madLibsRohit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fixedPhrase1 = "It was 5 AM. I woke up and decided to ";
        String fixedPhrase2 = ". Everything seemed to be going smoothly at first, but all of a sudden, ";
        String fixedPhrase3 = " came out of nowhere and proceeded to ";
        String fixedPhrase4 = "! My entire day ceased to be the same after that cause (he/she) is a ";
        String fixedPhrase5 = "! Eventually, I decided to head back home and ";
        String fixedPhrase6 = ". Overall, today was a ";
        String fixedPhrase7 = " day.";

        System.out.println("Enter what you would like to put for the first blank of the mad lib.");
        String blank1 = sc.nextLine();
        System.out.println("Enter what you would like to put for the second blank of the mad lib.");
        String blank2 = sc.nextLine();
        System.out.println("Enter what you woudl like to put for the third blank of the mad lib.");
        String blank3 = sc.nextLine();
        System.out.println("Enter what you would like to put for the fourth blank of the mad lib.");
        String blank4 = sc.nextLine();
        System.out.println("Enter what you would like to put for the fifth blank of the mad lib.");
        String blank5 = sc.nextLine();
        System.out.println("Enter what you would like to put for the sixth blank of the mad lib.");
        String blank6 = sc.nextLine();

        System.out.println("\nHere is the full completed mad lib: ");
        System.out.println(fixedPhrase1 + blank1 + fixedPhrase2 + blank2 + fixedPhrase3 + blank3 + fixedPhrase4 + blank4 + "\n" + fixedPhrase5 + blank5 + fixedPhrase6 + blank6 + fixedPhrase7);

        sc.close();
 
    }
}
