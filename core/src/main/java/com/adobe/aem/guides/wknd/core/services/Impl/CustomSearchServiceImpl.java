package com.adobe.aem.guides.wknd.core.services.Impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.jcr.Session;
import com.day.cq.search.PredicateGroup;
import com.day.cq.search.Query;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.adobe.aem.guides.wknd.core.services.CustomSearchService;
import com.day.cq.search.QueryBuilder;
import com.day.cq.search.result.Hit;
import com.day.cq.search.result.SearchResult;
import com.day.cq.wcm.api.Page;
import com.adobe.aem.guides.wknd.core.models.DTO.CustomSearchDTO;

@Component(service = CustomSearchService.class, immediate = true)
public class CustomSearchServiceImpl implements CustomSearchService {

    @Reference
    QueryBuilder queryBuilder;
    Session session;

    private static final Logger LOG = LoggerFactory.getLogger(CustomSearchServiceImpl.class);

    @Activate
    public void activate(ComponentContext componentContext) {
        LOG.info("\n ==============INSIDE ACTIVATE munesh================");
        LOG.info("\n {} = {} ", componentContext.getBundleContext().getBundle().getBundleId(),
                componentContext.getBundleContext().getBundle().getSymbolicName());
    }

    @Deactivate
    public void deactivate(ComponentContext componentContext) {
        LOG.info("\n ==============INSIDE DEACTIVATE munesh================");
    }

    @Modified
    public void modified(ComponentContext componentContext) {
        LOG.info("\n ==============INSIDE MODIFIED munesh================");
    }

    @Override
    public List<CustomSearchDTO> getResults(SlingHttpServletRequest request) {

        String requestQuery = request.getParameter("query");
        String pageNumber = request.getParameter("page");
        if (!pageNumber.equals("0")) {
            pageNumber = pageNumber + 0;
        }

        ResourceResolver resourceResolver = request.getResourceResolver();
        session = resourceResolver.adaptTo(Session.class);

        Map<String, String> predicate = new HashMap<>();
        predicate.put("path", "/content/wknd/");
        predicate.put("type", "cq:Page");
        predicate.put("1_property", "jcr:content/jcr:title");
        predicate.put("1_property.value", requestQuery + "%");
        predicate.put("1_property.operation", "like");
        predicate.put("p.offset", pageNumber);
        predicate.put("p.limit", "10");
        Query query = null;

        try {
            query = queryBuilder.createQuery(PredicateGroup.create(predicate), session);
        } catch (Exception e) {
            // LOGGER.error("Error in Query Check kr le bhai try block me Shahid bhai bol
            // rha");
        }

        SearchResult searchResult = query.getResult();
        List<CustomSearchDTO> list = new ArrayList<>();
        for (Hit hit : searchResult.getHits()) {
            String path = null;
            CustomSearchDTO temp = new CustomSearchDTO();

            try {
                path = hit.getPath();
                Resource articlResource = resourceResolver.getResource(path);
                Page articlPage = articlResource.adaptTo(Page.class);
                temp.setTitle(articlPage.getTitle());
                temp.setDescription(articlPage.getDescription());
                temp.setPath(path);
                list.add(temp);

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        return list;
    }
}
