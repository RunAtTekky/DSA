/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

//
//class Solution {
//    public int findInMountainArray(int target, MountainArray mountainArr) {
//        int peak = findPeak(mountainArr);
//        int inIncreasing = oaBS(mountainArr, target, 0, peak, true);
//        if (inIncreasing!=-1){
//            return inIncreasing;
//        }
//        return oaBS(mountainArr, target, peak+1, mountainArr.length()-1, false);
//    }
//
//
//    static int oaBS(MountainArray mountainArr, int target, int start, int end, boolean isInc){
//        while(start<=end){
//            int mid = start + (end-start)/2;
//            int ele = mountainArr.get(mid);
//
//            if (ele == target){
//                return mid;
//            }
//
//            if (isInc){
//                if (ele > target){
//                    end = mid-1;
//                }
//                else{
//                    start = mid+1;
//                }
//            }
//            else{
//                if (ele > target){
//                    start = mid+1;
//                }
//                else{
//                    end = mid-1;
//                }
//            }
//        }
//        return -1;
//    }
//
//
//    static int findPeak(MountainArray mountainArr){
//        int start = 0;
//        int end = mountainArr.length()-1;
//
//        while(start<end){
//            int mid = start + (end-start)/2;
//            int ele = mountainArr.get(mid);
//            int ele2 = mountainArr.get(mid+1);
//            if(ele > ele2){
//                end = mid;
//            }
//            else if (ele < ele2){
//                start = mid+1;
//            }
//        }
//        return start;
//    }
//}