package org.jivesoftware.smackx.iqregister;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.logging.Logger;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.PacketCollector;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.filter.StanzaIdFilter;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.Type;
import org.jivesoftware.smackx.disco.packet.DiscoverItems.Item;
import org.jivesoftware.smackx.iqregister.packet.Registration;
import p205i.p486d.p487a.C14055b;

public class AccountManager extends Manager {
    private static final Map<XMPPConnection, AccountManager> INSTANCES = new WeakHashMap();
    private static final Logger LOGGER = Logger.getLogger(AccountManager.class.getName());
    private static boolean allowSensitiveOperationOverInsecureConnectionDefault = false;
    private boolean accountCreationSupported = false;
    private boolean allowSensitiveOperationOverInsecureConnection = allowSensitiveOperationOverInsecureConnectionDefault;
    private Registration info = null;

    private AccountManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
    }

    private PacketCollector createPacketCollectorAndSend(C15617IQ iq) throws NotConnectedException {
        return connection().createPacketCollectorAndSend(new StanzaIdFilter(iq.getStanzaId()), iq);
    }

    public static synchronized AccountManager getInstance(XMPPConnection xMPPConnection) {
        AccountManager accountManager;
        synchronized (AccountManager.class) {
            accountManager = (AccountManager) INSTANCES.get(xMPPConnection);
            if (accountManager == null) {
                accountManager = new AccountManager(xMPPConnection);
                INSTANCES.put(xMPPConnection, accountManager);
            }
        }
        return accountManager;
    }

    private synchronized void getRegistrationInfo() throws NoResponseException, XMPPErrorException, NotConnectedException {
        Registration registration = new Registration();
        registration.setTo(connection().getServiceName());
        this.info = (Registration) createPacketCollectorAndSend(registration).nextResultOrThrow();
    }

    public static void sensitiveOperationOverInsecureConnectionDefault(boolean z) {
        allowSensitiveOperationOverInsecureConnectionDefault = z;
    }

    public void changePassword(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        if (!connection().isSecureConnection() && !this.allowSensitiveOperationOverInsecureConnection) {
            LOGGER.warning("Changing password over insecure connection. This will throw an exception in future versions of Smack if AccountManager.sensitiveOperationOverInsecureConnection(true) is not set");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("username", C14055b.m60647g(connection().getUser()));
        hashMap.put("password", str);
        Registration registration = new Registration(hashMap);
        registration.setType(Type.set);
        registration.setTo(connection().getServiceName());
        createPacketCollectorAndSend(registration).nextResultOrThrow();
    }

    public void createAccount(String str, String str2) throws NoResponseException, XMPPErrorException, NotConnectedException {
        HashMap hashMap = new HashMap();
        for (String put : getAccountAttributes()) {
            hashMap.put(put, "");
        }
        createAccount(str, str2, hashMap);
    }

    public void deleteAccount() throws NoResponseException, XMPPErrorException, NotConnectedException {
        HashMap hashMap = new HashMap();
        hashMap.put(Item.REMOVE_ACTION, "");
        Registration registration = new Registration(hashMap);
        registration.setType(Type.set);
        registration.setTo(connection().getServiceName());
        createPacketCollectorAndSend(registration).nextResultOrThrow();
    }

    public String getAccountAttribute(String str) throws NoResponseException, XMPPErrorException, NotConnectedException {
        if (this.info == null) {
            getRegistrationInfo();
        }
        return (String) this.info.getAttributes().get(str);
    }

    public Set<String> getAccountAttributes() throws NoResponseException, XMPPErrorException, NotConnectedException {
        if (this.info == null) {
            getRegistrationInfo();
        }
        Map attributes = this.info.getAttributes();
        if (attributes != null) {
            return Collections.unmodifiableSet(attributes.keySet());
        }
        return Collections.emptySet();
    }

    public String getAccountInstructions() throws NoResponseException, XMPPErrorException, NotConnectedException {
        if (this.info == null) {
            getRegistrationInfo();
        }
        return this.info.getInstructions();
    }

    public void sensitiveOperationOverInsecureConnection(boolean z) {
        this.allowSensitiveOperationOverInsecureConnection = z;
    }

    /* access modifiers changed from: 0000 */
    public void setSupportsAccountCreation(boolean z) {
        this.accountCreationSupported = z;
    }

    public boolean supportsAccountCreation() throws NoResponseException, XMPPErrorException, NotConnectedException {
        boolean z = true;
        if (this.accountCreationSupported) {
            return true;
        }
        if (this.info == null) {
            getRegistrationInfo();
            if (this.info.getType() == Type.error) {
                z = false;
            }
            this.accountCreationSupported = z;
        }
        return this.accountCreationSupported;
    }

    public void createAccount(String str, String str2, Map<String, String> map) throws NoResponseException, XMPPErrorException, NotConnectedException {
        if (!connection().isSecureConnection() && !this.allowSensitiveOperationOverInsecureConnection) {
            LOGGER.warning("Creating account over insecure connection. This will throw an exception in future versions of Smack if AccountManager.sensitiveOperationOverInsecureConnection(true) is not set");
        }
        map.put("username", str);
        map.put("password", str2);
        Registration registration = new Registration(map);
        registration.setType(Type.set);
        registration.setTo(connection().getServiceName());
        createPacketCollectorAndSend(registration).nextResultOrThrow();
    }
}
