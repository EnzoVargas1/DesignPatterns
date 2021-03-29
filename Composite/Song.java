package Composite;



public class Song implements IComponent{
	
	public String songName;
	public String artist;
	public float speed = 1; // Default playback speed

	public Song(String songName, String artist ) {
		this.songName = songName;
		this.artist = artist; 
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing " + songName + " by " + artist);
	}

	@Override
	public void setPlaybackSpeed(float speed) {
		// TODO Auto-generated method stub
		this.speed = speed;
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return songName;
	}
	
	public String getArtist() {
		return artist;
	}

}
