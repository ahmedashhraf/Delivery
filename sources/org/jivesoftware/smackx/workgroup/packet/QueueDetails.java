package org.jivesoftware.smackx.workgroup.packet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.packet.ExtensionElement;
import org.jivesoftware.smack.provider.ExtensionElementProvider;
import org.jivesoftware.smackx.time.packet.Time;
import org.jivesoftware.smackx.workgroup.QueueUser;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class QueueDetails implements ExtensionElement {
    private static final String DATE_FORMAT = "yyyyMMdd'T'HH:mm:ss";
    public static final String ELEMENT_NAME = "notify-queue-details";
    /* access modifiers changed from: private */
    public static final Logger LOGGER = Logger.getLogger(QueueDetails.class.getName());
    public static final String NAMESPACE = "http://jabber.org/protocol/workgroup";
    private SimpleDateFormat dateFormat;
    private Set<QueueUser> users;

    public static class Provider extends ExtensionElementProvider<QueueDetails> {
        public QueueDetails parse(XmlPullParser xmlPullParser, int i) throws XmlPullParserException, IOException, SmackException {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(QueueDetails.DATE_FORMAT);
            QueueDetails queueDetails = new QueueDetails();
            int eventType = xmlPullParser.getEventType();
            while (eventType != 3) {
                if (!QueueDetails.ELEMENT_NAME.equals(xmlPullParser.getName())) {
                    break;
                }
                eventType = xmlPullParser.next();
                while (eventType == 2) {
                    String str = "user";
                    if (!str.equals(xmlPullParser.getName())) {
                        break;
                    }
                    String attributeValue = xmlPullParser.getAttributeValue("", "jid");
                    int next = xmlPullParser.next();
                    int i2 = -1;
                    Date date = null;
                    int i3 = -1;
                    while (true) {
                        if (next == 3 && str.equals(xmlPullParser.getName())) {
                            break;
                        }
                        if ("position".equals(xmlPullParser.getName())) {
                            i2 = Integer.parseInt(xmlPullParser.nextText());
                        } else {
                            if (Time.ELEMENT.equals(xmlPullParser.getName())) {
                                i3 = Integer.parseInt(xmlPullParser.nextText());
                            } else {
                                if ("join-time".equals(xmlPullParser.getName())) {
                                    try {
                                        date = simpleDateFormat.parse(xmlPullParser.nextText());
                                    } catch (ParseException e) {
                                        throw new SmackException((Throwable) e);
                                    }
                                } else if (xmlPullParser.getName().equals("waitTime")) {
                                    try {
                                        QueueDetails.LOGGER.fine(simpleDateFormat.parse(xmlPullParser.nextText()).toString());
                                    } catch (ParseException e2) {
                                        throw new SmackException((Throwable) e2);
                                    }
                                }
                            }
                        }
                        next = xmlPullParser.next();
                    }
                    queueDetails.addUser(new QueueUser(attributeValue, i2, i3, date));
                    eventType = xmlPullParser.next();
                }
            }
            return queueDetails;
        }
    }

    /* access modifiers changed from: private */
    public void addUser(QueueUser queueUser) {
        synchronized (this.users) {
            this.users.add(queueUser);
        }
    }

    public String getElementName() {
        return ELEMENT_NAME;
    }

    public String getNamespace() {
        return "http://jabber.org/protocol/workgroup";
    }

    public int getUserCount() {
        return this.users.size();
    }

    public Set<QueueUser> getUsers() {
        Set<QueueUser> set;
        synchronized (this.users) {
            set = this.users;
        }
        return set;
    }

    private QueueDetails() {
        this.dateFormat = new SimpleDateFormat(DATE_FORMAT);
        this.users = new HashSet();
    }

    public String toXML() {
        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(ELEMENT_NAME);
        sb.append(" xmlns=\"");
        sb.append("http://jabber.org/protocol/workgroup");
        sb.append("\">");
        synchronized (this.users) {
            for (QueueUser queueUser : this.users) {
                int queuePosition = queueUser.getQueuePosition();
                int estimatedRemainingTime = queueUser.getEstimatedRemainingTime();
                Date queueJoinTimestamp = queueUser.getQueueJoinTimestamp();
                sb.append("<user jid=\"");
                sb.append(queueUser.getUserID());
                sb.append("\">");
                if (queuePosition != -1) {
                    sb.append("<position>");
                    sb.append(queuePosition);
                    sb.append("</position>");
                }
                if (estimatedRemainingTime != -1) {
                    sb.append("<time>");
                    sb.append(estimatedRemainingTime);
                    sb.append("</time>");
                }
                if (queueJoinTimestamp != null) {
                    sb.append("<join-time>");
                    sb.append(this.dateFormat.format(queueJoinTimestamp));
                    sb.append("</join-time>");
                }
                sb.append("</user>");
            }
        }
        sb.append("</");
        sb.append(ELEMENT_NAME);
        sb.append(">");
        return sb.toString();
    }
}
