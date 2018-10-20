package CalculVariance;

import CalculVariance.Model.*;
import java.util.*;

  public class Program
  {
	private static String DefaultFile = "./Data/data.csv";
	static void main(String[] args)
	{
	  System.out.println("Press enter to start or type exit then press enter to close");
	  while (!new Scanner(System.in).nextLine().equals("exit"))
	  {
		double average = 0d;
		double variance = 0d;
		double deviation = 0d;
		ArrayList<MathValue> data = GetFile();
		tangible.OutObject<Double> tempOut_average = new tangible.OutObject<Double>();
		tangible.OutObject<Double> tempOut_variance = new tangible.OutObject<Double>();
		tangible.OutObject<Double> tempOut_deviation = new tangible.OutObject<Double>();
		Init(data, tempOut_average, tempOut_variance, tempOut_deviation);
		deviation = tempOut_deviation.argValue;
		variance = tempOut_variance.argValue;
		average = tempOut_average.argValue;
		ShowResult(average, variance, deviation);
		System.out.println("Enter to start, exit to close");
	  }
	}
	private static void RenderList(ArrayList<MathValue> data)
	{
	  for (MathValue item : data)
	  {
		System.out.println(item.getValue());
	  }

	}

	public static void Init(ArrayList<MathValue> data, tangible.OutObject<Double> average, tangible.OutObject<Double> variance, tangible.OutObject<Double> deviation)
	{
	  average.argValue = MathCustom.MathFct.Average(data);
	  variance.argValue = MathCustom.MathFct.Variance(data);
	  deviation.argValue = MathCustom.MathFct.StandardDeviation(variance.argValue);
	}
	private static ArrayList<MathValue> GetFile()
	{
	  System.out.print("File path (./data.csv): ");
	  String fileName = new Scanner(System.in).nextLine();
	  return CVSUtils.ImportCsv(tangible.StringHelper.isNullOrEmpty(fileName)?DefaultFile:fileName);
	}

	private static void ShowResult(double average, double variance, double deviation)
	{
	  System.out.println(String.format("Average: %1$s", average));
	  System.out.println(String.format("Variance: %1$s", variance));
	  System.out.println(String.format("Ecart type: %1$s", deviation));

	}
  }