package org.jivesoftware.smackx.iqversion;

import java.util.Map;
import java.util.WeakHashMap;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.SmackConfiguration;
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
import org.jivesoftware.smackx.iqversion.packet.Version;

public class VersionManager extends Manager {
    private static final Map<XMPPConnection, VersionManager> INSTANCES = new WeakHashMap();
    private static boolean autoAppendSmackVersion = true;
    private static Version defaultVersion;
    /* access modifiers changed from: private */
    public Version ourVersion = defaultVersion;

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new ConnectionCreationListener() {
            public void connectionCreated(XMPPConnection xMPPConnection) {
                VersionManager.getInstanceFor(xMPPConnection);
            }
        });
    }

    private VersionManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        ServiceDiscoveryManager.getInstanceFor(xMPPConnection).addFeature(Version.NAMESPACE);
        C156932 r2 = new AbstractIqRequestHandler("query", Version.NAMESPACE, Type.get, Mode.async) {
            public C15617IQ handleIQRequest(C15617IQ iq) {
                if (VersionManager.this.ourVersion == null) {
                    return C15617IQ.createErrorResponse(iq, new XMPPError(Condition.not_acceptable));
                }
                return Version.createResultFor(iq, VersionManager.this.ourVersion);
            }
        };
        xMPPConnection.registerIQRequestHandler(r2);
    }

    private static Version generateVersionFrom(String str, String str2, String str3) {
        if (autoAppendSmackVersion) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" (Smack ");
            sb.append(SmackConfiguration.getVersion());
            sb.append(')');
            str = sb.toString();
        }
        return new Version(str, str2, str3);
    }

    public static synchronized VersionManager getInstanceFor(XMPPConnection xMPPConnection) {
        VersionManager versionManager;
        synchronized (VersionManager.class) {
            versionManager = (VersionManager) INSTANCES.get(xMPPConnection);
            if (versionManager == null) {
                versionManager = new VersionManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, versionManager);
            }
        }
        return versionManager;
    }

    public static void setAutoAppendSmackVersion(boolean z) {
        autoAppendSmackVersion = z;
    }

    public static void setDefaultVersion(String str, String str2) {
        setDefaultVersion(str, str2, null);
    }

    public Version getVersion(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        if (!isSupported(str)) {
            return null;
        }
        return (Version) connection().createPacketCollectorAndSend(new Version(str)).nextResultOrThrow();
    }

    public boolean isSupported(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        return ServiceDiscoveryManager.getInstanceFor(connection()).supportsFeature(str, Version.NAMESPACE);
    }

    public void setVersion(String str, String str2) {
        setVersion(str, str2, null);
    }

    public void unsetVersion() {
        this.ourVersion = null;
    }

    public static void setDefaultVersion(String str, String str2, String str3) {
        defaultVersion = generateVersionFrom(str, str2, str3);
    }

    public void setVersion(String str, String str2, String str3) {
        this.ourVersion = generateVersionFrom(str, str2, str3);
    }
}
