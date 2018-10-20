package CalculVariance;

import CalculVariance.MathCustom.*;
import CalculVariance.Model.*;
import Xunit.*;
import java.util.*;

public class TestUnitStandardDeviation
{

//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [Theory][MemberData("dataAverageTest", parameters: 0)] public void TestLimitInferior_StandardDeviation(List<MathValue> data)
	public final void TestLimitInferior_StandardDeviation(ArrayList<MathValue> data)
	{
		double deviation = MathCustom.MathFct.StandardDeviation(MathCustom.MathFct.Variance(data));

		Assert.Equal(61728414.000005841, deviation, false, false, false);
	}

//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [Theory][MemberData("dataAverageTest", parameters: 1)] public void TestLimitSuperior_StandardDeviation(List<MathValue> data)
	public final void TestLimitSuperior_StandardDeviation(ArrayList<MathValue> data)
	{
		double deviation = MathCustom.MathFct.StandardDeviation(MathCustom.MathFct.Variance(data));

		Assert.Equal(61728375.000005841, deviation, false, false, false);
	}

//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [Theory][MemberData("dataAverageTest", parameters: 2)] public void TestInvalidData_StandardDeviation(List<MathValue> data)
	public final void TestInvalidData_StandardDeviation(ArrayList<MathValue> data)
	{
		double deviation = MathCustom.MathFct.StandardDeviation(MathCustom.MathFct.Variance(data));

		Assert.NotInRange(deviation, -Double.MAX_VALUE, Double.MAX_VALUE);
	}

	private static java.lang.Iterable<Object[]> dataAverageTest(int index)
	{
		ArrayList<Object[]> list = new ArrayList<Object[]>(Arrays.asList(new Object[] {new ArrayList<MathValue>(Arrays.asList(new MathValue(-123456789), new MathValue(2), new MathValue(50), new MathValue(65)))}, new Object[] {new ArrayList<MathValue>(Arrays.asList(new MathValue(123456789), new MathValue(2), new MathValue(50), new MathValue(65)))}, new Object[] {new ArrayList<MathValue>(Arrays.asList(new MathValue(Double.MAX_VALUE), new MathValue(2), new MathValue(50), new MathValue(65)))}));
		return list.GetRange(index,1);

	}
}