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
package org.apache.sling.scripting.sightly.apps.wknd.components.multitab;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class multitab__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _global_placeholdertemplate = null;
Collection var_collectionvar6_list_coerced$ = null;
_global_model = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.Multitab.class.getName(), obj());
_global_placeholdertemplate = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
out.write("\r\n   <div class=\"cmp-container__imagecontainer\">\r\n   <img");
{
    Object var_attrvalue0 = renderContext.getObjectModel().resolveProperty(_global_model, "image");
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
out.write("/></div>\r\n   <div class=\"cmp-container-center\">");
{
    Object var_4 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "data"), "text");
    out.write(renderContext.getObjectModel().toString(var_4));
}
out.write("</div>\r\n   \r\n\r\n\r\n\r\n<div class=\"cmp-container-title\">\r\n<p>");
{
    String var_5 = ("Main Title:" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "title1"), "text")));
    out.write(renderContext.getObjectModel().toString(var_5));
}
out.write("</p> \r\n   </div>\r\n    ");
{
    Object var_collectionvar6 = renderContext.getObjectModel().resolveProperty(_global_model, "books");
    {
        long var_size7 = ((var_collectionvar6_list_coerced$ == null ? (var_collectionvar6_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar6)) : var_collectionvar6_list_coerced$).size());
        {
            boolean var_notempty8 = (var_size7 > 0);
            if (var_notempty8) {
                {
                    long var_end11 = var_size7;
                    {
                        boolean var_validstartstepend12 = (((0 < var_size7) && true) && (var_end11 > 0));
                        if (var_validstartstepend12) {
                            out.write("<div class=\"cmp-container_item\">");
                            if (var_collectionvar6_list_coerced$ == null) {
                                var_collectionvar6_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar6);
                            }
                            long var_index13 = 0;
                            for (Object item : var_collectionvar6_list_coerced$) {
                                {
                                    boolean var_traversal15 = (((var_index13 >= 0) && (var_index13 <= var_end11)) && true);
                                    if (var_traversal15) {
                                        out.write("\r\n    <ul>\r\n        <li>");
                                        {
                                            String var_16 = ("Name: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "title2"), "text")));
                                            out.write(renderContext.getObjectModel().toString(var_16));
                                        }
                                        out.write("</li><span>|</span>\r\n        <li>");
                                        {
                                            String var_17 = ("Date: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "date"), "text")));
                                            out.write(renderContext.getObjectModel().toString(var_17));
                                        }
                                        out.write("</li><br/>\r\n        <li>");
                                        {
                                            String var_18 = ("Description: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "description"), "text")));
                                            out.write(renderContext.getObjectModel().toString(var_18));
                                        }
                                        out.write("</li><br/>\r\n        <li>");
                                        {
                                            String var_19 = ("Copies: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "copies"), "text")));
                                            out.write(renderContext.getObjectModel().toString(var_19));
                                        }
                                        out.write("</li>\r\n        <br/>\r\n    </ul>\r\n");
                                    }
                                }
                                var_index13++;
                            }
                            out.write("</div>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar6_list_coerced$ = null;
}
out.write(" \r\n\r\n</div>\r\n  \r\n   \r\n\r\n\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

