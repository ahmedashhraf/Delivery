package org.jivesoftware.smackx.vcardtemp;

import java.util.Map;
import java.util.WeakHashMap;
import org.jivesoftware.smack.ConnectionCreationListener;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPConnectionRegistry;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smack.packet.p556id.StanzaIdUtil;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.vcardtemp.packet.VCard;

public class VCardManager extends Manager {
    public static final String ELEMENT = "vCard";
    private static final Map<XMPPConnection, VCardManager> INSTANCES = new WeakHashMap();
    public static final String NAMESPACE = "vcard-temp";

    static {
        XMPPConnectionRegistry.addConnectionCreationListener(new ConnectionCreationListener() {
            public void connectionCreated(XMPPConnection xMPPConnection) {
                VCardManager.getInstanceFor(xMPPConnection);
            }
        });
    }

    private VCardManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        ServiceDiscoveryManager.getInstanceFor(xMPPConnection).addFeature("vcard-temp");
    }

    public static synchronized VCardManager getInstanceFor(XMPPConnection xMPPConnection) {
        VCardManager vCardManager;
        synchronized (VCardManager.class) {
            vCardManager = (VCardManager) INSTANCES.get(xMPPConnection);
            if (vCardManager == null) {
                vCardManager = new VCardManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, vCardManager);
            }
        }
        return vCardManager;
    }

    @Deprecated
    public static boolean isSupported(String str, XMPPConnection xMPPConnection) throws NoResponseException, XMPPErrorException, NotConnectedException {
        return getInstanceFor(xMPPConnection).isSupported(str);
    }

    public VCard loadVCard() throws NoResponseException, XMPPErrorException, NotConnectedException {
        return loadVCard(null);
    }

    public void saveVCard(VCard vCard) throws NoResponseException, XMPPErrorException, NotConnectedException {
        vCard.setTo(null);
        vCard.setType(Type.set);
        vCard.setStanzaId(StanzaIdUtil.newStanzaId());
        connection().createPacketCollectorAndSend(vCard).nextResultOrThrow();
    }

    public boolean isSupported(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        return ServiceDiscoveryManager.getInstanceFor(connection()).supportsFeature(str, "vcard-temp");
    }

    public VCard loadVCard(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        VCard vCard = new VCard();
        vCard.setTo(str);
        return (VCard) connection().createPacketCollectorAndSend(vCard).nextResultOrThrow();
    }
}
