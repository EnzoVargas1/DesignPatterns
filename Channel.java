package Command;

import java.util.ArrayList;

public class Channel implements Subject {
	
	private ArrayList<Observer> observers;
	private String channelName;
	private String status;
	
	public Channel(String channelName, String status) {
		this.channelName = channelName;
		this.status = status;
	}
	
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
		notifyObservers();
	}
	
	
	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}
	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer o: observers) {
			o.update(this.status);
		}
	}
	
	
}
