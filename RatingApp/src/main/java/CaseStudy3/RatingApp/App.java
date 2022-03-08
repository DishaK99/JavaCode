package CaseStudy3.RatingApp;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("springbeans.xml");
    	
    	User user=(User)context.getBean("user");
    	System.out.println("User Name : "+user.getUserName());
    	System.out.println("Email : "+user.getEmailID());
    	System.out.println("Password : "+user.getPassword());
    	System.out.println("Mobile No : "+user.getMobileNo());
    	System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    	
    	Comment comment=(Comment)context.getBean("comment");
    	System.out.println("Comment ID : "+comment.getCommentId());
    	System.out.println("Comment Text : "+comment.getCommentText());
    	System.out.println("Likes : "+comment.getLikes());
    	System.out.println("Dislikes : "+comment.getDislikes());
    	System.out.println("Report : "+comment.isReport());
    	System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");

    	
    	Review review=(Review)context.getBean("review");
    	System.out.println("Review ID : "+review.getReviewId());
    	System.out.println("Review Text : "+review.getReviewedText());
    	System.out.println("Financial Product Review : "+review.getFinancialProductReviewed());
    	List<Comment> commenList=review.getComments();
    	for(Comment c:commenList)
    	{
    		System.out.println("Comment ID : "+c.getCommentId());
        	System.out.println("Comment Text : "+c.getCommentText());
        	System.out.println("Likes : "+c.getLikes());
        	System.out.println("Dislikes : "+c.getDislikes());
        	System.out.println("Report : "+c.isReport());
        	System.out.println("___________________________________________");
    	}
    	System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
    	
    	FinancialProduct fp = (FinancialProduct)context.getBean("financialproduct");
    	System.out.println("Product Id      : " +fp.getProductID());
    	System.out.println("Product Name    : "+fp.getProductName());
    	System.out.println("Description     : "+fp.getDescription());
    	System.out.println("Rating          : "+fp.getRating());
    	System.out.println("------------------------------------ REVIEW ------------------------------------");
    	System.out.println("Review Id       : "+fp.getReview().getReviewId());
    	System.out.println("Product Reviewed: " +fp.getReview().getFinancialProductReviewed());
    	System.out.println("Review Text     : "+fp.getReview().getReviewedText());
    	
    	
    }
}
