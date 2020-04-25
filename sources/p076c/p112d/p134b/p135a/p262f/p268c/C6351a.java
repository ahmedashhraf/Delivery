package p076c.p112d.p134b.p135a.p262f.p268c;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import p076c.p112d.p134b.p135a.p143g.C2766f;
import p076c.p112d.p134b.p135a.p143g.C6436w;

@C2766f
/* renamed from: c.d.b.a.f.c.a */
/* compiled from: LogRecordingHandler */
public class C6351a extends Handler {

    /* renamed from: a */
    private final List<LogRecord> f17754a = C6436w.m29853a();

    /* renamed from: a */
    public List<String> mo25698a() {
        ArrayList a = C6436w.m29853a();
        for (LogRecord message : this.f17754a) {
            a.add(message.getMessage());
        }
        return a;
    }

    public void close() throws SecurityException {
    }

    public void flush() {
    }

    public void publish(LogRecord logRecord) {
        this.f17754a.add(logRecord);
    }
}
