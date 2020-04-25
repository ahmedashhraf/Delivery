package org.jivesoftware.smackx.workgroup.packet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smackx.time.packet.Time;
import org.jivesoftware.smackx.workgroup.agent.WorkgroupQueue.Status;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class QueueOverview implements ExtensionElement {
    private static final String DATE_FORMAT = "yyyyMMdd'T'HH:mm:ss";
    public static String ELEMENT_NAME = "notify-queue";
    public static String NAMESPACE = "http://jabber.org/protocol/workgroup";
    private int averageWaitTime = -1;
    private SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
    private Date oldestEntry = null;
    private Status status = null;
    private int userCount = -1;

    public static class Provider extends ExtensionElementProvider<QueueOverview> {
        public QueueOverview parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException, SmackException {
            xmlPullParser.getEventType();
            QueueOverview queueOverview = new QueueOverview();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(QueueOverview.DATE_FORMAT);
            int next = xmlPullParser.next();
            while (true) {
                if (next == 3 && QueueOverview.ELEMENT_NAME.equals(xmlPullParser.getName())) {
                    return queueOverview;
                }
                if ("count".equals(xmlPullParser.getName())) {
                    queueOverview.setUserCount(Integer.parseInt(xmlPullParser.nextText()));
                } else {
                    if (Time.ELEMENT.equals(xmlPullParser.getName())) {
                        queueOverview.setAverageWaitTime(Integer.parseInt(xmlPullParser.nextText()));
                    } else {
                        if ("oldest".equals(xmlPullParser.getName())) {
                            try {
                                queueOverview.setOldestEntry(simpleDateFormat.parse(xmlPullParser.nextText()));
                            } catch (ParseException e) {
                                throw new SmackException((Throwable) e);
                            }
                        } else {
                            if ("status".equals(xmlPullParser.getName())) {
                                queueOverview.setStatus(Status.fromString(xmlPullParser.nextText()));
                            }
                        }
                    }
                }
                next = xmlPullParser.next();
            }
        }
    }

    QueueOverview() {
    }

    public int getAverageWaitTime() {
        return this.averageWaitTime;
    }

    public String getElementName() {
        return ELEMENT_NAME;
    }

    public String getNamespace() {
        return NAMESPACE;
    }

    public Date getOldestEntry() {
        return this.oldestEntry;
    }

    public Status getStatus() {
        return this.status;
    }

    public int getUserCount() {
        return this.userCount;
    }

    /* access modifiers changed from: 0000 */
    public void setAverageWaitTime(int i) {
        this.averageWaitTime = i;
    }

    /* access modifiers changed from: 0000 */
    public void setOldestEntry(Date date) {
        this.oldestEntry = date;
    }

    /* access modifiers changed from: 0000 */
    public void setStatus(Status status2) {
        this.status = status2;
    }

    /* access modifiers changed from: 0000 */
    public void setUserCount(int i) {
        this.userCount = i;
    }

    public String toXML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(ELEMENT_NAME);
        sb.append(" xmlns=\"");
        sb.append(NAMESPACE);
        sb.append("\">");
        if (this.userCount != -1) {
            sb.append("<count>");
            sb.append(this.userCount);
            sb.append("</count>");
        }
        if (this.oldestEntry != null) {
            sb.append("<oldest>");
            sb.append(this.dateFormat.format(this.oldestEntry));
            sb.append("</oldest>");
        }
        if (this.averageWaitTime != -1) {
            sb.append("<time>");
            sb.append(this.averageWaitTime);
            sb.append("</time>");
        }
        if (this.status != null) {
            sb.append("<status>");
            sb.append(this.status);
            sb.append("</status>");
        }
        sb.append("</");
        sb.append(ELEMENT_NAME);
        sb.append(">");
        return sb.toString();
    }
}
