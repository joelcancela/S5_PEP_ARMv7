package arm.m0.Instructions;

/**
 * Created by NIKITA ROUSSEAU on 01/01/2017.
 */
//A7-312 2args
public class MOV {

	String rd;
	String imm8;

	public MOV(String[] args){

		//args[1] 8 bits
		imm8 = String.format("%08d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(args[1]))));

		//args[0] 3 bits
		rd = String.format("%03d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(args[0].substring(1)))));
	}

	@Override
	public String toString() {
		return "00100"+rd+imm8;
	}
}
