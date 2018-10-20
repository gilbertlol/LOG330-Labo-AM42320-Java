import Model.MathValue;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestUnitMoyenne
{
	@Test
	public final void TestLimitInferieur_Moyenne(ArrayList<MathValue> data)
	{
		double average = MathCustom.MathFct.Average(data);

		assert.Equal(-30864168, average);
	}

	@Test
	public final void TestLimitSuperieur_Moyenne(ArrayList<MathValue> data)
	{
		double average = MathCustom.MathFct.Average(data);

		Junit.assertEqual(30864226.5, average, false, false, false);
	}

	@Test
	public final void TestInvalidData_Moyenne(ArrayList<MathValue> data)
	{
		double average = MathCustom.MathFct.Average(data);

		assert.NotInRange(average, -Double.MAX_VALUE, Double.MAX_VALUE);
	}

	private static java.lang.Iterable<Object[]> dataAverageTest(int index)
	{
		ArrayList<Object[]> list = new ArrayList<Object[]>(Arrays.asList(new Object[] {new ArrayList<MathValue>(Arrays.asList(new MathValue(-123456789), new MathValue(2), new MathValue(50), new MathValue(65)))}, new Object[] {new ArrayList<MathValue>(Arrays.asList(new MathValue(123456789), new MathValue(2), new MathValue(50), new MathValue(65)))}, new Object[] {new ArrayList<MathValue>(Arrays.asList(new MathValue(Double.MAX_VALUE+1), new MathValue(Double.MAX_VALUE+2), new MathValue(Double.MAX_VALUE+3), new MathValue(Double.MAX_VALUE+4)))}));
		return list.get(index);

	}
}