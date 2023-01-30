package com.adobe.aem.guides.wknd.core.models.impl;

import javax.print.DocFlavor.STRING;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;

import com.adobe.aem.guides.wknd.core.models.IdCard2;

@Model(adaptables = { SlingHttpServletRequest.class }, adapters = { IdCard2.class }, resourceType = {
        IdCard2Impl.RESOURCE_TYPE })
public class IdCard2Impl implements IdCard2 {

    protected final static String RESOURCE_TYPE = "wknd/components/idcard2";

    @Override
    public String getImage() {

        return null;
    }

    @Override
    public String getName() {

        return null;
    }

    @Override
    public String getDesignation() {

        return null;
    }

    @Override
    public String getContact() {

        return null;
    }

}
