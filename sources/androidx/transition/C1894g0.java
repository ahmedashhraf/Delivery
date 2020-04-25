package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.ViewGroup;
import androidx.annotation.C0193h0;
import androidx.collection.C0635a;
import androidx.core.content.p020h.C0878h;
import java.io.IOException;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.transition.g0 */
/* compiled from: TransitionInflater */
public class C1894g0 {

    /* renamed from: b */
    private static final Class<?>[] f7314b = {Context.class, AttributeSet.class};

    /* renamed from: c */
    private static final C0635a<String, Constructor<?>> f7315c = new C0635a<>();

    /* renamed from: a */
    private final Context f7316a;

    private C1894g0(@C0193h0 Context context) {
        this.f7316a = context;
    }

    /* renamed from: a */
    public static C1894g0 m10026a(Context context) {
        return new C1894g0(context);
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: b */
    private void m10030b(XmlPullParser xmlPullParser, AttributeSet attributeSet, C1880f0 f0Var) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                if (xmlPullParser.getName().equals("target")) {
                    TypedArray obtainStyledAttributes = this.f7316a.obtainStyledAttributes(attributeSet, C1861e0.f7186a);
                    int c = C0878h.m5080c(obtainStyledAttributes, xmlPullParser, "targetId", 1, 0);
                    if (c != 0) {
                        f0Var.mo8318a(c);
                    } else {
                        int c2 = C0878h.m5080c(obtainStyledAttributes, xmlPullParser, "excludeId", 2, 0);
                        if (c2 != 0) {
                            f0Var.mo8339b(c2, true);
                        } else {
                            String a = C0878h.m5072a(obtainStyledAttributes, xmlPullParser, "targetName", 4);
                            if (a != null) {
                                f0Var.mo8327a(a);
                            } else {
                                String a2 = C0878h.m5072a(obtainStyledAttributes, xmlPullParser, "excludeName", 5);
                                if (a2 != null) {
                                    f0Var.mo8328a(a2, true);
                                } else {
                                    String a3 = C0878h.m5072a(obtainStyledAttributes, xmlPullParser, "excludeClass", 3);
                                    if (a3 != null) {
                                        try {
                                            f0Var.mo8344b(Class.forName(a3), true);
                                        } catch (ClassNotFoundException e) {
                                            obtainStyledAttributes.recycle();
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("Could not create ");
                                            sb.append(a3);
                                            throw new RuntimeException(sb.toString(), e);
                                        }
                                    } else {
                                        String a4 = C0878h.m5072a(obtainStyledAttributes, xmlPullParser, "targetClass", 0);
                                        if (a4 != null) {
                                            f0Var.mo8325a(Class.forName(a4));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    obtainStyledAttributes.recycle();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unknown scene name: ");
                    sb2.append(xmlPullParser.getName());
                    throw new RuntimeException(sb2.toString());
                }
            }
        }
    }

    /* renamed from: a */
    public C1880f0 mo8390a(int i) {
        XmlResourceParser xml = this.f7316a.getResources().getXml(i);
        try {
            C1880f0 a = m10025a((XmlPullParser) xml, Xml.asAttributeSet(xml), (C1880f0) null);
            xml.close();
            return a;
        } catch (XmlPullParserException e) {
            throw new InflateException(e.getMessage(), e);
        } catch (IOException e2) {
            StringBuilder sb = new StringBuilder();
            sb.append(xml.getPositionDescription());
            sb.append(": ");
            sb.append(e2.getMessage());
            throw new InflateException(sb.toString(), e2);
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    /* renamed from: a */
    public C1906i0 mo8391a(int i, ViewGroup viewGroup) {
        XmlResourceParser xml = this.f7316a.getResources().getXml(i);
        try {
            C1906i0 a = m10027a((XmlPullParser) xml, Xml.asAttributeSet(xml), viewGroup);
            xml.close();
            return a;
        } catch (XmlPullParserException e) {
            InflateException inflateException = new InflateException(e.getMessage());
            inflateException.initCause(e);
            throw inflateException;
        } catch (IOException e2) {
            StringBuilder sb = new StringBuilder();
            sb.append(xml.getPositionDescription());
            sb.append(": ");
            sb.append(e2.getMessage());
            InflateException inflateException2 = new InflateException(sb.toString());
            inflateException2.initCause(e2);
            throw inflateException2;
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    /* renamed from: a */
    private C1880f0 m10025a(XmlPullParser xmlPullParser, AttributeSet attributeSet, C1880f0 f0Var) throws XmlPullParserException, IOException {
        C1880f0 f0Var2;
        int depth = xmlPullParser.getDepth();
        C1913k0 k0Var = f0Var instanceof C1913k0 ? (C1913k0) f0Var : null;
        loop0:
        while (true) {
            f0Var2 = null;
            while (true) {
                int next = xmlPullParser.next();
                if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                    if (next == 2) {
                        String name = xmlPullParser.getName();
                        if ("fade".equals(name)) {
                            f0Var2 = new C1916l(this.f7316a, attributeSet);
                        } else if ("changeBounds".equals(name)) {
                            f0Var2 = new C1849e(this.f7316a, attributeSet);
                        } else if ("slide".equals(name)) {
                            f0Var2 = new C1837d0(this.f7316a, attributeSet);
                        } else if ("explode".equals(name)) {
                            f0Var2 = new C1912k(this.f7316a, attributeSet);
                        } else if ("changeImageTransform".equals(name)) {
                            f0Var2 = new C1890g(this.f7316a, attributeSet);
                        } else if ("changeTransform".equals(name)) {
                            f0Var2 = new C1899i(this.f7316a, attributeSet);
                        } else if ("changeClipBounds".equals(name)) {
                            f0Var2 = new C1878f(this.f7316a, attributeSet);
                        } else if ("autoTransition".equals(name)) {
                            f0Var2 = new C1833c(this.f7316a, attributeSet);
                        } else if ("changeScroll".equals(name)) {
                            f0Var2 = new C1896h(this.f7316a, attributeSet);
                        } else if ("transitionSet".equals(name)) {
                            f0Var2 = new C1913k0(this.f7316a, attributeSet);
                        } else {
                            String str = "transition";
                            if (str.equals(name)) {
                                f0Var2 = (C1880f0) m10028a(attributeSet, C1880f0.class, str);
                            } else if ("targets".equals(name)) {
                                m10030b(xmlPullParser, attributeSet, f0Var);
                            } else if (!"arcMotion".equals(name)) {
                                String str2 = "pathMotion";
                                if (str2.equals(name)) {
                                    if (f0Var != null) {
                                        f0Var.mo8335a((C1950w) m10028a(attributeSet, C1950w.class, str2));
                                    } else {
                                        throw new RuntimeException("Invalid use of pathMotion element");
                                    }
                                } else if (!"patternPathMotion".equals(name)) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Unknown scene name: ");
                                    sb.append(xmlPullParser.getName());
                                    throw new RuntimeException(sb.toString());
                                } else if (f0Var != null) {
                                    f0Var.mo8335a((C1950w) new C1956y(this.f7316a, attributeSet));
                                } else {
                                    throw new RuntimeException("Invalid use of patternPathMotion element");
                                }
                            } else if (f0Var != null) {
                                f0Var.mo8335a((C1950w) new C1830b(this.f7316a, attributeSet));
                            } else {
                                throw new RuntimeException("Invalid use of arcMotion element");
                            }
                        }
                        if (f0Var2 == null) {
                            continue;
                        } else {
                            if (!xmlPullParser.isEmptyElementTag()) {
                                m10025a(xmlPullParser, attributeSet, f0Var2);
                            }
                            if (k0Var != null) {
                                break;
                            } else if (f0Var != null) {
                                throw new InflateException("Could not add transition to another transition.");
                            }
                        }
                    }
                }
            }
            k0Var.mo8424a(f0Var2);
        }
        return f0Var2;
    }

    /* renamed from: a */
    private Object m10028a(AttributeSet attributeSet, Class<?> cls, String str) {
        Object newInstance;
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        if (attributeValue != null) {
            try {
                synchronized (f7315c) {
                    Constructor constructor = (Constructor) f7315c.get(attributeValue);
                    if (constructor == null) {
                        Class asSubclass = Class.forName(attributeValue, false, this.f7316a.getClassLoader()).asSubclass(cls);
                        if (asSubclass != null) {
                            constructor = asSubclass.getConstructor(f7314b);
                            constructor.setAccessible(true);
                            f7315c.put(attributeValue, constructor);
                        }
                    }
                    newInstance = constructor.newInstance(new Object[]{this.f7316a, attributeSet});
                }
                return newInstance;
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not instantiate ");
                sb.append(cls);
                sb.append(" class ");
                sb.append(attributeValue);
                throw new InflateException(sb.toString(), e);
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" tag must have a 'class' attribute");
            throw new InflateException(sb2.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.transition.C1906i0 m10027a(org.xmlpull.v1.XmlPullParser r5, android.util.AttributeSet r6, android.view.ViewGroup r7) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r4 = this;
            int r0 = r5.getDepth()
            r1 = 0
        L_0x0005:
            int r2 = r5.next()
            r3 = 3
            if (r2 != r3) goto L_0x0012
            int r3 = r5.getDepth()
            if (r3 <= r0) goto L_0x0054
        L_0x0012:
            r3 = 1
            if (r2 == r3) goto L_0x0054
            r3 = 2
            if (r2 == r3) goto L_0x0019
            goto L_0x0005
        L_0x0019:
            java.lang.String r2 = r5.getName()
            java.lang.String r3 = "transitionManager"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x002b
            androidx.transition.i0 r1 = new androidx.transition.i0
            r1.<init>()
            goto L_0x0005
        L_0x002b:
            java.lang.String r3 = "transition"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x0039
            r4.m10029a(r6, r5, r7, r1)
            goto L_0x0005
        L_0x0039:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Unknown scene name: "
            r7.append(r0)
            java.lang.String r5 = r5.getName()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r6.<init>(r5)
            throw r6
        L_0x0054:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.C1894g0.m10027a(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.ViewGroup):androidx.transition.i0");
    }

    @SuppressLint({"RestrictedApi"})
    /* renamed from: a */
    private void m10029a(AttributeSet attributeSet, XmlPullParser xmlPullParser, ViewGroup viewGroup, C1906i0 i0Var) throws NotFoundException {
        C1831b0 b0Var;
        TypedArray obtainStyledAttributes = this.f7316a.obtainStyledAttributes(attributeSet, C1861e0.f7187b);
        int c = C0878h.m5080c(obtainStyledAttributes, xmlPullParser, "transition", 2, -1);
        int c2 = C0878h.m5080c(obtainStyledAttributes, xmlPullParser, "fromScene", 0, -1);
        C1831b0 b0Var2 = null;
        if (c2 < 0) {
            b0Var = null;
        } else {
            b0Var = C1831b0.m9814a(viewGroup, c2, this.f7316a);
        }
        int c3 = C0878h.m5080c(obtainStyledAttributes, xmlPullParser, "toScene", 1, -1);
        if (c3 >= 0) {
            b0Var2 = C1831b0.m9814a(viewGroup, c3, this.f7316a);
        }
        if (c >= 0) {
            C1880f0 a = mo8390a(c);
            if (a != null) {
                if (b0Var2 == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("No toScene for transition ID ");
                    sb.append(c);
                    throw new RuntimeException(sb.toString());
                } else if (b0Var == null) {
                    i0Var.mo8419a(b0Var2, a);
                } else {
                    i0Var.mo8418a(b0Var, b0Var2, a);
                }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
