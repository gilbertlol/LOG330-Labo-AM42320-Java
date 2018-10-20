package CalculVariance;

import CalculVariance.Model.*;
import Xunit.*;
import java.util.*;

public class TestUnitMoyenne
{
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [Theory][MemberData("dataAverageTest", parameters: 0)] public void TestLimitInferieur_Moyenne(List<MathValue> data)
	public final void TestLimitInferieur_Moyenne(ArrayList<MathValue> data)
	{
		double average = MathCustom.MathFct.Average(data);

		Assert.Equal(-30864168, average, false, false, false);
	}

//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [Theory][MemberData("dataAverageTest", parameters: 1)] public void TestLimitSuperieur_Moyenne(List<MathValue> data)
	public final void TestLimitSuperieur_Moyenne(ArrayList<MathValue> data)
	{
		double average = MathCustom.MathFct.Average(data);

		Assert.Equal(30864226.5, average, false, false, false);
	}

//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [Theory][MemberData("dataAverageTest", parameters: 2)] public void TestInvalidData_Moyenne(List<MathValue> data)
	public final void TestInvalidData_Moyenne(ArrayList<MathValue> data)
	{
		double average = MathCustom.MathFct.Average(data);

		Assert.NotInRange(average, -Double.MAX_VALUE, Double.MAX_VALUE);
	}

	private static java.lang.Iterable<Object[]> dataAverageTest(int index)
	{
		ArrayList<Object[]> list = new ArrayList<Object[]>(Arrays.asList(new Object[] {new ArrayList<MathValue>(Arrays.asList(new MathValue(-123456789), new MathValue(2), new MathValue(50), new MathValue(65)))}, new Object[] {new ArrayList<MathValue>(Arrays.asList(new MathValue(123456789), new MathValue(2), new MathValue(50), new MathValue(65)))}, new Object[] {new ArrayList<MathValue>(Arrays.asList(new MathValue(Double.MAX_VALUE+1), new MathValue(Double.MAX_VALUE+2), new MathValue(Double.MAX_VALUE+3), new MathValue(Double.MAX_VALUE+4)))}));
		return list.GetRange(index,1);

	}
}