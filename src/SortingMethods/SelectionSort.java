package SortingMethods;

public class SelectionSort  // swaps each element outside inner loop on the basis of minimum or maximum value and time complexity is O(N2)
{
    public static void main(String[] args) {
        int nums[] = {6,8,2,5,4,20};
        int min = -1;
        int temp=0;
        int it=0;
        System.out.println("Before sorting the elements are : ");
        for(int num:nums)
        {
            System.out.print(num + " ");
        }
        for(int i=0;i<nums.length;i++)
        {
            min = i;
            it++;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[min]>nums[j])
                {
                    min = j;
                }
            }
            temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
            System.out.println();
            System.out.println();
            System.out.println("The " + it + " iteration is as follows :");
            for(int num:nums)
            {
                System.out.print(num + " ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("After sorting the elements are : ");
        for(int num:nums)
        {
            System.out.print(num + " ");
        }
    }
}
