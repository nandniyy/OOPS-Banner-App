/*
 OOPSBannerApp UC5 - Render OOPS Banner using Inline Array Initialization
*/

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Declare and initialize array in one statement
        String[] lines = {
                String.join("", " *** ", " *** ", " *** ", "  *** "),
                String.join("", "*   *", "*   *", "*   * ", "*   * "),
                String.join("", "*   *", "*   *", "*   * ", "*    "),
                String.join("", "*   *", "*   *", "**** ", "  *** "),
                String.join("", "*   *", "*   *", "*     ", "    * "),
                String.join("", "*   *", "*   *", "*     ", "*   * "),
                String.join("", " *** ", " *** ", "*     ", " *** ")
        };

        // Print banner using enhanced for-loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}