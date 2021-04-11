package OOP2;

class MyTv {
	// private 같은 클래스 내부에서만 접근 가능
	//private boolean isPowerOn;
	private int channel;
	private int volume;
	private int prevCh;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME || volume < MIN_VOLUME) {
			return;
		}
		this.volume = volume;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setChannel(int channel) {
		if(channel > MAX_CHANNEL || channel < MIN_CHANNEL) {
			return;}
		
		prevCh = this.channel;
		this.channel = channel;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void gotoPrevCh() {
		setChannel(prevCh);
	}
}


public class q7_4 {

	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.setChannel(10);
		System.out.println("channel=" + t.getChannel());
		t.setVolume(20);
		System.out.println("volume=" + t.getVolume());
		t.setChannel(100);
		System.out.println("channel=" + t.getChannel());
		t.gotoPrevCh();
		System.out.println("channel=" + t.getChannel());

	}

}
