package arm.m0.Instructions;

/**
 * Compare Negative (register)
 */
// A7-227 2args
public class CMN {

	String rn;
	String rm;

	public CMN(String[] args) {

		//args[1] 3 bits
		rm = String.format("%03d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(args[1].substring(1)))));

		//args[0] 3 bits
		rn = String.format("%03d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(args[0].substring(1)))));
	}

	@Override
	public String toString() {
		return "0100001011" + rm + rn;
	}

}
