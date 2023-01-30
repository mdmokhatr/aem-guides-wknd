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
package org.apache.sling.scripting.sightly.apps.wknd.components.userdata;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class userdata__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _global_templates = null;
out.write("\r\n    ");
_global_model = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.UserData.class.getName(), obj());
_global_templates = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
out.write("<div class=\"cmp-userdata\" data-cmp-is=\"userdata\">\r\n        ");
{
    boolean var_testvariable0 = (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_model, "isEmpty")));
    if (var_testvariable0) {
        out.write("\r\n\r\n            <div class=\"cmp-formcontainer\">\r\n                <form");
        {
            Object var_attrvalue1 = renderContext.getObjectModel().resolveProperty(_global_model, "Path");
            {
                Object var_attrcontent2 = renderContext.call("xss", var_attrvalue1, "uri");
                {
                    boolean var_shoulddisplayattr4 = (((null != var_attrcontent2) && (!"".equals(var_attrcontent2))) && ((!"".equals(var_attrvalue1)) && (!((Object)false).equals(var_attrvalue1))));
                    if (var_shoulddisplayattr4) {
                        out.write(" action");
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
        out.write(" method=\"get\">\r\n                    <label for=\"fname\">First name:</label><br/>\r\n                    <input type=\"text\" id=\"fname\" name=\"fname\" value=\"John\"/><br/>\r\n                    <label for=\"lname\">Last name:</label><br/>\r\n                    <input type=\"text\" id=\"lname\" name=\"lname\" value=\"Doe\"/><br/><br/>\r\n                    <label for=\"Password\">Password:</label><br/>\r\n                    <input type=\"password\" id=\"password\" name=\"password\"/><br/>\r\n                    <label for=\"Confirm Password\">Confirm Password:</label><br/>\r\n                    <input type=\"password\" id=\"confpassword\" name=\"confpassword\"/><br/><br/>\r\n\r\n                    <input type=\"submit\" value=\"Submit\"/>\r\n                </form>\r\n            </div>\r\n        ");
    }
}
out.write("\r\n    </div>\r\n\r\n");
{
    Object var_templatevar5 = renderContext.getObjectModel().resolveProperty(_global_templates, "placeholder");
    {
        Object var_templateoptions6_field$_isempty = renderContext.getObjectModel().resolveProperty(_global_model, "isEmpty");
        {
            java.util.Map var_templateoptions6 = obj().with("isEmpty", var_templateoptions6_field$_isempty);
            callUnit(out, renderContext, var_templatevar5, var_templateoptions6);
        }
    }
}


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

