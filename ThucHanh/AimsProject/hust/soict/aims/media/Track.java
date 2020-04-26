package hust.soict.aims.media;

public class Track implements Playable,Comparable{
	protected String title;
	protected int length;
	public Track(){
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void play() {
		System.out.println("Playing Track: " + this.getTitle());
		System.out.println("Track length: " + this.getLength());
	}
	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		int a= this.getTitle().compareTo(((Track) obj).getTitle());
		return a!=0 ? a: Integer.compare(this.getLength(),((Track) obj).getLength());
	}
	
}
