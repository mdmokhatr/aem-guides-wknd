package com.adobe.aem.guides.wknd.core.models.impl;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Required;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.adobe.aem.guides.wknd.core.models.StudentDetails;

@Model(adaptables = { SlingHttpServletRequest.class }, adapters = { StudentDetails.class }, resourceType = {
        StudentDetailsImpl.RESOURCE_TYPE }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class StudentDetailsImpl implements StudentDetails {
    protected static final String RESOURCE_TYPE = "wknd/components/studentcard";

    @ValueMapValue
    @Required
    @Default(values = "Md Mokhtar")
    String name;

    @ValueMapValue
    @Required
    @Default(values = "18EAICS085")
    String rollno;

    @ValueMapValue
    @Required
    @Default(values = "B")
    String section;

    @ValueMapValue
    @Required
    @Default(values = "B.Tech")
    String course;

    @ValueMapValue
    @Required
    @Default(values = "8507545991")
    String contact;

    @Override
    public String getName() {

        return name;
    }

    @Override
    public String getRollno() {

        return rollno;
    }

    @Override
    public String getSection() {

        return section;
    }

    @Override
    public String getCourse() {

        return course;
    }

    @Override
    public String getContact() {

        return contact;
    }

}
