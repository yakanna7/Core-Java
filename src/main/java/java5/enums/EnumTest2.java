//Java example program to initialize specific values to the enum constants

package java5.enums;

public class EnumTest2 {
	enum MachineState {
		PowerOff(0), Running(5), Sleeping(10), Hibernating(15);

		private int value;

		private MachineState(int value) {
			this.value = value;
		}
	}

	public static void main(String args[]) {
		for (MachineState s : MachineState.values()) {
			System.out.println(s + " " + s.value);
		}
	}
}
