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
package org.apache.sling.scripting.sightly.apps.wknd.components.studentdetails;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class studentdetails__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
_global_model = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.StudentDetails.class.getName(), obj());
out.write("<div>\r\n    <h1>Student Details</h1>\r\n    <h3 class=\"name\">");
{
    String var_0 = (" Name :" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "name"), "text")));
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</h3>\r\n    <h4 class=\"rollno\">");
{
    String var_1 = (" Roll-No:" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "rollno"), "text")));
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</h4>\r\n    <h5 class=\"section\">");
{
    String var_2 = ("Section:" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "section"), "text")));
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("</h5>\r\n    <h6 class=\"course\">");
{
    String var_3 = ("Course :" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "course"), "text")));
    out.write(renderContext.getObjectModel().toString(var_3));
}
out.write("</h6>\r\n    <h4 class=\"contact\">");
{
    String var_4 = ("Contact: " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "contact"), "text")));
    out.write(renderContext.getObjectModel().toString(var_4));
}
out.write("</h4>\r\n    \r\n\r\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

