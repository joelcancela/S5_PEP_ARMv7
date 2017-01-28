package arm.m0.Instructions;

/**
 * Conditional Branch
 */
//A7-207 T1 2args
public class BRANCH {
	String imm8;

	public BRANCH(String[] args) {

		//args[2] = nb entre 0-31 on veut le binaire sur 5 bits
		imm8 = String.format("%08d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(args[0]))));
	}

	@Override
	public String toString() {
		return "1101" + "0000" + imm8;
	}
}
