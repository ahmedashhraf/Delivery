package org.jivesoftware.smackx.bytestreams.ibb.provider;

import java.io.IOException;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smackx.bytestreams.ibb.packet.Data;
import org.jivesoftware.smackx.bytestreams.ibb.packet.DataPacketExtension;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class DataPacketProvider {

    public static class IQProvider extends org.jivesoftware.smack.provider.IQProvider<Data> {
        private static final PacketExtensionProvider packetExtensionProvider = new PacketExtensionProvider();

        public Data parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException, SmackException {
            return new Data((DataPacketExtension) packetExtensionProvider.parse(xmlPullParser));
        }
    }

    public static class PacketExtensionProvider extends ExtensionElementProvider<DataPacketExtension> {
        public DataPacketExtension parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
            String str = "";
            return new DataPacketExtension(xmlPullParser.getAttributeValue(str, "sid"), Long.parseLong(xmlPullParser.getAttributeValue(str, "seq")), xmlPullParser.nextText());
        }
    }
}
