package com.control;
import static net.mindview.util.Print.*;

public class LabeledFor {
	public static void main(String[] args) {
		int i=0;
		outer://Can't have statements here
			for(;true;){
				inner:
				for(;i<10;i++){
					print("i= "+i);
					if(i==2){
						print("cotinue");
						continue;
					}
					if(i==3){
						print("break");
						i++;//Otherwise i never
							//ets increamented.
						break;
					}
					if(i==7){
						print("continue outer");
						i++;//Otherwise i never
							//gets increamented
						continue outer;
					}
					if(i==8){
						print("break outer");
						break outer;
					}
				}
			}
	    // Can't break or continue to labels here
	}

}
