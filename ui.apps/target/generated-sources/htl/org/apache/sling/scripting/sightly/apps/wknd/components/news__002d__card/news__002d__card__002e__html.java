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
package org.apache.sling.scripting.sightly.apps.wknd.components.news__002d__card;

import java.io.PrintWriter;
import java.util.Collection;
import javax.script.Bindings;

import org.apache.sling.scripting.sightly.render.RenderUnit;
import org.apache.sling.scripting.sightly.render.RenderContext;

public final class news__002d__card__002e__html extends RenderUnit {

    @Override
    protected final void render(PrintWriter out,
                                Bindings bindings,
                                Bindings arguments,
                                RenderContext renderContext) {
// Main Template Body -----------------------------------------------------------------------------

out.write("<!DOCTYPE html>\r\n<html lang=\"en\">\r\n<head>\r\n    <meta charset=\"UTF-8\"/>\r\n    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"/>\r\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"/>\r\n    <title>Document</title>\r\n</head>\r\n<body>\r\n\r\n    <a href=\"#\">\r\n        <div class=\"cmp-card\">\r\n            <div class=\"cmp-card__image\">\r\n                <img src=\"\" alt=\"\"/>\r\n            </div>\r\n            \r\n            <div class=\"cmp-card__details\">\r\n                <div class=\"cmp-card__details-article-type\"> News </div>\r\n                <div class=\"cmp-card__details-date\"> \r\n                    Wednesday, March 24, 2021 \r\n                </div>\r\n                <p class=\"cmp-card__details-description\"> Garden of Life, a Nestle Health Science Brand Teams up With Rightpoint to Redefine Direct-to-Consumer Digital Commerce </p>\r\n            </div>\r\n\r\n        </div>\r\n    </a>\r\n    \r\n</body>\r\n</html>");


// End Of Main Template Body ----------------------------------------------------------------------
    }



    {
//Sub-Templates Initialization --------------------------------------------------------------------



//End of Sub-Templates Initialization -------------------------------------------------------------
    }

}

