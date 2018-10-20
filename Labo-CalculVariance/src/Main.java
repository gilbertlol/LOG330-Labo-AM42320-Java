import MathCustom.MathFct;
import Model.MathValue;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static String DefaultFile = "./Data/data.csv";
    public static void main(String[] args) {
        System.out.println("Press enter to start or type exit then press enter to close");
        while (!new Scanner(System.in).nextLine().equals("exit"))
        {
            double average = 0d;
            double variance = 0d;
            double deviation = 0d;
            ArrayList<MathValue> data = GetFile();
            variance = MathFct.Variance(data);
            deviation = MathFct.StandardDeviation(variance);
            average = MathFct.Average(data);
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

    private static ArrayList<MathValue> GetFile()
    {
        System.out.print("File path (./data.csv): ");
        String fileName = new Scanner(System.in).nextLine();
        return CSVUtils.ImportCsv(fileName == null?DefaultFile:fileName);
    }

    private static void ShowResult(double average, double variance, double deviation)
    {
        System.out.println(String.format("Average: %1$s", average));
        System.out.println(String.format("Variance: %1$s", variance));
        System.out.println(String.format("Ecart type: %1$s", deviation));
    }
}
