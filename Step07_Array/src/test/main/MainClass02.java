package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		//0으로 초기화된 방 3개짜리 int[] 객체를 만들어서 참조값을 지역변수 nums에 담기
		int[] nums={0, 0, 0};
		//0번방에 10, 1번방에 20, 2번방에 30을 저장해보세요.
		nums[0]=10;
		nums[1]=20;
		nums[2]=30;
		
		//0으로 초기화된 방 100개짜리 int[] 객체를 만들어서 참조값을 지역변수 nums2에 담기
		int[] nums2=new int[100];
		
		//0으로 초기화된 방 3개짜리 int[] 객체를 만들어서 참조값을 지역변수 nums3에 담기
		int[] nums3=new int[3];
		nums3[0]=100;
		nums3[1]=200;
		nums3[2]=300;
		// nums3[3]=400; 를 작성하면 작성시에는 오류라고 나오진 않지만 run해보면 오류가 나타난다.
		
		System.out.println("main 메소드가 정상 종료됩니다.");
	}
}
