import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Initial {
    private int type;
    private int length;
    private String filename;
    List<Character> alphabet = new ArrayList<>();

    public Initial() {
        inputData();
        generateArray();
    }
    private void inputData(){
        Scanner scan = new Scanner(System.in);
        do  {
            System.out.println("Выберите тип алфавита: ");
            System.out.println("1 - только латинские строчные буквы");
            System.out.println("2 - латинские буквы обоих регистров");
            System.out.println("3 - латинские буквы обоих регистров и цифры");
            System.out.println(": ");
            type = scan.nextInt();
        } while(type<1 || type>4);
        do {
            System.out.println("Введите длину пароля");
            System.out.println(": ");
            length = scan.nextInt();
        } while(length<1 || length>5);
        scan.nextLine();
        System.out.println("Введите имя выходного файла");
        System.out.println(": ");
        filename = scan.nextLine();
        scan.close();
    }
    private void generateArray(){
            initArray(97,123);
            if (type == 2 || type == 3)
                initArray(65,91);
            if (type == 3)
                initArray(48,58);
    }
    private  void initArray(int first, int last){
        for (int i = first; i < last; i++)
            alphabet.add((char)i);
    }
    public int getType() {
        return type;
    }
    public int getLength() {
        return length;
    }
    public String getFilename() {
        return filename;
    }

    public List<Character> getAlphabet() {
        return alphabet;
    }

    @Override
    public String toString() {
        return  "Тип алфавита: " + type +
                "\nДлина пароля: " + length +
                "\nИмя выходного файла: " + filename +
                "\nАлфавит: " + alphabet.toString() ;
    }
}
