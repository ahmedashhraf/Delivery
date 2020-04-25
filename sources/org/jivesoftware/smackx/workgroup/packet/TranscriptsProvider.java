package org.jivesoftware.smackx.workgroup.packet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import org.jivesoftware.smack.provider.IQProvider;
import org.jivesoftware.smackx.workgroup.packet.Transcripts.AgentDetail;
import org.jivesoftware.smackx.workgroup.packet.Transcripts.TranscriptSummary;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class TranscriptsProvider extends IQProvider<Transcripts> {
    private static final SimpleDateFormat UTC_FORMAT = new SimpleDateFormat("yyyyMMdd'T'HH:mm:ss");

    static {
        UTC_FORMAT.setTimeZone(TimeZone.getTimeZone("GMT+0"));
    }

    private List<AgentDetail> parseAgents(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        while (true) {
            String str = null;
            Date date = null;
            Date date2 = null;
            while (true) {
                if (z) {
                    return arrayList;
                }
                int next = xmlPullParser.next();
                String str2 = "agent";
                if (next == 2) {
                    if (xmlPullParser.getName().equals("agentJID")) {
                        str = xmlPullParser.nextText();
                    } else if (xmlPullParser.getName().equals("joinTime")) {
                        try {
                            date = UTC_FORMAT.parse(xmlPullParser.nextText());
                        } catch (ParseException unused) {
                        }
                    } else if (xmlPullParser.getName().equals("leftTime")) {
                        date2 = UTC_FORMAT.parse(xmlPullParser.nextText());
                    } else if (xmlPullParser.getName().equals(str2)) {
                    }
                } else if (next == 3) {
                    if (xmlPullParser.getName().equals("agents")) {
                        z = true;
                    } else if (xmlPullParser.getName().equals(str2)) {
                        arrayList.add(new AgentDetail(str, date, date2));
                    }
                }
            }
        }
    }

    private TranscriptSummary parseSummary(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String attributeValue = xmlPullParser.getAttributeValue("", "sessionID");
        Date date = null;
        boolean z = false;
        List arrayList = new ArrayList();
        Date date2 = null;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("joinTime")) {
                    try {
                        date = UTC_FORMAT.parse(xmlPullParser.nextText());
                    } catch (ParseException unused) {
                    }
                } else if (xmlPullParser.getName().equals("leftTime")) {
                    date2 = UTC_FORMAT.parse(xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals("agents")) {
                    arrayList = parseAgents(xmlPullParser);
                }
            } else if (next == 3 && xmlPullParser.getName().equals("transcript")) {
                z = true;
            }
        }
        return new TranscriptSummary(attributeValue, date, date2, arrayList);
    }

    public Transcripts parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue("", "userID");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("transcript")) {
                    arrayList.add(parseSummary(xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("transcripts")) {
                z = true;
            }
        }
        return new Transcripts(attributeValue, arrayList);
    }
}
