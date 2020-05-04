package facade;

public class ComputerFacade implements Facade {
	private final CPU processor;
	private final Memory ram;
	private final HardDrive hd;
	
	
	public ComputerFacade() {
		this.processor = new CPU();
		this.ram = new Memory();
		this.hd = new HardDrive();
	}
	
	public void start() {
		long BOOT_ADDRESS=8007;
		String BOOT_SECTOR="0x1B";
		int SECTOR_SIZE = 261;
		processor.freeze();
		
		ram.load( BOOT_ADDRESS, hd.read(BOOT_SECTOR, SECTOR_SIZE));
		processor.jump(BOOT_ADDRESS);
		processor.execute();
		
	}
	

}
