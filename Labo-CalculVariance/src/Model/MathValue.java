package Model;

public class MathValue
{
    private double Value;
    public final double getValue()
    {
        return Value;
    }
    public final void setValue(double value)
    {
        Value = value;
    }
    private double DistanceSquare;
    public final double getDistanceSquare()
    {
        return DistanceSquare;
    }
    public final void setDistanceSquare(double value)
    {
        DistanceSquare = value;
    }
    public MathValue()
    {
    }

    public MathValue(double value)
    {
        setValue(value);
    }
}
