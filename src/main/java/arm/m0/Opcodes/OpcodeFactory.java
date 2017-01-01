package arm.m0.Opcodes;

import java.util.ArrayList;
import java.util.List;

public class OpcodeFactory {

	public List immediatesDuplicates;
	public List keywords;

	public OpcodeFactory() {
		immediatesDuplicates = new ArrayList<String>();
		keywords = new ArrayList<String>();
		//Category A
		immediatesDuplicates.add("LSL");
		immediatesDuplicates.add("LSR");
		immediatesDuplicates.add("ASR");

		keywords.add("ADD");
		keywords.add("SUB");
		keywords.add("MOV");

		//Category B

		keywords.add("AND");
		keywords.add("EOR");
		keywords.add("LSL");
		keywords.add("LSR");
		keywords.add("ASR");
		keywords.add("ADC");
		keywords.add("SBC");
		keywords.add("ROR");
		keywords.add("TST");
		keywords.add("RSB");
		keywords.add("CMP");
		keywords.add("CMN");
		keywords.add("ORR");
		keywords.add("MUL");
		keywords.add("BIC");
		keywords.add("MVN");

		//Category C
		keywords.add("STR");
		keywords.add("LDR");

		//Category D
		keywords.add("B");

	}
}
