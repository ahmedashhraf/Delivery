package org.jivesoftware.smackx.jiveproperties.provider;

import java.util.logging.Logger;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smackx.jiveproperties.packet.JivePropertiesExtension;

public class JivePropertiesExtensionProvider extends ExtensionElementProvider<JivePropertiesExtension> {
    private static final Logger LOGGER = Logger.getLogger(JivePropertiesExtensionProvider.class.getName());

    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v1 */
    /* JADX WARNING: type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r5v2 */
    /* JADX WARNING: type inference failed for: r7v3, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v25, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r0v26, types: [java.lang.Boolean] */
    /* JADX WARNING: type inference failed for: r0v27, types: [java.lang.Double] */
    /* JADX WARNING: type inference failed for: r0v28, types: [java.lang.Float] */
    /* JADX WARNING: type inference failed for: r0v29, types: [java.lang.Long] */
    /* JADX WARNING: type inference failed for: r0v30 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r0v31, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r5v4, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v6 */
    /* JADX WARNING: type inference failed for: r5v7 */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r5v10 */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: type inference failed for: r0v32 */
    /* JADX WARNING: type inference failed for: r0v33 */
    /* JADX WARNING: type inference failed for: r0v34 */
    /* JADX WARNING: type inference failed for: r0v35 */
    /* JADX WARNING: type inference failed for: r0v36 */
    /* JADX WARNING: type inference failed for: r0v37 */
    /* JADX WARNING: type inference failed for: r5v11 */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x001e, code lost:
        r7 = r7;
        r5 = r5;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v2
      assigns: []
      uses: []
      mth insns count: 102
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 12 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.jivesoftware.smackx.jiveproperties.packet.JivePropertiesExtension parse(org.xmlpull.v1.XmlPullParser r12, int r13) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r11 = this;
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
        L_0x0005:
            int r0 = r12.next()
            r1 = 3
            r2 = 2
            if (r0 != r2) goto L_0x00e2
            java.lang.String r3 = r12.getName()
            java.lang.String r4 = "property"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00e2
            r0 = 0
            r3 = 0
            r5 = r3
            r6 = r5
            r7 = r6
        L_0x001e:
            if (r0 != 0) goto L_0x0005
            int r8 = r12.next()
            if (r8 != r2) goto L_0x004c
            java.lang.String r8 = r12.getName()
            java.lang.String r9 = "name"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x0037
            java.lang.String r6 = r12.nextText()
            goto L_0x001e
        L_0x0037:
            java.lang.String r9 = "value"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x001e
            java.lang.String r3 = ""
            java.lang.String r5 = "type"
            java.lang.String r3 = r12.getAttributeValue(r3, r5)
            java.lang.String r5 = r12.nextText()
            goto L_0x001e
        L_0x004c:
            if (r8 != r1) goto L_0x001e
            java.lang.String r8 = r12.getName()
            boolean r8 = r8.equals(r4)
            if (r8 == 0) goto L_0x001e
            java.lang.String r0 = "integer"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0067
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
        L_0x0064:
            r7 = r0
            goto L_0x00d8
        L_0x0067:
            java.lang.String r0 = "long"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0074
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            goto L_0x0064
        L_0x0074:
            java.lang.String r0 = "float"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0081
            java.lang.Float r0 = java.lang.Float.valueOf(r5)
            goto L_0x0064
        L_0x0081:
            java.lang.String r0 = "double"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x008e
            java.lang.Double r0 = java.lang.Double.valueOf(r5)
            goto L_0x0064
        L_0x008e:
            java.lang.String r0 = "boolean"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x009b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            goto L_0x0064
        L_0x009b:
            java.lang.String r0 = "string"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00a5
            r7 = r5
            goto L_0x00d8
        L_0x00a5:
            java.lang.String r0 = "java-object"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00d8
            boolean r0 = org.jivesoftware.smackx.jiveproperties.JivePropertiesManager.isJavaObjectEnabled()
            if (r0 == 0) goto L_0x00d1
            byte[] r0 = org.jivesoftware.smack.util.stringencoder.Base64.decode(r5)     // Catch:{ Exception -> 0x00c6 }
            java.io.ObjectInputStream r8 = new java.io.ObjectInputStream     // Catch:{ Exception -> 0x00c6 }
            java.io.ByteArrayInputStream r9 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x00c6 }
            r9.<init>(r0)     // Catch:{ Exception -> 0x00c6 }
            r8.<init>(r9)     // Catch:{ Exception -> 0x00c6 }
            java.lang.Object r0 = r8.readObject()     // Catch:{ Exception -> 0x00c6 }
            goto L_0x0064
        L_0x00c6:
            r0 = move-exception
            java.util.logging.Logger r8 = LOGGER
            java.util.logging.Level r9 = java.util.logging.Level.SEVERE
            java.lang.String r10 = "Error parsing java object"
            r8.log(r9, r10, r0)
            goto L_0x00d8
        L_0x00d1:
            java.util.logging.Logger r0 = LOGGER
            java.lang.String r8 = "JavaObject is not enabled. Enable with JivePropertiesManager.setJavaObjectEnabled(true)"
            r0.severe(r8)
        L_0x00d8:
            if (r6 == 0) goto L_0x00df
            if (r7 == 0) goto L_0x00df
            r13.put(r6, r7)
        L_0x00df:
            r0 = 1
            goto L_0x001e
        L_0x00e2:
            if (r0 != r1) goto L_0x0005
            java.lang.String r0 = r12.getName()
            java.lang.String r1 = "properties"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0005
            org.jivesoftware.smackx.jiveproperties.packet.JivePropertiesExtension r12 = new org.jivesoftware.smackx.jiveproperties.packet.JivePropertiesExtension
            r12.<init>(r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.jiveproperties.provider.JivePropertiesExtensionProvider.parse(org.xmlpull.v1.XmlPullParser, int):org.jivesoftware.smackx.jiveproperties.packet.JivePropertiesExtension");
    }
}
