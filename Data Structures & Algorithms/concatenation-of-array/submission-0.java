class Solution {
    public int[] getConcatenation(int[] nums) {
        int res[]=new int[nums.length*2];
        int j=0;
        for(int i=0;i<res.length;i++){
            if(j==nums.length){
                j=0;
            }
        res[i]=nums[j];
        j++;
        }
        return res;
    }
}