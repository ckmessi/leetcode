public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(numRows == 0){
            return list;
        }
        for(int i = 0; i < numRows; i++){
            List<Integer> line = new ArrayList<Integer>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    line.add(1);
                }
                else{
                    line.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
                }
            }
            list.add(line);
        }
        return list;
    }
}
