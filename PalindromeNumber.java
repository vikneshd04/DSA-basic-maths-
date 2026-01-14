class Solution {
    public boolean isPalindrome(int n) {
        // Code here
        int temp =n;
        int rev = 0;
        while(temp!=0){
            
            int r = temp%10;
            rev = rev *10 + r;
            temp = temp/10;
        }
        
        if(n==rev){
            return true;
        }
        
        return false;
    }
}