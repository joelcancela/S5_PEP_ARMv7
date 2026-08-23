package arm.m0.Instructions;

/**
 * Arithmetic Shift Right (immediate)
 */
public class ASRImmediate {//A7-203 3args
	String imm5;
	String rm;
	String rd;

	public ASRImmediate(String[] args) {

		//args[2] = nb entre 0-31 on veut le binaire sur 5 bits
		imm5 = String.format("%05d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(args[2].substring(1)))));

		//args[1] = "Rx" x un nombre on veut son binaire sur 3 bits
		rm = String.format("%03d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(args[1].substring(1)))));

		//args[0] = "Rx" x un nombre on veut son binaire sur 3 bits
		rd = String.format("%03d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(args[0].substring(1)))));
	}

	@Override
	public String toString() {
		return "00010" + imm5 + rm + rd;
	}
}
