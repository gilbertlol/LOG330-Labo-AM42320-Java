import Model.MathValue;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestUnitVariance
  {
	@Test
  	public final void TestLimitInferieur_Variance(ArrayList<MathValue> data)
	  {
		  double variance = MathCustom.MathFct.Variance(data);
		  assert.Equal(3810397094956117, variance, false, false, false);
	  }

	  @Test
	  public final void TestLimitSuperieur_Variance(ArrayList<MathValue> data)
	  {
		  double variance = MathCustom.MathFct.Variance(data);

		  assert.Equal(3810392280141346.5, variance, false, false, false);
	  }

	  @Test
	  public final void TestInvalidData_Variance(ArrayList<MathValue> data)
	  {
		  double variance = MathCustom.MathFct.Variance(data);

		  assert.NotInRange(variance, -double.MAX_VALUE, double.MAX_VALUE);
	  }

	  private static lang.Iterable<object[]> dataAverageTest(int index)
	  {
		  ArrayList<object[]> list = new ArrayList<object[]>(Arrays.asList(new Object[] {new ArrayList<MathValue>(Arrays.asList(new MathValue(-123456789), new MathValue(2), new MathValue(50), new MathValue(65)))}, new Object[] {new ArrayList<MathValue>(Arrays.asList(new MathValue(123456789), new MathValue(2), new MathValue(50), new MathValue(65)))}, new Object[] {new ArrayList<MathValue>(Arrays.asList(new MathValue(Double.MAX_VALUE), new MathValue(2), new MathValue(50), new MathValue(65)))}));
		  return list.get(index);

	  }
  }