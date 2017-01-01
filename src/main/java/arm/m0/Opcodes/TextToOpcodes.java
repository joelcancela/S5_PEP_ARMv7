package arm.m0.Opcodes;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/**
 * Created by Joel CANCELA VAZ on 01/01/2017.
 */
public class TextToOpcodes {
	static OpcodeFactory factory = new OpcodeFactory();

	public static String convert(String[] tokens) {
		String binaryCode = "";
		String instructionName = "arm.m0.Instructions.";
		String[] args = Arrays.copyOfRange(tokens,1,tokens.length);
		if (factory.immediatesDuplicates.contains(tokens[0]) && tokens.length == 4) {
		instructionName+= tokens[0]+"Immediate";

			try {
				Class myClass = Class.forName(instructionName);
				Constructor constructor = myClass.getConstructor(String[].class);

				Object[] parameters = {args};
				Object instanceOfMyClass = constructor.newInstance(parameters);
				binaryCode += instanceOfMyClass.toString();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			instructionName+= tokens[0];
			try {
				Class myClass = Class.forName(instructionName);
				Constructor constructor = myClass.getConstructor(String[].class);

				Object[] parameters = {args};
				Object instanceOfMyClass = constructor.newInstance(parameters);
				binaryCode += instanceOfMyClass.toString();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return binaryCode.replaceAll("....(?!$)", "$0 ");
	}
}
