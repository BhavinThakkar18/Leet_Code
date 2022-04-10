class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> first_word=new Stack<>();
        Stack<Character> second_word=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='#')
            {
                if(first_word.isEmpty())
                {
                    continue;
                }
                first_word.pop();
            }
            else
            {
                first_word.push(s.charAt(i));
            }
        }
        for(int i=0;i<t.length();i++)
        {
            if(t.charAt(i)=='#')
            {
                if(second_word.isEmpty())
                {
                    continue;
                }
                second_word.pop();
            }
            else
            {
                second_word.push(t.charAt(i));
            }
        }
        String fs="";
        String ss="";
        while(!first_word.isEmpty())
        {
            fs+=first_word.pop();
        }
        while(!second_word.isEmpty())
        {
            ss+=second_word.pop();
        }
        System.out.println(fs+" "+ss);
        return fs.equals(ss);
    }
}