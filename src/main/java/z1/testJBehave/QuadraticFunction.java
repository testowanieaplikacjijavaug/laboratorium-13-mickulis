package z1.testJBehave;
import java.io.Serializable;

public class QuadraticFunction implements Serializable {

	private double a;
	private double b;
	private double c;
	private double x1;
	private double x2;

	public void setA(double value)
	{
		a = value;
	}
	public void setB(double value)
	{
		b = value;
	}
	public void setC(double value)
	{
		c = value;
	}
	public double getA() {
		return a;
	}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public double getX1() {
		return x1;
	}
	public double getX2() {
		return x2;
	}

	public void calculate()
	{
		if(a == 0)
		{
			if (b != 0)
			{
				x1 = x2 = -c / b;
				return;
			}
			else
				throw new IllegalArgumentException("");
		}
		final double delta = b * b - 4 * a * c;
		if (delta > 0)
		{
			x1 = (-b - Math.sqrt(delta)) / (2 * a);
			x2 = (-b + Math.sqrt(delta)) / (2 * a);
		}
		else if (delta == 0) {
			x1 = x2 = -b / (2 * a);
		}
		else {
			throw new IllegalArgumentException("No real solution for these parameters");
		}
	}

	@Override
	public String toString()
	{
		if(a != 0)
		{
			if(b != 0)
			{
				if(c != 0)
				{
					return a + "x^2 + " + b + "x + " + c + " = 0";
				}
				else
					return a + "x^2 + " + b + "x" + " = 0";
			}
			else
			{
				if(c != 0)
				{
					return a + "x^2 + " + c + " = 0";
				}
				else
					return a + "x^2 = 0";
			}
		}
		else
		{
			if(b != 0)
			{
				if(c != 0)
				{
					return b + "x + " + c + " = 0";
				}
				else
					return b + "x = 0";
			}
			else
			{
				if(c != 0)
				{
					return c + " = 0";
				}
				else
					return "0 = 0";
			}
		}
	}

}