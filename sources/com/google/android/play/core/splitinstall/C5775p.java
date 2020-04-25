package com.google.android.play.core.splitinstall;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.google.android.play.core.splitinstall.p */
final class C5775p {

    /* renamed from: a */
    private final XmlPullParser f16653a;

    /* renamed from: b */
    private final C7187v f16654b = new C7187v();

    C5775p(XmlPullParser xmlPullParser) {
        this.f16653a = xmlPullParser;
    }

    /* renamed from: a */
    private final String m25328a(String str) {
        for (int i = 0; i < this.f16653a.getAttributeCount(); i++) {
            if (this.f16653a.getAttributeName(i).equals(str)) {
                return this.f16653a.getAttributeValue(i);
            }
        }
        return null;
    }

    /* renamed from: b */
    private final void m25329b() throws IOException, XmlPullParserException {
        int i = 1;
        while (i != 0) {
            int next = this.f16653a.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C5778s mo23059a() {
        while (this.f16653a.next() != 1) {
            try {
                if (this.f16653a.getEventType() == 2) {
                    if (this.f16653a.getName().equals("splits")) {
                        while (this.f16653a.next() != 3) {
                            if (this.f16653a.getEventType() == 2) {
                                if (this.f16653a.getName().equals("module")) {
                                    String a = m25328a("name");
                                    if (a != null) {
                                        while (this.f16653a.next() != 3) {
                                            if (this.f16653a.getEventType() == 2) {
                                                if (this.f16653a.getName().equals("language")) {
                                                    while (this.f16653a.next() != 3) {
                                                        if (this.f16653a.getEventType() == 2) {
                                                            if (this.f16653a.getName().equals("entry")) {
                                                                String a2 = m25328a("key");
                                                                String a3 = m25328a("split");
                                                                m25329b();
                                                                if (!(a2 == null || a3 == null)) {
                                                                    this.f16654b.mo28608a(a, a2, a3);
                                                                }
                                                            } else {
                                                                m25329b();
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    m25329b();
                                                }
                                            }
                                        }
                                    }
                                }
                                m25329b();
                            }
                        }
                    } else {
                        m25329b();
                    }
                }
            } catch (IOException | IllegalStateException | XmlPullParserException unused) {
                return null;
            }
        }
        return this.f16654b.mo28607a();
    }
}
