package javaclass;
import java.util.*;

public class mid {
public int longestPalindrome(String s){
    HashSet set=new HashSet();	
    int count=0;
	for(int i=0;i<s.length();i++){
		if(set.contains(s.charAt(i))){
			set.remove(s.charAt(i));
			count++;
			continue;
		}
		set.add(s.charAt(i));
	}
	int num=1;
	if(set.size()==0) num=0;
	return count*2+num;
}
public int maxProfit(int[] prices){
    int count=0;
    for(int i=0;i<prices.length-1;i++){
        if(prices[i+1]>prices[i]) count+=prices[i+1]-prices[i];
    }
    return count;
}
public String convertToTitle(int n) {
    return n == 0 ? "" : convertToTitle(--n / 26) + (char)('A' + (n % 26));
}
public int twoSum(int[] nums, int target){
	Arrays.sort(nums);
	int left = 0, right = nums.length - 1;
	int count=0;
	while (left < right) {
        int v = nums[left] + nums[right];
        if (v == target) {
            count++;
            right--;
            left++;
        } else if (v > target) {
            right --;
        } else {
            left ++;
        }
    }
	return count;
}

public static void main(String args[]){
	mid m=new mid();
	int[] nums={1,5,2,4,3,6};
	System.out.println(m.twoSum(nums, 3));
}
}
