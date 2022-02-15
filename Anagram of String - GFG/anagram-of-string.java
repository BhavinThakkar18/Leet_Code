// { Driver Code Starts
//saksham raj seth
import java.util.*;
class Anagrams{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			String s=sc.next();
			String s1=sc.next();
			GfG g=new GfG();
			System.out.println(g.remAnagrams(s,s1));
		}
	}
}// } Driver Code Ends


/*Complete the function below*/
class GfG
{
	public int remAnagrams(String s1,String s2)
        {
          int c=0;
          int[] freq1 = new int[26];
          int[] freq2 = new int[26];
          for(int i=0;i<s1.length();i++)
          {
              freq1[s1.charAt(i)-'a']+=1;
          }
          for(int i=0;i<s2.length();i++)
          {
              freq2[s2.charAt(i)-'a']+=1;
          }
          for(int i=0;i<26;i++)
          {
             c+=Math.abs(freq1[i]-freq2[i]);
          }
          return c;
        }
}