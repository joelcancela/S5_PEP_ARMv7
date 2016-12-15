package arm.m0.Opcodes;

import java.util.HashMap;
import java.util.Map;

public class OpcodeFactory {

	Map<String,String> keywordsAToBinary = new HashMap<String, String>();
	Map<String,String> keywordsBToBinary = new HashMap<String, String>();
	Map<String,String> keywordsCToBinary = new HashMap<String, String>();
	Map<String,String> keywordsDToBinary = new HashMap<String, String>();

	public OpcodeFactory(){
		//Category A
		keywordsAToBinary.put("LSL","00"+"000"+"00");//A7-298
		keywordsAToBinary.put("LSR","00"+"001"+"00");//A7-302
		keywordsAToBinary.put("ASR","00"+"010"+"00");//A7-203
		keywordsAToBinary.put("ADD","00"+"01100");//A7-191
		keywordsAToBinary.put("SUB","00"+"01101");//A7-450
		keywordsAToBinary.put("MOV","00"+"100"+"00");//A7-312
		//Category B
		keywordsBToBinary.put("AND","");
		keywordsBToBinary.put("EOR","");
		keywordsBToBinary.put("LSL","");
		keywordsBToBinary.put("LSR","");
		keywordsBToBinary.put("ASR","");
		keywordsBToBinary.put("ADC","");
		keywordsBToBinary.put("SBC","");
		keywordsBToBinary.put("ROR","");
		keywordsBToBinary.put("TST","");
		keywordsBToBinary.put("RSB","");
		keywordsBToBinary.put("CMP","");
		keywordsBToBinary.put("CMN","");
		keywordsBToBinary.put("ORR","");
		keywordsBToBinary.put("MUL","");
		keywordsBToBinary.put("BIC","");
		keywordsBToBinary.put("MVN","");
		//Category C
		keywordsCToBinary.put("STR","");
		keywordsCToBinary.put("LDR","");
		//Category D
		keywordsDToBinary.put("B","");
	}
	
	public Opcode getOpcode(String operator, String csvArgs) {
		return null;
	}
}
