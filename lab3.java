import java.util.Scanner;
import java.util.regex.*;

public class lab3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите пароль: ");
        String p1 = sc.nextLine();
        sc.close();
        String pattern = "(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]{8}|(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[_])[a-zA-Z0-9_]{8}";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(p1);

        if (m.find()) {
            System.out.println("Пароль надежый");
        }
        else {
            System.out.println("Пароль ненадежный");
        }
    }
}
