/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int l=0;
        int r=n-1;
        int pick=0;
        boolean f=true;
        while(f==true)
        {
            pick=l+(r-l)/2;
            if(guess(pick)==1)
            {
               l=pick+1;
            }
            else if(guess(pick)==-1)
            {
                r=pick-1;
            }
            else
            {
                f=false;
            }
        }
        return pick;
    }
}