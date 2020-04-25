package org.jivesoftware.smack.packet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.jivesoftware.smack.util.TypedCloneable;
import org.jivesoftware.smack.util.XmlStringBuilder;

public final class Message extends Stanza implements TypedCloneable<Message> {
    public static final String BODY = "body";
    public static final String ELEMENT = "message";
    private final Set<Body> bodies;
    private final Set<Subject> subjects;
    private String thread;
    private Type type;

    public static class Body {
        /* access modifiers changed from: private */
        public final String language;
        /* access modifiers changed from: private */
        public final String message;

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || Body.class != obj.getClass()) {
                return false;
            }
            Body body = (Body) obj;
            if (!this.language.equals(body.language) || !this.message.equals(body.message)) {
                z = false;
            }
            return z;
        }

        public String getLanguage() {
            return this.language;
        }

        public String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return ((this.language.hashCode() + 31) * 31) + this.message.hashCode();
        }

        private Body(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("Language cannot be null.");
            } else if (str2 != null) {
                this.language = str;
                this.message = str2;
            } else {
                throw new NullPointerException("Message cannot be null.");
            }
        }
    }

    public static class Subject {
        /* access modifiers changed from: private */
        public final String language;
        /* access modifiers changed from: private */
        public final String subject;

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || Subject.class != obj.getClass()) {
                return false;
            }
            Subject subject2 = (Subject) obj;
            if (!this.language.equals(subject2.language) || !this.subject.equals(subject2.subject)) {
                z = false;
            }
            return z;
        }

        public String getLanguage() {
            return this.language;
        }

        public String getSubject() {
            return this.subject;
        }

        public int hashCode() {
            return ((this.language.hashCode() + 31) * 31) + this.subject.hashCode();
        }

        private Subject(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("Language cannot be null.");
            } else if (str2 != null) {
                this.language = str;
                this.subject = str2;
            } else {
                throw new NullPointerException("Subject cannot be null.");
            }
        }
    }

    public enum Type {
        normal,
        chat,
        groupchat,
        headline,
        error;

        public static Type fromString(String str) {
            return valueOf(str.toLowerCase(Locale.US));
        }
    }

    public Message() {
        this.thread = null;
        this.subjects = new HashSet();
        this.bodies = new HashSet();
    }

    private String determineLanguage(String str) {
        if ("".equals(str)) {
            str = null;
        }
        if (str == null) {
            String str2 = this.language;
            if (str2 != null) {
                return str2;
            }
        }
        if (str == null) {
            str = Stanza.getDefaultLanguage();
        }
        return str;
    }

    private Body getMessageBody(String str) {
        String determineLanguage = determineLanguage(str);
        for (Body body : this.bodies) {
            if (determineLanguage.equals(body.language)) {
                return body;
            }
        }
        return null;
    }

    private Subject getMessageSubject(String str) {
        String determineLanguage = determineLanguage(str);
        for (Subject subject : this.subjects) {
            if (determineLanguage.equals(subject.language)) {
                return subject;
            }
        }
        return null;
    }

    public Body addBody(String str, String str2) {
        Body body = new Body(determineLanguage(str), str2);
        this.bodies.add(body);
        return body;
    }

    public Subject addSubject(String str, String str2) {
        Subject subject = new Subject(determineLanguage(str), str2);
        this.subjects.add(subject);
        return subject;
    }

    public Set<Body> getBodies() {
        return Collections.unmodifiableSet(this.bodies);
    }

    public String getBody() {
        return getBody(null);
    }

    public List<String> getBodyLanguages() {
        Body messageBody = getMessageBody(null);
        ArrayList arrayList = new ArrayList();
        for (Body body : this.bodies) {
            if (!body.equals(messageBody)) {
                arrayList.add(body.language);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public String getSubject() {
        return getSubject(null);
    }

    public List<String> getSubjectLanguages() {
        Subject messageSubject = getMessageSubject(null);
        ArrayList arrayList = new ArrayList();
        for (Subject subject : this.subjects) {
            if (!subject.equals(messageSubject)) {
                arrayList.add(subject.language);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Set<Subject> getSubjects() {
        return Collections.unmodifiableSet(this.subjects);
    }

    public String getThread() {
        return this.thread;
    }

    public Type getType() {
        Type type2 = this.type;
        return type2 == null ? Type.normal : type2;
    }

    public boolean removeBody(String str) {
        String determineLanguage = determineLanguage(str);
        for (Body body : this.bodies) {
            if (determineLanguage.equals(body.language)) {
                return this.bodies.remove(body);
            }
        }
        return false;
    }

    public boolean removeSubject(String str) {
        String determineLanguage = determineLanguage(str);
        for (Subject subject : this.subjects) {
            if (determineLanguage.equals(subject.language)) {
                return this.subjects.remove(subject);
            }
        }
        return false;
    }

    public void setBody(String str) {
        if (str == null) {
            removeBody("");
        } else {
            addBody(null, str);
        }
    }

    public void setSubject(String str) {
        if (str == null) {
            removeSubject("");
        } else {
            addSubject(null, str);
        }
    }

    public void setThread(String str) {
        this.thread = str;
    }

    public void setType(Type type2) {
        this.type = type2;
    }

    public Message clone() {
        return new Message(this);
    }

    public String getBody(String str) {
        Body messageBody = getMessageBody(str);
        if (messageBody == null) {
            return null;
        }
        return messageBody.message;
    }

    public String getSubject(String str) {
        Subject messageSubject = getMessageSubject(str);
        if (messageSubject == null) {
            return null;
        }
        return messageSubject.subject;
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
        String str = "message";
        xmlStringBuilder.halfOpenElement(str);
        addCommonAttributes(xmlStringBuilder);
        xmlStringBuilder.optAttribute("type", (Enum<?>) this.type);
        xmlStringBuilder.rightAngleBracket();
        Subject messageSubject = getMessageSubject(null);
        String str2 = "subject";
        if (messageSubject != null) {
            xmlStringBuilder.element(str2, messageSubject.subject);
        }
        for (Subject subject : getSubjects()) {
            if (!subject.equals(messageSubject)) {
                xmlStringBuilder.halfOpenElement(str2).xmllangAttribute(subject.language).rightAngleBracket();
                xmlStringBuilder.escape(subject.subject);
                xmlStringBuilder.closeElement(str2);
            }
        }
        Body messageBody = getMessageBody(null);
        String str3 = "body";
        if (messageBody != null) {
            xmlStringBuilder.element(str3, messageBody.message);
        }
        for (Body body : getBodies()) {
            if (!body.equals(messageBody)) {
                xmlStringBuilder.halfOpenElement(str3).xmllangAttribute(body.getLanguage()).rightAngleBracket();
                xmlStringBuilder.escape(body.getMessage());
                xmlStringBuilder.closeElement(str3);
            }
        }
        xmlStringBuilder.optElement("thread", this.thread);
        if (this.type == Type.error) {
            appendErrorIfExists(xmlStringBuilder);
        }
        xmlStringBuilder.append(getExtensionsXML());
        xmlStringBuilder.closeElement(str);
        return xmlStringBuilder;
    }

    public Message(String str) {
        this.thread = null;
        this.subjects = new HashSet();
        this.bodies = new HashSet();
        setTo(str);
    }

    public boolean removeBody(Body body) {
        return this.bodies.remove(body);
    }

    public boolean removeSubject(Subject subject) {
        return this.subjects.remove(subject);
    }

    public Message(String str, Type type2) {
        this(str);
        setType(type2);
    }

    public Message(String str, String str2) {
        this(str);
        setBody(str2);
    }

    public Message(Message message) {
        super((Stanza) message);
        this.thread = null;
        this.subjects = new HashSet();
        this.bodies = new HashSet();
        this.type = message.type;
        this.thread = message.thread;
        this.subjects.addAll(message.subjects);
        this.bodies.addAll(message.bodies);
    }
}
