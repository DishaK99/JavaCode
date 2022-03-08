package CaseStudy3.RatingApp;

import java.util.List;

public class Review {
	private int reviewId;
	private String financialProductReviewed;
	private String reviewedText;
	private List<Comment> comments;
	
	public Review()
	{
		
	}

	public Review(int reviewId,String financialProductReviewed, String reviewedText,
			List<Comment> comments) {
		super();
		this.reviewId = reviewId;
		this.financialProductReviewed = financialProductReviewed;
		this.reviewedText = reviewedText;
		this.comments = comments;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public String getFinancialProductReviewed() {
		return financialProductReviewed;
	}

	public void setFinancialProductReviewed(String financialProductReviewed) {
		this.financialProductReviewed = financialProductReviewed;
	}

	public String getReviewedText() {
		return reviewedText;
	}

	public void setReviewedText(String reviewedText) {
		this.reviewedText = reviewedText;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	
}
