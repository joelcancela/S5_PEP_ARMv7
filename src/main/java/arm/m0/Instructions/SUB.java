package arm.m0.Instructions;

/**
 * Created by Joel CANCELA VAZ on 01/01/2017.
 */
//A7-450 3args
public class SUB {

	String rm;
	String rn;
	String rd;

	public SUB(String[] args){

		//args[2] = "Rx" x un nombre on veut son binaire sur 3 bits
		rm = String.format("%03d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(args[2].substring(1)))));

		//args[1] = "Rx" x un nombre on veut son binaire sur 3 bits
		rn = String.format("%03d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(args[1].substring(1)))));

		//args[0] = "Rx" x un nombre on veut son binaire sur 3 bits
		rd = String.format("%03d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(args[0].substring(1)))));
	}

	@Override
	public String toString() {
		return "0001101"+rm+rn+rd;
	}
}
