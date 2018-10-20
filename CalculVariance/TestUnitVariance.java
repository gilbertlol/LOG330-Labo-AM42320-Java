package CalculVariance;

import CalculVariance.Model.*;
import Xunit.*;
import java.util.*;

  public class TestUnitVariance
  {
//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [Theory][MemberData("dataAverageTest", parameters: 0)] public void TestLimitInferieur_Variance(List<MathValue> data)
	  public final void TestLimitInferieur_Variance(ArrayList<MathValue> data)
	  {
		  double variance = MathCustom.MathFct.Variance(data);

		  Assert.Equal(3810397094956117, variance, false, false, false);
	  }

//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [Theory][MemberData("dataAverageTest", parameters: 1)] public void TestLimitSuperieur_Variance(List<MathValue> data)
	  public final void TestLimitSuperieur_Variance(ArrayList<MathValue> data)
	  {
		  double variance = MathCustom.MathFct.Variance(data);

		  Assert.Equal(3810392280141346.5, variance, false, false, false);
	  }

//C# TO JAVA CONVERTER TODO TASK: Java annotations will not correspond to .NET attributes:
//ORIGINAL LINE: [Theory][MemberData("dataAverageTest", parameters: 2)] public void TestInvalidData_Variance(List<MathValue> data)
	  public final void TestInvalidData_Variance(ArrayList<MathValue> data)
	  {
		  double variance = MathCustom.MathFct.Variance(data);

		  Assert.NotInRange(variance, -Double.MAX_VALUE, Double.MAX_VALUE);
	  }

	  private static java.lang.Iterable<Object[]> dataAverageTest(int index)
	  {
		  ArrayList<Object[]> list = new ArrayList<Object[]>(Arrays.asList(new Object[] {new ArrayList<MathValue>(Arrays.asList(new MathValue(-123456789), new MathValue(2), new MathValue(50), new MathValue(65)))}, new Object[] {new ArrayList<MathValue>(Arrays.asList(new MathValue(123456789), new MathValue(2), new MathValue(50), new MathValue(65)))}, new Object[] {new ArrayList<MathValue>(Arrays.asList(new MathValue(Double.MAX_VALUE), new MathValue(2), new MathValue(50), new MathValue(65)))}));
		  return list.GetRange(index,1);

	  }
  }