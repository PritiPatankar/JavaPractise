package com.ltimindtree.blog.model;

public class BlogPost {
    private String blogposttitle;
    private String content;
    private String authorinfo;
    public BlogPost() {
    }
    public BlogPost(String blogposttitle, String content, String authorinfo) {
        this.blogposttitle = blogposttitle;
        this.content = content;
        this.authorinfo = authorinfo;
    }
    public String getBlogposttitle() {
        return blogposttitle;
    }
    public void setBlogposttitle(String blogposttitle) {
        this.blogposttitle = blogposttitle;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getAuthorinfo() {
        return authorinfo;
    }
    public void setAuthorinfo(String authorinfo) {
        this.authorinfo = authorinfo;
    }
   
}
