/**
 * OOPSBannerApp UC3 – OOPS Banner Display using String.join()
 *
 * This program prints the word "OOPS" as a banner
 * using String.join() instead of + concatenation.
 *
 * @author Developer
 * @version 3.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join("",
                "  ***  ", "  ***  ", " ***** ", " ***** "));

        System.out.println(String.join("",
                " *   * ", " *   * ", " *   * ", " *     "));

        System.out.println(String.join("",
                " *   * ", " *   * ", " *   * ", " *     "));

        System.out.println(String.join("",
                " *   * ", " *   * ", " ***** ", " ***** "));

        System.out.println(String.join("",
                " *   * ", " *   * ", " *     ", "     * "));

        System.out.println(String.join("",
                " *   * ", " *   * ", " *     ", "     * "));

        System.out.println(String.join("",
                "  ***  ", "  ***  ", " *     ", " ***** "));
    }
}
