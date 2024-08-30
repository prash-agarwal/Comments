package com.example.CommentsAPI.Services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.CommentsAPI.Models.Comment;
import com.example.CommentsAPI.Repo.CommentApiRepoInterface;

@Service
public class CommentAPIService {

	@Autowired
	CommentApiRepoInterface commentApiRepoInterface;
	
	public List<String> getAllComments() {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		List<Comment> comments=commentApiRepoInterface.findAll();
		for(int i=0;i<comments.size();i++) {
			list.add(comments.get(i).getText());
		}
		return list;
	}

	public String getCommentsByUsername(String username) {
		// TODO Auto-generated method stub
		return commentApiRepoInterface.findComment(username).getText();
	}
	
	public String getCommentsByDate(Date date) {
		// TODO Auto-generated method stub
		return commentApiRepoInterface.findCommentByDate(date).getText();
	}

}
