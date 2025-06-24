package solution;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int length = digits.length;

        if (digits[length - 1] != 9) {
            digits[length - 1] = digits[length - 1] + 1;
            return digits;
        } else {
            for (int i = length - 1; i >= 0; i--) {
                if (digits[i] == 9) {
                    digits[i] = 0;
                    continue;
                } else {
                    digits[i] = digits[i] + 1;
                    break;
                }

            }
        }

        if (digits[0] == 0) {
            int[] newDigits = new int[length + 1];
            newDigits[0] = 1;
            for (int i = 1; i < newDigits.length; i++) {
                newDigits[i] = 0;
            }
            return newDigits;
        }

        return digits;

    }
}
