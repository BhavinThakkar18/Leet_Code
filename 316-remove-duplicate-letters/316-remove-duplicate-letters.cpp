class Solution {
public:
    string removeDuplicateLetters(string s) {
        vector<int> freq(26,0);
        for(int i=0;i<s.size();i++)
        {
            freq[s[i]-'a']++;
        }
        string res;
        vector<bool> isPresent(26,0);
        for(int i=0;i<s.size();i++)
        {
            freq[s[i]-'a']--;
            if(!isPresent[s[i]-'a']){
                while(res.size()>0 && freq[res.back()-'a']>0 && res.back()>s[i])
                {
                    isPresent[res.back()-'a']=false;
                    res.pop_back();
                }
                res+=s[i];
                isPresent[s[i]-'a']=true;
            }
        }
        return res;
    }
};