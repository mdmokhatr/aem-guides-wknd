package com.adobe.aem.guides.wknd.core.services.Impl;
import javax.jcr.Node;
import javax.jcr.Session;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.adobe.aem.guides.wknd.core.services.NodeService;
import com.adobe.aem.guides.wknd.core.Util.ResolverUtil;
@Component(service = NodeService.class, immediate = true)
public class NodeServiceImpl implements NodeService {
    private static final Logger LOG = LoggerFactory.getLogger(NodeServiceImpl.class);
    @Reference
    private ResourceResolverFactory resourceResolverFactory;

    String responseString = "null value ";
    
    @Override
    // public void createNode(String nodeName, String path) {

    public String createNode(String nodeName, String path) throws Exception {
       ResourceResolver resourceResolver;
        try{
            LOG.info("\n -------resolver not found-----");
            resourceResolver = ResolverUtil.newResolver(resourceResolverFactory);

            // ResourceResolver resourceResolver = ResolverUtil.newResolver(resourceResolverFactory);
            // LOG.info("\n ---resolver HIT ---> " + resourceResolver.getUserID());
            resourceResolver = ResolverUtil.newResolver(resourceResolverFactory);
            Session session = resourceResolver.adaptTo(Session.class);
            // Session session = resourceResolver.adaptTo(Session.class);
            Resource resource1 = resourceResolver.getResource("/apps/wknd/components/cards");
            // Node node1 = resource1.adaptTo(Node.class);
            Node nodetemp = resource1.adaptTo(Node.class);
            if(nodetemp.hasNode("mydetails"))
            {
                resource1 = resourceResolver.getResource("/apps/wknd/components/cards/mydetails");
            }
            else{
                nodetemp.addNode("mydetails", "nt:unstructured");
                resource1 = resourceResolver.getResource("/apps/wknd/components/cards/mydetails");
            }
            session.save();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }  

        return responseString;     
        
    }
}
