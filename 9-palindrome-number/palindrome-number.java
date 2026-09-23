class Solution {
    public boolean isPalindrome(int x) {
       if(x<0) return false;
      

       int original = x;
       int remainder  , reversedNum = 0;
       while (x != 0) {
        remainder = x % 10; 
        reversedNum = reversedNum * 10 + remainder; 
        x /= 10;
       }

    if(original == reversedNum){
        return true;
    }else{
        return false;
    }


    }
}