package arm.m0.Opcodes;

/**
 * Created by Joel CANCELA VAZ on 01/01/2017.
 */
public class TextToOpcodes {
	static OpcodeFactory factory = new OpcodeFactory();

	public static String convert(String[] tokens) {
		String binaryCode ="";
		if(factory.immediatesDuplicates.containsKey(tokens[0]) && binaryCode.length()==4){
			binaryCode+=factory.immediatesDuplicates.get(tokens[0]);
			binaryCode+=Integer.toBinaryString(Integer.parseInt(tokens[1].substring(1)));
			binaryCode+=Integer.toBinaryString(Integer.parseInt(tokens[2].substring(1)));
			binaryCode+=Integer.toBinaryString(Integer.parseInt(tokens[3]));
		}
		else{
			binaryCode+=factory.immediatesDuplicates.get(tokens[0]);
			binaryCode+=Integer.toBinaryString(Integer.parseInt(tokens[1].substring(1)));
			binaryCode+=Integer.toBinaryString(Integer.parseInt(tokens[2].substring(1)));
		}
		return binaryCode;
	}
}
