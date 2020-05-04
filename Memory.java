package facade;

public class Memory {
	public void load(long position, byte[] data) {
		String x = new String(data);
		System.out.println("RAM: Loading data from BOOT SECTOR "+x +" from BOOT ADDRESS " + position + " to memory");
	}
}
