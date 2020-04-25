package org.jivesoftware.smackx.xhtmlim;

import java.util.List;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.xhtmlim.packet.XHTMLExtension;

public class XHTMLManager {
    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new ConnectionCreationListener() {
            public void connectionCreated(XMPPConnection xMPPConnection) {
                XHTMLManager.setServiceEnabled(xMPPConnection, true);
            }
        });
    }

    public static void addBody(Message message, XHTMLText xHTMLText) {
        XHTMLExtension from = XHTMLExtension.from(message);
        if (from == null) {
            from = new XHTMLExtension();
            message.addExtension(from);
        }
        from.addBody(xHTMLText.toXML());
    }

    public static List<CharSequence> getBodies(Message message) {
        XHTMLExtension from = XHTMLExtension.from(message);
        if (from != null) {
            return from.getBodies();
        }
        return null;
    }

    public static boolean isServiceEnabled(XMPPConnection xMPPConnection) {
        return ServiceDiscoveryManager.getInstanceFor(xMPPConnection).includesFeature(XHTMLExtension.NAMESPACE);
    }

    public static boolean isXHTMLMessage(Message message) {
        return message.getExtension(XHTMLExtension.ELEMENT, XHTMLExtension.NAMESPACE) != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void setServiceEnabled(org.jivesoftware.smack.XMPPConnection r2, boolean r3) {
        /*
            java.lang.Class<org.jivesoftware.smackx.xhtmlim.XHTMLManager> r0 = org.jivesoftware.smackx.xhtmlim.XHTMLManager.class
            monitor-enter(r0)
            boolean r1 = isServiceEnabled(r2)     // Catch:{ all -> 0x0022 }
            if (r1 != r3) goto L_0x000b
            monitor-exit(r0)
            return
        L_0x000b:
            if (r3 == 0) goto L_0x0017
            org.jivesoftware.smackx.disco.ServiceDiscoveryManager r2 = org.jivesoftware.smackx.disco.ServiceDiscoveryManager.getInstanceFor(r2)     // Catch:{ all -> 0x0022 }
            java.lang.String r3 = "http://jabber.org/protocol/xhtml-im"
            r2.addFeature(r3)     // Catch:{ all -> 0x0022 }
            goto L_0x0020
        L_0x0017:
            org.jivesoftware.smackx.disco.ServiceDiscoveryManager r2 = org.jivesoftware.smackx.disco.ServiceDiscoveryManager.getInstanceFor(r2)     // Catch:{ all -> 0x0022 }
            java.lang.String r3 = "http://jabber.org/protocol/xhtml-im"
            r2.removeFeature(r3)     // Catch:{ all -> 0x0022 }
        L_0x0020:
            monitor-exit(r0)
            return
        L_0x0022:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.xhtmlim.XHTMLManager.setServiceEnabled(org.jivesoftware.smack.XMPPConnection, boolean):void");
    }

    public static boolean isServiceEnabled(XMPPConnection xMPPConnection, String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        return ServiceDiscoveryManager.getInstanceFor(xMPPConnection).supportsFeature(str, XHTMLExtension.NAMESPACE);
    }
}
