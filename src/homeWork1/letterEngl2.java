package homeWork1;
import java.util.Scanner;
public class letterEngl2 {
    public static void test2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите букву");
        String letter = scanner.nextLine().toLowerCase();
        switch(letter){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Гласная буква");
                break;
            default:
                System.out.println("Согласная букаа");
                break;

        }
    }
}