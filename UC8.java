import java.util.HashMap;

public class UC8 {

    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
            "   ***     ",
            " **   **   ",
            "**     **  ",
            "**     **  ",
            "**     **  ",
            "**     **  ",
            "**     **  ",
            " **   **   ",
            "   ***     "
        });

        charMap.put('P', new String[]{
            "*******  ",
            "**    ** ",
            "**     **",
            "**    ** ",
            "*******  ",
            "**       ",
            "**       ",
            "**       ",
            "**       "
        });

        charMap.put('S', new String[]{
            "   *****    ",
            " **         ",
            "**          ",
            " **         ",
            "   ***      ",
            "       **   ",
            "        **  ",
            "       **   ",
            "  *****     "
        });

        charMap.put(' ', new String[]{
            "     ",
            "     ",
            "     ",
            "     ",
            "     ",
            "     ",
            "     ",
            "     ",
            "     "
        });

        return charMap;
    }

    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        int patternHeight = charMap.get('O').length;

        for (int line = 0; line < patternHeight; line++) {

            StringBuilder output = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {
                char ch = Character.toUpperCase(message.charAt(i));
                String[] pattern = charMap.getOrDefault(ch, charMap.get(' '));
                output.append(pattern[line]).append("  ");
            }

            System.out.println(output);
        }
    }

    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();
        String message = "OOPS";
        displayBanner(message, charMap);
    }
}
