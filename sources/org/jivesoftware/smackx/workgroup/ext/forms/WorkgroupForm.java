package org.jivesoftware.smackx.workgroup.ext.forms;

import java.io.IOException;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.packet.SimpleIQ;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.util.PacketParserUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class WorkgroupForm extends SimpleIQ {
    public static final String ELEMENT_NAME = "workgroup-form";
    public static final String NAMESPACE = "http://jivesoftware.com/protocol/workgroup";

    public static class InternalProvider extends IQProvider<WorkgroupForm> {
        public WorkgroupForm parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException, SmackException {
            WorkgroupForm workgroupForm = new WorkgroupForm();
            boolean z = false;
            while (!z) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    PacketParserUtils.addExtensionElement((Stanza) workgroupForm, xmlPullParser);
                } else if (next == 3 && xmlPullParser.getName().equals(WorkgroupForm.ELEMENT_NAME)) {
                    z = true;
                }
            }
            return workgroupForm;
        }
    }

    public WorkgroupForm() {
        super(ELEMENT_NAME, "http://jivesoftware.com/protocol/workgroup");
    }
}
