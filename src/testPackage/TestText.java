package testPackage;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class TextTest {

    @Test
    public void testLinesCount() {
        //Arrange
        TextControl myTestControl = new TextControl();
        //Act
        myTestControl.setText("Never ");
        myTestControl.setText("regret a day");
        myTestControl.setText("in your");
        myTestControl.setText("life");
        int expected = 4;
        int actual = myTestControl.getLines();
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testCharactersCount() {
        //Arrange
        TextControl myTestControl = new TextControl();
        //Act
        myTestControl.setText("good days");
        myTestControl.setText("give happiness");
        int expected = 21;
        int actual = myTestControl.getCharacters();
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testWordsCount() {
        //Arrange
        TextControl myTestControl = new TextControl();
        //Act
        myTestControl.setText("bad days give");
        myTestControl.setText("experience");
        int expected = 4;
        int actual = myTestControl.getWords();
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testLongestWord() {
        //Arrange
        TextControl myTestControl = new TextControl();
        //Act
        myTestControl.setText("worst days");
        myTestControl.setText("give lessons");
        myTestControl.setText("and best days");
        myTestControl.setText("give memories");
        String expected = "memories";
        String actual = myTestControl.longestWord();
        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void testStopFunction() {
        //Arrange
        TextControl myTestControl = new TextControl();
        //Act
        myTestControl.setText("stop");
        boolean expected = false;
        boolean actual = myTestControl.getStopOrNot();
        //Assert
        assertEquals(expected, actual);

    }

    @Test
    public void testWordWithoutSpace() {
        //Arrange
        TextControl myTestControl = new TextControl();
        //Act
        myTestControl.setText("once up on a time");
        myTestControl.setText("snip snap slut");
        int expected = 8;
        int actual = myTestControl.withoutSpaceCount();
        //Assert
        assertEquals(expected, actual);

    }

    @Test
    public void testNoSpaceCharacters() {
        //Arrange
        TextControl myTestControl = new TextControl();
        //Act
        myTestControl.setText("snow is white");
        myTestControl.setText("sky is blue");
        int expected = 20;
        int actual = myTestControl.noSpaceCount();
        //Assert
        assertEquals(expected, actual);

    }
}


