package hust.soict.aims.media;

public class DigitalVideoDisc extends Media implements Playable, Comparable{

	private String director;

	private int length;

	/**
	 * Constructor for DigitalVideoDisc
	 */
	public DigitalVideoDisc() {
		super();
	}

	/**
	 * @return Returns the director.
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * @param director
	 *            The director to set.
	 */
	public void setDirector(String director) {
		this.director = director;
	}

	/**
	 * @return Returns the length.
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length
	 *            The length to set.
	 */
	public void setLength(int length) {
		this.length = length;
	}
	
	public void play() {
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	

	public DigitalVideoDisc(String title, String category, float cost,String director, int length) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
	}

	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		int a= this.getTitle().compareTo(((DigitalVideoDisc) obj).getTitle());
		return a!=0 ? a: Integer.compare(this.getLength(),((DigitalVideoDisc) obj).getLength());
	}
}