import Model.MathValue;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestUnitStandardDeviation
{
	@Test
	public final void TestLimitInferior_StandardDeviation(ArrayList<MathValue> data)
	{

		double deviation = MathCustom.MathFct.StandardDeviation(MathCustom.MathFct.Variance(data));

		assert.Equal(61728414.000005841, deviation, false, false, false);
	}

	@Test
	public final void TestLimitSuperior_StandardDeviation(ArrayList<MathValue> data)
	{
		double deviation = MathCustom.MathFct.StandardDeviation(MathCustom.MathFct.Variance(data));

		assert.Equal(61728375.000005841, deviation, false, false, false);
	}

	@Test
	public final void TestInvalidData_StandardDeviation(ArrayList<MathValue> data)
	{
		double deviation = MathCustom.MathFct.StandardDeviation(MathCustom.MathFct.Variance(data));

		assert.NotInRange(deviation, -double.MAX_VALUE, double.MAX_VALUE);
	}

	private static java.lang.Iterable<Object[]> dataAverageTest(int index)
	{
		ArrayList<Object[]> list = new ArrayList<Object[]>(Arrays.asList(new Object[] {new ArrayList<MathValue>(Arrays.asList(new MathValue(-123456789), new MathValue(2), new MathValue(50), new MathValue(65)))}, new Object[] {new ArrayList<MathValue>(Arrays.asList(new MathValue(123456789), new MathValue(2), new MathValue(50), new MathValue(65)))}, new Object[] {new ArrayList<MathValue>(Arrays.asList(new MathValue(Double.MAX_VALUE), new MathValue(2), new MathValue(50), new MathValue(65)))}));
		return list.get(index);

	}
}