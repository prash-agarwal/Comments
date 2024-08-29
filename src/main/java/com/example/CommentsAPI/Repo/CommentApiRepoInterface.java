package com.example.CommentsAPI.Repo;

import org.springframework.stereotype.Repository;

import com.example.CommentsAPI.Models.Comment;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface CommentApiRepoInterface extends JpaRepository<Comment,Integer>{

	@Query(value = "select a from Comment a where a.commented_by = :username")
    Comment findComment(String username);
	
	
	@Query(value = "select a from Comment a where a.date = :date")
    Comment findCommentByDate(Date date);
	
}
