package patternPackage;

import org.testng.annotations.Test;

public class ReverseLTriangle {


	@Test
	public void ReverseLTriangleMethod()
	{
		int num=9;
		for(int i=num;i>=1;i--)
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

