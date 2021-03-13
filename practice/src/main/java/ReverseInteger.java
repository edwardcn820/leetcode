// https://leetcode.com/problems/reverse-integer/

// Given a signed 32-bit integer x, return x with its digits reversed.
// If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1],
// then return 0.
public class ReverseInteger {
    public static int reverseInteger(int input) {
        int result = 0;
        // For example: Input = 123
        while (input != 0) {
            // Loop 1: Input = 123, Result = 0, Input % 10 = 3
            // Loop 2: Input = 12, Result = 3, Input % 10 = 2
            // Loop 3: Input = 12, Result = 3, Input % 10 = 2
            result = result * 10 + input % 10;
            // Loop 1: Result = 3
            // Loop 2: Result = 30 + 2
            // Loop 3: Result = 320 + 1
            input /= 10;
            // Loop 1: Input = 12
            // Loop 2: Input = 1
            // Loop 3: Input = 0 => In the coming while loop check, it will jump out of the loop automatically

            // Cannot check result * 10 > Integer.MAX_VALUE because result * 10 becomes long which is 64 bits
            if (result > Integer.MAX_VALUE / 10) {
                result = -1;
                break;
            }
        }
        // If Input = 123, Result = 321
        return result;
    }
}
