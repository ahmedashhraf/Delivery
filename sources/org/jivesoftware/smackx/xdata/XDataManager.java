package org.jivesoftware.smackx.xdata;

import java.util.Map;
import java.util.WeakHashMap;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;

public class XDataManager extends Manager {
    private static final Map<XMPPConnection, XDataManager> INSTANCES = new WeakHashMap();
    public static final String NAMESPACE = "jabber:x:data";

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new ConnectionCreationListener() {
            public void connectionCreated(XMPPConnection xMPPConnection) {
                XDataManager.getInstanceFor(xMPPConnection);
            }
        });
    }

    private XDataManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        ServiceDiscoveryManager.getInstanceFor(xMPPConnection).addFeature("jabber:x:data");
    }

    public static synchronized XDataManager getInstanceFor(XMPPConnection xMPPConnection) {
        XDataManager xDataManager;
        synchronized (XDataManager.class) {
            xDataManager = (XDataManager) INSTANCES.get(xMPPConnection);
            if (xDataManager == null) {
                xDataManager = new XDataManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, xDataManager);
            }
        }
        return xDataManager;
    }

    public boolean isSupported(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        return ServiceDiscoveryManager.getInstanceFor(connection()).supportsFeature(str, "jabber:x:data");
    }
}
