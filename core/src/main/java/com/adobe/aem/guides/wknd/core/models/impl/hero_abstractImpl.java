package com.adobe.aem.guides.wknd.core.models.impl;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Required;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;

import com.adobe.aem.guides.wknd.core.models.hero_abstract;

@Model(adaptables = { SlingHttpServletRequest.class }, adapters = { hero_abstract.class }, resourceType = {
        hero_abstractImpl.RESOURCE_TYPE }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class hero_abstractImpl implements hero_abstract {
    protected static final String RESOURCE_TYPE = "wknd/components/idcard1";

    @ValueMapValue
    @Required
    @Default(values = "Reimagining Cadillac's User Experience")
    String title;

    @ValueMapValue
    @Required
    @Default(values = "Rightpoint worked with Cadillac to reimagine their user experience and redefine what luxury is in a digitally enabled world.")
    String description;

    @ValueMapValue
    @Required
    @Default(values = "https://s1.cdn.autoevolution.com/images/news/history-of-the-batmobile-51373_1.jpeg")
    String background;

    @ValueMapValue
    @Required
    @Default(values = "https://www.google.com/")
    String link;

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDiscription() {
        return description;
    }

    @Override
    public String getLink() {
        return link;
    }

    @Override
    public String getBackground() {
        return background;
    }

}
