import java.util.List;

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
        System.out.println(init.toString());
        List<Character> alphabet = init.getAlphabet();

        PasswordsGenerator generator = new PasswordsGenerator(alphabet,init.getFilename());
        generator.generate(init.getLength());
    }
}
