import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LastDigitReturnTest {
	
	@Test
	public void testcase1()
	{
		Assertions.assertEquals(6,LastDigitReturn.lastDigitReturn(786));
	}
	@Test
	public void testcase2()
	{
		Assertions.assertEquals(6,LastDigitReturn.lastDigitReturn(-786));
	}


}
