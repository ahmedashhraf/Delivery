package org.jivesoftware.smackx.debugger.android;

import java.io.Reader;
import java.io.Writer;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.debugger.AbstractDebugger;

public class AndroidDebugger extends AbstractDebugger {
    public AndroidDebugger(XMPPConnection xMPPConnection, Writer writer, Reader reader) {
        super(xMPPConnection, writer, reader);
    }

    /* access modifiers changed from: protected */
    public void log(String str) {
    }
}
