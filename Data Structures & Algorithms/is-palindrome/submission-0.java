class Solution {
    public boolean isPalindrome(String s) {
       String ns= s.replace(" ", "");
       String s2=ns.replaceAll("[^a-zA-Z0-9]", "");
       String s1=s2.toLowerCase();
       String r = new StringBuilder(s1).reverse().toString();
       if(s1.equals(r)){
        return true;
       }return false;
 
    }
}
