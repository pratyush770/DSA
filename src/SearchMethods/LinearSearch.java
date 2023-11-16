package SearchMethods;
import java.util.*;
public class LinearSearch
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[10000];  // always requires a sorted array
        System.out.print("Enter the element :");
        int target = sc.nextInt();
        int result = linearSearch(nums,target);
        if(result!=-1)
        {
            System.out.println("The element is found at index : " + result);
        }
        else
        {
            System.out.println("Element not found");
        }
    }

    public static int linearSearch(int[] nums, int target) {
        int steps=0;
        for(int i=0;i<nums.length;i++)   // checks for 1 element at a time
        {
            steps++;
            if(nums[i]==target)
            {
                System.out.println("Steps taken by Linear Search are : " + steps);
                return  i;
            }
        }
        System.out.println("Steps taken by Linear Search are : " + steps);
        return -1;
    }
}
