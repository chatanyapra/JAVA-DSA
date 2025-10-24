class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> mpp = new HashSet<>();
        for (int num : nums) {
            if (mpp.contains(num)) return num;
            mpp.add(num);
        }
        return -1;
    }
}