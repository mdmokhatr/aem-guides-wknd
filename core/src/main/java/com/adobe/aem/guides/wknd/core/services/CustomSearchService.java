package com.adobe.aem.guides.wknd.core.services;

import java.util.List;

import org.apache.sling.api.SlingHttpServletRequest;

import com.adobe.aem.guides.wknd.core.models.DTO.CustomSearchDTO;

public interface CustomSearchService {
    List<CustomSearchDTO> getResults(SlingHttpServletRequest request);
}
