package com.adobe.aem.guides.wknd.core.models.impl;

import org.apache.commons.lang3.StringUtils;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.via.ResourceSuperType;
import com.adobe.aem.guides.wknd.core.models.Banner;
import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.wcm.core.components.models.Image;



@Model( adaptables = SlingHttpServletRequest.class, adapters = {Banner.class, ComponentExporter.class},
         resourceType = BannerImpl.RSOURCE_TYPE,
         defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class BannerImpl implements Banner {


  protected static final String RSOURCE_TYPE = "wknd/components/banner";

  @Self
  private SlingHttpServletRequest request;

  @Self
  @Via(type = ResourceSuperType.class )
  private Image image;
    
  @ValueMapValue
 private String bannerText;


 // use all method of image class


    @Override
    public String getSrc() {
        
        return null != image ? image.getSrc() : null;
    }
     
    @Override
    public String getAlt() {
        
        return null != image ? image.getAlt() : null;
    }
   
     @Override
     public String getTitle() {
        
         return null != image ? image.getTitle() : null;
     }

    @Override
    public String getBannerText() {
       
        return bannerText;
    }

    @Override
    public String getExportedType() {
        
        return BannerImpl.RSOURCE_TYPE;
    }

    @Override
    public Boolean isEmpty() {

        if (StringUtils.isBlank(bannerText)) {
            
            return true;
        } else if(image == null || StringUtils.isBlank(image.getSrc())){
            return true;
        }
        
        else {
            
             return false;
       
        
            
        }


        
    }
    
}
