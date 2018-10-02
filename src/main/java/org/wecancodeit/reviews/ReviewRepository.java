package org.wecancodeit.reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviewList = new HashMap<>();
	
	public ReviewRepository() {
		Review thresher = new Review(1, "Thresher Shark", "images/ThresherShark.jpg", "Sharks", "Extra Long Caudal Fin used to Whip the water and stun fish", "5 out of 5 Chomps");
		Review frilled = new Review(2, "Frilled Shark", "images/FrilledShark.jpg", "Sharks", "Deep Sea Sharks, like something from a prehistoric age", "5 out of 5 Chomps");
		Review whale = new Review(3, "Whale Shark", "images/WhaleShark.jpg", "Shark", "Gentle Giants, the largest fish", "5 out of 5 filter feeders");
		Review bull = new Review (4, "Bull Shark", "images/BullShark.jpg", "Shark", "Can switch from salt water to fresh water, most likely to bite humans", "5 out of 5 terrifying Chomps");
		
		reviewList.put(thresher.getId(), thresher);
		reviewList.put(frilled.getId(), frilled);
		reviewList.put(whale.getId(), whale);
		reviewList.put(bull.getId(), bull);
			
	}
	
	//Constructor for Testing Purposes
	public ReviewRepository(Review...reviews) {
		for (Review review : reviews) {
		reviewList.put(review.getId(), review);
		}
	}

	public Review returnOne(long id) {
		return reviewList.get(id);
	}

	public Collection<Review> returnAll() {
		return reviewList.values();
	}

}
