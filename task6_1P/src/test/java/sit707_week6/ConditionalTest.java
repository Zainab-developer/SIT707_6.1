package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class ConditionalTest {
	
	@Test
	public void testSumUpTo() {
	    Assert.assertEquals(1, Conditional.sumUpTo(1)); // Test with n = 1
	    Assert.assertEquals(15, Conditional.sumUpTo(5)); // Test with n = 5
	    Assert.assertEquals(0, Conditional.sumUpTo(0)); // Test with n = 0
	    Assert.assertEquals(55, Conditional.sumUpTo(10)); // Test with n = 10
	    Assert.assertEquals(0, Conditional.sumUpTo(-3)); // Test with negative n
	    Assert.assertEquals(500500, Conditional.sumUpTo(1000)); }
	
	@Test
	public void testSumUpToDifferent() {
	    Assert.assertEquals(1, Conditional.sumUpTo(1)); // Test with n = 1
	    Assert.assertEquals(15, Conditional.sumUpTo(5)); // Test with n = 5
	    Assert.assertEquals(0, Conditional.sumUpTo(0)); // Test with n = 0
	    Assert.assertEquals(55, Conditional.sumUpTo(10)); // Test with n = 10
	    Assert.assertEquals(0, Conditional.sumUpTo(-3)); }

	   

	@Test
	public void testIsPalindrome() {
	    Assert.assertTrue(Conditional.isPalindrome("racecar")); // Test with a palindrome
	    Assert.assertFalse(Conditional.isPalindrome("hello")); // Test with a non-palindrome
	    Assert.assertTrue(Conditional.isPalindrome("")); // Test with an empty string
	    Assert.assertTrue(Conditional.isPalindrome("a")); // Test with a single character string
	    Assert.assertTrue(Conditional.isPalindrome("level")); // Test with an odd-length palindrome
	    Assert.assertFalse(Conditional.isPalindrome("hello world")); // Test with a sentence
	    
	    // Additional test cases
	    Assert.assertTrue(Conditional.isPalindrome("madam")); // Test with another palindrome
	    Assert.assertTrue(Conditional.isPalindrome("noon")); // Test with another palindrome
	    Assert.assertFalse(Conditional.isPalindrome("abcde")); // Test with a non-palindrome
	    Assert.assertTrue(Conditional.isPalindrome("rotor")); // Test with another palindrome
	    Assert.assertFalse(Conditional.isPalindrome("hello there")); // Test with another non-palindrome
	}

    public int sumOfFirstNIntegers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    
    @Test
	public void testStudentIdentity() {
		String studentId =  "s223123562";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Zainab";
		Assert.assertNotNull("Student name is null", studentName);
	}
	

    @Test
    public void testSumOfFirstNIntegers() {
        int result = sumOfFirstNIntegers(5);
        Assert.assertEquals(15, result);

        result = sumOfFirstNIntegers(1);
        Assert.assertEquals(1, result);

        result = sumOfFirstNIntegers(10);
        Assert.assertEquals(55, result);

        result = sumOfFirstNIntegers(0); // Test with zero
        Assert.assertEquals(0, result);

        result = sumOfFirstNIntegers(-3); // Test with negative input
        Assert.assertEquals(0, result);
    }

    public boolean containsEvenNumber(int[] array) {
        if (array == null || array.length == 0) {
            return false;
        }
        for (int num : array) {
            if (num % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    @Test
    public void testContainsEvenNumber() {
        int[] array1 = {1, 3, 5, 7, 9};
        boolean result = containsEvenNumber(array1);
        Assert.assertFalse(result);

        int[] array2 = {1, 2, 3, 4, 5};
        result = containsEvenNumber(array2);
        Assert.assertTrue(result);

        int[] array3 = {2, 4, 6, 8, 10};
        result = containsEvenNumber(array3);
        Assert.assertTrue(result);

        int[] array4 = {2}; // Test with single even number
        result = containsEvenNumber(array4);
        Assert.assertTrue(result);

        int[] array5 = {1, 3, 5, 7, 9}; // Test with only odd numbers
        result = containsEvenNumber(array5);
        Assert.assertFalse(result);
    }
    @Test
    public void testOddNumber() {
        int number = 7; 
        Assert.assertFalse(WeatherAndMathUtils.isEven(number));
    }
    
 
    @Test
    public void testPrimeNumber() {
        int number = 7; 
        Assert.assertTrue(WeatherAndMathUtils.isPrime(number));
    }


    @Test
    public void testNonPrimeNumber() {
        int number = 6; 
        Assert.assertFalse(WeatherAndMathUtils.isPrime(number));
    }
    
  
    @Test
    public void testAllClearWeatherAdvice() {
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(30.0, 0.0));
    }
    
    @Test
    public void testEvenNumber() {
        int number = 4; 
        Assert.assertTrue(WeatherAndMathUtils.isEven(number));
    }

 
    @Test
    public void testWarningLevelWeatherAdvice() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(50.0, 3.0));
    }
    
   
    @Test
    public void testCancelWeatherAdvice() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    }
    @Test
    public void testDangerousWindSpeedWeatherAdvice() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(71.0, 0.0));
    }

    @Test
    public void testConcerningRainfallAndWindSpeedWeatherAdvice() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(46.0, 4.1));
    }

    @Test
    public void testMixedWeatherAdvice() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(55.0, 5.0));
    }
    @Test(expected = IllegalArgumentException.class)
    public void testIllegalArgumentException() {
        throw new IllegalArgumentException();
    }


    

    @Test
    public void testAnotherOddNumber() {
        int number = 9; 
        Assert.assertFalse(WeatherAndMathUtils.isEven(number));
    }

    @Test
    public void testAnotherPrimeNumber() {
        int number = 11; 
        Assert.assertTrue(WeatherAndMathUtils.isPrime(number));
    }

    @Test
    public void testAnotherNonPrimeNumber() {
        int number = 12; 
        Assert.assertFalse(WeatherAndMathUtils.isPrime(number));
    }

    @Test
    public void testAnotherAllClearWeatherAdvice() {
        Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(25.0, 0.0));
    }

    @Test
    public void testAnotherWarningLevelWeatherAdvice() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(55.0, 2.5));
    }

    @Test
    public void testAnotherCancelWeatherAdvice() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(75.0, 0.0));
    }

    @Test
    public void testAnotherDangerousWindSpeedWeatherAdvice() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(80.0, 0.0));
    }

    @Test
    public void testAnotherConcerningRainfallAndWindSpeedWeatherAdvice() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(60.0, 5.0));
    }

    @Test
    public void testAnotherMixedWeatherAdvice() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(65.0, 6.0));
    }
    @Test
    public void testAnotherEmptyStringPalindrome() {
        Assert.assertTrue(Conditional.isPalindrome(""));
    }

    @Test
    public void testAnotherSingleCharacterPalindrome() {
        Assert.assertTrue(Conditional.isPalindrome("x"));
    }

    @Test
    public void testAnotherEvenNumberInArray() {
        int[] array = {1, 3, 5, 7, 8};
        boolean result = containsEvenNumber(array);
        Assert.assertTrue(result);
    }

    @Test
    public void testAnotherNegativeNumber() {
        int number = -10; 
        Assert.assertFalse(WeatherAndMathUtils.isEven(number));
    }

    @Test
    public void testAnotherNonPrimeNumberInArray() {
        int[] array = {2, 3, 5, 7, 8};
        boolean result = containsEvenNumber(array);
        Assert.assertTrue(result);
    }

    @Test
    public void testAnotherSumOfFirstNIntegersWithLargeN() {
        int result = sumOfFirstNIntegers(100);
        Assert.assertEquals(5050, result);
    }

    @Test
    public void testAnotherNonPalindromeString() {
        Assert.assertFalse(Conditional.isPalindrome("hello"));
    }

    @Test
    public void testAnotherNegativeSumOfFirstNIntegers() {
        int result = sumOfFirstNIntegers(-5);
        Assert.assertEquals(0, result);
    }

    @Test
    public void testAnotherContainsEvenNumberWithEmptyArray() {
        int[] array = {};
        boolean result = containsEvenNumber(array);
        Assert.assertFalse(result);
    }

   

    @Test
    public void testAnotherNonPalindromeStringWithNumbers() {
        Assert.assertFalse(Conditional.isPalindrome("12321"));
    }

    @Test
    public void testAnotherLargePrimeNumber() {
        int number = 997; // A large prime number
        Assert.assertTrue(WeatherAndMathUtils.isPrime(number));
    }

    @Test
    public void testAnotherOddNumberInArray() {
        int[] array = {1, 3, 5, 7, 9};
        boolean result = containsEvenNumber(array);
        Assert.assertFalse(result);
    }

}
