class Solution {
    public int mostWordsFound(String[] sentences) {
        int max_words=0;
        for(int i=0;i<sentences.length;i++)
        {
            String sentence = sentences[i];
            String[] words = sentence.split(" ");
            int word_length=words.length;
            if(word_length>max_words)
            {
                max_words=word_length;
            }
        }
        return max_words;
    }
}