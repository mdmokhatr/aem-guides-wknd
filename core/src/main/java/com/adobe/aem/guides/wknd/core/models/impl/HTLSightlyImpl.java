package com.adobe.aem.guides.wknd.core.models.impl;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.inject.Inject;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.aem.guides.wknd.core.models.HTLSightly;

@Model(
    adaptables = SlingHttpServletRequest.class,
    adapters = HTLSightly.class,
    defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class HTLSightlyImpl implements HTLSightly {
    @Inject
    Resource compResource;

    @ValueMapValue
    private String[] booksarray;
    @ValueMapValue
    private List<String> books;
    @ValueMapValue
    private Map<String,String> booksmap;

    @Override
    public String[] getBooksArray() {
        return booksarray;
    }

    @Override
    public List<String> getBooks() {
        return books;
    }

    @Override
    public Map<String, String> getBooksMap() {
        return booksmap;
    }

    // @Override
    // public List<Map<String, String>> getBooksDetailsWithMap() {
       
    //     return booksdetailswithmap;
    // }
    
}
