package org.jivesoftware.smackx.workgroup.settings;

import java.io.IOException;
import org.jivesoftware.smack.packet.SimpleIQ;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smack.util.stringencoder.Base64;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class SoundSettings extends SimpleIQ {
    public static final String ELEMENT_NAME = "sound-settings";
    public static final String NAMESPACE = "http://jivesoftware.com/protocol/workgroup";
    private String incomingSound;
    private String outgoingSound;

    public static class InternalProvider extends IQProvider<SoundSettings> {
        public SoundSettings parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
            SoundSettings soundSettings = new SoundSettings();
            boolean z = false;
            while (!z) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if ("outgoingSound".equals(xmlPullParser.getName())) {
                        soundSettings.setOutgoingSound(xmlPullParser.nextText());
                    }
                }
                if (next == 2) {
                    if ("incomingSound".equals(xmlPullParser.getName())) {
                        soundSettings.setIncomingSound(xmlPullParser.nextText());
                    }
                }
                if (next == 3) {
                    if (SoundSettings.ELEMENT_NAME.equals(xmlPullParser.getName())) {
                        z = true;
                    }
                }
            }
            return soundSettings;
        }
    }

    public SoundSettings() {
        super(ELEMENT_NAME, "http://jivesoftware.com/protocol/workgroup");
    }

    public byte[] getIncomingSoundBytes() {
        return Base64.decode(this.incomingSound);
    }

    public byte[] getOutgoingSoundBytes() {
        return Base64.decode(this.outgoingSound);
    }

    public void setIncomingSound(String str) {
        this.incomingSound = str;
    }

    public void setOutgoingSound(String str) {
        this.outgoingSound = str;
    }
}
