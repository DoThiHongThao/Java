package baiTap;

public class Order {
	private int qtyOrdered;
	public static final int MAX_NUMBER_ORDER=10;
	private DigitalVideoDisc itemsOrdered[]= new DigitalVideoDisc[MAX_NUMBER_ORDER];
	public Order() {
		super();
		this.qtyOrdered=0;
	}
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}

	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	public void addDigitalVideoDisc(DigitalVideoDisc disc){
		if (this.qtyOrdered<MAX_NUMBER_ORDER){
			this.itemsOrdered[qtyOrdered] = disc;
			this.qtyOrdered=this.qtyOrdered+1;
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc []dvdList) {
		
		for (int i=0;i<=dvdList.length-1;i++){
			if (this.qtyOrdered<MAX_NUMBER_ORDER){
				this.itemsOrdered[qtyOrdered]=dvdList[i];
				this.qtyOrdered=this.qtyOrdered+1;
			} else {
				System.out.println("ko them duoc dia :"+dvdList[i].getTitle());
			}
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc){
		int j=0;
			for (int i=1;i<=this.qtyOrdered;i++){
				if (itemsOrdered[qtyOrdered].getTitle().equals(disc.getTitle())){
					j=1;
					this.qtyOrdered=this.qtyOrdered-1;
				}
				if (j==1){
					itemsOrdered[i]=itemsOrdered[i+1];
				}
			}
	}

	public void totalCost(){
		float tong=0;
		for (int i=0;i <this.qtyOrdered;i++){
			tong +=itemsOrdered[i].getCost();
		}
		System.out.println(tong);
	}
	
	
	
}