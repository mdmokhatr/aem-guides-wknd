package com.adobe.aem.guides.wknd.core.models.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.aem.guides.wknd.core.models.AuthorBooks;


@Model(
    adaptables = SlingHttpServletRequest.class,
    adapters = AuthorBooks.class,
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class AuthorBooksImpl  implements AuthorBooks{

    @Inject
    Resource  componentResource;

    @ValueMapValue
    private String authorname;

    @ValueMapValue
    private List<String> books;


    @Override
    public String getAuthorName() {
        
        return authorname;
    }

    @Override
    public List<String> getAuthorBooks() {
        
        if(books != null){
            return new ArrayList<String>(books);
        }
        else{
            return Collections.emptyList();
        }
    
    }
    
}
