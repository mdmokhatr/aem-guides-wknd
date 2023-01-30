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
package org.apache.sling.scripting.sightly.apps.wknd.components.textimage;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class textimage__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _global_placeholdertemplate = null;
Object _dynamic_templates = bindings.get("templates");
_global_model = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.TextImage.class.getName(), obj());
_global_placeholdertemplate = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
{
    boolean var_testvariable0 = (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_model, "empty")));
    if (var_testvariable0) {
        out.write("\r\n   <div class=\"cmp-text_name\">");
        {
            Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "name"), "html");
            out.write(renderContext.getObjectModel().toString(var_1));
        }
        out.write("</div>\r\n   <div class=\"cmp-text_occupations\">");
        {
            Object var_2 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "occupations"), "html");
            out.write(renderContext.getObjectModel().toString(var_2));
        }
        out.write("</div>\r\n   <div class=\"cmp-text_occupations\">");
        {
            Object var_3 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "headlines"), "html");
            out.write(renderContext.getObjectModel().toString(var_3));
        }
        out.write("</div>\r\n   ");
    }
}
out.write("\r\n   \r\n\r\n   ");
{
    Object var_templatevar4 = renderContext.getObjectModel().resolveProperty(_dynamic_templates, "placeholder");
    {
        Object var_templateoptions5_field$_isempty = renderContext.getObjectModel().resolveProperty(_global_model, "empty");
        {
            java.util.Map var_templateoptions5 = obj().with("isEmpty", var_templateoptions5_field$_isempty);
            callUnit(out, renderContext, var_templatevar4, var_templateoptions5);
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

