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
package org.apache.sling.scripting.sightly.apps.wknd.components.header;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class header__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _global_placeholdertemplate = null;
Collection var_collectionvar0_list_coerced$ = null;
_global_model = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.Header.class.getName(), obj());
_global_placeholdertemplate = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
out.write("\r\n\r\n    <header>\r\n        <div class=\"cmp-maincontainer\">\r\n      \r\n          <div class=\"cmp-maincontainer__logo\">\r\n            <a href=\"#\" alt=\"rightpoint\"> <p id=\"title\">RIGHTPOINT </p><hr/><p id=\"subtitle\">a <b id=\"stitle\">genpact</b> comapny</p></a>\r\n          </div>\r\n          ");
{
    Object var_collectionvar0 = renderContext.getObjectModel().resolveProperty(_global_model, "category");
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
                            out.write("<div class=\"cmp-maincontainer__navbar\">");
                            if (var_collectionvar0_list_coerced$ == null) {
                                var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0);
                            }
                            long var_index7 = 0;
                            for (Object item : var_collectionvar0_list_coerced$) {
                                {
                                    boolean var_traversal9 = (((var_index7 >= 0) && (var_index7 <= var_end5)) && true);
                                    if (var_traversal9) {
                                        out.write("\r\n            <a");
                                        {
                                            Object var_attrvalue10 = renderContext.getObjectModel().resolveProperty(item, "link");
                                            {
                                                Object var_attrcontent11 = renderContext.call("xss", var_attrvalue10, "uri");
                                                {
                                                    boolean var_shoulddisplayattr13 = (((null != var_attrcontent11) && (!"".equals(var_attrcontent11))) && ((!"".equals(var_attrvalue10)) && (!((Object)false).equals(var_attrvalue10))));
                                                    if (var_shoulddisplayattr13) {
                                                        out.write(" href");
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
                                        out.write(">");
                                        {
                                            Object var_14 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(item, "text"), "text");
                                            out.write(renderContext.getObjectModel().toString(var_14));
                                        }
                                        out.write("</a>\r\n          ");
                                    }
                                }
                                var_index7++;
                            }
                            out.write("</div>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar0_list_coerced$ = null;
}
out.write("\r\n          <div class=\"cmp-maincontainer__right\">\r\n                <a href=\"#\"><img src=\"https://i.pinimg.com/736x/ea/b4/70/eab4700ec044e504ef73c3a6eb6b03e6.jpg\" alt=\"E commerece RTE\" id=\"web-rtc\"/> </a>\r\n                <span class=\"vertical-line\"></span>\r\n                <a href=\"#\"><img src=\"https://cdn.onlinewebfonts.com/svg/img_588.png\" alt=\"Search\" id=\"web-search\"/> </a>\r\n                <span class=\"vertical-line\"></span>\r\n                <a href=\"#\"><img src=\"https://cdn3.iconfinder.com/data/icons/flat-and-simple-vol-3/512/9_List_menu-512.png\" alt=\"Menu\" id=\"menu\"/> </a>\r\n                \r\n                \r\n          </div>\r\n      </div>\r\n      </header>\r\n\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

