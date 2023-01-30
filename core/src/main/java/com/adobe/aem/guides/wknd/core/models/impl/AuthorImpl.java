package com.adobe.aem.guides.wknd.core.models.impl;

import javax.inject.Inject;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Required;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;

import com.adobe.aem.guides.wknd.core.models.Author;
import com.day.cq.wcm.api.Page;




@Model(adaptables = SlingHttpServletRequest.class,
       adapters = Author.class,
       defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
         )
public class AuthorImpl implements Author {

    @ScriptVariable
    Page currentPage;

    @Inject
    @Required
    @Default(values = "Satyam")
    String fname;

    @Inject
    @Default(values= "Gupta")
    String lname;
      
    @Inject
    boolean professor;



    @Override
    public String getFirstName() {
        
        return fname;
    }

    @Override
    public String getLastName() {
      
        return lname;
    }

    @Override
    public boolean getIsProfessor() {
        
        return professor;
    }

    @Override
    public String getPageTitle() {
        
        return currentPage.getTitle();
    }
    
}
