package arm.m0.Instructions;

/**
 * Created by Joel CANCELA VAZ on 01/01/2017.
 */
public class ADD {//A7-191 3args
	String rm;
	String rn;
	String rd;

	public ADD(String... args){
		rm = args[2];//args[2] = "Rx" x un nombre on veut son binaire sur 3 bits
		rn = args[1];//args[1] = "Rx" x un nombre on veut son binaire sur 3 bits
		rd = args[0];//args[0] = "Rx" x un nombre on veut son binaire sur 3 bits
	}

	@Override
	public String toString() {
		return "0001100"+rm+rn+rd;
	}
}
