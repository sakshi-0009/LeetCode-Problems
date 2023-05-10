''' Question : You are given an array of strings sentences, where each sentences[i] represents a single sentence.
Return the maximum number of words that appear in a single sentence.'''

// Solution : -

class Solution {
    public int mostWordsFound(String[] sentences) {
        int n = sentences.length;
        int maxCount =0;
        for(int i=0;i<n;i++){
            int count =1;
            for(int j=0;j<sentences[i].length();j++){
                if(sentences[i].charAt(j)==' '){
                    count++;
                }
            }
        maxCount =Math.max(maxCount,count);    
        }
        return maxCount;
    }
}
