package com.adobe.aem.guides.wknd.core.models.impl;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import com.adobe.aem.guides.wknd.core.models.OsgiConfiguration;
import com.adobe.aem.guides.wknd.core.services.OSGiConfig;
@Model(adaptables = SlingHttpServletRequest.class, adapters = OsgiConfiguration.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class OsgiConfigurationImpl implements OsgiConfiguration {
 @OSGiService
 OSGiConfig osGiConfig;
 

    @Override
    public String getServiceName() {
        
        return osGiConfig.getServiceName() ;
    }

    @Override
    public int getServiceCount() {
        
        return osGiConfig.getServiceCount();
    }

    @Override
    public boolean isLiveData() {
        
        return osGiConfig.isLiveData();
    }

    @Override
    public String[] getCountries() {
        
        return osGiConfig.getCountries();
    }

    @Override
    public String getRunModes() {
       
        return osGiConfig.getRunModes() ;
    }
    
}
