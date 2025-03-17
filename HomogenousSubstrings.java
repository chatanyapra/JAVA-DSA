public class HomogenousSubstrings {
        public static int countHomogenous(String s) {
            final int MOD = 1_000_000_007;
            long count = 0, length = 0;
            
            for (int i = 0; i < s.length(); i++) {
                if (i > 0 && s.charAt(i) == s.charAt(i - 1)) {
                    length++;
                } else {
                    length = 1;
                }
                count = (count + length) % MOD;
            }
            return (int) count;
        }
}
