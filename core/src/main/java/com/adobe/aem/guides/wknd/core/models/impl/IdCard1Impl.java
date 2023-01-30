package com.adobe.aem.guides.wknd.core.models.impl;

import javax.annotation.Resource;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.aem.guides.wknd.core.models.IdCard1;

@Model(adaptables = { SlingHttpServletRequest.class }, adapters = { IdCard1.class }, resourceType = {
        IdCard1Impl.RESOURCE_TYPE }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class IdCard1Impl implements IdCard1 {

    protected static final String RESOURCE_TYPE = "wknd/components/idcard1";

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
    public String getContact() {

        return contact;
    }

    @Override
    public String getDesignation() {

        return designation;
    }

}
