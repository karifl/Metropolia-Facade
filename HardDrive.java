package facade;


public class HardDrive {
	public byte[] read (String lba, int size) {
	System.out.println("HD: Reading data from BOOT SECTOR "+lba+" , size "+size+" kBs");
	byte[] arr = lba.getBytes();
	//String print = new String(arr);
	//System.out.println("arr: " +print);
	return arr;	
	}
}
