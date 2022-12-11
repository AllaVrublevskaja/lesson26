import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Character> alphabet = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g');
        PasswordsGenerator generator = new PasswordsGenerator(alphabet);
        generator.generate(5);
    }
}
