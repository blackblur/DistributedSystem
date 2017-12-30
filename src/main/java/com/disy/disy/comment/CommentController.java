package com.disy.disy.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Kamui on 30.12.2017.
 */

@RestController
public class CommentController {

    @Autowired
    private CommentService commentService;

    @RequestMapping("/comments")
    public List<Comment> getAllComments() {
        return commentService.getAllComments();
    }

    @RequestMapping("/comments/{id}")
    public Comment getComment(@PathVariable int id) {
        return commentService.getComment(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/comments")
    public void addComment(@RequestBody Comment comment) {
        commentService.addComment(comment);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/comments")
    public void updateComment(@RequestBody Comment comment) {
        commentService.updateComment(comment);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/comments/{id}")
    public void deleteComment(@PathVariable int id) {
        commentService.deleteComment(id);
    }
}
