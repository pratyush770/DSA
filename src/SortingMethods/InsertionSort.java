package SortingMethods;

public class InsertionSort   // shifts values and time complexity is O(n^2)
{
    public static void main(String[] args) {
        int nums [] = {5,6,1,4,2,10};
        int i,key=0;
        int it=0;
        System.out.println("Before sorting the elements are : ");
        for(int num:nums)
        {
            System.out.print(num + " ");
        }
        for(i=1;i< nums.length-1;i++)
        {
            it++;
            key = nums[i];  // the value of i goes to key
            int j=i-1;  // initially j=0
            while(j>=0 && nums[j]>key)
            {
                nums[j+1] = nums[j];  // shifts the previous value to the next value
                j--; // index keeps reducing
            }
            nums[j+1] = key;  // assigns the lowest value to the first index
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
