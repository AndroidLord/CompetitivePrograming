class Solution(object):
    def searchMatrix(self, matrix, target):
        r = len(matrix)
        c = len(matrix[0])

        low = 0; high = r

        while low<high:
            mid = (high + low) // 2

            if target>=matrix[mid][0] and target<=matrix[mid][c-1]:
                
                clow = 0;chigh=c-1
                
                while clow<=chigh :
                    cmid = (chigh+clow)//2
                    if matrix[mid][cmid]==target:
                        return True
                    elif matrix[mid][cmid]<target:
                        clow=cmid + 1
                    else:
                        chigh=cmid - 1
                return False

            elif target<matrix[mid][0]:
                high = mid
            else:
                low = mid + 1

        return False
        