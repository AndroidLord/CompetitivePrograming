class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
       
       val r = matrix.size
       val c = matrix[0].size

       var low = 0
       var high = c-1
       
       while(low<r && high>-1){
           val cur = matrix[low][high]
           if(cur==target) return true
           else if(target>cur)low++
           else high--
       }
       return false
    }
}