package arm.m0.Instructions;

/**
 * Created by Joel CANCELA VAZ on 01/01/2017.
 */
public class LSRImmediate {//A7-302 3args
	String imm5;
	String rm;
	String rd;

	public LSRImmediate(String[] args){

		//args[2] = nb entre 0-31 on veut le binaire sur 5 bits
		imm5 = String.format("%05d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(args[2]))));

		//args[1] = "Rx" x un nombre on veut son binaire sur 3 bits
		rm = String.format("%03d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(args[1].substring(1)))));

		//args[0] = "Rx" x un nombre on veut son binaire sur 3 bits
		rd = String.format("%03d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(args[0].substring(1)))));
	}

	@Override
	public String toString() {
		return "00001"+imm5+rm+rd;
	}
}
