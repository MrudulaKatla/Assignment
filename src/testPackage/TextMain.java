package testPackage;


import java.util.Scanner;
public class TextMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text, longestWord = "";
        boolean cont = true;
        TextControl myTestControl = new TextControl();
        do {
            System.out.println("Skriv en text:");
            text = scan.nextLine();
            cont = myTestControl.setText(text);
            if (cont) {
                longestWord = myTestControl.longestWord();
            }
        } while (cont);

        System.out.println("Entered number of characters are: " + myTestControl.getCharacters());
        System.out.println("Entered number of lines are: " + myTestControl.getLines());
        System.out.println("Entered number of words are: " + myTestControl.getWords());
        System.out.println("Entered longest word is: " + longestWord);
    }
}
