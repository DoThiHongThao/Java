package hust.soict.aims.media;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Book extends Media implements Comparable<Object>{
	
	private List<String> authors =new ArrayList<String>();
	private String content;
	List<String> contentTokens;
	Map<String,Integer> wordFrequency;
	public void processContent() {
		StringTokenizer st = new StringTokenizer(content, " .,");
		while (st.hasMoreTokens()) {
			contentTokens.add(st.nextToken());
        }
	}
	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	public void addAuthor(String authorName) {
		if(!(authors.contains(authorName))) {
			authors.add(authorName);
		}
	}
	
	public void removeAuthor(String authorName) {
		if((authors.contains(authorName))) {
			authors.remove(authorName);
		}
	}

	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		return this.getTitle().compareTo(((Book) obj).getTitle());
	}
}
