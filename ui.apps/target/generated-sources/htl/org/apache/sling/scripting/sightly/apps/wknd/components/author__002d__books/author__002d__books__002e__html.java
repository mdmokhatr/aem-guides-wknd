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
package org.apache.sling.scripting.sightly.apps.wknd.components.author__002d__books;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class author__002d__books__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _global_books = null;
Collection var_collectionvar1_list_coerced$ = null;
_global_books = renderContext.call("use", com.adobe.aem.guides.wknd.core.models.AuthorBooks.class.getName(), obj());
out.write("<div>\r\n    <h1>");
{
    String var_0 = (renderContext.getObjectModel().toString(renderContext.call("xss", renderContext.getObjectModel().resolveProperty(_global_books, "authorName"), "text")) + " Books");
    out.write(renderContext.getObjectModel().toString(var_0));
}
out.write("</h1>\r\n==========Multifield with single field=========================\r\n");
{
    Object var_collectionvar1 = renderContext.getObjectModel().resolveProperty(_global_books, "authorBooks");
    {
        long var_size2 = ((var_collectionvar1_list_coerced$ == null ? (var_collectionvar1_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar1)) : var_collectionvar1_list_coerced$).size());
        {
            boolean var_notempty3 = (var_size2 > 0);
            if (var_notempty3) {
                {
                    long var_end6 = var_size2;
                    {
                        boolean var_validstartstepend7 = (((0 < var_size2) && true) && (var_end6 > 0));
                        if (var_validstartstepend7) {
                            out.write("<div>");
                            if (var_collectionvar1_list_coerced$ == null) {
                                var_collectionvar1_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar1);
                            }
                            long var_index8 = 0;
                            for (Object item : var_collectionvar1_list_coerced$) {
                                {
                                    long itemlist_field$_count = (renderContext.getObjectModel().toNumber(org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.ADD.eval(var_index8, 1)).longValue());
                                    {
                                        boolean var_traversal10 = (((var_index8 >= 0) && (var_index8 <= var_end6)) && true);
                                        if (var_traversal10) {
                                            {
                                                String var_11 = (("\r\n    ---------------Book : " + renderContext.getObjectModel().toString(renderContext.call("xss", itemlist_field$_count, "text"))) + "---------------\r\n");
                                                out.write(renderContext.getObjectModel().toString(var_11));
                                            }
                                            out.write("<p>Book : <b>");
                                            {
                                                Object var_12 = renderContext.call("xss", item, "text");
                                                out.write(renderContext.getObjectModel().toString(var_12));
                                            }
                                            out.write("</b></p>\r\n\r\n");
                                        }
                                    }
                                }
                                var_index8++;
                            }
                            out.write("</div>");
                        }
                    }
                }
            }
        }
    }
    var_collectionvar1_list_coerced$ = null;
}
out.write("\r\n   <p>All Book: <b>");
{
    Object var_13 = renderContext.call("xss", renderContext.call("join", renderContext.getObjectModel().resolveProperty(_global_books, "authorBooks"), ", "), "text");
    out.write(renderContext.getObjectModel().toString(var_13));
}
out.write("</b></p>\r\n\r\n</div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

