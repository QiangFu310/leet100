package leet.next;

/**
 The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

 Given two integers x and y, calculate the Hamming distance.

 Note:
 0 ≤ x, y < 2^31.

 Example:

 Input: x = 1, y = 4

 Output: 2

 Explanation:
 1   (0 0 0 1)
 4   (0 1 0 0)
        ↑   ↑

 The above arrows point to positions where the corresponding bits are different.
 */
public class _461_Hamming_Distance {
    public int hammingDistance(int x, int y) {
        return 0;
    }
}


/*

What does come to your mind first when you see this sentence "corresponding bits are different"? Yes, XOR! Also, do not forget there is a decent function Java provided: Integer.bitCount() ~~~

public class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}
 */