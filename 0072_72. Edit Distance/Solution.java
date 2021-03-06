public class Solution {
    public int minDistance(String word1, String word2) {
        if(word1.length() == 0){
            return word2.length();
        }
        if(word2.length() == 0){
            return word1.length();
        }
        
        int[][] dp = new int[word1.length() + 1][word2.length() + 1];
        for(int i = 0; i <= word1.length(); i++){
            for(int j = 0; j <= word2.length(); j++){
                if(i == 0 && j == 0){
                    dp[i][j] = 0;
                }
                else if (i == 0){
                    dp[i][j] = j;
                }
                else if (j == 0){
                    dp[i][j] = i;
                }
                else{
                    char c1 = word1.charAt(i-1);
                    char c2 = word2.charAt(j-1);
                    int dis = (c1 == c2) ? 0 : 1;
                    dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]) + 1;
                    dp[i][j] = Math.min(dp[i][j], dp[i-1][j-1] + dis);
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }
}
