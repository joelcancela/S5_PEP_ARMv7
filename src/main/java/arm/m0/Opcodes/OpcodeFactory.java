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
		keywordsAToBinary.put("LSL","000"+"00");//A7-298
		keywordsAToBinary.put("LSR","000"+"01");//A7-302
		keywordsAToBinary.put("ASR","000"+"10");//A7-203
		keywordsAToBinary.put("ADD","000"+"1100");//A7-191
		keywordsAToBinary.put("SUB","000"+"1101");//A7-450
		keywordsAToBinary.put("MOV","001"+"00");//A7-312
		//Category B
		keywordsBToBinary.put("AND","0100000000");//A7-201
		keywordsBToBinary.put("EOR","0100000001");//A7-239
		keywordsBToBinary.put("LSL","0100000010");//A7-300
		keywordsBToBinary.put("LSR","0100000011");//A7-304
		keywordsBToBinary.put("ASR","0100000100");//A7-205
		keywordsBToBinary.put("ADC","0100000101");//A7-187
		keywordsBToBinary.put("SBC","0100000110");//A7-380
		keywordsBToBinary.put("ROR","0100000111");//A7-368
		keywordsBToBinary.put("TST","0100001000");//A7-466
		keywordsBToBinary.put("RSB","0100001001");//A7-372
		keywordsBToBinary.put("CMP","0100001010");//A7-231
		keywordsBToBinary.put("CMN","0100001011");//A7-227
		keywordsBToBinary.put("ORR","0100001100");//A7-336
		keywordsBToBinary.put("MUL","0100001101");//A7-324
		keywordsBToBinary.put("BIC","0100001110");//A7-213
		keywordsBToBinary.put("MVN","0100001111");//A7-328
		//Category C
		keywordsCToBinary.put("STR","10010");//A7-426 T2
		keywordsCToBinary.put("LDR","10011");//A7-252 T2
		//Category D
		keywordsDToBinary.put("B","1101");//A7-207 T1

	}
	
	public Opcode getOpcode(String operator, String csvArgs) {
		return null;
	}
}
