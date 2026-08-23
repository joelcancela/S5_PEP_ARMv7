package arm.m0.Instructions;

/**
 * Binary AND (register)
 */
// A7-201 2args
public class AND {

	String rm;
	String rdn;

	public AND(String[] args) {

		//args[1] 3 bits
		rm = String.format("%03d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(args[1].substring(1)))));

		//args[0] 3 bits
		rdn = String.format("%03d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(args[0].substring(1)))));
	}

	@Override
	public String toString() {
		return "0100000000" + rm + rdn;
	}
}
