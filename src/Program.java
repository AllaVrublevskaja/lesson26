import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        //1. Склонируйте репозиторий https://github.com/IlyaBikmeev/combinations
        //
        //2. Напишите программу, которая от пользователя на вход принимает тип
        // алфавита, длину пароля и имя выходного файла.
        //Тип алфавита нумеруется от 1 до 3.
        //1 - только латинские строчные буквы,
        //2 - латинские буквы обоих регистров,
        //3 - латинские буквы обоих регистров и цифры.
        //
        //3. Запишите в файл, имя которого дал пользователь всевозможные комбинации
        // из алфавита указанной длины.

        Initial init = new Initial();

        List<Character> alphabet = init.getAlphabet();
        String filename = init.getFilename();
        System.out.println(init.toString());

        PasswordsGenerator generator = new PasswordsGenerator(alphabet);
        generator.generate(init.getLength());
    }
}
