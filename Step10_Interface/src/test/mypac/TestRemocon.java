package test.mypac;

public class TestRemocon implements Remocon {

	@Override
	public void up() {		
		System.out.println("채널을 바꿔요!");
	}

	@Override
	public void down() {
		System.out.println("채널을 돌려요!");
	}

}
