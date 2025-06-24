package solution;

public class IsPalindrome {

    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        String sx = x + "";
        int left = 0;
        int right = sx.length() - 1;

        while (left < right) {
            if (sx.charAt(left) == sx.charAt(right)) {
                left++;
                right--;
                continue;
            } else {
                return false;
            }

        }

        return true;

    }

}
