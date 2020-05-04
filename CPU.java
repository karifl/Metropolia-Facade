package facade;

public class CPU {
	public void freeze() {
		System.out.println("CPU: Processor program on halt.");
	}
	public void jump(long position) {
		System.out.println("CPU: Jumping to memory position of BOOT ADDRESS  " + position);
	}
	public void execute() {	
		System.out.println("CPU: Executing new directives...");
	}
}
