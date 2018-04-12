package org.bdshadow.gwt.arjs4j;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.ScriptInjector;
import org.bdshadow.gwt.arjs4j.resources.ArJsTextResource;

/**
 * @author Dmitrii Bocharov <bdshadow@gmail.com>
 */
public class Arjs implements EntryPoint {

    @Override
    public void onModuleLoad() {
        loadThreeJS();
    }

    public static void loadThreeJS(){
        load("three.js");
    }

    public static void loadThreeJSMin(){
        load("three.min.js");
    }

    private static void load(String scriptName) {
        ScriptInjector.fromString(ArJsTextResource.IMPL.getArJs().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

    }

}
