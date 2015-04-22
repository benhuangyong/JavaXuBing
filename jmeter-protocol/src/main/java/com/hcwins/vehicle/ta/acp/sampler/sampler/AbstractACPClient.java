package com.hcwins.vehicle.ta.acp.sampler.sampler;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hcwins.vehicle.ta.acp.sampler.data.AbstractACPMessage;

import java.lang.reflect.Modifier;
import java.nio.charset.Charset;

public abstract class AbstractACPClient implements ACPClient {
    private ACPSampler acpSampler;
    private String requestData;

    private Gson gson;

    private AbstractACPMessage message;

    public AbstractACPClient() {
        //
    }

    public AbstractACPClient(ACPSampler acpSampler, String requestData) {
        this.acpSampler = acpSampler;
        this.requestData = requestData;

        this.gson = new GsonBuilder().excludeFieldsWithModifiers(Modifier.PROTECTED).create();
    }

    public ACPSampler getAcpSampler() {
        return acpSampler;
    }

    public void setAcpSampler(ACPSampler acpSampler) {
        this.acpSampler = acpSampler;
    }

    public String getRequestData() {
        return requestData;
    }

    public void setRequestData(String requestData) {
        this.requestData = requestData;
    }

    public Gson getGson() {
        return gson;
    }

    public void setGson(Gson gson) {
        this.gson = gson;
    }

    public AbstractACPMessage getACPMessage() {
        return message;
    }

    public void setACPMessage(AbstractACPMessage message) {
        this.message = message;
    }

    @Override
    public void setUp() {
    }

    @Override
    public void tearDown() {
    }

    @Override
    public String getCharset() {
        return Charset.defaultCharset().name();
    }
}
