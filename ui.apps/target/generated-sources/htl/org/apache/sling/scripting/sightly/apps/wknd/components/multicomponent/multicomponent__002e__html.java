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
package org.apache.sling.scripting.sightly.apps.wknd.components.multicomponent;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class multicomponent__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_model = null;
Object _global_templates = null;
Collection var_collectionvar6_list_coerced$ = null;
Object _dynamic_properties = bindings.get("properties");
_global_model = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.MultiComponent.class.getName(), obj());
_global_templates = renderContext.call("use", "core/wcm/components/commons/v1/templates.html", obj());
out.write("\r\n  ");
{
    boolean var_testvariable0 = (!renderContext.getObjectModel().toBoolean(renderContext.getObjectModel().resolveProperty(_global_model, "empty")));
    if (var_testvariable0) {
        out.write("\r\n    alignChildren:\r\n    <div class=\"cmp-readfieldfrompage__alignChildren\">");
        {
            String var_1 = (("\r\n      " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "alignChildren"), "text"))) + "\r\n    ");
            out.write(renderContext.getObjectModel().toString(var_1));
        }
        out.write("</div>\r\n    fruitType:\r\n    <div class=\"cmp-readfieldfrompage__fruitType\">");
        {
            Object var_2 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "fruitType"), "text");
            out.write(renderContext.getObjectModel().toString(var_2));
        }
        out.write("</div>\r\n    columnLast:\r\n    <div class=\"cmp-readfieldfrompage__columnLast\">");
        {
            Object var_3 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "columnLast"), "text");
            out.write(renderContext.getObjectModel().toString(var_3));
        }
        out.write("</div>\r\n    hideMismatches:\r\n    <div class=\"cmp-readfieldfrompage__fhideMismatches\">");
        {
            String var_4 = (("\r\n      " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "hideMismatches"), "text"))) + "\r\n    ");
            out.write(renderContext.getObjectModel().toString(var_4));
        }
        out.write("</div>\r\n    backgroundColor:\r\n    <div class=\"cmp-readfieldfrompage__backgroundColor\"");
        {
            String var_attrcontent5 = (("background-color:" + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "backgroundColor"), "html"))) + " ");
            out.write(" style=\"");
            out.write(renderContext.getObjectModel().toString(var_attrcontent5));
            out.write("\"");
        }
        out.write(">\r\n      bbbbbb\r\n    </div>\r\n    headlines:\r\n    ");
        {
            Object var_collectionvar6 = renderContext.getObjectModel().resolveProperty(_global_model, "headlines");
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
                                    if (var_collectionvar6_list_coerced$ == null) {
                                        var_collectionvar6_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar6);
                                    }
                                    long var_index13 = 0;
                                    for (Object item : var_collectionvar6_list_coerced$) {
                                        {
                                            boolean var_traversal15 = (((var_index13 >= 0) && (var_index13 <= var_end11)) && true);
                                            if (var_traversal15) {
                                                out.write("<div>");
                                                {
                                                    String var_16 = (("\r\n      " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "headlines"), "html"))) + "\r\n    ");
                                                    out.write(renderContext.getObjectModel().toString(var_16));
                                                }
                                                out.write("</div>\n");
                                            }
                                        }
                                        var_index13++;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            var_collectionvar6_list_coerced$ = null;
        }
        out.write("\r\n    columnWidth:\r\n    <div class=\"cmp-readfieldfrompage__columnWidth\">");
        {
            Object var_17 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_model, "columnWidth"), "text");
            out.write(renderContext.getObjectModel().toString(var_17));
        }
        out.write("</div>\r\n    coralcolumnWidth:\r\n    <div class=\"cmp-readfieldfrompage__columnWidth\">");
        {
            String var_18 = (("\r\n      " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "coralcolumnWidth"), "text"))) + "\r\n    ");
            out.write(renderContext.getObjectModel().toString(var_18));
        }
        out.write("</div>\r\n    buttonPath:\r\n    <div class=\"cmp-readfieldfrompage__buttonPath\">");
        {
            String var_19 = (("\r\n      " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "buttonPath"), "text"))) + "\r\n    ");
            out.write(renderContext.getObjectModel().toString(var_19));
        }
        out.write("</div>\r\n    buttonPathCoral:\r\n    <div class=\"cmp-readfieldfrompage__buttonPath\">");
        {
            String var_20 = (("\r\n      " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "buttonPathCoral"), "text"))) + "\r\n    ");
            out.write(renderContext.getObjectModel().toString(var_20));
        }
        out.write("</div>\r\n\r\n    longDescriptionText:\r\n    <div class=\"cmp-readfieldfrompage__longDescriptionText\">");
        {
            String var_21 = (("\r\n      " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "longDescriptionText"), "text"))) + "\r\n    ");
            out.write(renderContext.getObjectModel().toString(var_21));
        }
        out.write("</div>\r\n\r\n    linkColor:\r\n    <div class=\"cmp-readfieldfrompage__linkColor\">");
        {
            Object var_22 = renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "linkColor"), "text");
            out.write(renderContext.getObjectModel().toString(var_22));
        }
        out.write("</div>\r\n    linkColorCoral:\r\n    <div class=\"cmp-readfieldfrompage__linkColorCoral\">");
        {
            String var_23 = (("\r\n      " + renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_dynamic_properties, "linkColorCoral"), "text"))) + "\r\n    ");
            out.write(renderContext.getObjectModel().toString(var_23));
        }
        out.write("</div>\r\n  ");
    }
}
out.write("\r\n\r\n");
{
    Object var_templatevar24 = renderContext.getObjectModel().resolveProperty(_global_templates, "placeholder");
    {
        Object var_templateoptions25_field$_isempty = renderContext.getObjectModel().resolveProperty(_global_model, "empty");
        {
            java.util.Map var_templateoptions25 = obj().with("isEmpty", var_templateoptions25_field$_isempty);
            callUnit(out, renderContext, var_templatevar24, var_templateoptions25);
        }
    }
}
out.write("\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

