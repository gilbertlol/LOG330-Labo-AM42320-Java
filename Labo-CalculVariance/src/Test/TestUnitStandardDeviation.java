import Model.MathValue;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;

import java.util.ArrayList;
import java.util.Arrays;

public class TestUnitStandardDeviation
{
	@DisplayName("Should pass a non-null message to our test method")
	@ParameterizedTest
	@ValueSource(strings = {"Hello", "World"})
	@Test
	public final void TestLimitInferior_StandardDeviation(ArrayList<MathValue> data)
	{
		double deviation = MathCustom.MathFct.StandardDeviation(MathCustom.MathFct.Variance(data));
		assertEquals(deviation, 61728414.000005841);
	}

	@Test
	public final void TestLimitSuperior_StandardDeviation(ArrayList<MathValue> data)
	{
		double deviation = MathCustom.MathFct.StandardDeviation(MathCustom.MathFct.Variance(data));
		assertEquals(deviation, 61728375.000005841);
	}

	@Test
	public final void TestInvalidData_StandardDeviation(ArrayList<MathValue> data)
	{
		double deviation = MathCustom.MathFct.StandardDeviation(MathCustom.MathFct.Variance(data));
		assertEquals(deviation, -Double.MAX_VALUE);
	}

	private static java.lang.Iterable<Object[]> dataAverageTest(int index)
	{
		ArrayList<Object[]> list = new ArrayList<Object[]>(Arrays.asList(new Object[] {new ArrayList<MathValue>(Arrays.asList(new MathValue(-123456789), new MathValue(2), new MathValue(50), new MathValue(65)))}, new Object[] {new ArrayList<MathValue>(Arrays.asList(new MathValue(123456789), new MathValue(2), new MathValue(50), new MathValue(65)))}, new Object[] {new ArrayList<MathValue>(Arrays.asList(new MathValue(Double.MAX_VALUE), new MathValue(2), new MathValue(50), new MathValue(65)))}));
		return list.get(index);

	}
}