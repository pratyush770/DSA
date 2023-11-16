package SortingMethods;

public class BubbleSort
{
    public static void main(String[] args) {
        int it=0;
        int nums[] = {6,8,2,5,4,1};
        System.out.println("Before sorting the elements are : ");
        for(int num:nums)
        {
            System.out.print(num + " ");
        }
        for(int i=0;i<nums.length;i++)
        {

            int temp=0;
            it++;
            for(int j=0;j<nums.length-i-1;j++)
            {

                if(nums[j]>nums[j+1])
                {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
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
