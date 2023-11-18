package SortingMethods;

public class MergeSort
{
    public static void main(String[] args) {

        int nums[] = {5, 6, 1, 4, 3, 20};
        System.out.println("Before sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        mergeSort(nums,0,nums.length-1);
        System.out.println();
        System.out.println("After sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    private static void mergeSort(int[] nums, int l, int r) {
        if(l<r)
        {
            int mid = (l+r)/2;
            mergeSort(nums,l,mid);  // recursive function from l to mid
            mergeSort(nums,mid+1,r);  // recursive function from next element to mid till r
            merge(nums,l,mid,r);
        }
    }
    private static void merge(int [] nums,int l,int mid,int r)
    {
        int n1 = mid -l +1;  // size of 1st array
        int n2 = r-mid; // size of 2nd array
        int lArr[] = new int[n1];
        int rArr[] = new int[n2];
        for(int x=0;x<n1;x++)
        {
            lArr[x] = nums[l+x];  // copy the values in the left array
        }
        for(int x=0;x<n2;x++)
        {
            rArr[x] = nums[mid + 1 +x];   // copy the values in the right array
        }

        int i=0;
        int j=0;
        int k=l; // starts from left side

        while(i<n1 && j<n2)
        {
            if(lArr[i] <= rArr[j])
            {
                nums[k] = lArr[i];  // merge the elements in the array
                i++;
            }
            else {
                nums[k] = rArr[j];
                j++;
            }
            k++;  // increments the value so we can add 1 value after another in the array
        }
        while(i<n1)
        {
            nums[k] = lArr[i];   // merge the left elements in the array
            i++;
            k++;
        }
        while(j<n2)
        {
            nums[k] = rArr[j];
            j++;
            k++;
        }
    }
}
