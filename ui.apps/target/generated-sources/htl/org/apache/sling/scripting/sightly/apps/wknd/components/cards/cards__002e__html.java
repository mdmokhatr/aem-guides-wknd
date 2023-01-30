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
package org.apache.sling.scripting.sightly.apps.wknd.components.cards;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class cards__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _global_placeholdertemplate = null;
_global_model = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.Cards.class.getName(), obj());
_global_placeholdertemplate = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
out.write("\r\n  <section>\r\n    <div class=\"img-double-cards-container\">\r\n      <div class=\"row\">\r\n        <div class=\"col-md-6\">\r\n          <img");
{
    Object var_attrvalue0 = renderContext.getObjectModel().resolveProperty(_global_model, "image1");
    {
        Object var_attrcontent1 = renderContext.call("xss", var_attrvalue0, "uri");
        {
            boolean var_shoulddisplayattr3 = (((null != var_attrcontent1) && (!"".equals(var_attrcontent1))) && ((!"".equals(var_attrvalue0)) && (!((Object)false).equals(var_attrvalue0))));
            if (var_shoulddisplayattr3) {
                out.write(" src");
                {
                    boolean var_istrueattr2 = (var_attrvalue0.equals(true));
                    if (!var_istrueattr2) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent1));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write("/>\r\n        </div>\r\n        <div class=\"col-md-6\">\r\n          <img");
{
    Object var_attrvalue4 = renderContext.getObjectModel().resolveProperty(_global_model, "image2");
    {
        Object var_attrcontent5 = renderContext.call("xss", var_attrvalue4, "uri");
        {
            boolean var_shoulddisplayattr7 = (((null != var_attrcontent5) && (!"".equals(var_attrcontent5))) && ((!"".equals(var_attrvalue4)) && (!((Object)false).equals(var_attrvalue4))));
            if (var_shoulddisplayattr7) {
                out.write(" src");
                {
                    boolean var_istrueattr6 = (var_attrvalue4.equals(true));
                    if (!var_istrueattr6) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent5));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write("/>\r\n        </div>\r\n      </div>\r\n    </div>\r\n  </section>\r\n  <div class=\"bio-card card\">\r\n    <img");
{
    Object var_attrvalue8 = renderContext.getObjectModel().resolveProperty(_global_model, "image3");
    {
        Object var_attrcontent9 = renderContext.call("xss", var_attrvalue8, "uri");
        {
            boolean var_shoulddisplayattr11 = (((null != var_attrcontent9) && (!"".equals(var_attrcontent9))) && ((!"".equals(var_attrvalue8)) && (!((Object)false).equals(var_attrvalue8))));
            if (var_shoulddisplayattr11) {
                out.write(" src");
                {
                    boolean var_istrueattr10 = (var_attrvalue8.equals(true));
                    if (!var_istrueattr10) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent9));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" class=\"card-img-top\"/>\r\n    <div class=\"card-body\">\r\n      <h5 class=\"card-title\">");
{
    Object var_12 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "title"), "text");
    out.write(renderContext.getObjectModel().toString(var_12));
}
out.write("</h5>\r\n      <div class=\"card-text\">");
{
    Object var_13 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "text"), "text");
    out.write(renderContext.getObjectModel().toString(var_13));
}
out.write("</div>\r\n    </div>\r\n  </div>\r\n  <div class=\"card patient_story-card\">\r\n    <img");
{
    Object var_attrvalue14 = renderContext.getObjectModel().resolveProperty(_global_model, "image4");
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
out.write(" class=\"card-img-top\" alt=\"patient_story-card-image\"/>\r\n    <div class=\"card-body\">\r\n      <h5 class=\"card-title\">");
{
    Object var_18 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "title1"), "text");
    out.write(renderContext.getObjectModel().toString(var_18));
}
out.write("</h5>\r\n      <p class=\"card-text\">");
{
    Object var_19 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "history"), "text");
    out.write(renderContext.getObjectModel().toString(var_19));
}
out.write("</p>\r\n    </div>\r\n  </div>\r\n\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

