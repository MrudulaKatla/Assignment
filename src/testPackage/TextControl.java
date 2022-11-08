package testPackage;

public class TextControl {
    private int lines;
    private int characters, i;
    private String longWord;
    private String text;
    private int words;
    private int maxLength;
    private boolean cont;
    private String[] stringArray = new String[10];

    public TextControl() {
        lines = 0;
        characters = 0;
        words = 0;
        maxLength = 0;
        cont = true;
        text = "";
        i = 0;
    }

    public boolean setText(String inputtext) {
        if (inputtext.equalsIgnoreCase("stop")) {
            cont = false;
            return cont;
        } else {
            lines++;
            if ((!inputtext.trim().equals(""))) {
                characters = characters + inputtext.replaceAll("\\s+", "").length();
                words = words + inputtext.split("\\s+").length;
                stringArray = inputtext.split("\\s+");
            }
        }
        return cont;
    }

    public int getLines() {
        return lines;

    }

    public int getCharacters() {
        return characters;
    }

    public int getWords() {
        return words;
    }

    public String longestWord() {
        for (i = 0; i < stringArray.length; i++) {
            text = stringArray[i];
            //System.out.println("text: " + text );
            if (text.length() >= maxLength) {
                maxLength = text.length();
                //System.out.println("max length: " + maxLength );
                longWord = stringArray[i];
                //System.out.println("longWord: " + longWord );
            }
        }
        return longWord;
    }

    public boolean getStopOrNot() {

        return cont;
    }

    public int withoutSpaceCount() {
        return words;
    }

    public int noSpaceCount() {
        return characters;
    }
}

