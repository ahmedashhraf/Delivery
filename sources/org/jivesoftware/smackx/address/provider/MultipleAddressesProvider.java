package org.jivesoftware.smackx.address.provider;

import com.facebook.internal.ServerProtocol;
import com.facebook.share.internal.ShareConstants;
import java.io.IOException;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smackx.address.packet.MultipleAddresses;
import org.jivesoftware.smackx.address.packet.MultipleAddresses.Type;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class MultipleAddressesProvider extends ExtensionElementProvider<MultipleAddresses> {
    public MultipleAddresses parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
        MultipleAddresses multipleAddresses = new MultipleAddresses();
        while (true) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                char c = 65535;
                if (name.hashCode() == -1147692044 && name.equals("address")) {
                    c = 0;
                }
                if (c == 0) {
                    String str = "";
                    multipleAddresses.addAddress(Type.valueOf(xmlPullParser.getAttributeValue(str, "type")), xmlPullParser.getAttributeValue(str, "jid"), xmlPullParser.getAttributeValue(str, "node"), xmlPullParser.getAttributeValue(str, "desc"), ServerProtocol.DIALOG_RETURN_SCOPES_TRUE.equals(xmlPullParser.getAttributeValue(str, "delivered")), xmlPullParser.getAttributeValue(str, ShareConstants.MEDIA_URI));
                }
            } else if (next == 3 && xmlPullParser.getDepth() == i) {
                return multipleAddresses;
            }
        }
    }
}
