import java.util.Arrays;
class Person {
	int age;
	boolean gender;// false --> male, true --> female

	Person(int age, boolean gender) {
		this.age = age;
		this.gender = gender;
	}
}

public class assignment2 {
	// Assignment
	/**
	 * Write a Computer program to find the type of a person and print the type.
	 * Infant : If the age is less than 1 year Toddler : If the age is less than
	 * 3 and greater than 1 Pre Schooler : If the age is less than 5 and greater
	 * than 3 KG Girl : If the age is greater than 5 and less than 6 and the
	 * gender is female KG Boy : If the age is greater than 5 and less than 6
	 * and the gender is male
	 */
	public void personType(Person person) {
    if(person.age<1){
    	System.out.println("Infant");
    }else if(person.age<3){
    	System.out.println("Toddler");
    }else if(person.age<5){
    	System.out.println("Pre Schooler");
    }else if(person.age<6 && person.gender){
    	System.out.println("KG Girl");
    }else if(person.age<6 && !person.gender){
    	System.out.println("KG Boy");
    }
	}

	/**
	 * Given an integer N as input, check the following: If N is odd, print
	 * "Weird". If N is even and, in between the range of 2 and 5(inclusive),
	 * print "Not Weird". If N is even and, in between the range of 6 and
	 * 20(inclusive), print "Weird". If N is even and N>20, print "Not Weird".
	 */
	public void weirdNumber(int n) {
    if(n%2 != 0){System.out.println("Weird");}
    else if(n<5 && n>=2){System.out.println("Not Weird");}
    else if(n<=20 && n>=6){System.out.println("Weird");}
    else if(n>20) System.out.println("Not Weird");    
	}

	/**
	 * Write a method to determine whether a number is prime
	 */
	public void isPrime(int n) {
    if(n<2){System.out.println("isn't prime");}
    else{
    	for(int i=2; i<=Math.sqrt(n);i++){
    		if(n%i == 0){
    			System.out.println("isn't prime");
    			return;
    		}
    	}
        System.out.println("is prime");
    }
	}

	/**
	 * Find N fibonacci numbers Fibonacci Number: f(N) = f(N-1)+f(N-2).
	 * Typically, f(0)=f(1)=1.
	 */
	public int[] fibonacciNumber(int n) {
    int[] f = new int[n];
    f[0]=f[1]=1;
    for(int i=2; i<n; i++){
    	f[i]=f[i-1]+f[i-2];
    //	System.out.println(f[i]);
    }
    return f;
	}

	/**
	 * Write a function that takes a string as input and returns the string
	 * reversed. Given s = "hello", return "olleh".
	 */
	public String reverseString(String s) {
		String ans = "";  
	       int length = s.length();  
	       for(int i = length-1;i>=0;i--)  
	           ans+=s.charAt(i);  
	           return ans;  
	}

	/**
	 * Given an array of nums, write a function to find the largest two integer.
	 */
	public int[] findTheLargestTwo(int[] nums) {
		int first = nums[0] ;
		int second = nums[1] ;
		if(first < second){
			int temp = first ;
			first = second ;
			second = temp ;
		}
		for(int i=2;i<nums.length;i++){
			if(nums[i] > first){
				second = first ;
				first = nums[i] ;
				continue ;
			}
			if(nums[i] > second){
				second = nums[i] ;
			}
		}
		int[] ans = new int[2];
		ans[0]=first;
		ans[1]=second;
		return ans;
	}

	/**
	 * Given an array nums, write a function to move all 0's to the end of it
	 * while maintaining the relative order of the non-zero elements. For
	 * example, given nums = [0, 1, 0, 3, 12], after calling your function, nums
	 * should be [1, 3, 12, 0, 0].
	 */
	public void moveZeroes1(int[] nums) {//Solution 1
		int l=nums.length;
		int[] nums2= nums.clone();
        int numofzero = 0;
        for(int i = 0; i<l; i++){
        	if(nums[i] == 0){
        		for(int j = i-numofzero; j<l-1; j++)
        		{
        			nums2[j]=nums2[j+1];
        		}
        		nums2[l-1]=0;
        		numofzero++;
        	}
        }
        System.out.println(Arrays.toString(nums2));
	}
	public void moveZeroes2(int[] nums) {//Solution 2 without making a copy of the array
		int l=nums.length;
        int zeroflag = 0;
        for(int hss = 0; hss<l; hss++){
        	int i = hss-zeroflag;
        	if(nums[i] == 0){
        		for(;i<l-1; i++)
        		{
        			nums[i]=nums[i+1];
        		}
        		nums[l-1]=0;
        		zeroflag++;
        	}
        }
        System.out.println(Arrays.toString(nums));
	}
	// Bonus
	/**
	 * Given a non-negative integer n, repeatedly add all its digits until the
	 * result has only one digit. For example: Given n = 38, the process is
	 * like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
	 */
	public int addDigits(int n) {
		int a=n/10;
		int b=n%10;
		if(a == 0){
			return n;
		}
		return addDigits(a+b);
	}

	/**
	 * Write a program to check whether a given number is an ugly number. Ugly
	 * numbers are positive numbers whose prime factors only include 2, 3, 5.
	 * For example, 6, 8 are ugly, while 14 is not ugly since it includes
	 * another prime factor 7. Note that 1 is typically treated as an ugly
	 * number.
	 */
	public boolean isUgly(int n) {
		if(n == 1) return true;
		if(n%2 == 0 ){
			return isUgly(n/2);
		}
		if(n%3 == 0 ){
			return isUgly(n/3);
		}
		if(n%5 == 0 ){
			return isUgly(n/5);
		}
		return false;
	}
	
	public static void main(String args[]){
	//Person p = new Person(4,false);
	assignment2 a = new assignment2();
	//int[] ss ={1,2,3,4,0,5,6,0,6,7};
System.out.println(a.isUgly(14));
	}
}