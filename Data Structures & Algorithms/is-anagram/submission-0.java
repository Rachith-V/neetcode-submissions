class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch =s.toCharArray();
        char[] c = t.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(c);
        String s1= new String(ch);
        String s2= new String(c);
        if(s1.equals(s2)){
                    return true;
        }return false;
    }
}
