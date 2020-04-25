package org.jivesoftware.smackx.workgroup.packet;

import java.io.IOException;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.packet.SimpleIQ;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.util.PacketParserUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class TranscriptSearch extends SimpleIQ {
    public static final String ELEMENT_NAME = "transcript-search";
    public static final String NAMESPACE = "http://jivesoftware.com/protocol/workgroup";

    public static class Provider extends IQProvider<TranscriptSearch> {
        public TranscriptSearch parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException, SmackException {
            TranscriptSearch transcriptSearch = new TranscriptSearch();
            boolean z = false;
            while (!z) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    PacketParserUtils.addExtensionElement((Stanza) transcriptSearch, xmlPullParser);
                } else if (next == 3 && xmlPullParser.getName().equals(TranscriptSearch.ELEMENT_NAME)) {
                    z = true;
                }
            }
            return transcriptSearch;
        }
    }

    public TranscriptSearch() {
        super(ELEMENT_NAME, "http://jivesoftware.com/protocol/workgroup");
    }
}
