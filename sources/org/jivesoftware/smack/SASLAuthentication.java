package org.jivesoftware.smack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import org.jivesoftware.smack.packet.Mechanisms;
import org.jivesoftware.smack.sasl.SASLAnonymous;
import org.jivesoftware.smack.sasl.SASLErrorException;
import org.jivesoftware.smack.sasl.SASLMechanism;
import org.jivesoftware.smack.sasl.packet.SaslStreamElements.SASLFailure;
import org.jivesoftware.smack.sasl.packet.SaslStreamElements.Success;

public class SASLAuthentication {
    private static final Set<String> BLACKLISTED_MECHANISMS = new HashSet();
    private static final Logger LOGGER = Logger.getLogger(SASLAuthentication.class.getName());
    private static final List<SASLMechanism> REGISTERED_MECHANISMS = new ArrayList();
    private boolean authenticationSuccessful;
    private final AbstractXMPPConnection connection;
    private SASLMechanism currentMechanism = null;
    private Exception saslException;

    SASLAuthentication(AbstractXMPPConnection abstractXMPPConnection) {
        this.connection = abstractXMPPConnection;
        init();
    }

    public static boolean blacklistSASLMechanism(String str) {
        boolean add;
        synchronized (BLACKLISTED_MECHANISMS) {
            add = BLACKLISTED_MECHANISMS.add(str);
        }
        return add;
    }

    public static Set<String> getBlacklistedSASLMechanisms() {
        HashSet hashSet;
        synchronized (BLACKLISTED_MECHANISMS) {
            hashSet = new HashSet(BLACKLISTED_MECHANISMS);
        }
        return hashSet;
    }

    public static Map<String, String> getRegisterdSASLMechanisms() {
        HashMap hashMap = new HashMap();
        synchronized (REGISTERED_MECHANISMS) {
            for (SASLMechanism sASLMechanism : REGISTERED_MECHANISMS) {
                hashMap.put(sASLMechanism.getClass().getName(), sASLMechanism.getName());
            }
        }
        return hashMap;
    }

    private void maybeThrowException() throws SmackException, SASLErrorException {
        Exception exc = this.saslException;
        if (exc == null) {
            return;
        }
        if (exc instanceof SmackException) {
            throw ((SmackException) exc);
        } else if (exc instanceof SASLErrorException) {
            throw ((SASLErrorException) exc);
        } else {
            throw new IllegalStateException("Unexpected exception type", exc);
        }
    }

    public static void registerSASLMechanism(SASLMechanism sASLMechanism) {
        synchronized (REGISTERED_MECHANISMS) {
            REGISTERED_MECHANISMS.add(sASLMechanism);
            Collections.sort(REGISTERED_MECHANISMS);
        }
    }

    private SASLMechanism selectMechanism() {
        for (SASLMechanism sASLMechanism : REGISTERED_MECHANISMS) {
            String name = sASLMechanism.getName();
            synchronized (BLACKLISTED_MECHANISMS) {
                if (!BLACKLISTED_MECHANISMS.contains(name)) {
                    if (serverMechanisms().contains(name)) {
                        return sASLMechanism.instanceForAuthentication(this.connection);
                    }
                }
            }
        }
        return null;
    }

    private List<String> serverMechanisms() {
        Mechanisms mechanisms = (Mechanisms) this.connection.getFeature(Mechanisms.ELEMENT, "urn:ietf:params:xml:ns:xmpp-sasl");
        if (mechanisms != null) {
            return mechanisms.getMechanisms();
        }
        LOGGER.warning("Server did not report any SASL mechanisms");
        return Collections.emptyList();
    }

    public static boolean unBlacklistSASLMechanism(String str) {
        boolean remove;
        synchronized (BLACKLISTED_MECHANISMS) {
            remove = BLACKLISTED_MECHANISMS.remove(str);
        }
        return remove;
    }

