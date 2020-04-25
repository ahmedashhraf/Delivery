package org.jivesoftware.smackx.pep.provider;

import androidx.core.app.C0770p;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class PEPProvider extends ExtensionElementProvider<ExtensionElement> {
    private static final Map<String, ExtensionElementProvider<?>> nodeParsers = new HashMap();

    public static void registerPEPParserExtension(String str, ExtensionElementProvider<?> extensionElementProvider) {
        nodeParsers.put(str, extensionElementProvider);
    }

    public ExtensionElement parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException, SmackException {
        ExtensionElement extensionElement = null;
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            String str = C0770p.f3524g0;
            if (next == 2) {
                if (!xmlPullParser.getName().equals(str) && xmlPullParser.getName().equals("items")) {
                    ExtensionElementProvider extensionElementProvider = (ExtensionElementProvider) nodeParsers.get(xmlPullParser.getAttributeValue("", "node"));
                    if (extensionElementProvider != null) {
                        extensionElement = (ExtensionElement) extensionElementProvider.parse(xmlPullParser);
                    }
                }
            } else if (next == 3 && xmlPullParser.getName().equals(str)) {
                z = true;
            }
        }
        return extensionElement;
    }
}
