package arm.m0.Instructions;

/**
 * Arithmetic Shift Right (register)
 */
// A7-205 2args
public class ASR {

	String rm;
	String rdn;

	public ASR(String[] args) {

		//args[1] 3 bits
		rm = String.format("%03d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(args[1].substring(1)))));

		//args[0] 3 bits
		rdn = String.format("%03d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(args[0].substring(1)))));
	}

	@Override
	public String toString() {
		return "0100000100" + rm + rdn;
	}
}
