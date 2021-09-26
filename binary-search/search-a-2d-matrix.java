// https://leetcode.com/problems/search-a-2d-matrix/

class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int start = 0;
        int end = mat.length - 1;
        int row_no = find_row(start, end, target, mat);
        
        return find_elem(start, end, row_no, target, mat);
    }
    
    //find row betn 1 to n-1 (don't start with 0)
    public static int find_row(int start, int end, int target, int mat[][]){
        int col = 0;
        int mid = 0;
        start = 1;
        while(start <= end){
            mid = start + (end - start)/2;
            if(mat[mid][col] > target) end = mid - 1;
            else if (mat[mid][col] < target) start = mid + 1;
            else return mid;
        }
        return end;
    }
    
    public static boolean find_elem(int start, int end, int row, int target, int mat[][]){
        int mid = 0;
        end = mat[0].length - 1;
        while(start <= end){
            mid = start + (end - start)/2;
            if(mat[row][mid] < target) start = mid + 1;
            else if(mat[row][mid] > target) end = mid - 1;
            else return true;
        }
        return false;
    }
}
