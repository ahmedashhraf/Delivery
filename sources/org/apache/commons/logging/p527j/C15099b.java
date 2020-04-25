package org.apache.commons.logging.p527j;

import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import org.apache.commons.logging.C15089a;

/* renamed from: org.apache.commons.logging.j.b */
/* compiled from: Jdk13LumberjackLogger */
public class C15099b implements C15089a, Serializable {

    /* renamed from: Q */
    protected static final Level f43895Q = Level.FINE;

    /* renamed from: N */
    private String f43896N;

    /* renamed from: O */
    private String f43897O;

    /* renamed from: P */
    private boolean f43898P;

    /* renamed from: a */
    protected transient Logger f43899a = null;

    /* renamed from: b */
    protected String f43900b = null;

    public C15099b(String str) {
        String str2 = "unknown";
        this.f43896N = str2;
        this.f43897O = str2;
        this.f43898P = false;
        this.f43900b = str;
        this.f43899a = mo46808i();
    }

    /* renamed from: a */
    private void m66990a(Level level, String str, Throwable th) {
        if (mo46808i().isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, str);
            if (!this.f43898P) {
                m66991j();
            }
            logRecord.setSourceClassName(this.f43896N);
            logRecord.setSourceMethodName(this.f43897O);
            if (th != null) {
                logRecord.setThrown(th);
            }
            mo46808i().log(logRecord);
        }
    }

    /* renamed from: j */
    private void m66991j() {
        try {
            Throwable th = new Throwable();
            th.fillInStackTrace();
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            StringTokenizer stringTokenizer = new StringTokenizer(stringWriter.getBuffer().toString(), "\n");
            stringTokenizer.nextToken();
            String nextToken = stringTokenizer.nextToken();
            while (nextToken.indexOf(getClass().getName()) == -1) {
                nextToken = stringTokenizer.nextToken();
            }
            while (nextToken.indexOf(getClass().getName()) >= 0) {
                nextToken = stringTokenizer.nextToken();
            }
            String substring = nextToken.substring(nextToken.indexOf("at ") + 3, nextToken.indexOf(40));
            int lastIndexOf = substring.lastIndexOf(46);
            this.f43896N = substring.substring(0, lastIndexOf);
            this.f43897O = substring.substring(lastIndexOf + 1);
        } catch (Exception unused) {
        }
        this.f43898P = true;
    }

    /* renamed from: b */
    public void mo46779b(Object obj) {
        m66990a(Level.INFO, String.valueOf(obj), null);
    }

    /* renamed from: c */
    public void mo46781c(Object obj) {
        m66990a(Level.SEVERE, String.valueOf(obj), null);
    }

    /* renamed from: d */
    public void mo46784d(Object obj, Throwable th) {
        m66990a(Level.SEVERE, String.valueOf(obj), th);
    }

    /* renamed from: e */
    public void mo46786e(Object obj) {
        m66990a(Level.SEVERE, String.valueOf(obj), null);
    }

    /* renamed from: f */
    public void mo46790f(Object obj, Throwable th) {
        m66990a(Level.INFO, String.valueOf(obj), th);
    }

    /* renamed from: g */
    public boolean mo46792g() {
        return mo46808i().isLoggable(Level.FINEST);
    }

    /* renamed from: h */
    public boolean mo46793h() {
        return mo46808i().isLoggable(Level.SEVERE);
    }

    /* renamed from: i */
    public Logger mo46808i() {
        if (this.f43899a == null) {
            this.f43899a = Logger.getLogger(this.f43900b);
        }
        return this.f43899a;
    }

    /* renamed from: b */
    public void mo46780b(Object obj, Throwable th) {
        m66990a(Level.FINEST, String.valueOf(obj), th);
    }

    /* renamed from: c */
    public void mo46782c(Object obj, Throwable th) {
        m66990a(Level.WARNING, String.valueOf(obj), th);
    }

    /* renamed from: d */
    public boolean mo46785d() {
        return mo46808i().isLoggable(Level.FINE);
    }

    /* renamed from: e */
    public void mo46787e(Object obj, Throwable th) {
        m66990a(Level.SEVERE, String.valueOf(obj), th);
    }

    /* renamed from: f */
    public boolean mo46791f() {
        return mo46808i().isLoggable(Level.INFO);
    }

    /* renamed from: d */
    public void mo46783d(Object obj) {
        m66990a(Level.WARNING, String.valueOf(obj), null);
    }

    /* renamed from: e */
    public boolean mo46788e() {
        return mo46808i().isLoggable(Level.SEVERE);
    }

    /* renamed from: f */
    public void mo46789f(Object obj) {
        m66990a(Level.FINEST, String.valueOf(obj), null);
    }

    /* renamed from: a */
    public void mo46776a(Object obj) {
        m66990a(Level.FINE, String.valueOf(obj), null);
    }

    /* renamed from: a */
    public void mo46777a(Object obj, Throwable th) {
        m66990a(Level.FINE, String.valueOf(obj), th);
    }

    /* renamed from: a */
    public boolean mo46778a() {
        return mo46808i().isLoggable(Level.WARNING);
    }
}
