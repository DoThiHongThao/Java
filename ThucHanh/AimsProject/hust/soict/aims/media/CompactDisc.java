package hust.soict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable,Comparable{
	private List<Track> tracks =new ArrayList<Track>();
	public List<Track> getTracks() {
		return tracks;
	}
	public void setTracks(List<Track> tracks) {
		this.tracks = tracks;
	}
	
	public void addTrack(Track a) {
		if(!(tracks.contains(a))) {
			tracks.add(a);
		}
	}
	public void removeTrack(Track a) {
		if(!(tracks.contains(a))) {
			tracks.remove(a);
		}
	}
	public int getLength() {
		int total=0;
		for(int i=0; i<tracks.size(); i++) {
			total+=tracks.get(i).getLength();
		}
		return total;
	}
	public void play() {
//		for(int i=0; i<tracks.size(); i++) {
//			tracks.get(i).play();
//		}
		System.out.println("Track length: " + this.getLength());
	}
	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		int a= this.getTitle().compareTo(((CompactDisc) obj).getTitle());
		return a!=0 ? a: Integer.compare(this.getLength(),((CompactDisc) obj).getLength());
	}
}
