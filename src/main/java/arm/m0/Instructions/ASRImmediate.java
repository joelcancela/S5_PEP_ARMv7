package arm.m0.Instructions;

/**
 * Created by Joel CANCELA VAZ on 01/01/2017.
 */
public class ASRImmediate {//A7-203 3args
	String imm5;
	String rm;
	String rd;

	public ASRImmediate(String... args){
		imm5 = args[2];//args[2] = nb entre 0-31 on veut le binaire sur 5 bits
		rm = args[1];//args[1] = "Rx" x un nombre on veut son binaire sur 3 bits
		rd = args[0];//args[0] = "Rx" x un nombre on veut son binaire sur 3 bits
	}

	@Override
	public String toString() {
		return "00010"+imm5+rm+rd;
	}
}
