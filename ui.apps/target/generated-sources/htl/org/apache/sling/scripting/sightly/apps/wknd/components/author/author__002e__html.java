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
package org.apache.sling.scripting.sightly.apps.wknd.components.author;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class author__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_author = null;
out.write("\n<h1>Author  Detail </h1>\n");
_global_author = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.Author.class.getName(), obj());
out.write("<div></div>\n\n        <div>");
{
    String var_0 = ("First Name : " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_author, "firstName"), "text")));
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</div>\n        <div>");
{
    String var_1 = ("Last Name : " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_author, "lastName"), "text")));
    out.write(renderContext.getObjectModel().toString(var_1));
}
out.write("</div>\n        <div>");
{
    String var_2 = ("Is Professor : " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_author, "isProfessor"), "text")));
    out.write(renderContext.getObjectModel().toString(var_2));
}
out.write("</div>\n        <div>");
{
    String var_3 = ("Page Title : " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_author, "pageTitle"), "text")));
    out.write(renderContext.getObjectModel().toString(var_3));
}
out.write("</div>\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

