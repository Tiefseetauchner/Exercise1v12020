package at.ac.fhcampuswien;

import org.junit.jupiter.api.*;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    private PrintStream originalOut;
    private InputStream originalIn;
    private ByteArrayOutputStream bos;
    private PrintStream ps;

    @BeforeAll
    public static void init(){
        System.out.println("Testing Exercise1");
    }

    @AfterAll
    public static void finish(){
        System.out.println("Finished Testing Exercise1");
    }

    @BeforeEach
    public void setupStreams() throws IOException {
        originalOut = System.out;
        originalIn = System.in;

        bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        PipedOutputStream pos = new PipedOutputStream();
        PipedInputStream pis = new PipedInputStream(pos);
        System.setIn(pis);
        ps = new PrintStream(pos, true);
    }

    @AfterEach
    public void tearDownStreams() {
        // undo the binding in System
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    @Test
    public void sayHelloWorld()
    {
        // action
        App exercise1 = new App();
        exercise1.sayHelloWorld();

        // assertion
        assertEquals("Hello World!\n", bos.toString());
    }
    @Test
    void helloRobot() {
        // action
        App exercise1 = new App();
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
    }

    @Test
    void sumOfLiterals() {
        // action
        App exercise1 = new App();
        exercise1.sumOfLiterals();

        // assertion
        assertEquals("64582\n", bos.toString());
    }

    @Test
    void addTwoNumbers() {
        ps.println(6);
        ps.println(6);

        // action
        App exercise1 = new App();
        exercise1.addTwoNumbers();

        // assertion
        assertEquals("12\n", bos.toString());
    }

    @Test
    void swapTwoNumbers() {
        ps.println(2);
        ps.println(5);

        // action
        App exercise1 = new App();
        exercise1.swapTwoNumbers();

        // assertion
        String expected = "Before Swap:\n" +
                "x: " +
                "y: " +
                "After Swap:\n" +
                "x: 5\n" +
                "y: 2\n";
        assertEquals(expected, bos.toString());
    }

    @Test
    void compareTwoNumbers1() {
        ps.println(2);
        ps.println(5);
        // action
        App exercise1 = new App();
        exercise1.compareTwoNumbers();

        // assertion
        String expected = "n1: " +
                "n2: " +
                "n2 > n1\n";
        assertEquals(expected, bos.toString());
    }

    @Test
    void compareTwoNumbers2() {
        ps.println(5);
        ps.println(2);

        // action
        App exercise1 = new App();
        exercise1.compareTwoNumbers();

        // assertion
        String expected = "n1: " +
                "n2: " +
                "n1 > n2\n";
        assertEquals(expected, bos.toString());
    }

    @Test
    void compareTwoNumbers3() {
        ps.println(5);
        ps.println(5);

        // action
        App exercise1 = new App();
        exercise1.compareTwoNumbers();

        // assertion
        String expected = "n1: " +
                "n2: " +
                "n1 == n2\n";
        assertEquals(expected, bos.toString());
    }

    @Test
    void ratingSalesPerson1() {
        ps.println("100000");
        // action
        App exercise1 = new App();
        exercise1.ratingSalesPerson();

        // assertion
        String expected = "Enter annual Revenue: " +
                "Invalid Revenue\n";
        assertEquals(expected, bos.toString());
    }

    @Test
    void ratingSalesPerson2() {
        ps.println("60000");
        // action
        App exercise1 = new App();
        exercise1.ratingSalesPerson();

        // assertion
        String expected = "Enter annual Revenue: " +
                "Good Sales Revenue\n";
        assertEquals(expected, bos.toString());
    }

    @Test
    void ratingSalesPerson3() {
        ps.println("0");
        // action
        App exercise1 = new App();
        exercise1.ratingSalesPerson();

        // assertion
        String expected = "Enter annual Revenue: " +
                "Poor Sales Revenue\n";
        assertEquals(expected, bos.toString());
    }



    @Test
    void getCommissionRate1() {
        ps.println("1");

        // action
        App exercise1 = new App();
        exercise1.getCommissionRate();

        // assertion
        String expected = "Enter CommissionClass: " +
                "Your Commission Rate was set to 0.01\n";
        assertEquals(expected, bos.toString());
    }

    @Test
    void getCommissionRate2() {
        ps.println("4");

        // action
        App exercise1 = new App();
        exercise1.getCommissionRate();

        // assertion
        String expected = "Enter CommissionClass: " +
                "Your Commission Rate was set to 0.04\n";
        assertEquals(expected, bos.toString());
    }

    @Test
    void getCommissionRate3() {
        ps.println("0");

        // action
        App exercise1 = new App();
        exercise1.getCommissionRate();

        // assertion
        String expected = "Enter CommissionClass: " +
                "Your Commission Rate was set to 0.0\n";
        assertEquals(expected, bos.toString());
    }


    @Test
    void leapYear1() {
        ps.println("2000");

        // action
        App exercise1 = new App();
        exercise1.leapyear();

        // assertion
        String expected = "Year: " +
                "Leapyear\n";
        assertEquals(expected, bos.toString());
    }

    @Test
    void leapYear2() {
        ps.println("1900");

        // action
        App exercise1 = new App();
        exercise1.leapyear();

        // assertion
        String expected = "Year: " +
                "Not a Leapyear\n";
        assertEquals(expected, bos.toString());
    }

    @Test
    void leapYear3() {
        ps.println("1845");

        // action
        App exercise1 = new App();
        exercise1.leapyear();

        // assertion
        String expected = "Year: " +
                "Not a Leapyear\n";
        assertEquals(expected, bos.toString());
    }

    @Test
    void transposedNumbers() {
        ps.println("135");

        // action
        App exercise1 = new App();
        exercise1.transposedNumbers();

        // assertion
        String expected = "Number: " +
                "531\n";
        assertEquals(expected, bos.toString());
    }
}
