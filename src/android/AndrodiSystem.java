package com.sectionpi.system;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult.Status;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.inputmethod.InputMethodManager;

public class AndroidSystem extends CordovaPlugin{
	@Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);

		
    }
	
	@Override
    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
         
		 if ("alert".equals(action)) {
            
			
            callbackContext.success();
            return true;
        }
		
		
        return false;  // Returning false results in a "MethodNotFound" error.
    }


}

