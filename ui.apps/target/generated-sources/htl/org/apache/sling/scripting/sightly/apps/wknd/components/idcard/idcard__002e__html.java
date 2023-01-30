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
package org.apache.sling.scripting.sightly.apps.wknd.components.idcard;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class idcard__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
Object _global_model = null;
out.write("\n\n\n ");
{
    String var_0 = (((((((("<!-- <div class=\"card\">\n    <h2 class=\"cmp-card_cname\" >Rightpoint India </h2>\n    <img src=\"" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "image"), "comment"))) + "\" alt=\"Employee Picture\" class=\"cmp-card_eimage\">\n    <h3 class=\"cmp-card_ename\">") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "name"), "comment"))) + "</h3>\n    <h4 class=\"cmp-card_edesignation\">") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "designation"), "comment"))) + "</h4>\n    <p class=\"cmp-card_econtact\">Emergency Contact No : ") + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "contact"), "comment"))) + " </p>\n</div>  -->");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("\n\n ");
_global_model = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.Idcard.class.getName(), obj());
out.write("<div class=\"card\">\n    <h2 class=\"cmp-card_cname\">Rightpoint India </h2>\n\n    <img");
{
    Object var_attrvalue1 = renderContext.getObjectModel().resolveProperty(_global_model, "image");
    {
        Object var_attrcontent2 = renderContext.call("xss", var_attrvalue1, "uri");
        {
            boolean var_shoulddisplayattr4 = (((null != var_attrcontent2) && (!"".equals(var_attrcontent2))) && ((!"".equals(var_attrvalue1)) && (!((Object)false).equals(var_attrvalue1))));
            if (var_shoulddisplayattr4) {
                out.write(" src");
                {
                    boolean var_istrueattr3 = (var_attrvalue1.equals(true));
                    if (!var_istrueattr3) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent2));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" alt=\"Employee Picture\" class=\"cmp-card_eimage\"/>\n    <h3 class=\"cmp-card_ename\">");
{
    Object var_5 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "name"), "text");
    out.write(renderContext.getObjectModel().toString(var_5));
}
out.write("</h3>\n    <h4 class=\"cmp-card_edesignation\">");
{
    Object var_6 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "designation"), "text");
    out.write(renderContext.getObjectModel().toString(var_6));
}
out.write("</h4>\n    <p class=\"cmp-card_econtact\">");
{
    String var_7 = (("Emergency Contact No : " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "contact"), "text"))) + " ");
    out.write(renderContext.getObjectModel().toString(var_7));
}
out.write("</p>\n</div> ");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

