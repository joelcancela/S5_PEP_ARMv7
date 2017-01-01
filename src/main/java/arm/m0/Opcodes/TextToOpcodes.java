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
		}
		else{

		}

	}
}
