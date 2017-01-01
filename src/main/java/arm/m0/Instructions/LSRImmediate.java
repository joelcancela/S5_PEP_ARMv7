package arm.m0.Instructions;

/**
 * Created by Joel CANCELA VAZ on 01/01/2017.
 */
public class LSRImmediate {//A7-302 3args
	String imm5;
	String rm;
	String rd;

	public LSRImmediate(String... args){
		imm5 = args[2];//args[2] = nb entre 0-31 on veut le binaire sur 5 bits
		rm = args[1];//args[1] = "Rx" x un nombre on veut son binaire sur 3 bits
		rd = args[0];//args[0] = "Rx" x un nombre on veut son binaire sur 3 bits
	}

	@Override
	public String toString() {
		return "00001"+imm5+rm+rd;
	}
}
