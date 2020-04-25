package org.jivesoftware.smackx.workgroup.packet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TimeZone;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.IQChildElementXmlStringBuilder;
import org.jivesoftware.smack.provider.IQProvider;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class OccupantsInfo extends C15617IQ {
    public static final String ELEMENT_NAME = "occupants-info";
    public static final String NAMESPACE = "http://jivesoftware.com/protocol/workgroup";
    /* access modifiers changed from: private */
    public static final SimpleDateFormat UTC_FORMAT = new SimpleDateFormat("yyyyMMdd'T'HH:mm:ss");
    /* access modifiers changed from: private */
    public final Set<OccupantInfo> occupants = new HashSet();
    private String roomID;

    public static class OccupantInfo {
        private String jid;
        private Date joined;
        private String nickname;

        public OccupantInfo(String str, String str2, Date date) {
            this.jid = str;
            this.nickname = str2;
            this.joined = date;
        }

        public String getJID() {
            return this.jid;
        }

        public Date getJoined() {
            return this.joined;
        }

        public String getNickname() {
            return this.nickname;
        }
    }

    public static class Provider extends IQProvider<OccupantsInfo> {
        private OccupantInfo parseOccupantInfo(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            String str = null;
            boolean z = false;
            String str2 = null;
            Date date = null;
            while (!z) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if ("jid".equals(xmlPullParser.getName())) {
                        str = xmlPullParser.nextText();
                    }
                }
                if (next == 2) {
                    if ("nickname".equals(xmlPullParser.getName())) {
                        str2 = xmlPullParser.nextText();
                    }
                }
                if (next == 2) {
                    if ("joined".equals(xmlPullParser.getName())) {
                        try {
                            date = OccupantsInfo.UTC_FORMAT.parse(xmlPullParser.nextText());
                        } catch (ParseException e) {
                            new SmackException((Throwable) e);
                        }
                    }
                }
                if (next == 3) {
                    if ("occupant".equals(xmlPullParser.getName())) {
                        z = true;
                    }
                }
            }
            return new OccupantInfo(str, str2, date);
        }

        public OccupantsInfo parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
            OccupantsInfo occupantsInfo = new OccupantsInfo(xmlPullParser.getAttributeValue("", "roomID"));
            boolean z = false;
            while (!z) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if ("occupant".equals(xmlPullParser.getName())) {
                        occupantsInfo.occupants.add(parseOccupantInfo(xmlPullParser));
                    }
                }
                if (next == 3) {
                    if (OccupantsInfo.ELEMENT_NAME.equals(xmlPullParser.getName())) {
                        z = true;
                    }
                }
            }
            return occupantsInfo;
        }
    }

    static {
        UTC_FORMAT.setTimeZone(TimeZone.getTimeZone("GMT+0"));
    }

    public OccupantsInfo(String str) {
        super(ELEMENT_NAME, "http://jivesoftware.com/protocol/workgroup");
        this.roomID = str;
    }

    /* access modifiers changed from: protected */
    public IQChildElementXmlStringBuilder getIQChildElementBuilder(IQChildElementXmlStringBuilder iQChildElementXmlStringBuilder) {
        iQChildElementXmlStringBuilder.append((CharSequence) "\" roomID=\"").append((CharSequence) this.roomID).append((CharSequence) "\">");
        synchronized (this.occupants) {
            for (OccupantInfo occupantInfo : this.occupants) {
                iQChildElementXmlStringBuilder.append((CharSequence) "<occupant>");
                iQChildElementXmlStringBuilder.append((CharSequence) "<jid>");
                iQChildElementXmlStringBuilder.append((CharSequence) occupantInfo.getJID());
                iQChildElementXmlStringBuilder.append((CharSequence) "</jid>");
                iQChildElementXmlStringBuilder.append((CharSequence) "<name>");
                iQChildElementXmlStringBuilder.append((CharSequence) occupantInfo.getNickname());
                iQChildElementXmlStringBuilder.append((CharSequence) "</name>");
                iQChildElementXmlStringBuilder.append((CharSequence) "<joined>");
                iQChildElementXmlStringBuilder.append((CharSequence) UTC_FORMAT.format(occupantInfo.getJoined()));
                iQChildElementXmlStringBuilder.append((CharSequence) "</joined>");
                iQChildElementXmlStringBuilder.append((CharSequence) "</occupant>");
            }
        }
        return iQChildElementXmlStringBuilder;
    }

    public Set<OccupantInfo> getOccupants() {
        return Collections.unmodifiableSet(this.occupants);
    }

    public int getOccupantsCount() {
        return this.occupants.size();
    }

    public String getRoomID() {
        return this.roomID;
    }
}
