package arm.m0.Instructions;

/**
 * Created by nikita on 01/01/2017.
 */
//A7-207 T1 2args
public class B {
	String imm8;
	String cond;

	public B(String[] args){

		//args[2] = nb entre 0-31 on veut le binaire sur 5 bits
		imm8 = String.format("%08d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(args[1].substring(1)))));

		//args[1] = "Rx" x un nombre on veut son binaire sur 3 bits
		cond = String.format("%04d", Integer.parseInt(Integer.toBinaryString(Integer.parseInt(args[0].substring(1)))));
	}

	@Override
	public String toString() {
		return "1101"+cond+imm8;
	}
}
