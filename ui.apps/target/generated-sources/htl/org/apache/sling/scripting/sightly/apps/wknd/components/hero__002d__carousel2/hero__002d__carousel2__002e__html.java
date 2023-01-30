/*******************************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 ******************************************************************************/
package org.apache.sling.scripting.sightly.apps.wknd.components.hero__002d__carousel2;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class hero__002d__carousel2__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _global_placeholdertemplate = null;
Collection var_collectionvar0_list_coerced$ = null;
_global_model = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.HeroCarousel2.class.getName(), obj());
_global_placeholdertemplate = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
out.write("\r\n  <div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-bs-touch=\"true\" data-bs-ride=\"carousel\" data-interval=\"3000\">\r\n    <div class=\"carousel-inner\">\r\n      <div class=\"carousel-item active\">\r\n      ");
{
    Object var_collectionvar0 = renderContext.getObjectModel().resolveProperty(_global_model, "carousel");
    {
        long var_size1 = ((var_collectionvar0_list_coerced$ == null ? (var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0)) : var_collectionvar0_list_coerced$).size());
        {
            boolean var_notempty2 = (var_size1 > 0);
            if (var_notempty2) {
                {
                    long var_end5 = var_size1;
                    {
                        boolean var_validstartstepend6 = (((0 < var_size1) && true) && (var_end5 > 0));
                        if (var_validstartstepend6) {
                            if (var_collectionvar0_list_coerced$ == null) {
                                var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0);
                            }
                            long var_index7 = 0;
                            for (Object item : var_collectionvar0_list_coerced$) {
                                {
                                    boolean var_traversal9 = (((var_index7 >= 0) && (var_index7 <= var_end5)) && true);
                                    if (var_traversal9) {
                                        out.write("\r\n        <div class=\"row right-align-image\">\r\n          <div class=\"col-md-6 col-lg-5 d-flex align-items-center image-content\">\r\n            <picture>\r\n              <source");
                                        {
                                            Object var_attrvalue10 = renderContext.getObjectModel().resolveProperty(item, "image");
                                            {
                                                Object var_attrcontent11 = renderContext.call("xss", var_attrvalue10, "attribute");
                                                {
                                                    boolean var_shoulddisplayattr13 = (((null != var_attrcontent11) && (!"".equals(var_attrcontent11))) && ((!"".equals(var_attrvalue10)) && (!((Object)false).equals(var_attrvalue10))));
                                                    if (var_shoulddisplayattr13) {
                                                        out.write(" srcset");
                                                        {
                                                            boolean var_istrueattr12 = (var_attrvalue10.equals(true));
                                                            if (!var_istrueattr12) {
                                                                out.write("=\"");
                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent11));
                                                                out.write("\"");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        out.write(" media=\"(max-width: 600px)\"/>\r\n              <img");
                                        {
                                            Object var_attrvalue14 = renderContext.getObjectModel().resolveProperty(item, "image");
                                            {
                                                Object var_attrcontent15 = renderContext.call("xss", var_attrvalue14, "uri");
                                                {
                                                    boolean var_shoulddisplayattr17 = (((null != var_attrcontent15) && (!"".equals(var_attrcontent15))) && ((!"".equals(var_attrvalue14)) && (!((Object)false).equals(var_attrvalue14))));
                                                    if (var_shoulddisplayattr17) {
                                                        out.write(" src");
                                                        {
                                                            boolean var_istrueattr16 = (var_attrvalue14.equals(true));
                                                            if (!var_istrueattr16) {
                                                                out.write("=\"");
                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent15));
                                                                out.write("\"");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        out.write("/>\r\n            </picture>\r\n          </div>\r\n          <div class=\"col-md-6 d-flex align-items-center content-background-color\">\r\n            <div class=\"hero-carousel-content\">\r\n             \r\n              <div class=\"bodyCopy\">");
                                        {
                                            String var_18 = (("\r\n                   " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "description"), "text"))) + "\r\n              ");
                                            out.write(renderContext.getObjectModel().toString(var_18));
                                        }
                                        out.write("</div>\r\n            </div>\r\n          </div>\r\n        ");
                                    }
                                }
                                var_index7++;
                            }
                        }
                    }
                }
            }
        }
    }
    var_collectionvar0_list_coerced$ = null;
}
out.write("\r\n        </div>\r\n      </div>\r\n    </div>\r\n    <div class=\"carousel-indicators\">\r\n      <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\" aria-label=\"Slide 1\"></button>\r\n      <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\r\n      <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\r\n    </div>\r\n    <button class=\"carousel-control-prev\" data-bs-target=\"#carouselExampleIndicators\" type=\"button\" data-bs-slide=\"prev\">\r\n      <span class=\"fa fa-angle-left\" aria-hidden=\"true\"></span>\r\n      <span class=\"sr-only\">Previous</span>\r\n    </button>\r\n    <button class=\"carousel-control-next\" data-bs-target=\"#carouselExampleIndicators\" type=\"button\" data-bs-slide=\"next\">\r\n      <span class=\"fa fa-angle-right\" aria-hidden=\"true\"></span>\r\n      <span class=\"sr-only\">Next</span>\r\n    </button>\r\n  </div>\r\n</section>\r\n\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

