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
package org.apache.sling.scripting.sightly.apps.wknd.components.hero__002d__carousel;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class hero__002d__carousel__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_resource = bindings.get("resource");
Collection var_collectionvar0_list_coerced$ = null;
Collection var_collectionvar11_list_coerced$ = null;
out.write("<section class=\"hero-carousel\">\r\n  <div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-bs-touch=\"true\" data-bs-ride=\"carousel\" data-interval=\"3000\">\r\n    <div class=\"carousel-inner\">\r\n    ");
{
    Object var_collectionvar0 = renderContext.getObjectModel().resolveProperty(_dynamic_resource, "getChildren");
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
                            if (var_collectionvar0_list_coerced$ == null) {
                                var_collectionvar0_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar0);
                            }
                            long var_index7 = 0;
                            for (Object carousalimages : var_collectionvar0_list_coerced$) {
                                {
                                    boolean var_traversal9 = (((var_index7 >= 0) && (var_index7 <= var_end5)) && true);
                                    if (var_traversal9) {
                                        out.write("\r\n        ");
                                        {
                                            boolean var_testvariable10 = (org.apache.sling.scripting.sightly.compiler.expression.nodes.BinaryOperator.strictEq(renderContext.getObjectModel().resolveProperty(carousalimages, "name"), "herocarousal"));
                                            if (var_testvariable10) {
                                                out.write("\r\n         ");
                                                {
                                                    Object var_collectionvar11 = renderContext.getObjectModel().resolveProperty(carousalimages, "getChildren");
                                                    {
                                                        long var_size12 = ((var_collectionvar11_list_coerced$ == null ? (var_collectionvar11_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar11)) : var_collectionvar11_list_coerced$).size());
                                                        {
                                                            boolean var_notempty13 = (var_size12 > 0);
                                                            if (var_notempty13) {
                                                                {
                                                                    long var_end16 = var_size12;
                                                                    {
                                                                        boolean var_validstartstepend17 = (((0 < var_size12) && true) && (var_end16 > 0));
                                                                        if (var_validstartstepend17) {
                                                                            if (var_collectionvar11_list_coerced$ == null) {
                                                                                var_collectionvar11_list_coerced$ = renderContext.getObjectModel().toCollection(var_collectionvar11);
                                                                            }
                                                                            long var_index18 = 0;
                                                                            for (Object herocarousal : var_collectionvar11_list_coerced$) {
                                                                                {
                                                                                    boolean var_traversal20 = (((var_index18 >= 0) && (var_index18 <= var_end16)) && true);
                                                                                    if (var_traversal20) {
                                                                                        out.write("\r\n      <div class=\"carousel-item active\">\r\n      \r\n        <picture>\r\n          <source");
                                                                                        {
                                                                                            Object var_attrvalue21 = renderContext.getObjectModel().resolveProperty(herocarousal, "images");
                                                                                            {
                                                                                                Object var_attrcontent22 = renderContext.call("xss", var_attrvalue21, "attribute");
                                                                                                {
                                                                                                    boolean var_shoulddisplayattr24 = (((null != var_attrcontent22) && (!"".equals(var_attrcontent22))) && ((!"".equals(var_attrvalue21)) && (!((Object)false).equals(var_attrvalue21))));
                                                                                                    if (var_shoulddisplayattr24) {
                                                                                                        out.write(" srcset");
                                                                                                        {
                                                                                                            boolean var_istrueattr23 = (var_attrvalue21.equals(true));
                                                                                                            if (!var_istrueattr23) {
                                                                                                                out.write("=\"");
                                                                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent22));
                                                                                                                out.write("\"");
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        out.write(" media=\"(max-width: 600px)\"/>\r\n          <img");
                                                                                        {
                                                                                            Object var_attrvalue25 = renderContext.getObjectModel().resolveProperty(herocarousal, "images");
                                                                                            {
                                                                                                Object var_attrcontent26 = renderContext.call("xss", var_attrvalue25, "uri");
                                                                                                {
                                                                                                    boolean var_shoulddisplayattr28 = (((null != var_attrcontent26) && (!"".equals(var_attrcontent26))) && ((!"".equals(var_attrvalue25)) && (!((Object)false).equals(var_attrvalue25))));
                                                                                                    if (var_shoulddisplayattr28) {
                                                                                                        out.write(" src");
                                                                                                        {
                                                                                                            boolean var_istrueattr27 = (var_attrvalue25.equals(true));
                                                                                                            if (!var_istrueattr27) {
                                                                                                                out.write("=\"");
                                                                                                                out.write(renderContext.getObjectModel().toString(var_attrcontent26));
                                                                                                                out.write("\"");
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        out.write("/>\r\n        </picture>\r\n\r\n        <div class=\"col-md-6 align-items-center\">\r\n          <div class=\"hero-content\">\r\n            <a class=\"btn-link btn-border-round btn-clr-blue\" href=\"JavaScript:void(0);\">\r\n            </a>\r\n          </div>\r\n          </div>\r\n        </div>\r\n        ");
                                                                                    }
                                                                                }
                                                                                var_index18++;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    var_collectionvar11_list_coerced$ = null;
                                                }
                                            }
                                        }
                                    }
                                }
                                var_index7++;
                            }
                        }
                    }
                }
            }
        }
    }
    var_collectionvar0_list_coerced$ = null;
}
out.write("</div>\r\n        \r\n        \r\n        \r\n     \r\n    </div>\r\n    <div class=\"carousel-indicators\">\r\n      <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"0\" class=\"active\" aria-current=\"true\" aria-label=\"Slide 1\"></button>\r\n      <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"1\" aria-label=\"Slide 2\"></button>\r\n      <button type=\"button\" data-bs-target=\"#carouselExampleIndicators\" data-bs-slide-to=\"2\" aria-label=\"Slide 3\"></button>\r\n    </div>\r\n    <button class=\"carousel-control-prev\" data-bs-target=\"#carouselExampleIndicators\" type=\"button\" data-bs-slide=\"prev\">\r\n      <span class=\"fa fa-angle-left\" aria-hidden=\"true\"></span>\r\n      <span class=\"sr-only\">Previous</span>\r\n    </button>\r\n    <button class=\"carousel-control-next\" data-bs-target=\"#carouselExampleIndicators\" type=\"button\" data-bs-slide=\"next\">\r\n      <span class=\"fa fa-angle-right\" aria-hidden=\"true\"></span>\r\n      <span class=\"sr-only\">Next</span>\r\n    </button>\r\n  </div>\r\n</section>\r\n");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

