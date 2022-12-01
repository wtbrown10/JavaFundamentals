package com.careerdevs.will;

public class BinarySearch {
}

//class Solution {
//    public int search(int[] nums, int target) {
//        int index = 0;
//        int count = -1;
//        for (int num : nums){
//            count++;
//            System.out.println(count);
//            if(num == target) {
//                index = count;
//                System.out.println(target + " exists in nums and its index is " + index);
//                break;
//            } else if(count >= nums.length-1)
//                index = -1;
//        }
//        return index;
//    }
//}
//// fastest solution
//class Solution {
//    public int search(int[] nums, int target, int start, int end) {
//        if (start == end) return -1;
//
//        int mid = (start+end)/2;
//        if (nums[mid] == target) return mid;
//
//        if (target < nums[mid])
//            return search(nums, target, start, mid);
//        else
//            return search(nums, target, mid+1, end);
//    }
//
//    public int search(int[] nums, int target) {
//        int len = nums.length;
//        if (nums == null || len == 0 || target < nums[0] || target > nums[len-1])
//            return -1;
//        return search(nums, target, 0, len);
//    }
//}
