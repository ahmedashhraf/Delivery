package kotlin.p217i1;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C14730m;
import kotlin.C14734o;
import kotlin.C6121u;
import kotlin.p214b1.p215t.C6069a;
import kotlin.p214b1.p216u.C14417a1;
import kotlin.p214b1.p216u.C14419b1;
import kotlin.p214b1.p216u.C14443g1;
import kotlin.p214b1.p216u.C14448i0;
import kotlin.p505f1.C14557l;
import p205i.p209c.p210a.C6003d;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\b\u0001\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001c"}, mo24990d2 = {"Lkotlin/text/CharDirectionality;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "UNDEFINED", "LEFT_TO_RIGHT", "RIGHT_TO_LEFT", "RIGHT_TO_LEFT_ARABIC", "EUROPEAN_NUMBER", "EUROPEAN_NUMBER_SEPARATOR", "EUROPEAN_NUMBER_TERMINATOR", "ARABIC_NUMBER", "COMMON_NUMBER_SEPARATOR", "NONSPACING_MARK", "BOUNDARY_NEUTRAL", "PARAGRAPH_SEPARATOR", "SEGMENT_SEPARATOR", "WHITESPACE", "OTHER_NEUTRALS", "LEFT_TO_RIGHT_EMBEDDING", "LEFT_TO_RIGHT_OVERRIDE", "RIGHT_TO_LEFT_EMBEDDING", "RIGHT_TO_LEFT_OVERRIDE", "POP_DIRECTIONAL_FORMAT", "Companion", "kotlin-stdlib"}, mo24991k = 1, mo24992mv = {1, 1, 10})
/* renamed from: kotlin.i1.b */
/* compiled from: CharDirectionality.kt */
public enum C14655b {
    UNDEFINED(-1),
    LEFT_TO_RIGHT(0),
    RIGHT_TO_LEFT(1),
    RIGHT_TO_LEFT_ARABIC(2),
    EUROPEAN_NUMBER(3),
    EUROPEAN_NUMBER_SEPARATOR(4),
    EUROPEAN_NUMBER_TERMINATOR(5),
    ARABIC_NUMBER(6),
    COMMON_NUMBER_SEPARATOR(7),
    NONSPACING_MARK(8),
    BOUNDARY_NEUTRAL(9),
    PARAGRAPH_SEPARATOR(10),
    SEGMENT_SEPARATOR(11),
    WHITESPACE(12),
    OTHER_NEUTRALS(13),
    LEFT_TO_RIGHT_EMBEDDING(14),
    LEFT_TO_RIGHT_OVERRIDE(15),
    RIGHT_TO_LEFT_EMBEDDING(16),
    RIGHT_TO_LEFT_OVERRIDE(17),
    POP_DIRECTIONAL_FORMAT(18);
    
    public static final C14657b Companion = null;
    /* access modifiers changed from: private */
    public static final C14730m directionalityMap$delegate = null;
    private final int value;

    /* renamed from: kotlin.i1.b$a */
    /* compiled from: CharDirectionality.kt */
    static final class C14656a extends C14448i0 implements C6069a<Map<Integer, ? extends C14655b>> {

        /* renamed from: a */
        public static final C14656a f42832a = null;

        static {
            f42832a = new C14656a();
        }

        C14656a() {
            super(0);
        }

        @C6003d
        /* renamed from: p */
        public final Map<Integer, C14655b> m63531p() {
            C14655b[] values = C14655b.values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(C14534q.m62902a(C14841t0.m65538a(values.length), 16));
            for (C14655b bVar : values) {
                linkedHashMap.put(Integer.valueOf(bVar.mo45868d()), bVar);
            }
            return linkedHashMap;
        }
    }

    /* renamed from: kotlin.i1.b$b */
    /* compiled from: CharDirectionality.kt */
    public static final class C14657b {

        /* renamed from: a */
        static final /* synthetic */ C14557l[] f42833a = null;

        static {
            f42833a = new C14557l[]{C14443g1.m62437a((C14417a1) new C14419b1(C14443g1.m62440b(C14657b.class), "directionalityMap", "getDirectionalityMap()Ljava/util/Map;"))};
        }

        private C14657b() {
        }

        /* renamed from: a */
        private final Map<Integer, C14655b> m63532a() {
            C14730m e = C14655b.directionalityMap$delegate;
            C14557l lVar = f42833a[0];
            return (Map) e.getValue();
        }

        @C6003d
        /* renamed from: a */
        public final C14655b mo45869a(int i) {
            C14655b bVar = (C14655b) m63532a().get(Integer.valueOf(i));
            if (bVar != null) {
                return bVar;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Directionality #");
            sb.append(i);
            sb.append(" is not defined.");
            throw new IllegalArgumentException(sb.toString());
        }

        public /* synthetic */ C14657b(C14487u uVar) {
            this();
        }
    }

    static {
        Companion = new C14657b(null);
        directionalityMap$delegate = C14734o.m63889a((C6069a<? extends T>) C14656a.f42832a);
    }

    protected C14655b(int i) {
        this.value = i;
    }

    /* renamed from: d */
    public final int mo45868d() {
        return this.value;
    }
}
