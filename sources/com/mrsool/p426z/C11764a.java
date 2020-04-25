package com.mrsool.p426z;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.jivesoftware.smack.packet.Stanza;
import org.jivesoftware.smack.util.TypedCloneable;
import org.jivesoftware.smack.util.XmlStringBuilder;

/* renamed from: com.mrsool.z.a */
/* compiled from: CustomXmppMessage */
public final class C11764a extends Stanza implements TypedCloneable<C11764a> {

    /* renamed from: Q */
    public static final String f34017Q = "message";

    /* renamed from: R */
    public static final String f34018R = "body";

    /* renamed from: N */
    private String f34019N;

    /* renamed from: O */
    private final Set<C11767c> f34020O;

    /* renamed from: P */
    private final Set<C11766b> f34021P;

    /* renamed from: a */
    private C11768d f34022a;

    /* renamed from: b */
    private String f34023b;

    /* renamed from: com.mrsool.z.a$b */
    /* compiled from: CustomXmppMessage */
    public static class C11766b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f34024a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final String f34025b;

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C11766b.class != obj.getClass()) {
                return false;
            }
            C11766b bVar = (C11766b) obj;
            if (!this.f34025b.equals(bVar.f34025b) || !this.f34024a.equals(bVar.f34024a)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return ((this.f34025b.hashCode() + 31) * 31) + this.f34024a.hashCode();
        }

        private C11766b(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("Language cannot be null.");
            } else if (str2 != null) {
                this.f34025b = str;
                this.f34024a = str2;
            } else {
                throw new NullPointerException("Message cannot be null.");
            }
        }

        /* renamed from: a */
        public String mo40296a() {
            return this.f34025b;
        }

        /* renamed from: b */
        public String mo40297b() {
            return this.f34024a;
        }
    }

    /* renamed from: com.mrsool.z.a$c */
    /* compiled from: CustomXmppMessage */
    public static class C11767c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f34026a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final String f34027b;

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C11767c.class != obj.getClass()) {
                return false;
            }
            C11767c cVar = (C11767c) obj;
            if (!this.f34027b.equals(cVar.f34027b) || !this.f34026a.equals(cVar.f34026a)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return ((this.f34027b.hashCode() + 31) * 31) + this.f34026a.hashCode();
        }

        private C11767c(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("Language cannot be null.");
            } else if (str2 != null) {
                this.f34027b = str;
                this.f34026a = str2;
            } else {
                throw new NullPointerException("Subject cannot be null.");
            }
        }

        /* renamed from: a */
        public String mo40300a() {
            return this.f34027b;
        }

        /* renamed from: b */
        public String mo40301b() {
            return this.f34026a;
        }
    }

    /* renamed from: com.mrsool.z.a$d */
    /* compiled from: CustomXmppMessage */
    public enum C11768d {
        normal,
        chat,
        groupchat,
        headline,
        error;

        /* renamed from: b */
        public static C11768d m52914b(String str) {
            return valueOf(str.toLowerCase(Locale.US));
        }
    }

    public C11764a() {
        this.f34023b = null;
        this.f34020O = new HashSet();
        this.f34021P = new HashSet();
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

    private C11766b getMessageBody(String str) {
        String determineLanguage = determineLanguage(str);
        for (C11766b bVar : this.f34021P) {
            if (determineLanguage.equals(bVar.f34025b)) {
                return bVar;
            }
        }
        return null;
    }

    private C11767c getMessageSubject(String str) {
        String determineLanguage = determineLanguage(str);
        for (C11767c cVar : this.f34020O) {
            if (determineLanguage.equals(cVar.f34027b)) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public String mo40272a() {
        return this.f34019N;
    }

    public C11766b addBody(String str, String str2) {
        C11766b bVar = new C11766b(determineLanguage(str), str2);
        this.f34021P.add(bVar);
        return bVar;
    }

    public C11767c addSubject(String str, String str2) {
        C11767c cVar = new C11767c(determineLanguage(str), str2);
        this.f34020O.add(cVar);
        return cVar;
    }

    public Set<C11766b> getBodies() {
        return Collections.unmodifiableSet(this.f34021P);
    }

    public String getBody() {
        return getBody(null);
    }

    public List<String> getBodyLanguages() {
        C11766b messageBody = getMessageBody(null);
        ArrayList arrayList = new ArrayList();
        for (C11766b bVar : this.f34021P) {
            if (!bVar.equals(messageBody)) {
                arrayList.add(bVar.f34025b);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public String getSubject() {
        return getSubject(null);
    }

    public List<String> getSubjectLanguages() {
        C11767c messageSubject = getMessageSubject(null);
        ArrayList arrayList = new ArrayList();
        for (C11767c cVar : this.f34020O) {
            if (!cVar.equals(messageSubject)) {
                arrayList.add(cVar.f34027b);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Set<C11767c> getSubjects() {
        return Collections.unmodifiableSet(this.f34020O);
    }

    public String getThread() {
        return this.f34023b;
    }

    public C11768d getType() {
        C11768d dVar = this.f34022a;
        return dVar == null ? C11768d.normal : dVar;
    }

    public boolean removeBody(String str) {
        String determineLanguage = determineLanguage(str);
        for (C11766b bVar : this.f34021P) {
            if (determineLanguage.equals(bVar.f34025b)) {
                return this.f34021P.remove(bVar);
            }
        }
        return false;
    }

    public boolean removeSubject(String str) {
        String determineLanguage = determineLanguage(str);
        for (C11767c cVar : this.f34020O) {
            if (determineLanguage.equals(cVar.f34027b)) {
                return this.f34020O.remove(cVar);
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
        this.f34023b = str;
    }

    /* renamed from: a */
    public void mo40274a(String str) {
        this.f34019N = str;
    }

    public C11764a clone() {
        return new C11764a(this);
    }

    public String getBody(String str) {
        C11766b messageBody = getMessageBody(str);
        if (messageBody == null) {
            return null;
        }
        return messageBody.f34024a;
    }

    public String getSubject(String str) {
        C11767c messageSubject = getMessageSubject(str);
        if (messageSubject == null) {
            return null;
        }
        return messageSubject.f34026a;
    }

    public XmlStringBuilder toXML() {
        XmlStringBuilder xmlStringBuilder = new XmlStringBuilder();
        String str = "message";
        xmlStringBuilder.halfOpenElement(str);
        addCommonAttributes(xmlStringBuilder);
        xmlStringBuilder.optAttribute("type", (Enum<?>) this.f34022a);
        xmlStringBuilder.optAttribute("iOrderID", this.f34019N);
        xmlStringBuilder.rightAngleBracket();
        C11767c messageSubject = getMessageSubject(null);
        String str2 = "subject";
        if (messageSubject != null) {
            xmlStringBuilder.element(str2, messageSubject.f34026a);
        }
        for (C11767c cVar : getSubjects()) {
            if (!cVar.equals(messageSubject)) {
                xmlStringBuilder.halfOpenElement(str2).xmllangAttribute(cVar.f34027b).rightAngleBracket();
                xmlStringBuilder.escape(cVar.f34026a);
                xmlStringBuilder.closeElement(str2);
            }
        }
        C11766b messageBody = getMessageBody(null);
        String str3 = "body";
        if (messageBody != null) {
            xmlStringBuilder.element(str3, messageBody.f34024a);
        }
        for (C11766b bVar : getBodies()) {
            if (!bVar.equals(messageBody)) {
                xmlStringBuilder.halfOpenElement(str3).xmllangAttribute(bVar.mo40296a()).rightAngleBracket();
                xmlStringBuilder.escape(bVar.mo40297b());
                xmlStringBuilder.closeElement(str3);
            }
        }
        xmlStringBuilder.optElement("thread", this.f34023b);
        if (this.f34022a == C11768d.error) {
            appendErrorIfExists(xmlStringBuilder);
        }
        xmlStringBuilder.append(getExtensionsXML());
        xmlStringBuilder.closeElement(str);
        return xmlStringBuilder;
    }

    /* renamed from: a */
    public void mo40273a(C11768d dVar) {
        this.f34022a = dVar;
    }

    /* renamed from: a */
    public boolean mo40276a(C11767c cVar) {
        return this.f34020O.remove(cVar);
    }

    public C11764a(String str) {
        this.f34023b = null;
        this.f34020O = new HashSet();
        this.f34021P = new HashSet();
        setTo(str);
    }

    /* renamed from: a */
    public boolean mo40275a(C11766b bVar) {
        return this.f34021P.remove(bVar);
    }

    public C11764a(String str, C11768d dVar) {
        this(str);
        mo40273a(dVar);
    }

    public C11764a(String str, String str2) {
        this(str);
        setBody(str2);
    }

    public C11764a(C11764a aVar) {
        super((Stanza) aVar);
        this.f34023b = null;
        this.f34020O = new HashSet();
        this.f34021P = new HashSet();
        this.f34022a = aVar.f34022a;
        this.f34023b = aVar.f34023b;
        this.f34019N = aVar.f34019N;
        this.f34020O.addAll(aVar.f34020O);
        this.f34021P.addAll(aVar.f34021P);
    }
}
