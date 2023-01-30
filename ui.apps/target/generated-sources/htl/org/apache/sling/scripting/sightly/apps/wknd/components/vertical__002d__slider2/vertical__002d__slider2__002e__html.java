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
package org.apache.sling.scripting.sightly.apps.wknd.components.vertical__002d__slider2;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class vertical__002d__slider2__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _global_placeholdertemplate = null;
Collection var_collectionvar0_list_coerced$ = null;
_global_model = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.VerticalSlider.class.getName(), obj());
_global_placeholdertemplate = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
out.write("\r\n  <div class=\"swiper cmp-vartical-teaser__swiper\">\r\n    <div class=\"swiper-wrapper cmp-vartical-teaser__swiper-wrapper\">\r\n    ");
{
    Object var_collectionvar0 = renderContext.getObjectModel().resolveProperty(_global_model, "carousal");
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
                                        out.write("\r\n              \r\n      <div class=\"swiper-slide cmp-vartical-teaser__swiper-slide\">\r\n      <div class=\"teaser light vertical-align\">\r\n      <div class=\"cmp-teaser\">\r\n        <div class=\"cmp-teaser__content\">\r\n          <h2 class=\"cmp-teaser__title\">");
                                        {
                                            String var_10 = (("\r\n              " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "title"), "text"))) + "\r\n          ");
                                            out.write(renderContext.getObjectModel().toString(var_10));
                                        }
                                        out.write("</h2>\r\n          <div class=\"cmp-teaser__description\">\r\n            <p>");
                                        {
                                            String var_11 = (("\r\n               " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "description"), "text"))) + "\r\n            ");
                                            out.write(renderContext.getObjectModel().toString(var_11));
                                        }
                                        out.write("</p>\r\n          </div>\r\n          \r\n        </div>\r\n        <div class=\"cmp-teaser__image\">\r\n          <div class=\"cmp-image\">\r\n          <img");
                                        {
                                            Object var_attrvalue12 = renderContext.getObjectModel().resolveProperty(item, "images");
                                            {
                                                Object var_attrcontent13 = renderContext.call("xss", var_attrvalue12, "uri");
                                                {
                                                    boolean var_shoulddisplayattr15 = (((null != var_attrcontent13) && (!"".equals(var_attrcontent13))) && ((!"".equals(var_attrvalue12)) && (!((Object)false).equals(var_attrvalue12))));
                                                    if (var_shoulddisplayattr15) {
                                                        out.write(" src");
                                                        {
                                                            boolean var_istrueattr14 = (var_attrvalue12.equals(true));
                                                            if (!var_istrueattr14) {
                                                                out.write("=\"");
                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent13));
                                                                out.write("\"");
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        out.write(" loading=\"lazy\" class=\"cmp-image__image\" alt=\"carousal\"/>\r\n            <meta itemprop=\"caption\" content=\"carousal\"/>\r\n            \r\n          </div>\r\n        </div>\r\n      </div>\r\n      </div>\r\n      </div>\r\n      ");
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
out.write("\r\n        \r\n  </div>\r\n    \r\n    <div class=\"swiper-button-next cmp-vartical-teaser__swiper__button-next\">\r\n      <svg viewBox=\"0 0 24 24\" xmlns=\"http://www.w3.org/2000/svg\">\r\n        <path d=\"m8.5 2.1 9.9 9.9-9.9 9.9\" stroke=\"#353435\" stroke-width=\"2.25\" fill=\"none\" fill-rule=\"evenodd\"></path>\r\n      </svg>\r\n    </div>\r\n    <div class=\"swiper-button-prev cmp-vartical-teaser__swiper__button-prev\">\r\n      <svg viewBox=\"0 0 24 24\" xmlns=\"http://www.w3.org/2000/svg\">\r\n        <path d=\"M15.5 2.1 5.6 12l9.9 9.9\" stroke=\"#353435\" stroke-width=\"2.25\" fill=\"none\" fill-rule=\"evenodd\"></path>\r\n      </svg>\r\n    </div>\r\n    <div class=\"swiper-pagination cmp-vartical-teaser__swiper__pagination\"></div>\r\n  </div>\r\n</section> \r\n\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

