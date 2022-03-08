package CaseStudy3.RatingApp;

public class FinancialProduct {
	
	private int productID;
	private String productName;
	private String description;
	private int rating;
	private Review review;
	
	public FinancialProduct()
	{
		super();
	}

	public FinancialProduct(Review review) {
		super();
		this.review = review;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Review getReview() {
		return review;
	}

	public void setReview(Review review) {
		this.review = review;
	}
	

	
}
