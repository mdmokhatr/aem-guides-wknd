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
package org.apache.sling.scripting.sightly.apps.wknd.components.studentcard;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class studentcard__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _global_placeholdertemplate = null;
_global_model = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.StudentCard.class.getName(), obj());
_global_placeholdertemplate = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
{
    boolean var_testvariable0 = (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_model, "empty")));
    if (var_testvariable0) {
        out.write("\r\n  \r\n   <div class=\"cmp-student\">\r\n   <div class=\"cmp-student_fname\">");
        {
            Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "FirstName"), "html");
            out.write(renderContext.getObjectModel().toString(var_1));
        }
        out.write("</div>\r\n   <div class=\"cmp-student_lname\">");
        {
            Object var_2 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "LastName"), "html");
            out.write(renderContext.getObjectModel().toString(var_2));
        }
        out.write("</div>\r\n   <div class=\"cmp-student_address\">");
        {
            Object var_3 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "Address"), "html");
            out.write(renderContext.getObjectModel().toString(var_3));
        }
        out.write("</div>\r\n\r\n   <div class=\"cmp-student_email\">");
        {
            Object var_4 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "Email"), "html");
            out.write(renderContext.getObjectModel().toString(var_4));
        }
        out.write("</div>\r\n   <img");
        {
            Object var_attrvalue5 = renderContext.getObjectModel().resolveProperty(_global_model, "Image");
            {
                Object var_attrcontent6 = renderContext.call("xss", var_attrvalue5, "uri");
                {
                    boolean var_shoulddisplayattr8 = (((null != var_attrcontent6) && (!"".equals(var_attrcontent6))) && ((!"".equals(var_attrvalue5)) && (!((Object)false).equals(var_attrvalue5))));
                    if (var_shoulddisplayattr8) {
                        out.write(" src");
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
        out.write("/>\r\n   </div>\r\n   \r\n   ");
    }
}
out.write("\r\n   \r\n\r\n   ");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

