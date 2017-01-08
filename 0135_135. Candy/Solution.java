c class Solution {
    public int candy(int[] ratings) {
        
        if(ratings.length == 0){
            return 0;
        }
        
        int[] candies = new int [ratings.length];
        for(int i = 0; i < ratings.length; i++){
            if(i == 0){
                candies[i] = 1;
            }
            else{
                if(ratings[i] > ratings[i-1]){
                    candies[i] = candies[i-1] + 1;
                }
                else{
                    candies[i] = 1;
                }
            }
        }
        for(int i = ratings.length - 1; i >= 0; i--){
            if(i == ratings.length - 1){
                continue;
            }
            else{
                if(ratings[i] > ratings[i+1]){
                    candies[i] = Math.max(candies[i], candies[i+1] + 1);
                }
                else{
                    continue;
                }
            }
        }
        
        int candyNum = 0;
        for(int i = 0; i < candies.length; i++){
            candyNum += candies[i];
        }
        
        return candyNum;
    }
}
