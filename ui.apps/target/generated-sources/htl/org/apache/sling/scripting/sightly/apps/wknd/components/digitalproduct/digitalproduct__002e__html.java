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
package org.apache.sling.scripting.sightly.apps.wknd.components.digitalproduct;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class digitalproduct__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

Object _dynamic_properties = bindings.get("properties");
out.write("<div class=\"cmp-digitalproduct\">\r\n\r\n    <div class=\"cmp-digitalproduct__leftcard\">\r\n      <div class=\"cmp-digitalproduct__leftcard-image\">\r\n        <a href=\"#\"> <img");
{
    Object var_attrvalue0 = renderContext.getObjectModel().resolveProperty(_dynamic_properties, "hbgfileReference");
    {
        Object var_attrcontent1 = renderContext.call("xss", var_attrvalue0, "uri");
        {
            boolean var_shoulddisplayattr3 = (((null != var_attrcontent1) && (!"".equals(var_attrcontent1))) && ((!"".equals(var_attrvalue0)) && (!((Object)false).equals(var_attrvalue0))));
            if (var_shoulddisplayattr3) {
                out.write(" src");
                {
                    boolean var_istrueattr2 = (var_attrvalue0.equals(true));
                    if (!var_istrueattr2) {
                        out.write("=\"");
                        out.write(renderContext.getObjectModel().toString(var_attrcontent1));
                        out.write("\"");
                    }
                }
            }
        }
    }
}
out.write(" alt=\"image\" width=\"100%\" height=\"100%\"/> </a>\r\n\r\n      </div>\r\n      <p>Customer Experience /\r\n        Digital Product /\r\n        Transportation</p>\r\n      <a href=\"#\">\r\n        <p class=\"cmp-digitalproduct__leftcard-title\"> <span style=\"color: black;\" class=\"cmp-digitalproduct__leftcard-title--black\"> The Electric Truck Revolution\r\n            Starts Inside </span>\r\n          <span class=\"cmp-digitalproduct__leftcard-title--grey\">Designing the In-Vehicle Experience for the First Electric Chevrolet Silverado </span>\r\n        </p>\r\n      </a>\r\n    </div>\r\n\r\n    <div class=\"cmp-digitalproduct__rightcard\">\r\n      <div class=\"cmp-digitalproduct__rightcard-image\">\r\n        <a href=\"#\"> <img src=\"https://www.rightpoint.com/-/media/banner-oasis_1800x670.jpg?sc=1\" alt=\"image\" width=\"100%\" height=\"100%\"/> </a>\r\n\r\n      </div>\r\n      <p> Digital Product</p>\r\n      <a href=\"#\" class=\"cmp-digitalproduct__rightcard-link\">\r\n        <p class=\"cmp-digitalproduct__leftcard-title\"> <span style=\"color: black;\" class=\"cmp-digitalproduct__leftcard-title--black\"> Genpact Oasis </span>\r\n          <span class=\"cmp-digitalproduct__leftcard-title--grey\">Virtual Meetings Through Immersive Environments </span></p>\r\n      </a>\r\n\r\n    </div>\r\n\r\n  </div>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

