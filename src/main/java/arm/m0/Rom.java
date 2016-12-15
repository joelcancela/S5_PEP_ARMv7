package arm.m0;

public class Rom {
	
	StringBuilder rom = new StringBuilder();

	public void append(String w) {
		rom.append(w);
	}
	
	@Override
	public String toString() {
		return this.rom.toString();
	}
}
