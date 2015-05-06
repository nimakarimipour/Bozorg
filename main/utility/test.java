package utility;

public class test {
	static Time time = new Time(1000);
	public static void main(String[] args) {
		
		Runnable runn = new Runnable(){
			@Override
			public void run(){
				f();
			}
		};
		time.goTimer(runn);
		while (true){
	//		System.out.println(time.getCurrentTime());
			
			if (time.getCurrentTime() >= 3) {
				System.out.println("hey");
				time.pause();
			}

		}
	}
	static void f(){
		System.out.println("Hoy");
	}
}
