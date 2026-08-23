package arm.m0.Instructions;

/**
 * Exclusive OR (register)
 */
// A7-239 2args
public class EOR {
	String rm;
	String rdn;

	public EOR(String[] args) {

		//args[1] 8 bits
		rm = String.format("%03d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(args[1].substring(1)))));

		//args[0] 3 bits
		rdn = String.format("%03d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(args[0].substring(1)))));
	}

	@Override
	public String toString() {
		return "0100000001" + rm + rdn;
	}
}
