package SearchMethods;

import java.util.Scanner;

public class BinarySearch
{
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            int nums[] = new int[1000];  // works on sorted as well as unsorted array
            System.out.print("Enter the element :");
            int target = sc.nextInt();
            int result = binarySearch(nums,target);
            if(result!=-1)
            {
                System.out.println("The element is found at index : " + result);
            }
            else
            {
                System.out.println("Element not found");
            }
        }

        public static int binarySearch(int[] nums, int target) {
            int steps = 0;
           int left = 0;
           int right = nums.length-1;
           while(left<=right)
           {
               steps++;
               int mid = (left + right)/2;
               if(nums[mid] == target)
               {
                   System.out.println("Steps taken by Binary Search are : " + steps);
                   return mid;
               }
               else if(nums[mid]<target)
               {
                   left = mid+1;
               }
               else if(nums[mid]>target)
               {
                   right = mid-1;
               }
           }
            System.out.println("Steps taken by Binary Search are : " + steps);
            return -1;
        }
}
