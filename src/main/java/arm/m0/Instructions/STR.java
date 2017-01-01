package arm.m0.Instructions;

/**
 * Created by nikita on 01/01/2017.
 */
//A7-426 T2 2args
public class STR {
	String imm8;
	String rt;

	public STR(String[] args){

		imm8 = String.format("%08d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(args[1]))));
		rt = String.format("%03d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(args[0].substring(1)))));
	}

	@Override
	public String toString() {
		return "10010"+rt+imm8;
	}
}
