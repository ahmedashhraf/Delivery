package org.jivesoftware.smackx.workgroup.packet;

import java.io.IOException;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smackx.time.packet.Time;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class QueueUpdate implements ExtensionElement {
    public static final String ELEMENT_NAME = "queue-status";
    public static final String NAMESPACE = "http://jabber.org/protocol/workgroup";
    private int position;
    private int remainingTime;

    public static class Provider extends ExtensionElementProvider<QueueUpdate> {
        public QueueUpdate parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
            int i2 = -1;
            boolean z = false;
            int i3 = -1;
            while (!z) {
                xmlPullParser.next();
                String name = xmlPullParser.getName();
                if (xmlPullParser.getEventType() == 2 && "position".equals(name)) {
                    try {
                        i2 = Integer.parseInt(xmlPullParser.nextText());
                    } catch (NumberFormatException unused) {
                    }
                } else if (xmlPullParser.getEventType() == 2 && Time.ELEMENT.equals(name)) {
                    i3 = Integer.parseInt(xmlPullParser.nextText());
                } else if (xmlPullParser.getEventType() == 3 && QueueUpdate.ELEMENT_NAME.equals(name)) {
                    z = true;
                }
            }
            return new QueueUpdate(i2, i3);
        }
    }

    public QueueUpdate(int i, int i2) {
        this.position = i;
        this.remainingTime = i2;
    }

    public String getElementName() {
        return ELEMENT_NAME;
    }

    public String getNamespace() {
        return "http://jabber.org/protocol/workgroup";
    }

    public int getPosition() {
        return this.position;
    }

    public int getRemaingTime() {
        return this.remainingTime;
    }

    public String toXML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<queue-status xmlns=\"http://jabber.org/protocol/workgroup\">");
        if (this.position != -1) {
            sb.append("<position>");
            sb.append(this.position);
            sb.append("</position>");
        }
        if (this.remainingTime != -1) {
            sb.append("<time>");
            sb.append(this.remainingTime);
            sb.append("</time>");
        }
        sb.append("</queue-status>");
        return sb.toString();
    }
}
