package hust.soict.aims.media;

public abstract class Media {
	protected String title;

	protected String category;

	protected float cost;

	protected String getTitle() {
		return title;
	}

	protected void setTitle(String title) {
		this.title = title;
	}

	protected String getCategory() {
		return category;
	}

	protected void setCategory(String category) {
		this.category = category;
	}

	protected float getCost() {
		return cost;
	}

	protected void setCost(float cost) {
		this.cost = cost;
	}
	
	public Media() {
		
	}

	public Media(String title, String category, float cost) {
		super();
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
}
