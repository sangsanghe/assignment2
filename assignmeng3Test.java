import static org.junit.Assert.*;
import java.io.*;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class assignmeng3Test {

	@Test
	public void test() {
	    assignmeng3 a = new assignmeng3();
		int[] one = a.findPowerOfThree(4);
		int[] expecteds1 = {1,3,9,27};
		Assert.assertArrayEquals(expecteds1, one);
		
		int two = a.countDigits(100);
		int expecteds2 = 1;
		Assert.assertEquals(expecteds2, two);
		
		ByteArrayOutputStream b = new ByteArrayOutputStream(1024);
		PrintStream cacheStream = new PrintStream(b);
		System.setOut(cacheStream);
		a.printNumbers(3);
		String output = b.toString();
		Assert.assertEquals("135", output);

		int[][] four = a.generatePascalsTriangle(5);
	    int[][] expecteds4 = {{1},{1,1},{1,2,1},{1,3,3,1},{1,4,6,4,1}};
	    Assert.assertArrayEquals(expecteds4, four);
	    
	    String five = a.reverseVowels("hello");
	    String expecteds5 = "holle";
	    Assert.assertEquals(expecteds5, five);
	    
	    int six = a.lengthOfLastWord("sangsang he");
	    int expecteds6 = 2;
	    Assert.assertEquals(expecteds6, six);
	    
	    String seven = a.reverseString2("I LOVE SOCCER");
	    String expecteds7 = "SOCCER LOVE I";
	    Assert.assertEquals(expecteds7, seven);
	    
	    int eight = a.checkMessage("SOSSUSSOP");
	    int expecteds8 = 2;
	    Assert.assertEquals(expecteds8, eight);
	}

}
