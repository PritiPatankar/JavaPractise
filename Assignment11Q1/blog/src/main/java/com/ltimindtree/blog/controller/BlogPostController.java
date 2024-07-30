package com.ltimindtree.blog.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ltimindtree.blog.model.BlogPost;
import com.ltimindtree.blog.service.BlogPostService;

@RestController
@RequestMapping("/blogposts")
 
public class BlogPostController {
    @Autowired
    private BlogPostService blogpostService;
 
    @GetMapping
    public ResponseEntity<List<BlogPost>> getAllBlogposttitle() {
       
        List<BlogPost> blog =blogpostService.getAllBlogposttitle();
        return new ResponseEntity<>(blog,HttpStatus.OK);
 
    }
    @GetMapping("/{blogposttitle}")
    public ResponseEntity<BlogPost> getBlogposttitleByTitle(@PathVariable String blogposttitle) {
       
        BlogPost blg=blogpostService.getBlogposttitleByTitle(blogposttitle);
        if(blg==null){
            return ResponseEntity.notFound().build();
        }
        return new ResponseEntity<>(blg,HttpStatus.OK);
       
    }
 
    @PostMapping
    public ResponseEntity<BlogPost>  addBlogPost(@RequestBody BlogPost blg) {
       return new ResponseEntity<BlogPost>(blogpostService.addBlogPost(blg),HttpStatus.OK);
 
    }
}
