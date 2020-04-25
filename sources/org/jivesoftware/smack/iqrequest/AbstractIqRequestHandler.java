package org.jivesoftware.smack.iqrequest;

import org.jivesoftware.smack.iqrequest.IQRequestHandler.Mode;
import org.jivesoftware.smack.packet.C15617IQ;
import org.jivesoftware.smack.packet.C15617IQ.Type;

public abstract class AbstractIqRequestHandler implements IQRequestHandler {
    private final String element;
    private final Mode mode;
    private final String namespace;
    private final Type type;

    /* renamed from: org.jivesoftware.smack.iqrequest.AbstractIqRequestHandler$1 */
    static /* synthetic */ class C156161 {
        static final /* synthetic */ int[] $SwitchMap$org$jivesoftware$smack$packet$IQ$Type = new int[Type.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                org.jivesoftware.smack.packet.IQ$Type[] r0 = org.jivesoftware.smack.packet.C15617IQ.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$jivesoftware$smack$packet$IQ$Type = r0
                int[] r0 = $SwitchMap$org$jivesoftware$smack$packet$IQ$Type     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.jivesoftware.smack.packet.IQ$Type r1 = org.jivesoftware.smack.packet.C15617IQ.Type.set     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$org$jivesoftware$smack$packet$IQ$Type     // Catch:{ NoSuchFieldError -> 0x001f }
                org.jivesoftware.smack.packet.IQ$Type r1 = org.jivesoftware.smack.packet.C15617IQ.Type.get     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jivesoftware.smack.iqrequest.AbstractIqRequestHandler.C156161.<clinit>():void");
        }
    }

    protected AbstractIqRequestHandler(String str, String str2, Type type2, Mode mode2) {
        int i = C156161.$SwitchMap$org$jivesoftware$smack$packet$IQ$Type[type2.ordinal()];
        if (i == 1 || i == 2) {
            this.element = str;
            this.namespace = str2;
            this.type = type2;
            this.mode = mode2;
            return;
        }
        throw new IllegalArgumentException("Only get and set IQ type allowed");
    }

    public String getElement() {
        return this.element;
    }

    public Mode getMode() {
        return this.mode;
    }

    public String getNamespace() {
        return this.namespace;
    }

    public Type getType() {
        return this.type;
    }

    public abstract C15617IQ handleIQRequest(C15617IQ iq);
}
