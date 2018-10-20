package MathCustom;


import Model.MathValue;

import java.util.ArrayList;

public final class MathFct
{

    public static double Average(ArrayList<MathValue> list)
    {
        double sum = 0;

        for (MathValue item : list)
        {
            sum += item.getValue();
        }

        return sum / list.size();
    }

    public static double SumDistanceSquare(ArrayList<MathValue> list)
    {
        double sum = 0;
        DistanceSquare(list);

        for (MathValue item : list)
        {
            sum += item.getDistanceSquare();
        }

        return sum;
    }

    public static void DistanceSquare(ArrayList<MathValue> list)
    {
        double average = Average(list);
        for (MathValue item : list)
        {
            double distance = (item.getValue() - average);
            item.setDistanceSquare(distance * distance);
        }
    }

    public static double Variance(ArrayList<MathValue> list)
    {
        double sumDistanceSquare = SumDistanceSquare(list);
        return (((double)1 / (list.size() - 1))) * sumDistanceSquare;
    }

    public static double StandardDeviation(double variance)
    {
        return Math.sqrt(variance);
    }
}