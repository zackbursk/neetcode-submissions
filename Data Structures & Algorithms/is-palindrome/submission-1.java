class Solution {
    public boolean isPalindrome(String s) {
        String base = s.replaceAll("\\s+", "").replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(base).reverse().toString();
        System.out.println(base);
        System.out.println(reversed);
        if (base.equals(reversed)){
            return true;
        }
        return false;
    }
}
