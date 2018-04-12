package org.bdshadow.gwt.arjs4j.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

/**
 * @author Dmitrii Bocharov <bdshadow@gmail.com>
 */
public interface ArJsTextResource extends ClientBundle{

    ArJsTextResource IMPL = GWT.create(ArJsTextResource.class);


    @Source("js/aframe-ar.js")
    TextResource getArJs();

    @Source("js/aframe-ar.min.js")
    TextResource getArJsSMin();
}
