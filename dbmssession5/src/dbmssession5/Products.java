package dbmssession5;

/* This is a POJO class. This class consists of getters and setters. *
 */
public class Products {

	// Instance variables.
	int productIdArray[];
	String imageLinkArray[];

	// Getters and setters.
	public int[] getProductIdArray() {
		return productIdArray;
	}

	public void setProductIdArray(int[] productIdArray) {
		this.productIdArray = productIdArray;
	}

	public String[] getImageLinkArray() {
		return imageLinkArray;
	}

	public void setImageLinkArray(String[] imageLinkArray) {
		this.imageLinkArray = imageLinkArray;
	}
}