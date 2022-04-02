class Solution {
    public static String removeNonAlphanumeric(String s)
    {
        String str = s.replaceAll("[^a-zA-Z0-9]", "");
        return str;
    }
    public boolean isPalindrome(String s) {
        //System.out.println(removeNonAlphanumeric(s));
        //System.out.println(s.length());
        String new_string = removeNonAlphanumeric(s.trim());
        new_string=new_string.toLowerCase();
        int i=0;
        int j=new_string.length()-1;
        while(i<j)
        {
            if(new_string.charAt(i)!=new_string.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}