package com.adobe.aem.guides.wknd.core.models.impl;

import com.adobe.aem.guides.wknd.core.models.Idcard;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = {SlingHttpServletRequest.class}, adapters = {Idcard.class}, resourceType = {IdCardImpl.RESOURCE_TYPE},
defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL )
public class IdCardImpl implements Idcard {

    protected static final String RESOURCE_TYPE = "wknd/components/idcard";

        @ValueMapValue
        private String name;

        @ValueMapValue
        private String image;

        @ValueMapValue
        private String designation;

        @ValueMapValue
        private String contact;


    @Override
    public String getName() {
       
        return name;
    }

    @Override
    public String getImage() {
        
        return image;
    }

    @Override
    public String getDesignation() {
        
        return designation;
    }

    @Override
    public String getContact() {
       
        return contact;
    }
    

}
