package OOP2;

class Tv{
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() { ++channel; }
	void channelDown() {--channel; }
}

class SmartTv extends Tv{
	boolean caption; // 자막을 보여주는 기능 on/off
	
	void displayCaption(String text) {
		if(caption) { // caption이 on일때만 자막을 보여줌
			System.out.println(text);
		}
	}
}


public class extend {

	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 10; // 조상클래스로부터 상속받은 멤버
		stv.channelUp(); 
		System.out.println(stv.channel);
		stv.displayCaption("hello");
		stv.caption = true; // 자막 기능 켜기
		stv.displayCaption("hello");

	}

}
