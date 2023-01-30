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
package org.apache.sling.scripting.sightly.apps.wknd.components.banner;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class banner__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_banner = null;
Object _global_placeholertemplate = null;
Object _global_hascontrent = null;
Object _dynamic_placeholdertemplate = bindings.get("placeholdertemplate");
Object _dynamic_hascontent = bindings.get("hascontent");
_global_banner = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.Banner.class.getName(), obj());
_global_placeholertemplate = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
_global_hascontrent = (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_banner, "empty")));
if (renderContext.getObjectModel().toBoolean(_global_hascontrent)) {
    out.write("<div class=\"cmp-banner\">\r\n        <div cmp-banner_image>\r\n            <img");
    {
        Object var_attrvalue0 = renderContext.getObjectModel().resolveProperty(_global_banner, "src");
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
    {
        Object var_attrvalue4 = renderContext.getObjectModel().resolveProperty(_global_banner, "alt");
        {
            Object var_attrcontent5 = renderContext.call("xss", var_attrvalue4, "attribute");
            {
                boolean var_shoulddisplayattr7 = (((null != var_attrcontent5) && (!"".equals(var_attrcontent5))) && ((!"".equals(var_attrvalue4)) && (!((Object)false).equals(var_attrvalue4))));
                if (var_shoulddisplayattr7) {
                    out.write(" alt");
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
    out.write("/>\r\n        </div>\r\n    <h2 class=\"cmp-banner_name\">");
    {
        Object var_8 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_banner, "bannerText"), "text");
        out.write(renderContext.getObjectModel().toString(var_8));
    }
    out.write("</h2>\r\n    Localization:\r\n     <h3 class=\"cmp-banner_title\">");
    {
        Object var_9 = renderContext.call("xss", renderContext.call("i18n", "Banner Title", obj().with("i18n", null)), "text");
        out.write(renderContext.getObjectModel().toString(var_9));
    }
    out.write("</h3>\r\n\r\n</div>");
}
out.write("\r\n");
{
    Object var_templatevar10 = renderContext.getObjectModel().resolveProperty(_dynamic_placeholdertemplate, "placeholder");
    {
        boolean var_templateoptions11_field$_isempty = (!renderContext.getObjectModel().toBoolean(_dynamic_hascontent));
        {
            java.util.Map var_templateoptions11 = obj().with("isEmpty", var_templateoptions11_field$_isempty);
            callUnit(out, renderContext, var_templatevar10, var_templateoptions11);
        }
    }
}
out.write(" ");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

