package arm.m0.Opcodes;

import java.util.HashMap;
import java.util.Map;

public class OpcodeFactory {

	public Map<String,String> immediatesDuplicates = new HashMap<String, String>();
	public Map<String,String> keywords = new HashMap<String, String>();

	public OpcodeFactory(){
		//Category A
		immediatesDuplicates.put("LSL","000"+"00");//A7-298 3args
		immediatesDuplicates.put("LSR","000"+"01");//A7-302 3args
		immediatesDuplicates.put("ASR","000"+"10");//A7-203 3args

		keywords.put("ADD","000"+"1100");//A7-191
		keywords.put("SUB","000"+"1101");//A7-450
		keywords.put("MOV","001"+"00");//A7-312
		//Category B
		keywords.put("AND","0100000000");//A7-201
		keywords.put("EOR","0100000001");//A7-239
		keywords.put("LSL","0100000010");//A7-300
		keywords.put("LSR","0100000011");//A7-304
		keywords.put("ASR","0100000100");//A7-205
		keywords.put("ADC","0100000101");//A7-187
		keywords.put("SBC","0100000110");//A7-380
		keywords.put("ROR","0100000111");//A7-368
		keywords.put("TST","0100001000");//A7-466
		keywords.put("RSB","0100001001");//A7-372
		keywords.put("CMP","0100001010");//A7-231
		keywords.put("CMN","0100001011");//A7-227
		keywords.put("ORR","0100001100");//A7-336
		keywords.put("MUL","0100001101");//A7-324
		keywords.put("BIC","0100001110");//A7-213
		keywords.put("MVN","0100001111");//A7-328
		//Category C
		keywords.put("STR","10010");//A7-426 T2
		keywords.put("LDR","10011");//A7-252 T2
		//Category D
		keywords.put("B","1101");//A7-207 T1

	}
}
