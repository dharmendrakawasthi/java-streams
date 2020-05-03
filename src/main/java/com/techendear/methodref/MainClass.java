package com.techendear.methodref;

public class MainClass {

	public static void main(String[] args) {
//		
//		BinaryOps ops = BinaryOpsClass::add;
//		System.out.println(ops.doBinaryOps(4, 5));
//		
//		BinaryOpsClass binaryOpsClass = new BinaryOpsClass();
		
//		BinaryOps subs = binaryOpsClass::substract;
//		System.out.println(subs.doBinaryOps(6, 2));
		
		BinaryOps multip = BinaryOpsClass::new;
		multip.mult(5, 6);
		
	}
}
