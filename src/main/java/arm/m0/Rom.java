package arm.m0;

import arm.m0.Opcodes.Opcode;

public class Rom {
	
	StringBuilder rom = new StringBuilder();

	public void append(Opcode o) {
		rom.append(o.toString());
	}
	
	@Override
	public String toString() {
		return this.rom.toString();
	}
}
