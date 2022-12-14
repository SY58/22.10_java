package frame08;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import test.mypac.AnotherThread;
import test.mypac.CountRunnable;

public class MyFrame extends JFrame implements ActionListener{
	
	//생성자
	public MyFrame(String title) {
		super(title);
		//프레임의 초기 설정 작업하기
		setBounds(100,100,500,500);
		//이 프레임의 x버튼(close버튼)을 눌렀을때 프로세스도 같이 종료되도록 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//레이아웃 설정
		setLayout(new FlowLayout());
		
		JButton startBtn=new JButton("카운트 다운 시작");
		startBtn.addActionListener(this);
		//프레임에 버튼 추가		
		add(startBtn);
				
		JTextField tf=new JTextField(10);
		//프레임에 JTextField 추가
		add(tf);
		
		//프레임을 화면상에 실제 보이게 하기(false하면 화면에 보이지않는다.)
		this.setVisible(true);
	}	
	
	//run 했을때 실행의 흐름이 시작되는 특별한 메소드
	public static void main(String[] args) {
		//MyFrame 객체 생성하기
		new MyFrame("나의 프레임");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("카운트 다운을 시작합니다.");		
		
		new Thread(()->{
			//카운트 값을 저장할 지역변수를 만들고 초기값 대입
			int count=10;
			while(true) {
				System.out.println("현재 카운트:"+count);
				if(count==0) {//만일 count가 0이면
					break; //반복문 탈출(반복문 탈출하면 run() 메소드가 리턴되기 때문에 스레드가 종료된다.
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e2) {			
					e2.printStackTrace();
				}
				count--;
			}			
		}).start();		
	}	
}