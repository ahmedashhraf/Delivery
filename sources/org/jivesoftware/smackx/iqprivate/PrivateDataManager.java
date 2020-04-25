package org.jivesoftware.smackx.iqprivate;

import java.util.Hashtable;
import java.util.Map;
import java.util.WeakHashMap;
import org.jivesoftware.smack.Manager;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smackx.iqprivate.packet.PrivateData;
import org.jivesoftware.smackx.iqprivate.packet.PrivateDataIQ;
import org.jivesoftware.smackx.iqprivate.provider.PrivateDataProvider;

public class PrivateDataManager extends Manager {
    private static final Map<XMPPConnection, PrivateDataManager> instances = new WeakHashMap();
    private static Map<String, PrivateDataProvider> privateDataProviders = new Hashtable();

    public static class PrivateDataIQProvider extends IQProvider<PrivateDataIQ> {
        /* JADX WARNING: type inference failed for: r1v0 */
        /* JADX WARNING: type inference failed for: r1v1, types: [org.jivesoftware.smackx.iqprivate.packet.PrivateData] */
        /* JADX WARNING: type inference failed for: r1v2 */
        /* JADX WARNING: type inference failed for: r6v1, types: [org.jivesoftware.smackx.iqprivate.packet.DefaultPrivateData] */
        /* JADX WARNING: type inference failed for: r1v4 */
        /* JADX WARNING: type inference failed for: r1v5, types: [org.jivesoftware.smackx.iqprivate.packet.PrivateData] */
        /* JADX WARNING: type inference failed for: r1v6 */
        /* JADX WARNING: type inference failed for: r1v7 */
        /* JADX WARNING: type inference failed for: r1v8 */
        /* JADX WARNING: type inference failed for: r1v9 */
        /* JADX WARNING: type inference failed for: r1v10 */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0004, code lost:
            r1 = r1;
         */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v2
          assigns: []
          uses: []
          mth insns count: 43
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 4 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public org.jivesoftware.smackx.iqprivate.packet.PrivateDataIQ parse(org.xmlpull.v1.XmlPullParser r11, int r12) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, org.jivesoftware.smack.SmackException {
            /*
                r10 = this;
                r12 = 0
                r0 = 0
                r1 = r0
                r0 = 0
            L_0x0004:
                if (r0 != 0) goto L_0x006f
                int r2 = r11.next()
                r3 = 1
                r4 = 3
                r5 = 2
                if (r2 != r5) goto L_0x005f
                java.lang.String r1 = r11.getName()
                java.lang.String r2 = r11.getNamespace()
                org.jivesoftware.smackx.iqprivate.provider.PrivateDataProvider r6 = org.jivesoftware.smackx.iqprivate.PrivateDataManager.getPrivateDataProvider(r1, r2)
                if (r6 == 0) goto L_0x0022
                org.jivesoftware.smackx.iqprivate.packet.PrivateData r1 = r6.parsePrivateData(r11)
                goto L_0x0004
            L_0x0022:
                org.jivesoftware.smackx.iqprivate.packet.DefaultPrivateData r6 = new org.jivesoftware.smackx.iqprivate.packet.DefaultPrivateData
                r6.<init>(r1, r2)
                r2 = 0
            L_0x0028:
                if (r2 != 0) goto L_0x005d
                int r7 = r11.next()
                if (r7 != r5) goto L_0x004f
                java.lang.String r7 = r11.getName()
                boolean r8 = r11.isEmptyElementTag()
                if (r8 == 0) goto L_0x0040
                java.lang.String r8 = ""
                r6.setValue(r7, r8)
                goto L_0x0028
            L_0x0040:
                int r8 = r11.next()
                r9 = 4
                if (r8 != r9) goto L_0x0028
                java.lang.String r8 = r11.getText()
                r6.setValue(r7, r8)
                goto L_0x0028
            L_0x004f:
                if (r7 != r4) goto L_0x0028
                java.lang.String r7 = r11.getName()
                boolean r7 = r7.equals(r1)
                if (r7 == 0) goto L_0x0028
                r2 = 1
                goto L_0x0028
            L_0x005d:
                r1 = r6
                goto L_0x0004
            L_0x005f:
                if (r2 != r4) goto L_0x0004
                java.lang.String r2 = r11.getName()
                java.lang.String r4 = "query"
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x0004
                r0 = 1
                goto L_0x0004
            L_0x006f:
                org.jivesoftware.smackx.iqprivate.packet.PrivateDataIQ r11 = new org.jivesoftware.smackx.iqprivate.packet.PrivateDataIQ
                r11.<init>(r1)
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.iqprivate.PrivateDataManager.PrivateDataIQProvider.parse(org.xmlpull.v1.XmlPullParser, int):org.jivesoftware.smackx.iqprivate.packet.PrivateDataIQ");
        }
    }

    private PrivateDataManager(XMPPConnection xMPPConnection) {
        super(xMPPConnection);
        instances.put(xMPPConnection, this);
    }

    public static void addPrivateDataProvider(String str, String str2, PrivateDataProvider privateDataProvider) {
        privateDataProviders.put(getProviderKey(str, str2), privateDataProvider);
    }

    public static synchronized PrivateDataManager getInstanceFor(XMPPConnection xMPPConnection) {
        PrivateDataManager privateDataManager;
        synchronized (PrivateDataManager.class) {
            privateDataManager = (PrivateDataManager) instances.get(xMPPConnection);
            if (privateDataManager == null) {
                privateDataManager = new PrivateDataManager(xMPPConnection);
            }
        }
        return privateDataManager;
    }

    public static PrivateDataProvider getPrivateDataProvider(String str, String str2) {
        return (PrivateDataProvider) privateDataProviders.get(getProviderKey(str, str2));
    }

    private static String getProviderKey(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(str);
        sb.append("/><");
        sb.append(str2);
        sb.append("/>");
        return sb.toString();
    }

    public static void removePrivateDataProvider(String str, String str2) {
        privateDataProviders.remove(getProviderKey(str, str2));
    }

    public PrivateData getPrivateData(String str, String str2) throws NoResponseException, XMPPErrorException, NotConnectedException {
        return ((PrivateDataIQ) connection().createPacketCollectorAndSend(new PrivateDataIQ(str, str2)).nextResultOrThrow()).getPrivateData();
    }

    public void setPrivateData(PrivateData privateData) throws NoResponseException, XMPPErrorException, NotConnectedException {
        connection().createPacketCollectorAndSend(new PrivateDataIQ(privateData)).nextResultOrThrow();
    }
}
