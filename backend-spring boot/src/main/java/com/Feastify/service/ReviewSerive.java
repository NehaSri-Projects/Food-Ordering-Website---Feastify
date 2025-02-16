package com.Feastify.service;

import java.util.List;

import com.Feastify.Exception.ReviewException;
import com.Feastify.model.Review;
import com.Feastify.model.User;
import com.Feastify.request.ReviewRequest;

public interface ReviewSerive {
	
    public Review submitReview(ReviewRequest review,User user);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}
