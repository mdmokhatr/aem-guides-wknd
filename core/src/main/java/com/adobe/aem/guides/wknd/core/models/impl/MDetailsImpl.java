package com.adobe.aem.guides.wknd.core.models.impl;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.aem.guides.wknd.core.models.MDeatils;
@Model(adaptables = { SlingHttpServletRequest.class }, adapters = { MDeatils.class }, resourceType = {
    IdCard1Impl.RESOURCE_TYPE }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class MDetailsImpl implements MDeatils {
    protected static final String RESOURCE_TYPE = "wknd/components/mddetails";

    @ValueMapValue
    private String fname;
   @Default(values="AEM")
    @ValueMapValue
    private String lname;

    @ValueMapValue
    private String professor;

    @Override
    public String getFname() {
        
        return fname;
    }

    @Override
    public String getLname() {
        
        return lname;
    }

    @Override
    public String getProfessor() {
        return professor;
    }
    
}
