package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
	
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
    public void testEvenNumber() {
        int number = 4; 
        Assert.assertTrue(WeatherAndMathUtils.isEven(number));
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
    public void testWarningLevelWeatherAdvice() {
        Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(50.0, 3.0));
    }
    
   
    @Test
    public void testCancelWeatherAdvice() {
        Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    }
    
}