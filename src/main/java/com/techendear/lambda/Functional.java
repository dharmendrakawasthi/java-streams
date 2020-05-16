package com.techendear.lambda;

@FunctionalInterface
public interface Functional<T> {
	public void print(T message);
	
	public default Functional<T> apply(Functional<T> functional){
		return functional;
	}
}
