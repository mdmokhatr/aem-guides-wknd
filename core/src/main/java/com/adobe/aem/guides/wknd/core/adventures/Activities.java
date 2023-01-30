package com.adobe.aem.guides.wknd.core.adventures;

import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface Activities {
    String getRandomActivity();
    
}
