class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> S = new HashSet<Integer>();
        for (int n : nums) {
            if (!S.add(n))
                return true;
        }
        return false;
    }
}