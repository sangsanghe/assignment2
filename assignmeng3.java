import java.util.*;

/**
 * Finish assignments, try bonus. Deadline: Before the next class.
 * 
 * @author Sangsang
 */
public class assignmeng3 {
	// assignments
	/**
	 * Write a method to find N numbers which are power of three. e.g. n=4,
	 * return {1,3,9,27}
	 */
	public int[] findPowerOfThree(int n) {
		int[] answer = new int[n];
		for(int i=0; i<n ;i++)
		{
		answer[i] = (int)Math.pow(3, i);	
		}
		return answer;
	}

	/**
	 * Given a integer 'n', return n%count, count is the number of digits of n
	 * For example, n = 100, return 1
	 */
	public int countDigits(int n) {
		int num = n;
		int i =0;
		for(; true; i++){
			if(n/10 == 0) break;
			else n = n/10;
		}
		return num%(i+1);
	}

	/**
	 * Given a integer 'n', if n is odd, print n odd numbers, if n is even,
	 * print n even numbers. For example, n = 3, print 1 3 5 n = 4, print 0 2 4
	 * 6
	 */
	public void printNumbers(int n) {
        if(n%2 == 0){
        	for(int i=0; i<n; i++){
        		System.out.println(2*i);
        	}
        }else{
        	for(int i=0; i<n; i++){
        		System.out.println(2*i+1);
        	}
        }
	}

	/**
	 * Given numRows, generate the first numRows of Pascal's triangle. For
	 * example, given numRows = 5, return: [1] [1,1] [1,2,1] [1,3,3,1]
	 * [1,4,6,4,1]
	 */
	public int[][] generatePascalsTriangle(int n) {
		int[][] a = new int[n][];
		for(int i=0; i<n; i++){
			int[] ans = new int[i+1];
			if(i == 0) ans[0]=1;
			else if(i == 1) ans[0]=ans[1]=1;
			else{
			for(int j=0; j<i+1; j++){
				if(j == 0 || j ==i)
				ans[j] = 1;
				else
				{
					ans[j] = a[i-1][j-1]+ a[i-1][j];
				}
			}}
			a[i] = ans;
		}
		return a;
	}
	
	 public List<List<Integer>> generate(int numRows) {//solution 2 for leecode
	        List<List<Integer>> a = new ArrayList<List<Integer>>();
			for(int i=0; i<numRows; i++){
				//int[] ans = new int[i+1];
				List<Integer> l = new ArrayList<Integer>();
				if(i == 0) l.add(1);
				else if(i == 1)
				{
					l.add(1);
					l.add(1);
				}
				else{
				for(int j=0; j<i+1; j++){
					if(j == 0 || j ==i)
					l.add(1);
					else
					{
						l.add(a.get(i-1).get(j-1)+a.get(i-1).get(j));
					}
				}}
				a.add(l);
			}
			return a;
	    }
	

	/**
	 * Write a function that takes a string as input and reverse only the vowels
	 * of a string. For example: Given s = "hello", return "holle".
	 */
	public String reverseVowels(String s) {
		String vowels = "";  
        String ans = "";
        int j = 1;
        int length = s.length();  
        for(int i = 0;i<length;i++)  {
	    if(s.charAt(i) == 'a'||s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u'||s.charAt(i) == 'A'||s.charAt(i) == 'E'||s.charAt(i) == 'I'||s.charAt(i) == 'O'||s.charAt(i) == 'U'){
		   vowels+=s.charAt(i);
	    }
        }
        for(int i = 0;i<length;i++)  {
	    if(s.charAt(i) == 'a'||s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u'||s.charAt(i) == 'A'||s.charAt(i) == 'E'||s.charAt(i) == 'I'||s.charAt(i) == 'O'||s.charAt(i) == 'U'){
		   ans+=vowels.charAt(vowels.length() - j);
		   j++;
	    }else{
		   ans+=s.charAt(i);
	    }
        }
       //ans+=s.charAt(i);  
       return ans;  
	}

	/**
	 * Given a string s consists of upper/lower-case alphabets and empty space
	 * characters ' ', return the length of last word in the string. If the last
	 * word does not exist, return 0. Note: A word is defined as a character
	 * sequence consists of non-space characters only.
	 */
	public int lengthOfLastWord(String str) {
		int num = -1;
		int ss = 0;
        for(int i = 0;i<str.length();i++)  {
        if(str.charAt(i) == ' '){
        	num = i;
        }
        }
        if(num == -1){//non-space
        return str.length();
        }else if(num == str.length() - 1){//end with ' '
        	for(int j = str.length()-2; j>=0; j--){
                if(str.charAt(j) == ' '){
                	if(ss == 0)
                	continue;
                	else
                		break;
                }
                ss++;
        	}
        	return ss;
        }
		return str.length()-num-1;
	}

	/**
	 * Reverse a string by words. Do not use 'split' function. e.g. "I like
	 * soccer" --> "soccer like I"
	 */
	public String reverseString2(String str) {
		int s=-1;
		int count=1;
		for(int k = 0; k<str.length(); k++){
		if(str.charAt(k) == ' '){
			count++;
		}
		}
		if(count == str.length()+1) return "";
		if(count == 1) return str;
		String[] ss = new String[count];
		int num=0;
		for(int k = 0; k<str.length(); k++){
			if(str.charAt(k) == ' '){
				ss[num]=str.substring(s+1, k);
				num++;
				s = k;
			}
			}
		if(str.charAt(str.length()-1) != ' ') ss[num]= str.substring(s+1,str.length());
        for(int i = 0; i<ss.length-1; i++){
        	//System.out.println(ss.length);
            String temp = ss[i];
            ss[i] = ss[ss.length-1-i];
            ss[ss.length-1-i] = temp;
        }
        String hss = "";
        for(int j=0; j<ss.length; j++){
        	hss=hss+ss[j]+" ";
        }

        return hss;
	}
	
	// Bonus
	/**
	 * A robot from Mars send a long message to Earth which only contains many
	 * "SOS", like "SOSSOS", "SOSSOSSOSSOSSOS" But the radiation from universe
	 * changed some characters of the massage. Write a method to count how many
	 * characters were changed. For example, "SOSSOSSOS" might be changed to
	 * "SOSSUSSOP", then your method should return 2. The message was consisted
	 * by "SOS" so its length will be multiple of 3. You could assume the
	 * message only contains upper letter.
	 */
	public int checkMessage(String message) {
		int num = 0;
		for(int i = 0; i<message.length(); i= i+3){
			if(message.charAt(i) == 'S') continue;
			else num++;
		}
		for(int i = 1; i<message.length(); i= i+3){
			if(message.charAt(i) == 'O') continue;
			else num++;
		}
		for(int i = 2; i<message.length(); i= i+3){
			if(message.charAt(i) == 'S') continue;
			else num++;
		}
		return num;
	}
	
	public static void main(String args[]){
		assignmeng3 a = new assignmeng3();
	    System.out.println(a.reverseString2("ss hello world"));
}
}