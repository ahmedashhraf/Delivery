package org.jivesoftware.smack.provider;

import java.io.IOException;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.packet.Bind;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class BindIQProvider extends IQProvider<Bind> {
    public Bind parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException, SmackException {
        Bind bind = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                char c = 65535;
                int hashCode = name.hashCode();
                if (hashCode != -341064690) {
                    if (hashCode == 105221 && name.equals("jid")) {
                        c = 1;
                    }
                } else if (name.equals("resource")) {
                    c = 0;
                }
                if (c == 0) {
                    bind = Bind.newSet(xmlPullParser.nextText());
                } else if (c == 1) {
                    bind = Bind.newResult(xmlPullParser.nextText());
                }
            } else if (next == 3 && xmlPullParser.getDepth() == i) {
                return bind;
            }
        }
    }
}
