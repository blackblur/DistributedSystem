package com.disy.disy.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kamui on 30.12.2017.
 */

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public List<Comment> getAllComments() {
        List<Comment> comments = new ArrayList<>();
        commentRepository.findAll()
                .forEach(comments::add);
        return comments;
    }

    public Comment getComment(int id) {
        return commentRepository.findOne(id);
    }

    public void addComment(Comment comment) {
        commentRepository.save(comment);
    }

    public void updateComment(Comment comment) {
        commentRepository.save(comment);
    }

    public void deleteComment(int id) {
        commentRepository.delete(id);
    }
}
