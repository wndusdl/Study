package ch6��ü�������α׷���1;

public class ex19 {

	public static void main(String[] args) {
		MyTv t = new MyTv();
		
		t.channel = 100;
		t.volume = 0;
		System.out.println("CH: " + t.channel + ", VOL: " + t.volume);
		
		t.channelDown();
		t.volumnDown();
		System.out.println("CH: " + t.channel + ", VOL: " + t.volume);
		
		t.volume = 100;
		t.channelUp();
		t.volumnUp();
		System.out.println("CH: " + t.channel + ", VOL: " + t.volume);
	}
}

class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	//isPowerOn�� ���� true�� fasle, false�� true�� �ٲ۴�.
	void turnOnOff() {
		isPowerOn = !isPowerOn;
	}
	
	//volumn�� ���� MAX_VOLUME���� ���� ���� ���� 1 ������Ų��.
	void volumnUp() {
		if(volume<MAX_VOLUME) 
			volume++;
	}
	
	//volumn�� ���� MIN_VOLUME���� Ŭ ���� ���� 1 ���ҽ�Ų��.
	void volumnDown() {
		if(volume>MIN_VOLUME) 
			volume--;
	}
	
	//channel�� ���� 1 ������Ų��.
	//���� channel�� MAX_CHANNEL�̸�, channel�� ���� MIN_CHANNEL�� �ٲ۴�.
	void channelUp() {
		
		if(channel==MAX_CHANNEL) 
			channel = MIN_CHANNEL;
		else
			channel++;
	}
	
	//channel�� ���� 1 ���ҽ�Ų��.
	//���� channel�� MIN_CHANNEL�̸�, channel�� ���� MAX_CHANNEL�� �ٲ۴�.
		void channelDown() {
			
			if(channel==MIN_CHANNEL) 
				channel = MAX_CHANNEL;
			else channel--;
		}
}