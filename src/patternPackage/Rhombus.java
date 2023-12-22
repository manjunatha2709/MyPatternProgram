package patternPackage;

import org.testng.annotations.Test;

public class Rhombus {
/*	@Test
	public void RhombusMethod()
	{
		int num=9;
		for(int i=1;i<=num;i++)
		{
			for(int j=1*(num-i);j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}System.out.println();
		}

		for(int i=num;i>=1;i--)
		{
			for(int j=1*(num-i);j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}System.out.println();
		}
	}*/
	
	@Test
	
	public static void RhombusMethod()
	{
		ETriangle etr = new ETriangle();
		etr.ETriangleMethod();
		ReverseETriangle etr1 = new ReverseETriangle();
		etr1.ReverseETriangleMethod();
	}
}
