package com.naat.legacy.plugin.wrapper;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class LegacyPlugin extends CordovaPlugin {

    private int REQUEST_CODE = 9552;
    private CallbackContext callbackContext;

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        this.callbackContext = callbackContext;
        if (action.equals("initProcess")) {
            this.initProcess(args.getString(0), callbackContext);
            return true;
        }
        return false;
    }

    private void initProcess(String string, CallbackContext callbackContext) {

    }


}
