package com.interfaces.classprocessor;
import static net.mindview.util.Print.*;

class Processor{
	public String name(){
		return getClass().getSimpleName();
	}
	Object process(Object input){return input;}
}

class Upcase extends Processor{
	
}
public class Apply {

}
