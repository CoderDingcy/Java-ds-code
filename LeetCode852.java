public class LeetCode852 {
    //符合下列属性的数组 arr 称为 山脉数组 ：
    //arr.length >= 3
    //存在 i（0 < i < arr.length - 1）使得：
    //arr[0] < arr[1] < ... arr[i-1] < arr[i]
    //arr[i] > arr[i+1] > ... > arr[arr.length - 1]
    //给你由整数组成的山脉数组 arr ，返回满足 arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1] 的下标 i 。
    //
    //你必须设计并实现时间复杂度为 O(log(n)) 的解决方案。
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (true) {
            int mid = left + (right - left) / 2;
            if (mid > 0 && mid < arr.length - 1) {
                if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
                    return mid;
                } else if (arr[mid - 1] < arr[mid] && arr[mid] < arr[mid + 1]) {
                    left = mid + 1;
                } else if (arr[mid - 1] > arr[mid] && arr[mid] > arr[mid + 1]) {
                    right = mid - 1;
                }
            } else {
                // 边界情况处理，即mid为0或者arr.length-1
                if (mid == 0) {
                    if (arr[mid] > arr[mid + 1]) {
                        return mid;
                    } else {
                        return mid + 1;
                    }
                } else { // mid == arr.length - 1
                    if (arr[mid] > arr[mid - 1]) {
                        return mid;
                    } else {
                        return mid - 1;
                    }
                }
            }
        }
    }

}
