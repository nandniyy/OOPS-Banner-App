/**
 * OOPSBannerApp UC4 – Banner using String Array and Loop
 *
 * Displays "OOPS" banner using String array and enhanced for-loop
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Create array to store banner lines
        String[] banner = {

            String.join("", "  ***  ", "  ***  ", " ***** ", " ***** "),
            String.join("", " *   * ", " *   * ", " *   * ", " *     "),
            String.join("", " *   * ", " *   * ", " *   * ", " *     "),
            String.join("", " *   * ", " *   * ", " ***** ", " ***** "),
            String.join("", " *   * ", " *   * ", " *     ", "     * "),
            String.join("", " *   * ", " *   * ", " *     ", "     * "),
            String.join("", "  ***  ", "  ***  ", " *     ", " ***** ")

        };

        // Print banner using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
