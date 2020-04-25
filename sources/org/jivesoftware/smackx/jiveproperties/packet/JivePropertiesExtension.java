package org.jivesoftware.smackx.jiveproperties.packet;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Logger;
import org.jivesoftware.smack.packet.ExtensionElement;

public class JivePropertiesExtension implements ExtensionElement {
    public static final String ELEMENT = "properties";
    private static final Logger LOGGER = Logger.getLogger(JivePropertiesExtension.class.getName());
    public static final String NAMESPACE = "http://www.jivesoftware.com/xmlns/xmpp/properties";
    private final Map<String, Object> properties;

    public JivePropertiesExtension() {
        this.properties = new HashMap();
    }

    public synchronized void deleteProperty(String str) {
        if (this.properties != null) {
            this.properties.remove(str);
        }
    }

    public String getElementName() {
        return ELEMENT;
    }

    public String getNamespace() {
        return NAMESPACE;
    }

    public synchronized Map<String, Object> getProperties() {
        if (this.properties == null) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(new HashMap(this.properties));
    }

    public synchronized Object getProperty(String str) {
        if (this.properties == null) {
            return null;
        }
        return this.properties.get(str);
    }

    public synchronized Collection<String> getPropertyNames() {
        if (this.properties == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(new HashSet(this.properties.keySet()));
    }

    public synchronized void setProperty(String str, Object obj) {
        if (obj instanceof Serializable) {
            this.properties.put(str, obj);
        } else {
            throw new IllegalArgumentException("Value must be serialiazble");
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x00ad */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e2 A[SYNTHETIC, Splitter:B:47:0x00e2] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e9 A[SYNTHETIC, Splitter:B:51:0x00e9] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0102 A[SYNTHETIC, Splitter:B:57:0x0102] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0109 A[SYNTHETIC, Splitter:B:61:0x0109] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00ec A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence toXML() {
        /*
            r11 = this;
            org.jivesoftware.smack.util.XmlStringBuilder r0 = new org.jivesoftware.smack.util.XmlStringBuilder
            r0.<init>(r11)
            r0.rightAngleBracket()
            java.util.Collection r1 = r11.getPropertyNames()
            java.util.Iterator r1 = r1.iterator()
        L_0x0010:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x010d
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r11.getProperty(r2)
            java.lang.String r4 = "property"
            r0.openElement(r4)
            java.lang.String r5 = "name"
            r0.element(r5, r2)
            java.lang.String r2 = "value"
            r0.halfOpenElement(r2)
            boolean r5 = r3 instanceof java.lang.Integer
            java.lang.String r6 = "java-object"
            if (r5 == 0) goto L_0x0043
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.String r3 = java.lang.Integer.toString(r3)
            java.lang.String r6 = "integer"
            goto L_0x00ec
        L_0x0043:
            boolean r5 = r3 instanceof java.lang.Long
            if (r5 == 0) goto L_0x0055
            java.lang.Long r3 = (java.lang.Long) r3
            long r5 = r3.longValue()
            java.lang.String r3 = java.lang.Long.toString(r5)
            java.lang.String r6 = "long"
            goto L_0x00ec
        L_0x0055:
            boolean r5 = r3 instanceof java.lang.Float
            if (r5 == 0) goto L_0x0067
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            java.lang.String r3 = java.lang.Float.toString(r3)
            java.lang.String r6 = "float"
            goto L_0x00ec
        L_0x0067:
            boolean r5 = r3 instanceof java.lang.Double
            if (r5 == 0) goto L_0x0079
            java.lang.Double r3 = (java.lang.Double) r3
            double r5 = r3.doubleValue()
            java.lang.String r3 = java.lang.Double.toString(r5)
            java.lang.String r6 = "double"
            goto L_0x00ec
        L_0x0079:
            boolean r5 = r3 instanceof java.lang.Boolean
            if (r5 == 0) goto L_0x008b
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.lang.String r3 = java.lang.Boolean.toString(r3)
            java.lang.String r6 = "boolean"
            goto L_0x00ec
        L_0x008b:
            boolean r5 = r3 instanceof java.lang.String
            if (r5 == 0) goto L_0x0094
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r6 = "string"
            goto L_0x00ec
        L_0x0094:
            r5 = 0
            java.io.ByteArrayOutputStream r7 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x00c0, all -> 0x00bd }
            r7.<init>()     // Catch:{ Exception -> 0x00c0, all -> 0x00bd }
            java.io.ObjectOutputStream r8 = new java.io.ObjectOutputStream     // Catch:{ Exception -> 0x00b9, all -> 0x00b5 }
            r8.<init>(r7)     // Catch:{ Exception -> 0x00b9, all -> 0x00b5 }
            r8.writeObject(r3)     // Catch:{ Exception -> 0x00b3, all -> 0x00b1 }
            byte[] r3 = r7.toByteArray()     // Catch:{ Exception -> 0x00b3, all -> 0x00b1 }
            java.lang.String r3 = org.jivesoftware.smack.util.stringencoder.Base64.encodeToString(r3)     // Catch:{ Exception -> 0x00b3, all -> 0x00b1 }
            r8.close()     // Catch:{ Exception -> 0x00ad }
        L_0x00ad:
            r7.close()     // Catch:{ Exception -> 0x00ec }
            goto L_0x00ec
        L_0x00b1:
            r0 = move-exception
            goto L_0x00b7
        L_0x00b3:
            r3 = move-exception
            goto L_0x00bb
        L_0x00b5:
            r0 = move-exception
            r8 = r5
        L_0x00b7:
            r5 = r7
            goto L_0x0100
        L_0x00b9:
            r3 = move-exception
            r8 = r5
        L_0x00bb:
            r5 = r7
            goto L_0x00c2
        L_0x00bd:
            r0 = move-exception
            r8 = r5
            goto L_0x0100
        L_0x00c0:
            r3 = move-exception
            r8 = r5
        L_0x00c2:
            java.util.logging.Logger r7 = LOGGER     // Catch:{ all -> 0x00ff }
            java.util.logging.Level r9 = java.util.logging.Level.SEVERE     // Catch:{ all -> 0x00ff }
            java.lang.String r10 = "Error encoding java object"
            r7.log(r9, r10, r3)     // Catch:{ all -> 0x00ff }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ff }
            r7.<init>()     // Catch:{ all -> 0x00ff }
            java.lang.String r9 = "Serializing error: "
            r7.append(r9)     // Catch:{ all -> 0x00ff }
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x00ff }
            r7.append(r3)     // Catch:{ all -> 0x00ff }
            java.lang.String r3 = r7.toString()     // Catch:{ all -> 0x00ff }
            if (r8 == 0) goto L_0x00e7
            r8.close()     // Catch:{ Exception -> 0x00e6 }
            goto L_0x00e7
        L_0x00e6:
        L_0x00e7:
            if (r5 == 0) goto L_0x00ec
            r5.close()     // Catch:{ Exception -> 0x00ec }
        L_0x00ec:
            java.lang.String r5 = "type"
            r0.attribute(r5, r6)
            r0.rightAngleBracket()
            r0.escape(r3)
            r0.closeElement(r2)
            r0.closeElement(r4)
            goto L_0x0010
        L_0x00ff:
            r0 = move-exception
        L_0x0100:
            if (r8 == 0) goto L_0x0107
            r8.close()     // Catch:{ Exception -> 0x0106 }
            goto L_0x0107
        L_0x0106:
        L_0x0107:
            if (r5 == 0) goto L_0x010c
            r5.close()     // Catch:{ Exception -> 0x010c }
        L_0x010c:
            throw r0
        L_0x010d:
            r0.closeElement(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smackx.jiveproperties.packet.JivePropertiesExtension.toXML():java.lang.CharSequence");
    }

    public JivePropertiesExtension(Map<String, Object> map) {
        this.properties = map;
    }
}
