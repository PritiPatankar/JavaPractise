package com.ltimindtree.blog.service;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.ltimindtree.blog.model.BlogPost;

@Service
public class BlogPostService {
    private final List<BlogPost> blog = new ArrayList<>();
    public List<BlogPost> getAllBlogposttitle() {
        return blog;
    }
 
    public BlogPost getBlogposttitleByTitle(String blogposttitle) {
        for(BlogPost blg:blog ){
           if(blg.getBlogposttitle().equals(blogposttitle)){
               return blg;
           }  
        }
       return null;
       }
   
   
    public BlogPost addBlogPost(BlogPost blg) {
        blog.add(blg);
        return blg;
       
     }
 }
