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
package org.apache.sling.scripting.sightly.apps.wknd.components.hero_abstract;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class hero_abstract__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
out.write("<div class=\"card_image_over\">\r\n    <!-- <div  data-sly-use.model=\"com.adobe.aem.guides.wknd.core.models.hero_abstract\"> -->\r\n\r\n    <img");
{
    Object var_attrvalue0 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "background");
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
out.write(" alt=\"error\" class=\"bg-image\"/>\r\n    \r\n    <div class=\"mycard\"");
{
    String var_attrcontent4 = (("background-color: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "color"), "styleToken"))) + ";");
    out.write(" style=\"");
    out.write(renderContext.getObjectModel().toString(var_attrcontent4));
    out.write("\"");
}
out.write(">\r\n        <a");
{
    Object var_attrvalue5 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "link");
    {
        Object var_attrcontent6 = renderContext.call("xss", var_attrvalue5, "uri");
        {
            boolean var_shoulddisplayattr8 = (((null != var_attrcontent6) && (!"".equals(var_attrcontent6))) && ((!"".equals(var_attrvalue5)) && (!((Object)false).equals(var_attrvalue5))));
            if (var_shoulddisplayattr8) {
                out.write(" href");
                {
                    boolean var_istrueattr7 = (var_attrvalue5.equals(true));
                    if (!var_istrueattr7) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent6));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(">\r\n            <h1 class=\"mycard-title\">\r\n                <span>");
{
    String var_9 = ((" " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "title"), "text"))) + " ");
    out.write(renderContext.getObjectModel().toString(var_9));
}
out.write("</span>\r\n            </h1>\r\n        </a>\r\n        <h2 class=\"mycard-subtitle\">\r\n\r\n        </h2>\r\n        <p>");
{
    Object var_10 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "description"), "text");
    out.write(renderContext.getObjectModel().toString(var_10));
}
out.write("</p>\r\n\r\n        <div class=\"mycard-footer\">\r\n            <a");
{
    Object var_attrvalue11 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "link");
    {
        Object var_attrcontent12 = renderContext.call("xss", var_attrvalue11, "uri");
        {
            boolean var_shoulddisplayattr14 = (((null != var_attrcontent12) && (!"".equals(var_attrcontent12))) && ((!"".equals(var_attrvalue11)) && (!((Object)false).equals(var_attrvalue11))));
            if (var_shoulddisplayattr14) {
                out.write(" href");
                {
                    boolean var_istrueattr13 = (var_attrvalue11.equals(true));
                    if (!var_istrueattr13) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent12));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" target=\"_blank\"> Read More</a>\r\n        </div>\r\n    </div>\r\n\r\n\r\n</div>\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

