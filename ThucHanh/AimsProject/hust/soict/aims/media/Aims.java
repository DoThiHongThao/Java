package hust.soict.aims.media;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Aims {

	public Aims() {
		super();
	}

	public static void main(String[] args) {
		// Create a new Order object
		//java.util.Collection collection=new java.util.ArrayList();
		Collection collection = new ArrayList();
		List<CompactDisc> discs = new ArrayList<CompactDisc>();
		List<Media> itemsOrdered = new ArrayList<Media>();
		List<DigitalVideoDisc> dvd = new ArrayList<DigitalVideoDisc>();
		// Create a new dvd object and set the fields
		dvd.add(new DigitalVideoDisc("The Lion King","Animation",19.95f,"Roger Allers",87));

		DigitalVideoDisc dvd2 = new DigitalVideoDisc();
		dvd2.setTitle("Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);


		// Create a new dvd object and set the fields
		DigitalVideoDisc dvd3 = new DigitalVideoDisc();
		dvd3.setTitle("Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);

		//collection.add(dvd1);
		collection.add(dvd2);
		collection.add(dvd3);
		
		
		java.util.Iterator iterator=collection.iterator();
		System.out.println("**************************************");
		System.out.println(" The DVDs currently in the order are: ");
		while(iterator.hasNext()) {
			System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
		}
		java.util.Collections.sort((java.util.List)collection);
		iterator=collection.iterator();
		System.out.println("**************************************");
		System.out.println(" The DVDs in sorted order are: ");
		while(iterator.hasNext()) {
			System.out.println(((DigitalVideoDisc)iterator.next()).getTitle());
		}
		System.out.println("**************************************");
	}
}