    public static boolean unregisterSASLMechanism(String str) {
        synchronized (REGISTERED_MECHANISMS) {
            Iterator it = REGISTERED_MECHANISMS.iterator();
            while (it.hasNext()) {
                if (((SASLMechanism) it.next()).getClass().getName().equals(str)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0023 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void authenticate(java.lang.String r3, javax.security.auth.callback.CallbackHandler r4) throws java.io.IOException, org.jivesoftware.smack.XMPPException.XMPPErrorException, org.jivesoftware.smack.sasl.SASLErrorException, org.jivesoftware.smack.SmackException {
        /*
            r2 = this;
            org.jivesoftware.smack.sasl.SASLMechanism r3 = r2.selectMechanism()
            if (r3 == 0) goto L_0x0036
            r2.currentMechanism = r3
            monitor-enter(r2)
            org.jivesoftware.smack.sasl.SASLMechanism r3 = r2.currentMechanism     // Catch:{ all -> 0x0033 }
            org.jivesoftware.smack.AbstractXMPPConnection r0 = r2.connection     // Catch:{ all -> 0x0033 }
            java.lang.String r0 = r0.getHost()     // Catch:{ all -> 0x0033 }
            org.jivesoftware.smack.AbstractXMPPConnection r1 = r2.connection     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = r1.getServiceName()     // Catch:{ all -> 0x0033 }
            r3.authenticate(r0, r1, r4)     // Catch:{ all -> 0x0033 }
            org.jivesoftware.smack.AbstractXMPPConnection r3 = r2.connection     // Catch:{ InterruptedException -> 0x0023 }
            long r3 = r3.getPacketReplyTimeout()     // Catch:{ InterruptedException -> 0x0023 }
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x0023 }
        L_0x0023:
            monitor-exit(r2)     // Catch:{ all -> 0x0033 }
            r2.maybeThrowException()
            boolean r3 = r2.authenticationSuccessful
            if (r3 == 0) goto L_0x002c
            return
        L_0x002c:
            org.jivesoftware.smack.AbstractXMPPConnection r3 = r2.connection
            org.jivesoftware.smack.SmackException$NoResponseException r3 = org.jivesoftware.smack.SmackException.NoResponseException.newWith(r3)
            throw r3
        L_0x0033:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0033 }
            throw r3
        L_0x0036:
            org.jivesoftware.smack.SmackException r3 = new org.jivesoftware.smack.SmackException
            java.lang.String r4 = "SASL Authentication failed. No known authentication mechanisims."
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.SASLAuthentication.authenticate(java.lang.String, javax.security.auth.callback.CallbackHandler):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:2|3|4|5|6|7) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x001f */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0027 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void authenticateAnonymously() throws org.jivesoftware.smack.sasl.SASLErrorException, org.jivesoftware.smack.SmackException, org.jivesoftware.smack.XMPPException.XMPPErrorException {
        /*
            r3 = this;
            org.jivesoftware.smack.sasl.SASLAnonymous r0 = new org.jivesoftware.smack.sasl.SASLAnonymous
            r0.<init>()
            org.jivesoftware.smack.AbstractXMPPConnection r1 = r3.connection
            org.jivesoftware.smack.sasl.SASLMechanism r0 = r0.instanceForAuthentication(r1)
            r3.currentMechanism = r0
            monitor-enter(r3)
            org.jivesoftware.smack.sasl.SASLMechanism r0 = r3.currentMechanism     // Catch:{ all -> 0x002f }
            java.lang.String r1 = ""
            r2 = 0
            r0.authenticate(r2, r2, r2, r1)     // Catch:{ all -> 0x002f }
            org.jivesoftware.smack.AbstractXMPPConnection r0 = r3.connection     // Catch:{ InterruptedException -> 0x001f }
            long r0 = r0.getPacketReplyTimeout()     // Catch:{ InterruptedException -> 0x001f }
            r3.wait(r0)     // Catch:{ InterruptedException -> 0x001f }
        L_0x001f:
            monitor-exit(r3)     // Catch:{ all -> 0x002f }
            r3.maybeThrowException()
            boolean r0 = r3.authenticationSuccessful
            if (r0 == 0) goto L_0x0028
            return
        L_0x0028:
            org.jivesoftware.smack.AbstractXMPPConnection r0 = r3.connection
            org.jivesoftware.smack.SmackException$NoResponseException r0 = org.jivesoftware.smack.SmackException.NoResponseException.newWith(r0)
            throw r0
        L_0x002f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.SASLAuthentication.authenticateAnonymously():void");
    }

    public void authenticated(Success success) throws SmackException {
        if (success.getData() != null) {
            challengeReceived(success.getData(), true);
        }
        this.currentMechanism.checkIfSuccessfulOrThrow();
        this.authenticationSuccessful = true;
        synchronized (this) {
            notify();
        }
    }

    public void authenticationFailed(SASLFailure sASLFailure) {
        authenticationFailed((Exception) new SASLErrorException(this.currentMechanism.getName(), sASLFailure));
    }

    public boolean authenticationSuccessful() {
        return this.authenticationSuccessful;
    }

    public void challengeReceived(String str) throws SmackException {
        challengeReceived(str, false);
    }

    public boolean hasAnonymousAuthentication() {
        return serverMechanisms().contains(SASLAnonymous.NAME);
    }

    public boolean hasNonAnonymousAuthentication() {
        return !serverMechanisms().isEmpty() && (serverMechanisms().size() != 1 || !hasAnonymousAuthentication());
    }

    /* access modifiers changed from: protected */
    public void init() {
        this.authenticationSuccessful = false;
        this.saslException = null;
    }

    public void authenticationFailed(Exception exc) {
        this.saslException = exc;
        synchronized (this) {
            notify();
        }
    }

    public void challengeReceived(String str, boolean z) throws SmackException {
        try {
            this.currentMechanism.challengeReceived(str, z);
        } catch (SmackException e) {
            authenticationFailed((Exception) e);
            throw e;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0023 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void authenticate(java.lang.String r3, java.lang.String r4, java.lang.String r5) throws org.jivesoftware.smack.XMPPException.XMPPErrorException, org.jivesoftware.smack.sasl.SASLErrorException, java.io.IOException, org.jivesoftware.smack.SmackException {
        /*
            r2 = this;
            org.jivesoftware.smack.sasl.SASLMechanism r5 = r2.selectMechanism()
            if (r5 == 0) goto L_0x0036
            r2.currentMechanism = r5
            monitor-enter(r2)
            org.jivesoftware.smack.sasl.SASLMechanism r5 = r2.currentMechanism     // Catch:{ all -> 0x0033 }
            org.jivesoftware.smack.AbstractXMPPConnection r0 = r2.connection     // Catch:{ all -> 0x0033 }
            java.lang.String r0 = r0.getHost()     // Catch:{ all -> 0x0033 }
            org.jivesoftware.smack.AbstractXMPPConnection r1 = r2.connection     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = r1.getServiceName()     // Catch:{ all -> 0x0033 }
            r5.authenticate(r3, r0, r1, r4)     // Catch:{ all -> 0x0033 }
            org.jivesoftware.smack.AbstractXMPPConnection r3 = r2.connection     // Catch:{ InterruptedException -> 0x0023 }
            long r3 = r3.getPacketReplyTimeout()     // Catch:{ InterruptedException -> 0x0023 }
            r2.wait(r3)     // Catch:{ InterruptedException -> 0x0023 }
        L_0x0023:
            monitor-exit(r2)     // Catch:{ all -> 0x0033 }
            r2.maybeThrowException()
            boolean r3 = r2.authenticationSuccessful
            if (r3 == 0) goto L_0x002c
            return
        L_0x002c:
            org.jivesoftware.smack.AbstractXMPPConnection r3 = r2.connection
            org.jivesoftware.smack.SmackException$NoResponseException r3 = org.jivesoftware.smack.SmackException.NoResponseException.newWith(r3)
            throw r3
        L_0x0033:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0033 }
            throw r3
        L_0x0036:
            org.jivesoftware.smack.SmackException r3 = new org.jivesoftware.smack.SmackException
            java.lang.String r4 = "SASL Authentication failed. No known authentication mechanisims."
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.SASLAuthentication.authenticate(java.lang.String, java.lang.String, java.lang.String):void");
    }
}
