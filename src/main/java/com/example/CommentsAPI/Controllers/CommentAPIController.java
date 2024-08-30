package com.example.CommentsAPI.Controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.CommentsAPI.Models.Comment;
import com.example.CommentsAPI.Services.CommentAPIService;

@RestController
public class CommentAPIController {
	
	@Autowired
	CommentAPIService commentAPIService;
	
	@GetMapping("/api/v2/comments")
	public List<String> getAllComments(){
		return commentAPIService.getAllComments();
	}

	@GetMapping("/api/v2/comments/search?username={username}")
	public String getCommentsByUsername(@RequestParam("username")String username){
		return commentAPIService.getCommentsByUsername(username);
	}

	@GetMapping("/api/v2/comments/search?date={date}")
	public String getCommentsByUsername(@RequestParam("date")Date date){
		return commentAPIService.getCommentsByDate(date);
	}
	
}
