package com.hcwins.vehicle.ta.acp.sampler.sampler;

import org.apache.log.Logger;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface ACPClient {
    public String getDefaultRequestData();

    public void setUp();

    public void tearDown();

    public Logger getLogger();

    public String write(OutputStream os) throws IOException;

    public boolean returnMessageRequired();

    public String read(InputStream is) throws IOException, ACPException;

    public String getCharset();
}
