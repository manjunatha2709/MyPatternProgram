package patternPackage;

import org.testng.annotations.Test;

public class RTriangle {
	@Test
	public void RTriangleMethod()
	{
		int num=9;
		for(int i=1;i<=num;i++)
		{
			for(int j=2*(num-i);j>=1;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}System.out.println();
		}
	}

}