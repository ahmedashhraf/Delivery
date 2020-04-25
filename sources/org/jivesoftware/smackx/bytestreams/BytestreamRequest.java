package org.jivesoftware.smackx.bytestreams;

import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;

public interface BytestreamRequest {
    BytestreamSession accept() throws InterruptedException, NoResponseException, XMPPErrorException, SmackException;

    String getFrom();

    String getSessionID();

    void reject() throws NotConnectedException;
}
