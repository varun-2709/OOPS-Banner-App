/**
 * OOPSBannerApp UC3 - Banner Display Application
 *
 * Displays the word "OOPS" in a banner format using
 * asterisks (*) and spaces via multiple print statements.
 *
 * @author Developer
 * @version 3.0
 */

public class Banner {

    public static void main(String[] args) {

        String line1 = String.join("  ",
                " ***** ",
                " ***** ",
                " ******",
                " ***** ");

        String line2 = String.join("  ",
                "*     *",
                "*     *",
                "*     *",
                "*     *");

        String line3 = String.join("  ",
                "*     *",
                "*     *",
                "*     *",
                "*      ");

        String line4 = String.join("  ",
                "*     *",
                "*     *",
                " ******",
                " ***** ");

        String line5 = String.join("  ",
                "*     *",
                "*     *",
                "*      ",
                "      *");

        String line6 = String.join("  ",
                "*     *",
                "*     *",
                "*      ",
                "*     *");

        String line7 = String.join("  ",
                " ***** ",
                " ***** ",
                "*      ",
                " ***** ");

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
        System.out.println(line6);
        System.out.println(line7);
    }
}