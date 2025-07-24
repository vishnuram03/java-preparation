public class Q3 {
    static boolean isvowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public static void main(String ars[]) {
        String s = "leetcode";
        int left = 0, right = s.length() - 1;
        char str[] = s.toCharArray();

        while (left < right) {
            if (isvowel(str[left]) && isvowel(str[right])) {
                char swap = str[left];
                str[left] = str[right];
                str[right] = swap;
                left++;
                right--;
            } else {
                if (!isvowel(str[left])) left++;
                if (!isvowel(str[right])) right--;
            }
        }

        System.out.println(new String(str)); // Output: holle
    }
}
