package chap10;

public interface RemoteControl {

	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	public abstract void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	default void repair()
	{
		System.out.println("장비를 수리합니다.");
	}
	
	static void reset()
	{
		System.out.println("장비를 초기화한다.");
	}
}
