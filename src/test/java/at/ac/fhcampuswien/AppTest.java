package at.ac.fhcampuswien;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @BeforeAll
    public static void init(){
        System.out.println("Testing Exercise1");
    }

    @AfterAll
    public static void finish(){
        System.out.println("Finished Testing Exercise1");
    }

    @Test
    public void sayHelloWorld()
    {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        App exercise1 = new App("Exercise1");
        exercise1.sayHelloWorld();

        // assertion
        assertEquals("Hello World!\n", bos.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }
    @Test
    void helloRobot() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        App exercise1 = new App("Exercise1");
        exercise1.helloRobot();
        String output = "0123456789012345678901\n";
        output += "         __\n" +
                " _(\\    |@@|\n" +
                "(__/\\__ \\--/ __\n" +
                "   \\___|----|  |   __\n" +
                "       \\ }{ /\\ )_ / _\\\n" +
                "       /\\__/\\ \\__O (__\n" +
                "      (--/\\--)    \\__/\n" +
                "      _)(  )(_\n" +
                "     `---''---`\n";

        // assertion
        assertEquals(output, bos.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    void sumOfLiterals() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        App exercise1 = new App("Exercise1");
        exercise1.sumOfLiterals();

        // assertion
        assertEquals("64582\n", bos.toString());

        // undo the binding in System
        System.setOut(originalOut);
    }

    @Test
    void addTwoNumbers() {
        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;

        String input = "6" + System.lineSeparator() + "6" + System.lineSeparator();
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        App exercise1 = new App("Exercise1");
        exercise1.addTwoNumbers();

        // assertion
        assertEquals("12\n", bos.toString());

        // undo the binding in System
        System.setOut(originalOut);
        System.setIn(originalIn);

    }

    @Test
    void swapTwoNumbers() {
        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;

        String input = "2" + System.lineSeparator() + "5" + System.lineSeparator();
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        App exercise1 = new App("Exercise1");
        exercise1.swapTwoNumbers();

        // assertion
        String expected = "Before Swap:\n" +
                "x: " +
                "y: " +
                "After Swap:\n" +
                "x: 5\n" +
                "y: 2\n";
        assertEquals(expected, bos.toString());

        // undo the binding in System
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    void compareTwoNumbers() {
        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;

        String input = "2" + System.lineSeparator() + "5" + System.lineSeparator();
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        App exercise1 = new App("Exercise1");
        exercise1.compareTwoNumbers();

        // assertion
        String expected = "n1: " +
                "n2: " +
                "n2 > n1\n";
        assertEquals(expected, bos.toString());

        input = "5" + System.lineSeparator() + "2" + System.lineSeparator();
        in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        exercise1 = new App("Exercise1");
        exercise1.compareTwoNumbers();

        // assertion
        expected = "n1: " +
                "n2: " +
                "n1 > n2\n";
        assertEquals(expected, bos.toString());

        input = "5" + System.lineSeparator() + "5" + System.lineSeparator();
        in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        exercise1 = new App("Exercise1");
        exercise1.compareTwoNumbers();

        // assertion
        expected = "n1: " +
                "n2: " +
                "n1 == n2\n";
        assertEquals(expected, bos.toString());

        // undo the binding in System
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    void ratingSalesPerson() {
        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;

        String input = "100000";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        App exercise1 = new App("Exercise1");
        exercise1.ratingSalesPerson();

        // assertion
        String expected = "Enter annual Revenue: " +
                "Invalid Revenue\n";
        assertEquals(expected, bos.toString());

        input = "60000";
        in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        exercise1 = new App("Exercise1");
        exercise1.ratingSalesPerson();

        // assertion
        expected = "Enter annual Revenue: " +
                "Good Sales Revenue\n";
        assertEquals(expected, bos.toString());

        input = "0";
        in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        exercise1 = new App("Exercise1");
        exercise1.ratingSalesPerson();

        // assertion
        expected = "Enter annual Revenue: " +
                "Poor Sales Revenue\n";
        assertEquals(expected, bos.toString());

        // undo the binding in System
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    void getCommissionRate() {
        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;

        String input = "1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        App exercise1 = new App("Exercise1");
        exercise1.getCommissionRate();

        // assertion
        String expected = "Enter CommissionClass: " +
                "Your Commission Rate was set to 0.01\n";
        assertEquals(expected, bos.toString());

        input = "4";
        in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        exercise1 = new App("Exercise1");
        exercise1.getCommissionRate();

        // assertion
        expected = "Enter CommissionClass: " +
                "Your Commission Rate was set to 0.04\n";
        assertEquals(expected, bos.toString());

        input = "0";
        in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        exercise1 = new App("Exercise1");
        exercise1.getCommissionRate();

        // assertion
        expected = "Enter CommissionClass: " +
                "Your Commission Rate was set to 0.0\n";
        assertEquals(expected, bos.toString());

        // undo the binding in System
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    void leapyear() {
        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;

        String input = "2000";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        App exercise1 = new App("Exercise1");
        exercise1.leapyear();

        // assertion
        String expected = "Year: " +
                "Leapyear\n";
        assertEquals(expected, bos.toString());

        input = "1900";
        in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        exercise1 = new App("Exercise1");
        exercise1.leapyear();

        // assertion
        expected = "Year: " +
                "Not a Leapyear\n";
        assertEquals(expected, bos.toString());

        input = "1845";
        in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        exercise1 = new App("Exercise1");
        exercise1.leapyear();

        // assertion
        expected = "Year: " +
                "Not a Leapyear\n";
        assertEquals(expected, bos.toString());

        // undo the binding in System
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    void transposedNumbers() {
        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;

        String input = "135";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        App exercise1 = new App("Exercise1");
        exercise1.transposedNumbers();

        // assertion
        String expected = "Number: " +
                "531\n";
        assertEquals(expected, bos.toString());

        // undo the binding in System
        System.setOut(originalOut);
        System.setIn(originalIn);
    }
}