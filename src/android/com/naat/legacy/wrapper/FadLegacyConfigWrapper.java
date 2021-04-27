package com.naat.legacy.wrapper;

import com.google.gson.annotations.SerializedName;

public class FadLegacyConfigWrapper{

    @SerializedName("endpoint_services")
    private String endpoint_services;
    @SerializedName("timeout_request")
    private int timeout_request;
    @SerializedName("available_free_space")
    private int available_free_space;
    @SerializedName("available_free_ram")
    private int available_free_ram;
    @SerializedName("so_cracked")
    private boolean isSOCracked;
    @SerializedName("load_verificationModule")
    private boolean isLoadVerificationModule;
    @SerializedName("load_sign_module")
    private boolean isLoadSignModule;
    @SerializedName("save_process")
    private boolean isSaveProcess;
    @SerializedName("readINE")
    private boolean isReadINE;
    @SerializedName("readPassport")
    private boolean isReadPassport;
    @SerializedName("proofOfAddress")
    private boolean isProofOfAddress;
    @SerializedName("proofLifeSelfie")
    private boolean isProofLifeSelfie;
    @SerializedName("timeToTakeSelfie")
    private int timeToTakeSelfie;
    @SerializedName("loadCurrentProcess")
    private boolean isLoadCurrentProcess;
    @SerializedName("removeSavedData")
    private boolean isRemoveSavedData;
    @SerializedName("dataImgCompany")
    private String imgCompany;
    @SerializedName("dataPDF")
    private String pdfData;
    @SerializedName("dataXml")
    private String xmlData;
    @SerializedName("")
    private String urlGetKeys;

    public String getEndpoint_services() {
        return endpoint_services;
    }

    public void setEndpoint_services(String endpoint_services) {
        this.endpoint_services = endpoint_services;
    }

    public int getTimeout_request() {
        return timeout_request;
    }

    public void setTimeout_request(int timeout_request) {
        this.timeout_request = timeout_request;
    }

    public int getAvailable_free_space() {
        return available_free_space;
    }

    public void setAvailable_free_space(int available_free_space) {
        this.available_free_space = available_free_space;
    }

    public int getAvailable_free_ram() {
        return available_free_ram;
    }

    public void setAvailable_free_ram(int available_free_ram) {
        this.available_free_ram = available_free_ram;
    }

    public boolean isSOCracked() {
        return isSOCracked;
    }

    public void setSOCracked(boolean SOCracked) {
        isSOCracked = SOCracked;
    }

    public boolean isLoadVerificationModule() {
        return isLoadVerificationModule;
    }

    public void setLoadVerificationModule(boolean loadVerificationModule) {
        isLoadVerificationModule = loadVerificationModule;
    }

    public boolean isLoadSignModule() {
        return isLoadSignModule;
    }

    public void setLoadSignModule(boolean loadSignModule) {
        isLoadSignModule = loadSignModule;
    }

    public boolean isSaveProcess() {
        return isSaveProcess;
    }

    public void setSaveProcess(boolean saveProcess) {
        isSaveProcess = saveProcess;
    }

    public boolean isReadINE() {
        return isReadINE;
    }

    public void setReadINE(boolean readINE) {
        isReadINE = readINE;
    }

    public boolean isReadPassport() {
        return isReadPassport;
    }

    public void setReadPassport(boolean readPassport) {
        isReadPassport = readPassport;
    }

    public boolean isProofOfAddress() {
        return isProofOfAddress;
    }

    public void setProofOfAddress(boolean proofOfAddress) {
        isProofOfAddress = proofOfAddress;
    }

    public boolean isProofLifeSelfie() {
        return isProofLifeSelfie;
    }

    public void setProofLifeSelfie(boolean proofLifeSelfie) {
        isProofLifeSelfie = proofLifeSelfie;
    }

    public int getTimeToTakeSelfie() {
        return timeToTakeSelfie;
    }

    public void setTimeToTakeSelfie(int timeToTakeSelfie) {
        this.timeToTakeSelfie = timeToTakeSelfie;
    }

    public boolean isLoadCurrentProcess() {
        return isLoadCurrentProcess;
    }

    public void setLoadCurrentProcess(boolean loadCurrentProcess) {
        isLoadCurrentProcess = loadCurrentProcess;
    }

    public boolean isRemoveSavedData() {
        return isRemoveSavedData;
    }

    public void setRemoveSavedData(boolean removeSavedData) {
        isRemoveSavedData = removeSavedData;
    }

    public String getImgCompany() {
        return imgCompany;
    }

    public void setImgCompany(String imgCompany) {
        this.imgCompany = imgCompany;
    }

    public String getPdfData() {
        return pdfData;
    }

    public void setPdfData(String pdfData) {
        this.pdfData = pdfData;
    }

    public String getXmlData() {
        return xmlData;
    }

    public void setXmlData(String xmlData) {
        this.xmlData = xmlData;
    }

    public String getUrlGetKeys() {
        return urlGetKeys;
    }

    public void setUrlGetKeys(String urlGetKeys) {
        this.urlGetKeys = urlGetKeys;
    }

}