## Instructions implemented
All instructions implemented are on 16 bits.


### Types

| Type | OPCode   | Instructions          |
|------|----------|-----------------------|
| A    | 00xxxx   | Shift, Move, Add, Sub |
| B    | 010000   | Data Processing       |
| C    | 1001x    | Load, Store           |
| D    | 11010000 | Conditional Branch    |


### Listing

Type A (6 instructions)
* Logical shift left - LSL(immediate)
* Logical shift right - LSR(immediate)
* Arithmetic shift right - ASR(immediate)
* Add register - ADD(register)
* Move - MOV(immediate)
* Subtract register - SUB(register)

Type B (16 instructions)
* Bitwise AND - AND(register)
* Exclusive OR - EOR(register)
* Logical Shift Left - LSL(register)
* Logical Shift Right - LSR(register)
* Arithmetic Shift Right - ASR(register)
* Add with carry - ADC(register)
* Subtract with carry - SBC(register)
* Rotate Right - ROR(register)
* Set flags on bitwise AND - TST(register)
* Reverse Subtract from 0 - RSB(register)
* Compare registers	- CMP(register)
* Compare negative - CMN(register)
* Logical OR - ORR(register)
* Multiply two registers - MUL(register)
* Bit clear - BIC(register)
* Bitwise NOT - MVN(register)
	 
Type C (2 instructions)
* Store register - STR(immediate)
* Load register - LDR(immediate)

Type D (1 instruction)
* Conditional branch - B

#### Notes
* For the conditional branch, we chose to implement the EQ flag by default.