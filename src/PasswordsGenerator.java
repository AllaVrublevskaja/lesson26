import java.util.List;

//Класс генерирует всевозможные комбинации паролей из допустимого множества символов.
public class PasswordsGenerator {
    private List<Character> alphabet;       //Допустимое множество символов

    public PasswordsGenerator(List<Character> alphabet) {
        this.alphabet = alphabet;
    }

    //backtracking - рекурсивный перебор
    private void generateHelper(int length, String cur) {
        if(cur.length() == length) {
            System.out.println(cur);
            return;
        }

        for(char c : alphabet) {
            generateHelper(length, cur + c);
        }
    }

    public void generate(int length) {
        generateHelper(length, "");
    }


}
