package arm.m0.Instructions;

/**
 * Logical OR (register)
 */
// A7-336 2args
public class ORR {

	String rm;
	String rdn;

	public ORR(String[] args) {

		//args[1] 3 bits
		rm = String.format("%03d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(args[1].substring(1)))));

		//args[0] 3 bits
		rdn = String.format("%03d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(args[0].substring(1)))));
	}

	@Override
	public String toString() {
		return "0100001100" + rm + rdn;
	}

}
