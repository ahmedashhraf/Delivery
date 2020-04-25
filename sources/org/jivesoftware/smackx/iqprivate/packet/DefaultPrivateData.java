package org.jivesoftware.smackx.iqprivate.packet;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DefaultPrivateData implements PrivateData {
    private String elementName;
    private Map<String, String> map;
    private String namespace;

    public DefaultPrivateData(String str, String str2) {
        this.elementName = str;
        this.namespace = str2;
    }

    public String getElementName() {
        return this.elementName;
    }

    public synchronized Set<String> getNames() {
        if (this.map == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(this.map.keySet());
    }

    public String getNamespace() {
        return this.namespace;
    }

    public synchronized String getValue(String str) {
        if (this.map == null) {
            return null;
        }
        return (String) this.map.get(str);
    }

    public synchronized void setValue(String str, String str2) {
        if (this.map == null) {
            this.map = new HashMap();
        }
        this.map.put(str, str2);
    }

    public String toXML() {
        StringBuilder sb = new StringBuilder();
        String str = "<";
        sb.append(str);
        sb.append(this.elementName);
        sb.append(" xmlns=\"");
        sb.append(this.namespace);
        sb.append("\">");
        Iterator it = getNames().iterator();
        while (true) {
            String str2 = "</";
            String str3 = ">";
            if (it.hasNext()) {
                String str4 = (String) it.next();
                String value = getValue(str4);
                sb.append(str);
                sb.append(str4);
                sb.append(str3);
                sb.append(value);
                sb.append(str2);
                sb.append(str4);
                sb.append(str3);
            } else {
                sb.append(str2);
                sb.append(this.elementName);
                sb.append(str3);
                return sb.toString();
            }
        }
    }
}
