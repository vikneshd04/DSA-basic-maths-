//brute force approach
class Solution {
    public int countDigits(int n) {
        // code here
    
        int count = 0;
        
        while(n !=0){
            
            count++;
            n = n/10;
        }
        
        return count;
    }
}

//optimal approach
class Solution {
    public int countDigits(int n) {
        // code here
    
        return (int)(Math.log10(n)) + 1;
    }
}