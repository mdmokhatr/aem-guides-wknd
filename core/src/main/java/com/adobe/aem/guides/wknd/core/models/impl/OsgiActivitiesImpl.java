package com.adobe.aem.guides.wknd.core.models.impl;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;

import com.adobe.aem.guides.wknd.core.adventures.Activities;
import com.adobe.aem.guides.wknd.core.models.OsgiActivities;

@Model(adaptables = SlingHttpServletRequest.class, adapters = OsgiActivities.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class OsgiActivitiesImpl implements OsgiActivities {

    @OSGiService
    Activities activities;

    @Override
    public String getRandomActivity() {

        return activities.getRandomActivity();
    }

}
