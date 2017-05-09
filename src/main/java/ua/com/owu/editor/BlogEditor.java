package ua.com.owu.editor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ua.com.owu.entity.Blog;
import ua.com.owu.service.BlogService;

import java.beans.PropertyEditorSupport;

@Component
public class BlogEditor extends PropertyEditorSupport{

    @Autowired
    private BlogService blogService;

    public void setBlogService(BlogService blogService) {
        this.blogService = blogService;
    }

    @Override
    public void setAsText(String id) throws IllegalArgumentException {
        System.out.println(id);
        Blog blog = blogService.findOne(Integer.parseInt(id));
        setValue(blog);
    }
}
