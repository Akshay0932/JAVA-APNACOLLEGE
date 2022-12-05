//Question 2 : Write a method named isEven that accepts an 
int argument. The method
should return true if the argument is even,
or false otherwise. 
Also write a program to test your
method.
//
import java.util.*;
class HelloWorld {
    public static boolean isEven(int num){
        if(num%2==0){
        return true;
    }else{
        return false;
    }
    
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
        System.out.print(isEven(a));
    }
       }
-------------------------------------------------------------------------------------------
     
//Question 5:
Write a Java method to compute the sum of the digits in an integer.

(Hint : Approach this question in the following way :
a. Take a variable sum = 0
b. Find the last digit of the number
c. Add it to the sum
d. Repeat a &b until the number becomes 0 )
//
import java.util.*;
class HelloWorld {
    public static void isEven(int num){
        int sum=0;
 while(num>0){
     int rem=num%10;
     sum+=rem;
     num/=10;
 }
  System.out.print(sum);
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
isEven(num);
    }
       }
     -----------------------------------------------------------------------------------------
Question 3 : Write a Java program to check if a number is a palindrome in Java? (121 isa
palindrome, 321 is not)

A number is called a palindrome if the number is equal to the reverse of anumber e.g., 121 is a
palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a

palindrome because the reverse A Mara to 321.
//
import java.util.*;
class HelloWorld {
    public static void isnumpalin(int num){
        int sum=0;
        int temp=num;
 while(num>0){
     int rem=num%10;
     sum=sum*10+rem;;
     num/=10;
 }
if(temp==sum){
    System.out.print("it is a palin");
}else{
    System.out.print("it is not a palin");
}
    }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
isnumpalin(num);
    }
       }
--------------------------------------------------------------------------------------------
-------------------(14)ARRAYS QUESTTIONS--------------------------------------------------
/*Given an integer array nums, return true if any value 
appears at least twice in the array, and return false if 
every element is distinct*/
import java.util.*;
public class Main
{
    static boolean arrays(int arr[]){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    return true;
                    }
            }
            }
        return false;
    }
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	    System.out.print("enter n elements: ");
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    System.out.print("Enter"+n+"elements: ");
	    for(int i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    System.out.print("array contains dupicate is: ");
	//int arr[]={1,2,3,4,5};
System.out.print(arrays(arr));
	}
}
--------------------------------------------------------------------------------------------
/*2)
There is an integer array nums sorted in ascending order (with distinct values).
Prior to being passed to your function, nums is possibly rotated at an unknown
pivot index k (1 <= k < nums.length) such that the resulting array is [numsfk],
nums|k+1], ..., nums[n-1], nums[0], numsf[1], ..., numsf[k-1]] (0-indexed). For
example, [0,1,2,4,5,6,7] might be rotated at pivot index3and
become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the
index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.
*/

public class Main
{
   public int search(int[] nums, int target) {//min will have index of minimum element of nums int min = minSearch(nums); //find in sorted left if(nums[min] <= target && target <= nums[nums.length-1]){ return search(nums,min,nums.length-1,target); } //find in sorted right else{ return search(nums,0,min,target); } }//binary search to find target in left to right boundary public int    search(int[] nums,int left,int right,int target){ int l = left; int    r  = right;// System.out.println(left+" "+right); while(l <= r){ int mid = l + (r - l)/2; if(nums[mid] ==   target){ return mid; } else if(nums[mid] > target){ r = mid-1; } else{ l = mid+1; } } return -1; }//smallest element indexpublic int minSearch(int[] nums){ int left = 0; int right = nums.length-1; Question 2 (DSA Sheet #6)Approach - Based on Binary Searchakshaykadam2049@gmail.com
//min will have index of minimum element of nums int min = minSearch(nums); //find in sorted left if(nums[min] <= target && target <= nums[nums.length-1]){ return search(nums,min,nums.length-1,target); } //find in sorted right else{ return search(nums,0,min,target); } }//binary search to find target in left to right boundary public int    search(int[] nums,int left,int right,int target){ int l = left; int    r  = right;// System.out.println(left+" "+right); while(l <= r){ int mid = l + (r - l)/2; if(nums[mid] ==   target){ return mid; } else if(nums[mid] > target){ r = mid-1; } else{ l = mid+1; } } return -1; }//smallest element indexpublic int minSearch(int[] nums){ int left = 0; int right = nums.length-1; Question 2 (DSA Sheet #6)Approach - Based on Binary Search
int min = minSearch (nums) ;
//find in sorted left
if(nums[min] <= target && target <= nums[nums.length-1]) {
return search (nums,min,nums.length-1, target) ;
}
//find in sorted right
else{
return search(nums,0,min, target) ;
}
}
//binary search to find target in left to right boundary
public int search(int[] nums,int left,int right,int target) {
int l = left;
int r = right;
// System.out.println(left+" "tright);
while(l <= r){
int mid = 1+ (r — 1)/2;
if (nums [mid] == target) {
return mid;

}
else if(nums[mid] > target){
   r=mid-1;
}
 
else{
   l=mid+1;
}
}
return -1;
}
//smallest element index

public int minSearch(int[] nums) {
int left = 0;
int right = nums.length-1;
while(left < right) {
int mid=left+(right -left)/2;
if(mid > 0 && nums[mid-1] > nums[mid]) {
return mid;
}
else if(nums[left] <= nums[mid] && nums[mid] > nums[right]) {
left=mid+1;
}
else{
   right=mid-1;
}
}
return left;
}
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
______________________________________________________________________________
/*3)in notebook
___________________________________________________________________________
/*4)
Given n non-negative integers representing an elevation map where the width of

each bar is 1, compute how much water it can trap after raining.
*/
___________________________________________________________________________
5)Given an integer array nums, return all the triplets [nums[i], numsfj],
nums{k]] such that i !=j, i != k, andj != k, and nums[i] + nums{j] + nums|k] ==
Notice that the solution set must not contain duplicate triplets.
*/
it uses list and hasmap not to do now
________________________________________________________________________________