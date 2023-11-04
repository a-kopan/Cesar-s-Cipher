import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void print(filetest a) {
        System.out.println(a.getValue());
    }
    public static String loadFile(String path) {
        try{
            File file = new File(path);
            Scanner sc = new Scanner(file);
            sc.useDelimiter("//Z");
            String output = sc.next();
            sc.close();
            return output;
        } catch (FileNotFoundException e) {
            System.out.println(e.getLocalizedMessage());
        }
        return"";
    }
    public static void main(String[] args) {
        //<65;90> - <97;122>
        //getting key from input
        Scanner scn = new Scanner(System.in);
        System.out.println("Provide a key");
        //showing output
        String input = scn.next();
        filetest fileContent = new filetest(loadFile("test.txt"));

        System.out.println("\nBefore encryption: ");
        print(fileContent);

        System.out.println("\nAfter encryption: ");
        fileContent.encrypt(Integer.valueOf(input));
        print(fileContent);

        System.out.println("\nAfter decryption: ");
        fileContent.decrypt(Integer.valueOf(input));
        print(fileContent);
        scn.close();
    }
}