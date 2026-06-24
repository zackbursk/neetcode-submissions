class Solution {
    public boolean isAnagram(String s, String t) {
        // 1. Convert to character array
        char[] chars = s.toCharArray();
        char[] chars2 = t.toCharArray();
        // 2. Sort the array (uses Timsort / Dual-Pivot Quicksort)
        Arrays.sort(chars);
        Arrays.sort(chars2);
        // 3. Convert back to String
        String sorted = new String(chars);
        String sorted2 = new String(chars2);
        System.out.println(sorted);
        System.out.println(sorted2);
        if (sorted.equals(sorted2)){
            return true;
        }
        return false;
    }
}
