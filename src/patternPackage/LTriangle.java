package patternPackage;

import org.testng.annotations.Test;

public class LTriangle {
	
	@Test
	public void LTriangleMethod()
	{
		int num=9;
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}System.out.println();
		}
	}

}
