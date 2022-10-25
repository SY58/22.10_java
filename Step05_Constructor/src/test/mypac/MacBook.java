package test.mypac;

public class MacBook {
	//외부에서 접근 불가하도록 접근 지정자를 private로 해서 필드 3개 선언하기
	private Cpu cpu;
	private Memory memory;
	private HardDisk hardDisk;
	//cpu, memory, harddisk 타입의 참조값을 담을수있는 필드!	
	
	//생성자
	public MacBook(Cpu cpu, Memory memory, HardDisk harddisk) {
		this.cpu=cpu;
		this.memory=memory;
		this.hardDisk=harddisk;
	}
	
	//메소드
	public void doGame() {
		if(this.cpu==null || memory==null || hardDisk==null) {
			System.out.println("부품이 부족해서 맥북이 동작을 할 수 없습니다.");
			return; //메소드를 여기서 끝내기
		}
		System.out.println("신나게 게임을 해요!");
	}
}
