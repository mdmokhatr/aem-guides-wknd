package com.adobe.aem.guides.wknd.core.services.Impl;
import javax.jcr.Node;
import javax.jcr.Session;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;
import com.adobe.aem.guides.wknd.core.Util.ResolverUtil;
// logger
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.adobe.aem.guides.wknd.core.services.InfoSaveInNodeService;
@Component(service = InfoSaveInNodeService.class, immediate = true)
public class InfoSaveInNodeServiceImpl implements InfoSaveInNodeService {
    private static final Logger LOG = LoggerFactory.getLogger(InfoSaveInNodeServiceImpl.class);
    @Reference
    private ResourceResolverFactory resourceResolverFactory;
    @Activate
    public void activate(ComponentContext componentContext) {
        LOG.info("\n ==============INSIDE ACTIVATE ================");
        LOG.info("\n {} = {} ", componentContext.getBundleContext().getBundle().getBundleId(),
                componentContext.getBundleContext().getBundle().getSymbolicName());
    }
    @Deactivate
    public void deactivate(ComponentContext componentContext) {
        LOG.info("\n ==============INSIDE DEACTIVATE ================");
    }
    @Modified
    public void modified(ComponentContext componentContext) {
        LOG.info("\n ==============INSIDE MODIFIED ================");
    }
    String responseString = "null";
    @Override
     public String saveDataInNode(String fname, String lname) throws Exception{
        ResourceResolver resourceResolver;
        try {
            resourceResolver = ResolverUtil.newResolver(resourceResolverFactory);
            Session session = resourceResolver.adaptTo(Session.class);
            Resource resource1 = resourceResolver.getResource("/apps/wknd/components/cards/details");
            Node node1 = resource1.adaptTo(Node.class);
            if (node1.hasNode(fname + "_" + lname)) {
                responseString = "Already Created, Dublicate Data";
            } else {
                Node node2 = node1.addNode(fname + "_" + lname);
                node2.setProperty("fname", fname);
                node2.setProperty("lname", lname);
                responseString = "Node 1 added Successfully created ....";
            }
            session.save();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return responseString;
    }
    // @Override
    // public String saveDataInNode(SlingHttpServletRequest req) {
    //     return responseString;
    // }

    
}

