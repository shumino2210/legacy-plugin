package com.naat.legacy;

import android.content.Intent;
import android.util.Base64;

import com.google.gson.Gson;
import com.naat.fad.demo.ui.activities.FADModuleSignActivity;
import com.naat.fad.demo.utils.FADConstants;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

/**
 * This class echoes a string called from JavaScript.
 */
public class LegacyPlugin extends CordovaPlugin {

    private int REQUEST_CODE = 9552;
    private CallbackContext callbackContext;

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        this.callbackContext = callbackContext;
        if (action.equals("invokeFAD")) {
            this.initProcess(args.getString(0), callbackContext);
            return true;
        } else if (action.equals("getIdRequisitionFAD")) {
            this.getIdReqMethod(callbackContext);
        }
        return false;
    }

    private void getIdReqMethod( CallbackContext callbackContext) {

        try {
            FADConstants fadConstants = FADConstants.getInstance();
            String reqId =fadConstants.getIdRequisition();
            callbackContext.success(reqId);

        }
        catch(Exception exc) {
            callbackContext.error("ERROR: Error inicialización FAD: " + exc.getMessage());
        }


    }

    private void initProcess(String string, CallbackContext callbackContext) {
        Gson gson = new Gson();
        com.naat.legacy.wrapper.FadLegacyConfigWrapper fadLegacyConfigWrapper = gson.fromJson(string, com.naat.legacy.wrapper.FadLegacyConfigWrapper.class);

        FADConstants fadConstants = FADConstants.getInstance();


        fadConstants.setEndpoint_services(fadLegacyConfigWrapper.getEndpoint_services());

        fadConstants.setTimeout_request(fadLegacyConfigWrapper.getTimeout_request());

        fadConstants.setAvailable_free_ram(fadLegacyConfigWrapper.getAvailable_free_ram());

        fadConstants.setAvailable_free_space(fadLegacyConfigWrapper.getAvailable_free_space());

        fadConstants.setSOCracked(fadLegacyConfigWrapper.isSOCracked());

        fadConstants.setLoadVerificationModule(false);

        fadConstants.setLoadSignModule(fadLegacyConfigWrapper.isLoadSignModule());

        fadConstants.setSaveProcess(fadLegacyConfigWrapper.isSaveProcess());

        fadConstants.setReadINE(fadLegacyConfigWrapper.isReadINE());

        fadConstants.setReadPassport(fadLegacyConfigWrapper.isReadPassport());

        fadConstants.setProofLifeSelfie(fadLegacyConfigWrapper.isProofLifeSelfie());

        fadConstants.setProofOfAddress(fadLegacyConfigWrapper.isProofOfAddress());

        fadConstants.setLoadCurrentProcess(fadLegacyConfigWrapper.isLoadCurrentProcess());

        fadConstants.setRemoveSavedData(fadLegacyConfigWrapper.isRemoveSavedData());

        if (fadLegacyConfigWrapper.getImgCompany() != null && !fadLegacyConfigWrapper.getImgCompany().isEmpty()){
            fadConstants.setImgCompany(Base64.decode(fadLegacyConfigWrapper.getImgCompany(), Base64.DEFAULT));
        }

        if (fadLegacyConfigWrapper.getPdfData() != null && !fadLegacyConfigWrapper.getPdfData().isEmpty()){
            fadConstants.setPdfData(Base64.decode(fadLegacyConfigWrapper.getPdfData(), Base64.DEFAULT));
        }

        if (fadLegacyConfigWrapper.getXmlData() != null && !fadLegacyConfigWrapper.getXmlData().isEmpty()){
            fadConstants.setXmlData(Base64.decode(fadLegacyConfigWrapper.getXmlData(), Base64.DEFAULT));
        }


        fadConstants.setUrlGetKeys((fadLegacyConfigWrapper.getUrlGetKeys().isEmpty())?"cub/getKeys" : fadLegacyConfigWrapper.getUrlGetKeys());

        cordova.getActivity().startActivityForResult(new Intent(cordova.getActivity(), FADModuleSignActivity.class), REQUEST_CODE);
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String idRequisition;
        idRequisition = FADConstants.getInstance().getIdRequisition();
        if(resultCode == FADConstants.STATUS_OK){
            callbackContext.success("SUCCESS");
        }else{
            callbackContext.success("CANCEL");
        }
    }
}
