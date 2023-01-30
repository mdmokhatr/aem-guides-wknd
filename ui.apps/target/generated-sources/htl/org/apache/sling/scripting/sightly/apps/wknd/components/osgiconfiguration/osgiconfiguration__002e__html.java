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
package org.apache.sling.scripting.sightly.apps.wknd.components.osgiconfiguration;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class osgiconfiguration__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
out.write("<h1> OSGI CONFIGURATION </h1>\r\n");
_global_model = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.OsgiConfiguration.class.getName(), obj());
out.write("<div>\r\n    <div>\r\n        <h1>");
{
    Object var_0 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "serviceName"), "text");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</h1>\r\n        <h1>");
{
    Object var_1 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "serviceCount"), "text");
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</h1>\r\n        <h1>");
{
    Object var_2 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "isLiveData"), "text");
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("</h1>\r\n        <h1>");
{
    Object var_3 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "countries"), "text");
    out.write(renderContext.getObjectModel().toString(var_3));
}
out.write("</h1>\r\n        <h1>");
{
    Object var_4 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "runModes"), "text");
    out.write(renderContext.getObjectModel().toString(var_4));
}
out.write("</h1>\r\n    </div>\r\n    ");
{
    String var_5 = (("<!-- <h1>Details :" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "randomActivity"), "comment"))) + "</h1> -->");
    out.write(renderContext.getObjectModel().toString(var_5));
}
out.write("\r\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

