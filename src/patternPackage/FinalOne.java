package patternPackage;

import org.testng.annotations.Test;

public class FinalOne {

	@Test
	public void finalMethod()
	{
		LTriangle Ltriangle = new LTriangle();
		Ltriangle.LTriangleMethod();
		System.out.println("========================");
		ETriangle Etriangle = new ETriangle();
		Etriangle.ETriangleMethod();
		System.out.println("========================");
		RTriangle Rtriangle = new RTriangle();
		Rtriangle.RTriangleMethod();
		System.out.println("========================");		
		ReverseLTriangle rlt = new ReverseLTriangle();
		rlt.ReverseLTriangleMethod();
		System.out.println("========================");
		ReverseETriangle ret = new ReverseETriangle();
		ret.ReverseETriangleMethod();
		System.out.println("========================");
		ReverseRTriangle rrt = new ReverseRTriangle();
		rrt.ReverseRTriangleMethod();
		System.out.println("========================");
		Rhombus.RhombusMethod();
	}
	
	
}
