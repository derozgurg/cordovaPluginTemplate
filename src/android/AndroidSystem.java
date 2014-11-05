package com.sectionpi.system;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.apache.cordova.PluginResult.Status;
import org.json.JSONArray;
import org.json.JSONException;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.inputmethod.InputMethodManager;

public class AndroidSystem extends CordovaPlugin{
	

	@Override
    public void initialize(CordovaInterface cordova, CordovaWebView webView) {
        super.initialize(cordova, webView);		
        this.webView = webView;
    }
	
	@Override
    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
         
		 if ("alert".equals(action)) 
		 {          
			 showAler(args.getString(0),callbackContext);
			
            
            return true;
        }		
		
        return false;  // Returning false results in a "MethodNotFound" error.
    }
	
	public void showAler(final String text, final CallbackContext callbackContext)
	{
		final CordovaInterface cordova = this.cordova;
		
	     Runnable runnable = new Runnable() {
	       
	    	 @Override
	    	 public void run() {
	        	
				AlertDialog.Builder alert = new AlertDialog.Builder(cordova.getActivity())				
			   .setTitle("Delete entry")
			   .setMessage(text)
			   .setPositiveButton("Tamam",
					   new AlertDialog.OnClickListener() {
				   			public void onClick(DialogInterface dialog, int which) {
		               dialog.dismiss();
		               callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, 0));
		           }
		       });
				
			 alert.show();
	        }
	     };
	     
	     this.cordova.getActivity().runOnUiThread(runnable);
		
	}
}