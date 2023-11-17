package SortingMethods;

public class QuickSort  // sorts on the basis of divide and conquer and requires pivot and time complexity is O(Nlog(N))
{
    public static void main(String[] args) {
        int nums [] = {2,3,1,6,10,19,25,21};
        quickSort(nums,0,nums.length-1);  // used for recursion
        for(int num:nums)
        {
            System.out.print(num + " ");
        }
    }

    public static void quickSort(int[] nums, int low, int high) {
        if(low<high)
        {
            int pi = partition(nums,low,high);  // calls the partition function to get the pivot
            // division of array using recursion
            quickSort(nums,low,pi-1);  // excludes the pivot
            quickSort(nums,pi+1,high);  // starts from next element after pivot
        }
    }

    private static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];  // usually considered the lst value
        int i = low-1;  // initially i=-1
        for(int j=low;j<high;j++)
        {
            if(nums[j]<pivot)
            {
                i++;  // increments the value of i if true i.e i becomes 1 first
                int temp = nums[i];  // swaps nums[i],nums[j]
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[i+1];  // swaps nums[i+1] with high value i.e. pivot
        nums[i+1] = nums[high];
        nums[high] = temp;
        return i+1;  // returns the pivot
    }
}
