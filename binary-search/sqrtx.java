// https://leetcode.com/problems/sqrtx/

class Solution {
    public int mySqrt(int x) {
        int start = 0;
        int end = x;
        int mid = 0;
        if(x == 0 || x ==1) return x;
        while(start + 1 != end){
            mid = start + (end - start)/2;
            
            if(mid > x/mid) end = mid;
            else if(mid < x/mid) start = mid;
            else return mid;
        }
        return start;
    }
}
