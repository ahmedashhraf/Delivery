package org.jivesoftware.smackx.workgroup.packet;

import java.io.IOException;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smackx.workgroup.MetaData;
import org.jivesoftware.smackx.workgroup.util.MetaDataUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class MetaDataProvider extends ExtensionElementProvider<MetaData> {
    public MetaData parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
        return new MetaData(MetaDataUtils.parseMetaData(xmlPullParser));
    }
}
