package com.adobe.aem.guides.wknd.core.models.impl;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import com.adobe.aem.guides.wknd.core.models.UserData;
@Model(adaptables = { SlingHttpServletRequest.class }, adapters = { UserData.class }, resourceType = {
    UserDataImpl.RESOURCE_TYPE }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class UserDataImpl implements UserData {
    protected static final String RESOURCE_TYPE = "wknd/components/userdata";

    @ValueMapValue
    private String mainpath;

    @Override
    public String getPath() {
        
        return mainpath;
    }
    
}
