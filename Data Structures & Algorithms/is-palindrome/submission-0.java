class Solution {
    private static final int DIFF = (int) 'a' - (int) 'A';

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char x = s.charAt(left);
            char y = s.charAt(right);

            if (!isAlphaNumerical(x)) {
                left++;
                continue;
            } else if (!isAlphaNumerical(y)) {
                right--;
                continue;
            } else {
                if (isUpperCase(x)) {
                    x = toLowerCase(x);
                }

                if (isUpperCase(y)) {
                    y = toLowerCase(y);
                }

                if (x != y) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

    private boolean isAlphaNumerical(char x) {
        return ('A' <= x && x <= 'Z') || ('a' <= x && x <= 'z') || ('0' <= x && x <= '9');
    }

    private boolean isUpperCase(char x) {
        return 'A' <= x && x <= 'Z';
    }

    private char toLowerCase(char x) {
        return (char) ((int) x + DIFF);
    }
}
