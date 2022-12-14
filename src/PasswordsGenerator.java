import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

//Класс генерирует всевозможные комбинации паролей из допустимого множества символов.
public class PasswordsGenerator {
    private List<Character> alphabet;       //Допустимое множество символов
    private String filename;

    public PasswordsGenerator(List<Character> alphabet, String filename) {
        this.alphabet = alphabet;
        this.filename = filename;
    }

    //backtracking - рекурсивный перебор
    private void generateHelper(int length, String cur, PrintWriter pw) {
            if (cur.length() == length) {
                pw.println(cur);
                return;
            }

            for (char c : alphabet) {
                generateHelper(length, cur + c, pw);
            }
    }

    public void generate(int length) {
        try(PrintWriter pw = new PrintWriter(filename)) {
            pw.println("Список возможных паролей:");
            generateHelper(length, "", pw);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
