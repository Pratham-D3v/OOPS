public class UC7 {

    static class CharacterPatternMap {
        private Character character;
        private String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public Character getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] oPattern = {
            "   ***     ",
            " **   **   ",
            "**     **  ",
            "**     **  ",
            "**     **  ",
            "**     **  ",
            "**     **  ",
            " **   **   ",
            "   ***     "
        };

        String[] pPattern = {
            "*******  ",
            "**    ** ",
            "**     **",
            "**    ** ",
            "*******  ",
            "**       ",
            "**       ",
            "**       ",
            "**       "
        };

        String[] sPattern = {
            "   *****    ",
            " **         ",
            "**          ",
            " **         ",
            "   ***      ",
            "       **   ",
            "        **   ",
            "      **     ",
            " *****       "
        };

        String[] spacePattern = {
            "         ",
            "         ",
            "         ",
            "         ",
            "         ",
            "         ",
            "         "
        };

        return new CharacterPatternMap[]{
            new CharacterPatternMap('O', oPattern),
            new CharacterPatternMap('P', pPattern),
            new CharacterPatternMap('S', sPattern),
            new CharacterPatternMap(' ', spacePattern)
        };
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == Character.toUpperCase(ch)) {
                return map.getPattern();
            }
        }
        return getCharacterPattern(' ', charMaps);
    }

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        int height = charMaps[0].getPattern().length;

        for (int row = 0; row < height; row++) {
            StringBuilder line = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {
                String[] pattern = getCharacterPattern(message.charAt(i), charMaps);
                line.append(pattern[row]).append("   ");
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        printMessage("OOPS", charMaps);
    }
}