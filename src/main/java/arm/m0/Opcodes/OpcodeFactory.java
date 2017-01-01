package arm.m0.Opcodes;

import java.util.HashMap;
import java.util.Map;

public class OpcodeFactory {

	public Map<String,String> immediatesDuplicates = new HashMap<String, String>();
	public Map<String,String> keywords = new HashMap<String, String>();

	public OpcodeFactory(){
		//Category A
		immediatesDuplicates.put("LSL","000"+"00");
		immediatesDuplicates.put("LSR","000"+"01");
		immediatesDuplicates.put("ASR","000"+"10");

		keywords.put("ADD","000"+"1100");
		keywords.put("SUB","000"+"1101");	//A7-450 3args
		keywords.put("MOV","001"+"00");		//A7-312 2args

		//Category B

		keywords.put("AND","0100000000");//A7-201 2args
		keywords.put("EOR","0100000001");//A7-239 2args
		keywords.put("LSL","0100000010");//A7-300 2args
		keywords.put("LSR","0100000011");//A7-304 2args
		keywords.put("ASR","0100000100");//A7-205 2args
		keywords.put("ADC","0100000101");//A7-187 2args
		keywords.put("SBC","0100000110");//A7-380 2args
		keywords.put("ROR","0100000111");//A7-368 2args
		keywords.put("TST","0100001000");//A7-466 2args
		keywords.put("RSB","0100001001");//A7-372 2args
		keywords.put("CMP","0100001010");//A7-231 2args
		keywords.put("CMN","0100001011");//A7-227 2args
		keywords.put("ORR","0100001100");//A7-336 2args
		keywords.put("MUL","0100001101");//A7-324 3args
		keywords.put("BIC","0100001110");//A7-213 2args
		keywords.put("MVN","0100001111");//A7-328 2args

		//Category C
		keywords.put("STR","10010");//A7-426 T2 2args
		keywords.put("LDR","10011");//A7-252 T2 2args

		//Category D
		keywords.put("B","1101");//A7-207 T1 2args

	}
}
