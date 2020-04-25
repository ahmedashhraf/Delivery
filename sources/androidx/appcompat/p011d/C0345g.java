package androidx.appcompat.p011d;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff.Mode;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.C0183c0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.appcompat.C0238R;
import androidx.appcompat.view.menu.C0375j;
import androidx.appcompat.view.menu.C0377k;
import androidx.appcompat.widget.C0469a0;
import androidx.appcompat.widget.C0549t0;
import androidx.core.p024e.p025b.C0886a;
import androidx.core.p034l.C0950b;
import androidx.core.p034l.C1003n;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@C0207n0({C0208a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.d.g */
/* compiled from: SupportMenuInflater */
public class C0345g extends MenuInflater {

    /* renamed from: e */
    static final String f1131e = "SupportMenuInflater";

    /* renamed from: f */
    private static final String f1132f = "menu";

    /* renamed from: g */
    private static final String f1133g = "group";

    /* renamed from: h */
    private static final String f1134h = "item";

    /* renamed from: i */
    static final int f1135i = 0;

    /* renamed from: j */
    static final Class<?>[] f1136j = {Context.class};

    /* renamed from: k */
    static final Class<?>[] f1137k = f1136j;

    /* renamed from: a */
    final Object[] f1138a;

    /* renamed from: b */
    final Object[] f1139b = this.f1138a;

    /* renamed from: c */
    Context f1140c;

    /* renamed from: d */
    private Object f1141d;

    /* renamed from: androidx.appcompat.d.g$a */
    /* compiled from: SupportMenuInflater */
    private static class C0346a implements OnMenuItemClickListener {

        /* renamed from: c */
        private static final Class<?>[] f1142c = {MenuItem.class};

        /* renamed from: a */
        private Object f1143a;

        /* renamed from: b */
        private Method f1144b;

        public C0346a(Object obj, String str) {
            this.f1143a = obj;
            Class cls = obj.getClass();
            try {
                this.f1144b = cls.getMethod(str, f1142c);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Couldn't resolve menu item onClick handler ");
                sb.append(str);
                sb.append(" in class ");
                sb.append(cls.getName());
                InflateException inflateException = new InflateException(sb.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f1144b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f1144b.invoke(this.f1143a, new Object[]{menuItem})).booleanValue();
                }
                this.f1144b.invoke(this.f1143a, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: androidx.appcompat.d.g$b */
    /* compiled from: SupportMenuInflater */
    private class C0347b {

        /* renamed from: G */
        private static final int f1145G = 0;

        /* renamed from: H */
        private static final int f1146H = 0;

        /* renamed from: I */
        private static final int f1147I = 0;

        /* renamed from: J */
        private static final int f1148J = 0;

        /* renamed from: K */
        private static final int f1149K = 0;

        /* renamed from: L */
        private static final boolean f1150L = false;

        /* renamed from: M */
        private static final boolean f1151M = true;

        /* renamed from: N */
        private static final boolean f1152N = true;

        /* renamed from: A */
        C0950b f1153A;

        /* renamed from: B */
        private CharSequence f1154B;

        /* renamed from: C */
        private CharSequence f1155C;

        /* renamed from: D */
        private ColorStateList f1156D = null;

        /* renamed from: E */
        private Mode f1157E = null;

        /* renamed from: a */
        private Menu f1159a;

        /* renamed from: b */
        private int f1160b;

        /* renamed from: c */
        private int f1161c;

        /* renamed from: d */
        private int f1162d;

        /* renamed from: e */
        private int f1163e;

        /* renamed from: f */
        private boolean f1164f;

        /* renamed from: g */
        private boolean f1165g;

        /* renamed from: h */
        private boolean f1166h;

        /* renamed from: i */
        private int f1167i;

        /* renamed from: j */
        private int f1168j;

        /* renamed from: k */
        private CharSequence f1169k;

        /* renamed from: l */
        private CharSequence f1170l;

        /* renamed from: m */
        private int f1171m;

        /* renamed from: n */
        private char f1172n;

        /* renamed from: o */
        private int f1173o;

        /* renamed from: p */
        private char f1174p;

        /* renamed from: q */
        private int f1175q;

        /* renamed from: r */
        private int f1176r;

        /* renamed from: s */
        private boolean f1177s;

        /* renamed from: t */
        private boolean f1178t;

        /* renamed from: u */
        private boolean f1179u;

        /* renamed from: v */
        private int f1180v;

        /* renamed from: w */
        private int f1181w;

        /* renamed from: x */
        private String f1182x;

        /* renamed from: y */
        private String f1183y;

        /* renamed from: z */
        private String f1184z;

        public C0347b(Menu menu) {
            this.f1159a = menu;
            mo1362d();
        }

        /* renamed from: a */
        public void mo1358a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0345g.this.f1140c.obtainStyledAttributes(attributeSet, C0238R.styleable.MenuGroup);
            this.f1160b = obtainStyledAttributes.getResourceId(C0238R.styleable.MenuGroup_android_id, 0);
            this.f1161c = obtainStyledAttributes.getInt(C0238R.styleable.MenuGroup_android_menuCategory, 0);
            this.f1162d = obtainStyledAttributes.getInt(C0238R.styleable.MenuGroup_android_orderInCategory, 0);
            this.f1163e = obtainStyledAttributes.getInt(C0238R.styleable.MenuGroup_android_checkableBehavior, 0);
            this.f1164f = obtainStyledAttributes.getBoolean(C0238R.styleable.MenuGroup_android_visible, true);
            this.f1165g = obtainStyledAttributes.getBoolean(C0238R.styleable.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: b */
        public void mo1360b(AttributeSet attributeSet) {
            C0549t0 a = C0549t0.m2909a(C0345g.this.f1140c, attributeSet, C0238R.styleable.MenuItem);
            this.f1167i = a.mo2888g(C0238R.styleable.MenuItem_android_id, 0);
            this.f1168j = (a.mo2880d(C0238R.styleable.MenuItem_android_menuCategory, this.f1161c) & C0886a.f4059c) | (a.mo2880d(C0238R.styleable.MenuItem_android_orderInCategory, this.f1162d) & 65535);
            this.f1169k = a.mo2889g(C0238R.styleable.MenuItem_android_title);
            this.f1170l = a.mo2889g(C0238R.styleable.MenuItem_android_titleCondensed);
            this.f1171m = a.mo2888g(C0238R.styleable.MenuItem_android_icon, 0);
            this.f1172n = m1934a(a.mo2886f(C0238R.styleable.MenuItem_android_alphabeticShortcut));
            this.f1173o = a.mo2880d(C0238R.styleable.MenuItem_alphabeticModifiers, 4096);
            this.f1174p = m1934a(a.mo2886f(C0238R.styleable.MenuItem_android_numericShortcut));
            this.f1175q = a.mo2880d(C0238R.styleable.MenuItem_numericModifiers, 4096);
            if (a.mo2892j(C0238R.styleable.MenuItem_android_checkable)) {
                this.f1176r = a.mo2871a(C0238R.styleable.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.f1176r = this.f1163e;
            }
            this.f1177s = a.mo2871a(C0238R.styleable.MenuItem_android_checked, false);
            this.f1178t = a.mo2871a(C0238R.styleable.MenuItem_android_visible, this.f1164f);
            this.f1179u = a.mo2871a(C0238R.styleable.MenuItem_android_enabled, this.f1165g);
            this.f1180v = a.mo2880d(C0238R.styleable.MenuItem_showAsAction, -1);
            this.f1184z = a.mo2886f(C0238R.styleable.MenuItem_android_onClick);
            this.f1181w = a.mo2888g(C0238R.styleable.MenuItem_actionLayout, 0);
            this.f1182x = a.mo2886f(C0238R.styleable.MenuItem_actionViewClass);
            this.f1183y = a.mo2886f(C0238R.styleable.MenuItem_actionProviderClass);
            if ((this.f1183y != null) && this.f1181w == 0 && this.f1182x == null) {
                this.f1153A = (C0950b) m1935a(this.f1183y, C0345g.f1137k, C0345g.this.f1139b);
            } else {
                this.f1153A = null;
            }
            this.f1154B = a.mo2889g(C0238R.styleable.MenuItem_contentDescription);
            this.f1155C = a.mo2889g(C0238R.styleable.MenuItem_tooltipText);
            if (a.mo2892j(C0238R.styleable.MenuItem_iconTintMode)) {
                this.f1157E = C0469a0.m2594a(a.mo2880d(C0238R.styleable.MenuItem_iconTintMode, -1), this.f1157E);
            } else {
                this.f1157E = null;
            }
            if (a.mo2892j(C0238R.styleable.MenuItem_iconTint)) {
                this.f1156D = a.mo2868a(C0238R.styleable.MenuItem_iconTint);
            } else {
                this.f1156D = null;
            }
            a.mo2887f();
            this.f1166h = false;
        }

        /* renamed from: c */
        public boolean mo1361c() {
            return this.f1166h;
        }

        /* renamed from: d */
        public void mo1362d() {
            this.f1160b = 0;
            this.f1161c = 0;
            this.f1162d = 0;
            this.f1163e = 0;
            this.f1164f = true;
            this.f1165g = true;
        }

        /* renamed from: a */
        private char m1934a(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        /* renamed from: a */
        private void m1936a(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f1177s).setVisible(this.f1178t).setEnabled(this.f1179u).setCheckable(this.f1176r >= 1).setTitleCondensed(this.f1170l).setIcon(this.f1171m);
            int i = this.f1180v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f1184z != null) {
                if (!C0345g.this.f1140c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new C0346a(C0345g.this.mo1354a(), this.f1184z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            boolean z2 = menuItem instanceof C0375j;
            if (z2) {
                C0375j jVar = (C0375j) menuItem;
            }
            if (this.f1176r >= 2) {
                if (z2) {
                    ((C0375j) menuItem).mo1645c(true);
                } else if (menuItem instanceof C0377k) {
                    ((C0377k) menuItem).mo1696a(true);
                }
            }
            String str = this.f1182x;
            if (str != null) {
                menuItem.setActionView((View) m1935a(str, C0345g.f1136j, C0345g.this.f1138a));
                z = true;
            }
            int i2 = this.f1181w;
            if (i2 > 0 && !z) {
                menuItem.setActionView(i2);
            }
            C0950b bVar = this.f1153A;
            if (bVar != null) {
                C1003n.m5734a(menuItem, bVar);
            }
            C1003n.m5740a(menuItem, this.f1154B);
            C1003n.m5744b(menuItem, this.f1155C);
            C1003n.m5737a(menuItem, this.f1172n, this.f1173o);
            C1003n.m5742b(menuItem, this.f1174p, this.f1175q);
            Mode mode = this.f1157E;
            if (mode != null) {
                C1003n.m5739a(menuItem, mode);
            }
            ColorStateList colorStateList = this.f1156D;
            if (colorStateList != null) {
                C1003n.m5738a(menuItem, colorStateList);
            }
        }

        /* renamed from: b */
        public SubMenu mo1359b() {
            this.f1166h = true;
            SubMenu addSubMenu = this.f1159a.addSubMenu(this.f1160b, this.f1167i, this.f1168j, this.f1169k);
            m1936a(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: a */
        public void mo1357a() {
            this.f1166h = true;
            m1936a(this.f1159a.add(this.f1160b, this.f1167i, this.f1168j, this.f1169k));
        }

        /* renamed from: a */
        private <T> T m1935a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor constructor = Class.forName(str, false, C0345g.this.f1140c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot instantiate class: ");
                sb.append(str);
                sb.toString();
                return null;
            }
        }
    }

    public C0345g(Context context) {
        super(context);
        this.f1140c = context;
        this.f1138a = new Object[]{context};
    }

    /* renamed from: a */
    private void m1932a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        String str;
        C0347b bVar = new C0347b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            str = f1132f;
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals(str)) {
                    eventType = xmlPullParser.next();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expecting menu, got ");
                    sb.append(name);
                    throw new RuntimeException(sb.toString());
                }
            }
        }
        int i = eventType;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (i != 1) {
                String str3 = "item";
                String str4 = "group";
                if (i != 2) {
                    if (i == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str2)) {
                            str2 = null;
                            z2 = false;
                        } else if (name2.equals(str4)) {
                            bVar.mo1362d();
                        } else if (name2.equals(str3)) {
                            if (!bVar.mo1361c()) {
                                C0950b bVar2 = bVar.f1153A;
                                if (bVar2 == null || !bVar2.mo1752b()) {
                                    bVar.mo1357a();
                                } else {
                                    bVar.mo1359b();
                                }
                            }
                        } else if (name2.equals(str)) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals(str4)) {
                        bVar.mo1358a(attributeSet);
                    } else if (name3.equals(str3)) {
                        bVar.mo1360b(attributeSet);
                    } else if (name3.equals(str)) {
                        m1932a(xmlPullParser, attributeSet, bVar.mo1359b());
                    } else {
                        str2 = name3;
                        z2 = true;
                    }
                }
                i = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public void inflate(@C0183c0 int i, Menu menu) {
        String str = "Error inflating menu XML";
        if (!(menu instanceof C0886a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f1140c.getResources().getLayout(i);
            m1932a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e) {
            throw new InflateException(str, e);
        } catch (IOException e2) {
            throw new InflateException(str, e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Object mo1354a() {
        if (this.f1141d == null) {
            this.f1141d = m1931a(this.f1140c);
        }
        return this.f1141d;
    }

    /* renamed from: a */
    private Object m1931a(Object obj) {
        if (obj instanceof Activity) {
            return obj;
        }
        if (obj instanceof ContextWrapper) {
            obj = m1931a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }
}
