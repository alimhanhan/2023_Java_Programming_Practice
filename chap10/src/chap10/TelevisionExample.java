package chap10;

public class TelevisionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Television tv = new Television();
		
		RemoteControl rc = tv;
		
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
		
		SmartTelevision stv = new SmartTelevision();
		RemoteControl rc1  = stv;
		rc1.turnOn();
		rc1.turnOff();
		rc1.setVolume(5);
		
		RemoteControl.reset();
		rc1.repair();
		
		Searchable searchable = stv;
		searchable.search("www.swu.ac.kr");
	}

}
