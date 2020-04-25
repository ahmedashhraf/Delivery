package org.jivesoftware.smackx.workgroup.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import org.jivesoftware.smack.util.StringUtils;
import org.jivesoftware.smackx.workgroup.MetaData;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class MetaDataUtils {
    public static Map<String, List<String>> parseMetaData(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() == 2) {
            String name = xmlPullParser.getName();
            String str = MetaData.ELEMENT_NAME;
            if (name.equals(str) && xmlPullParser.getNamespace().equals("http://jivesoftware.com/protocol/workgroup")) {
                Hashtable hashtable = new Hashtable();
                int nextTag = xmlPullParser.nextTag();
                while (true) {
                    if (nextTag == 3 && xmlPullParser.getName().equals(str)) {
                        return hashtable;
                    }
                    String attributeValue = xmlPullParser.getAttributeValue(0);
                    String nextText = xmlPullParser.nextText();
                    if (hashtable.containsKey(attributeValue)) {
                        ((List) hashtable.get(attributeValue)).add(nextText);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(nextText);
                        hashtable.put(attributeValue, arrayList);
                    }
                    nextTag = xmlPullParser.nextTag();
                }
            }
        }
        return Collections.emptyMap();
    }

    public static String serializeMetaData(Map<String, List<String>> map) {
        StringBuilder sb = new StringBuilder();
        if (map != null && map.size() > 0) {
            sb.append("<metadata xmlns=\"http://jivesoftware.com/protocol/workgroup\">");
            for (String str : map.keySet()) {
                for (String str2 : (List) map.get(str)) {
                    sb.append("<value name=\"");
                    sb.append(str);
                    sb.append("\">");
                    sb.append(StringUtils.escapeForXML(str2));
                    sb.append("</value>");
                }
            }
            sb.append("</metadata>");
        }
        return sb.toString();
    }
}
