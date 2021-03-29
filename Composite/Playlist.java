package Composite;

import java.util.ArrayList;

public class Playlist implements IComponent{
	
	public String playlistName;
	public ArrayList<IComponent> playlist = new ArrayList();
	

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing " + playlistName +" Playlist");
	}

	@Override
	public void setPlaybackSpeed(float speed) {
		// TODO Auto-generated method stub
		for(IComponent component: this.playlist) {
			component.setPlaybackSpeed(speed);
		}
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return playlistName;
	}
	
	public void add(IComponent component) {
		playlist.add(component);
	}
	
	public void remove(IComponent component) {
		playlist.remove(component);
	}

}
