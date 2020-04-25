package org.jivesoftware.smackx.iqregister.provider;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.util.PacketParserUtils;
import org.jivesoftware.smackx.iqregister.packet.Registration;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class RegistrationProvider extends IQProvider<Registration> {
    public Registration parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException, SmackException {
        HashMap hashMap = new HashMap();
        LinkedList linkedList = new LinkedList();
        String str = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getNamespace().equals(Registration.NAMESPACE)) {
                    String name = xmlPullParser.getName();
                    String text = xmlPullParser.next() == 4 ? xmlPullParser.getText() : "";
                    if (!name.equals("instructions")) {
                        hashMap.put(name, text);
                    } else {
                        str = text;
                    }
                } else {
                    PacketParserUtils.addExtensionElement((Collection<ExtensionElement>) linkedList, xmlPullParser);
                }
            } else if (next == 3 && xmlPullParser.getName().equals("query")) {
                Registration registration = new Registration(str, hashMap);
                registration.addExtensions(linkedList);
                return registration;
            }
        }
    }
}
