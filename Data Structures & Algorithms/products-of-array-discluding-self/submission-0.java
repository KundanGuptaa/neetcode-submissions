class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pro=new int[nums.length];
        Arrays.fill(pro,1); 
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i==j) continue;
                pro[i]*=nums[j];
            }
        }
        return pro;
    }
}  
