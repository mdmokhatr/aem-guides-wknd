package com.adobe.aem.guides.wknd.core.models.impl;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;


import javax.annotation.PostConstruct;

import com.adobe.aem.guides.wknd.core.models.Header;

import com.adobe.aem.guides.wknd.core.models.CategoryItem;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
//import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.SlingObject;
//import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = { SlingHttpServletRequest.class }, adapters = { Header.class }, resourceType = {
        HeaderImpl.RESOURCE_TYPE }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class HeaderImpl implements Header{

    protected static final String RESOURCE_TYPE = "wknd/components/header";

    @SlingObject
    private Resource resource;

    @Self
    private SlingHttpServletRequest request;
    

    @ValueMapValue
    private List<CategoryItem> category;


    @PostConstruct
    public void init(){
        category =new ArrayList<>();

        Resource res = resource.getChild("category");

        if(null != res && res.hasChildren()) {

            Iterator<Resource> cards = res.listChildren();

            while(cards.hasNext()) {

                Resource card = cards.next();

                CategoryItem book = new CategoryItem();

                book.setText(card.getValueMap().get("text", String.class));

                book.setLink(card.getValueMap().get("link", String.class));
                category.add(book);

            }

        }
    }
    @Override
    public List<CategoryItem> getCategory() {
        return category;
    }


}