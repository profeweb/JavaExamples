package unicode;

public class UnicodeExample {

    public static void main(String[] args) {
        // Unicode escape sequences
        char charA = '\u0041';         // Latin capital 'A'
        char charZ = '\u005A';         // Latin capital 'Z'
        char charCopyright = '\u00A9'; // Copyright symbol ©
        char charEuro = '\u20AC';      // Euro symbol €
        char charChinese = '\u4E2D';   // Chinese character '中'

        System.out.println("Using Unicode escape sequences:");
        System.out.println("\\u0041: " + charA);
        System.out.println("\\u005A: " + charZ);
        System.out.println("\\u00A9: " + charCopyright);
        System.out.println("\\u20AC: " + charEuro);
        System.out.println("\\u4E2D: " + charChinese);

        // Comparing direct characters and escape sequences
        System.out.println("\nComparing direct characters and escape sequences:");
        System.out.println("Direct 'A' == \\u0041: " + ('A' == '\u0041'));
        System.out.println("Direct '©' == \\u00A9: " + ('©' == '\u00A9'));
        System.out.println("Direct '中' == \\u4E2D: " + ('中' == '\u4E2D'));

        // Exploring character properties
        System.out.println("\nExploring properties of Unicode characters:");
        examineCharacter('A');
        examineCharacter('9');
        examineCharacter('©');
        examineCharacter('中');
    }

    private static void examineCharacter(char c) {
        System.out.println("\nCharacter: " + c);
        System.out.println("Unicode code point: \\u" +
                Integer.toHexString(c | 0x10000).substring(1).toUpperCase());
        System.out.println("Is letter? " + Character.isLetter(c));
        System.out.println("Is digit? " + Character.isDigit(c));
        System.out.println("Is whitespace? " + Character.isWhitespace(c));
        System.out.println("Is symbol? " + Character.isISOControl(c));
    }
}