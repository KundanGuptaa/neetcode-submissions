class Solution {
    public boolean isPalindrome(int x) {
        int reverse=0;
        int orgNum=x;
        while(x!=0){
            int temp=x%10;
            reverse=reverse*10+temp;
            x/=10;
        }
        if(orgNum==reverse && orgNum>=0){
            return true;
        }
        else return false;
    }
}