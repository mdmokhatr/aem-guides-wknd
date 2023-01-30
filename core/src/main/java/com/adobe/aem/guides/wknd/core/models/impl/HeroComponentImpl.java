package com.adobe.aem.guides.wknd.core.models.impl;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Required;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import com.adobe.aem.guides.wknd.core.models.HeroComponent;
@Model(adaptables = {SlingHttpServletRequest.class,Resource.class},adapters = HeroComponent.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL,resourceType = HeroComponentImpl.RESOURCE_TYPE)
public class HeroComponentImpl  implements HeroComponent{
    protected static final String RESOURCE_TYPE = "wknd/components/herocomponent";
    @ValueMapValue
    @Required
    @Default(values = "Reimagining Cadillac’s User Experience")
    String title;
    public HeroComponentImpl() {
    }
    @ValueMapValue
    @Required
    @Default(values = "Rightpoint worked with Cadillac to reimagine their user experience and redefine what luxury is in a digitally enabled world.")
    String description;
    @ValueMapValue
    @Required
    @Default(values = "https://source.unsplash.com/random/400x250/?car,sport")
    String background;
    @ValueMapValue
    @Required
    @Default(values = "https://www.google.com/?gws_rd=ssl")
    String link;
    @Override
    public String getTitle() { 
        return title;
    }
    @Override
    public String getDescription() {
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
