package p205i.p471b.p472a.p473a.p474c;

import java.lang.management.ManagementFactory;
import java.util.concurrent.Callable;
import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.management.StandardMBean;
import p205i.p471b.p472a.p473a.C13927a;

/* renamed from: i.b.a.a.c.f */
/* compiled from: JmxRegistration */
class C13937f implements Callable<Void> {

    /* renamed from: N */
    private static final String f40466N = "org.jacoco:type=Runtime";

    /* renamed from: a */
    private final MBeanServer f40467a = ManagementFactory.getPlatformMBeanServer();

    /* renamed from: b */
    private final ObjectName f40468b = new ObjectName(f40466N);

    C13937f(C13927a aVar) throws Exception {
        this.f40467a.registerMBean(new StandardMBean(aVar, C13927a.class), this.f40468b);
    }

    public Void call() throws Exception {
        this.f40467a.unregisterMBean(this.f40468b);
        return null;
    }
}
