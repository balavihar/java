package com.functionalprog.examples;

public class FunctionalProgExample {

	public static void main(String[] args) {
		StringParams sp = new StringParams() {
			
			@Override
			public void params() {
				System.out.println("hwlloo world");				
			}
		};
		
		String myStr = "hello worlddddd";
		
		//myStr -> sp;
		
		SampleFuncProg sfp = new SampleFuncProg();
		sfp.testStringParamFunc(() -> System.out.println(myStr));
		
		sfp.testStringMultiParamFunc().params("test hello world");
	}

}

class SampleFuncProg {
	
	public void testStringParamFunc(StringParams sp){
		sp.params();
	}
	
	public StringMultiParams testStringMultiParamFunc(){
		//return (str -> System.out.println(str));
		return (str -> (str));
	}
}
