package org.jivesoftware.smackx.time;

import java.util.Map;
import java.util.WeakHashMap;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.iqrequest.AbstractIqRequestHandler;
import org.jivesoftware.smack.iqrequest.IQRequestHandler.Mode;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smack.packet.XMPPError;
import org.jivesoftware.smack.packet.XMPPError.Condition;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.time.packet.Time;

public class EntityTimeManager extends Manager {
    private static final Map<XMPPConnection, EntityTimeManager> INSTANCES = new WeakHashMap();
    private static boolean autoEnable = true;
    /* access modifiers changed from: private */
    public boolean enabled = false;

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new ConnectionCreationListener() {
            public void connectionCreated(XMPPConnection xMPPConnection) {
                EntityTimeManager.getInstanceFor(xMPPConnection);
            }
        });
    }

    private EntityTimeManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        if (autoEnable) {
            enable();
        }
        C157292 r1 = new AbstractIqRequestHandler(Time.ELEMENT, Time.NAMESPACE, Type.get, Mode.async) {
            public C15617IQ handleIQRequest(C15617IQ iq) {
                if (EntityTimeManager.this.enabled) {
                    return Time.createResponse(iq);
                }
                return C15617IQ.createErrorResponse(iq, new XMPPError(Condition.not_acceptable));
            }
        };
        xMPPConnection.registerIQRequestHandler(r1);
    }

    public static synchronized EntityTimeManager getInstanceFor(XMPPConnection xMPPConnection) {
        EntityTimeManager entityTimeManager;
        synchronized (EntityTimeManager.class) {
            entityTimeManager = (EntityTimeManager) INSTANCES.get(xMPPConnection);
            if (entityTimeManager == null) {
                entityTimeManager = new EntityTimeManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, entityTimeManager);
            }
        }
        return entityTimeManager;
    }

    public static void setAutoEnable(boolean z) {
        autoEnable = z;
    }

    public synchronized void disable() {
        if (this.enabled) {
            ServiceDiscoveryManager.getInstanceFor(connection()).removeFeature(Time.NAMESPACE);
            this.enabled = false;
        }
    }

    public synchronized void enable() {
        if (!this.enabled) {
            ServiceDiscoveryManager.getInstanceFor(connection()).addFeature(Time.NAMESPACE);
            this.enabled = true;
        }
    }

    public Time getTime(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        if (!isTimeSupported(str)) {
            return null;
        }
        return (Time) connection().createPacketCollectorAndSend(new Time()).nextResultOrThrow();
    }

    public boolean isTimeSupported(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        return ServiceDiscoveryManager.getInstanceFor(connection()).supportsFeature(str, Time.NAMESPACE);
    }
}
