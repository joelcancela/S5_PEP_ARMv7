package arm.m0.Instructions;

/**
 * Created by Joel CANCELA VAZ on 01/01/2017.
 */
public class LSLImmediate {
	String imm5;
	String rm;
	String rd;

	public LSLImmediate(String... args){
		imm5 = args[2];//
		rm = args[1];
		rd = args[0];
	}

	@Override
	public String toString() {
		return "00000"+imm5+rm+rd;
	}
}
