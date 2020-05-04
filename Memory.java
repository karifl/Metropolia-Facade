package facade;

public class Memory {
	public void load(long position, byte[] data) {
		System.out.print("RAM: Loading data from BOOT SECTOR ");
		for (byte pointer : data) {
			System.out.print("[" +(char) pointer +"]");
		}
		System.out.println(" from BOOT ADDRESS " + position + " to memory");
	}
}
