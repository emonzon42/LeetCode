/*
Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.

Note that elements beyond the length of the original array are not written.

Do the above modifications to the input array in place, do not return anything from your function.

 

Example 1:

Input: [1,0,2,3,0,4,5,0]
Output: null
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
Example 2:

Input: [1,2,3]
Output: null
Explanation: After calling your function, the input array is modified to: [1,2,3]
 

Note:

1 <= arr.length <= 10000
0 <= arr[i] <= 9
*/

import java.util.Arrays;
class Solution {
    public void duplicateZeros(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){ 
                //overwrites {i+1,...,len} with {i,...,len-1}
                //so that the array becomes {0,...,i,i,...,len-1}
                System.arraycopy(Arrays.copyOfRange(arr, i, arr.length-1), 0, arr, i+1, arr.length-i-1);
                i++; //to skip over new 0
            }
        }
            
    }
}