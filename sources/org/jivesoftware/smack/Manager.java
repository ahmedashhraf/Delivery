package org.jivesoftware.smack;

import java.lang.ref.WeakReference;
import org.jivesoftware.smack.util.Objects;

public abstract class Manager {
    final WeakReference<XMPPConnection> weakConnection;

    public Manager(XMPPConnection xMPPConnection) {
        Objects.requireNonNull(xMPPConnection, "XMPPConnection must not be null");
        this.weakConnection = new WeakReference<>(xMPPConnection);
    }

    /* access modifiers changed from: protected */
    public final XMPPConnection connection() {
        return (XMPPConnection) this.weakConnection.get();
    }
}
