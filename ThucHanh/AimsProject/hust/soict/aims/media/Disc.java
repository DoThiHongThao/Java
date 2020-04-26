package hust.soict.aims.media;

public class Disc extends Media{
	protected int length;
	protected int director;
	protected int getLength() {
		return length;
	}
	protected void setLength(int length) {
		this.length = length;
	}
	protected int getDirector() {
		return director;
	}
	protected void setDirector(int director) {
		this.director = director;
	}
	
}
