package utility;

import java.util.Timer;
import java.util.TimerTask;

public class Time {
	private Timer timer;
	public final int miliseconds;
	long currentTime;
	private GameTask gameTask;
	/**
	 * constructor of Time
	 * @param miliseconds is the duration of time pulse
	 */
	public Time (int miliseconds){
		timer = new Timer();
		currentTime = 0;
		this.miliseconds = miliseconds;
	}
	
	/**
	 * Sets up the timer
	 * @param method is the method which is run every pulse by timer 
	 */
	public void goTimer(Runnable method){
		gameTask = new GameTask(method, this);
		timer.scheduleAtFixedRate(gameTask, this.miliseconds, this.miliseconds);
	}
	
	/**
	 * Gets current time
	 * @return current time in milliseconds
	 */
	public float getTime(){
		return  (float) currentTime * miliseconds / 1000;
	}
	
	/**
	 * Get Current Pulse number
	 * @return current pulse number
	 */
	public long getCurrentTime(){
		return currentTime;
	}
	
	/**
	 * Stops the timer
	 */
	void pause (){
		timer.cancel();
	}
}

class GameTask extends TimerTask{
	final Runnable timerMethod;
	Time timer;
	public GameTask(Runnable method, Time timer){
		timerMethod = method;
		this.timer = timer;
	}
	
	@Override
	public void run (){
		timer.currentTime += 1;
		timerMethod.run();
	}
}