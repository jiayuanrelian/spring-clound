package com.yto.project.job.dataflow;

public class FooRepositoryFactory {

	private static  FooRepository fooRepository = new FooRepository();
	
	public static FooRepository repository() {
		return fooRepository;
	}
	
	
}