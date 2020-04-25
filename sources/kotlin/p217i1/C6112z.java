package kotlin.p217i1;

import com.facebook.internal.FacebookRequestErrorClassification;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C14731m0;
import kotlin.C14854w;
import kotlin.C6049b;
import kotlin.C6094c0;
import kotlin.C6121u;
import kotlin.TypeCastException;
import kotlin.p213a1.C6041f;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p215t.C6084p;
import kotlin.p214b1.p216u.C14445h0;
import kotlin.p214b1.p216u.C14448i0;
import kotlin.p219v0.C14838s;
import kotlin.p504e1.C14522i;
import kotlin.p504e1.C14525k;
import kotlin.p506g1.C14594m;
import org.jivesoftware.smackx.xdatavalidation.packet.ValidateElement.RangeValidateElement;
import p205i.p209c.p210a.C6003d;
import p205i.p209c.p210a.C6004e;

@C6121u(mo24988bv = {1, 0, 2}, mo24989d1 = {"\u0000t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\f\n\u0002\u0010\u0019\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\u001a\u001c\u0010\t\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u001c\u0010\u000e\u001a\u00020\n*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u001f\u0010\u000f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\rH\u0002\u001a\u001f\u0010\u000f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\rH\u0002\u001a\u0015\u0010\u000f\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\n\u001a\u001c\u0010\u0014\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u001c\u0010\u0014\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r\u001a:\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001aE\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0002\b\u001c\u001a:\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0018\u00010\u0017*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u0012\u0010\u001e\u001a\u00020\r*\u00020\u00022\u0006\u0010\u001f\u001a\u00020\u0006\u001a&\u0010 \u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a;\u0010 \u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\rH\u0002¢\u0006\u0002\b\"\u001a&\u0010 \u001a\u00020\u0006*\u00020\u00022\u0006\u0010#\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a&\u0010$\u001a\u00020\u0006*\u00020\u00022\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a,\u0010$\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a\r\u0010'\u001a\u00020\r*\u00020\u0002H\b\u001a\r\u0010(\u001a\u00020\r*\u00020\u0002H\b\u001a\r\u0010)\u001a\u00020\r*\u00020\u0002H\b\u001a \u0010*\u001a\u00020\r*\u0004\u0018\u00010\u0002H\b\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a \u0010+\u001a\u00020\r*\u0004\u0018\u00010\u0002H\b\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0001\u001a\u0004\b\u0003\u0010\u0000\u001a\r\u0010,\u001a\u00020-*\u00020\u0002H\u0002\u001a&\u0010.\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a&\u0010.\u001a\u00020\u0006*\u00020\u00022\u0006\u0010#\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a&\u0010/\u001a\u00020\u0006*\u00020\u00022\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a,\u0010/\u001a\u00020\u0006*\u00020\u00022\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u0010\u00100\u001a\b\u0012\u0004\u0012\u00020\n01*\u00020\u0002\u001a\u0010\u00102\u001a\b\u0012\u0004\u0012\u00020\n03*\u00020\u0002\u001a\u0015\u00104\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\f\u001a\u000f\u00105\u001a\u00020\n*\u0004\u0018\u00010\nH\b\u001a\u001c\u00106\u001a\u00020\u0002*\u00020\u00022\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00108\u001a\u00020\u0011\u001a\u001c\u00106\u001a\u00020\n*\u00020\n2\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00108\u001a\u00020\u0011\u001a\u001c\u00109\u001a\u00020\u0002*\u00020\u00022\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00108\u001a\u00020\u0011\u001a\u001c\u00109\u001a\u00020\n*\u00020\n2\u0006\u00107\u001a\u00020\u00062\b\b\u0002\u00108\u001a\u00020\u0011\u001aG\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000101*\u00020\u00022\u000e\u0010;\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0<2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010=\u001a\u00020\u0006H\u0002¢\u0006\u0004\b>\u0010?\u001a=\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000101*\u00020\u00022\u0006\u0010;\u001a\u00020&2\b\b\u0002\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010=\u001a\u00020\u0006H\u0002¢\u0006\u0002\b>\u001a4\u0010@\u001a\u00020\r*\u00020\u00022\u0006\u0010A\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010B\u001a\u00020\u00062\u0006\u00107\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\u0012\u0010C\u001a\u00020\u0002*\u00020\u00022\u0006\u0010D\u001a\u00020\u0002\u001a\u0012\u0010C\u001a\u00020\n*\u00020\n2\u0006\u0010D\u001a\u00020\u0002\u001a\u001a\u0010E\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006\u001a\u0012\u0010E\u001a\u00020\u0002*\u00020\u00022\u0006\u0010F\u001a\u00020\u0001\u001a\u001d\u0010E\u001a\u00020\n*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006H\b\u001a\u0015\u0010E\u001a\u00020\n*\u00020\n2\u0006\u0010F\u001a\u00020\u0001H\b\u001a\u0012\u0010G\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002\u001a\u0012\u0010G\u001a\u00020\n*\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0002\u001a\u0012\u0010H\u001a\u00020\u0002*\u00020\u00022\u0006\u0010I\u001a\u00020\u0002\u001a\u001a\u0010H\u001a\u00020\u0002*\u00020\u00022\u0006\u0010D\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002\u001a\u0012\u0010H\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\u0002\u001a\u001a\u0010H\u001a\u00020\n*\u00020\n2\u0006\u0010D\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002\u001a+\u0010J\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0014\b\b\u0010K\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\u00020LH\b\u001a\u001d\u0010J\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010N\u001a\u00020\nH\b\u001a$\u0010O\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\u00112\u0006\u0010N\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a$\u0010O\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\n2\u0006\u0010N\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a$\u0010Q\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\u00112\u0006\u0010N\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a$\u0010Q\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\n2\u0006\u0010N\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a$\u0010R\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\u00112\u0006\u0010N\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a$\u0010R\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\n2\u0006\u0010N\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a$\u0010S\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\u00112\u0006\u0010N\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a$\u0010S\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\n2\u0006\u0010N\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a\u001d\u0010T\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010N\u001a\u00020\nH\b\u001a\"\u0010U\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\u0002\u001a\u001a\u0010U\u001a\u00020\u0002*\u00020\u00022\u0006\u0010F\u001a\u00020\u00012\u0006\u0010N\u001a\u00020\u0002\u001a%\u0010U\u001a\u00020\n*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00062\u0006\u0010N\u001a\u00020\u0002H\b\u001a\u001d\u0010U\u001a\u00020\n*\u00020\n2\u0006\u0010F\u001a\u00020\u00012\u0006\u0010N\u001a\u00020\u0002H\b\u001a=\u0010V\u001a\b\u0012\u0004\u0012\u00020\n03*\u00020\u00022\u0012\u0010;\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0<\"\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010=\u001a\u00020\u0006¢\u0006\u0002\u0010W\u001a0\u0010V\u001a\b\u0012\u0004\u0012\u00020\n03*\u00020\u00022\n\u0010;\u001a\u00020&\"\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010=\u001a\u00020\u0006\u001a/\u0010V\u001a\b\u0012\u0004\u0012\u00020\n03*\u00020\u00022\u0006\u0010I\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010=\u001a\u00020\u0006H\u0002¢\u0006\u0002\bX\u001a%\u0010V\u001a\b\u0012\u0004\u0012\u00020\n03*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010=\u001a\u00020\u0006H\b\u001a=\u0010Y\u001a\b\u0012\u0004\u0012\u00020\n01*\u00020\u00022\u0012\u0010;\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0<\"\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010=\u001a\u00020\u0006¢\u0006\u0002\u0010Z\u001a0\u0010Y\u001a\b\u0012\u0004\u0012\u00020\n01*\u00020\u00022\n\u0010;\u001a\u00020&\"\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010=\u001a\u00020\u0006\u001a\u001c\u0010[\u001a\u00020\r*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u001c\u0010[\u001a\u00020\r*\u00020\u00022\u0006\u0010D\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\r\u001a$\u0010[\u001a\u00020\r*\u00020\u00022\u0006\u0010D\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\r\u001a\u0012\u0010\\\u001a\u00020\u0002*\u00020\u00022\u0006\u0010F\u001a\u00020\u0001\u001a\u001d\u0010\\\u001a\u00020\u0002*\u00020\n2\u0006\u0010]\u001a\u00020\u00062\u0006\u0010^\u001a\u00020\u0006H\b\u001a\u001f\u0010_\u001a\u00020\n*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020\u0006H\b\u001a\u0012\u0010_\u001a\u00020\n*\u00020\u00022\u0006\u0010F\u001a\u00020\u0001\u001a\u0012\u0010_\u001a\u00020\n*\u00020\n2\u0006\u0010F\u001a\u00020\u0001\u001a\u001c\u0010`\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\u00112\b\b\u0002\u0010P\u001a\u00020\n\u001a\u001c\u0010`\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a\u001c\u0010a\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\u00112\b\b\u0002\u0010P\u001a\u00020\n\u001a\u001c\u0010a\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a\u001c\u0010b\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\u00112\b\b\u0002\u0010P\u001a\u00020\n\u001a\u001c\u0010b\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a\u001c\u0010c\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\u00112\b\b\u0002\u0010P\u001a\u00020\n\u001a\u001c\u0010c\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\n2\b\b\u0002\u0010P\u001a\u00020\n\u001a\n\u0010d\u001a\u00020\u0002*\u00020\u0002\u001a!\u0010d\u001a\u00020\u0002*\u00020\u00022\u0012\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0LH\b\u001a\u0016\u0010d\u001a\u00020\u0002*\u00020\u00022\n\u0010%\u001a\u00020&\"\u00020\u0011\u001a\r\u0010d\u001a\u00020\n*\u00020\nH\b\u001a!\u0010d\u001a\u00020\n*\u00020\n2\u0012\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0LH\b\u001a\u0016\u0010d\u001a\u00020\n*\u00020\n2\n\u0010%\u001a\u00020&\"\u00020\u0011\u001a\n\u0010f\u001a\u00020\u0002*\u00020\u0002\u001a!\u0010f\u001a\u00020\u0002*\u00020\u00022\u0012\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0LH\b\u001a\u0016\u0010f\u001a\u00020\u0002*\u00020\u00022\n\u0010%\u001a\u00020&\"\u00020\u0011\u001a\r\u0010f\u001a\u00020\n*\u00020\nH\b\u001a!\u0010f\u001a\u00020\n*\u00020\n2\u0012\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0LH\b\u001a\u0016\u0010f\u001a\u00020\n*\u00020\n2\n\u0010%\u001a\u00020&\"\u00020\u0011\u001a\n\u0010g\u001a\u00020\u0002*\u00020\u0002\u001a!\u0010g\u001a\u00020\u0002*\u00020\u00022\u0012\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0LH\b\u001a\u0016\u0010g\u001a\u00020\u0002*\u00020\u00022\n\u0010%\u001a\u00020&\"\u00020\u0011\u001a\r\u0010g\u001a\u00020\n*\u00020\nH\b\u001a!\u0010g\u001a\u00020\n*\u00020\n2\u0012\u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0LH\b\u001a\u0016\u0010g\u001a\u00020\n*\u00020\n2\n\u0010%\u001a\u00020&\"\u00020\u0011\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006h"}, mo24990d2 = {"indices", "Lkotlin/ranges/IntRange;", "", "getIndices", "(Ljava/lang/CharSequence;)Lkotlin/ranges/IntRange;", "lastIndex", "", "getLastIndex", "(Ljava/lang/CharSequence;)I", "commonPrefixWith", "", "other", "ignoreCase", "", "commonSuffixWith", "contains", "char", "", "regex", "Lkotlin/text/Regex;", "endsWith", "suffix", "findAnyOf", "Lkotlin/Pair;", "strings", "", "startIndex", "last", "findAnyOf$StringsKt__StringsKt", "findLastAnyOf", "hasSurrogatePairAt", "index", "indexOf", "endIndex", "indexOf$StringsKt__StringsKt", "string", "indexOfAny", "chars", "", "isEmpty", "isNotBlank", "isNotEmpty", "isNullOrBlank", "isNullOrEmpty", "iterator", "Lkotlin/collections/CharIterator;", "lastIndexOf", "lastIndexOfAny", "lineSequence", "Lkotlin/sequences/Sequence;", "lines", "", "matches", "orEmpty", "padEnd", "length", "padChar", "padStart", "rangesDelimitedBy", "delimiters", "", "limit", "rangesDelimitedBy$StringsKt__StringsKt", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Lkotlin/sequences/Sequence;", "regionMatchesImpl", "thisOffset", "otherOffset", "removePrefix", "prefix", "removeRange", "range", "removeSuffix", "removeSurrounding", "delimiter", "replace", "transform", "Lkotlin/Function1;", "Lkotlin/text/MatchResult;", "replacement", "replaceAfter", "missingDelimiterValue", "replaceAfterLast", "replaceBefore", "replaceBeforeLast", "replaceFirst", "replaceRange", "split", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "split$StringsKt__StringsKt", "splitToSequence", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Lkotlin/sequences/Sequence;", "startsWith", "subSequence", "start", "end", "substring", "substringAfter", "substringAfterLast", "substringBefore", "substringBeforeLast", "trim", "predicate", "trimEnd", "trimStart", "kotlin-stdlib"}, mo24991k = 5, mo24992mv = {1, 1, 10}, mo24994xi = 1, mo24995xs = "kotlin/text/StringsKt")
/* renamed from: kotlin.i1.z */
/* compiled from: Strings.kt */
class C6112z extends C6111y {

    /* renamed from: kotlin.i1.z$a */
    /* compiled from: Strings.kt */
    public static final class C6113a extends C14838s {

        /* renamed from: a */
        private int f17315a;

        /* renamed from: b */
        final /* synthetic */ CharSequence f17316b;

        C6113a(CharSequence charSequence) {
            this.f17316b = charSequence;
        }

        /* renamed from: b */
        public char mo24981b() {
            CharSequence charSequence = this.f17316b;
            int i = this.f17315a;
            this.f17315a = i + 1;
            return charSequence.charAt(i);
        }

        public boolean hasNext() {
            return this.f17315a < this.f17316b.length();
        }
    }

    /* renamed from: kotlin.i1.z$b */
    /* compiled from: Strings.kt */
    static final class C6114b extends C14448i0 implements C6084p<CharSequence, Integer, C14854w<? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ char[] f17317a;

        /* renamed from: b */
        final /* synthetic */ boolean f17318b;

        C6114b(char[] cArr, boolean z) {
            this.f17317a = cArr;
            this.f17318b = z;
            super(2);
        }

        @C6004e
        /* renamed from: a */
        public final C14854w<Integer, Integer> mo24983a(@C6003d CharSequence charSequence, int i) {
            C14445h0.m62478f(charSequence, "$receiver");
            int a = C6112z.m27940a(charSequence, this.f17317a, i, this.f17318b);
            if (a < 0) {
                return null;
            }
            return C14731m0.m63872a(Integer.valueOf(a), Integer.valueOf(1));
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo24962d(Object obj, Object obj2) {
            return mo24983a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: kotlin.i1.z$c */
    /* compiled from: Strings.kt */
    static final class C6115c extends C14448i0 implements C6084p<CharSequence, Integer, C14854w<? extends Integer, ? extends Integer>> {

        /* renamed from: a */
        final /* synthetic */ List f17319a;

        /* renamed from: b */
        final /* synthetic */ boolean f17320b;

        C6115c(List list, boolean z) {
            this.f17319a = list;
            this.f17320b = z;
            super(2);
        }

        @C6004e
        /* renamed from: a */
        public final C14854w<Integer, Integer> mo24984a(@C6003d CharSequence charSequence, int i) {
            C14445h0.m62478f(charSequence, "$receiver");
            C14854w a = C6112z.m28030b(charSequence, (Collection<String>) this.f17319a, i, this.f17320b, false);
            if (a != null) {
                return C14731m0.m63872a(a.mo46307e(), Integer.valueOf(((String) a.mo46309f()).length()));
            }
            return null;
        }

        /* renamed from: d */
        public /* bridge */ /* synthetic */ Object mo24962d(Object obj, Object obj2) {
            return mo24984a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: kotlin.i1.z$d */
    /* compiled from: Strings.kt */
    static final class C6116d extends C14448i0 implements C6080l<C14525k, String> {

        /* renamed from: a */
        final /* synthetic */ CharSequence f17321a;

        C6116d(CharSequence charSequence) {
            this.f17321a = charSequence;
            super(1);
        }

        @C6003d
        /* renamed from: a */
        public final String invoke(@C6003d C14525k kVar) {
            C14445h0.m62478f(kVar, "it");
            return C6112z.m28042c(this.f17321a, kVar);
        }
    }

    /* renamed from: kotlin.i1.z$e */
    /* compiled from: Strings.kt */
    static final class C6117e extends C14448i0 implements C6080l<C14525k, String> {

        /* renamed from: a */
        final /* synthetic */ CharSequence f17322a;

        C6117e(CharSequence charSequence) {
            this.f17322a = charSequence;
            super(1);
        }

        @C6003d
        /* renamed from: a */
        public final String invoke(@C6003d C14525k kVar) {
            C14445h0.m62478f(kVar, "it");
            return C6112z.m28042c(this.f17322a, kVar);
        }
    }

    @C6003d
    /* renamed from: b */
    public static final CharSequence m28001b(@C6003d CharSequence charSequence, @C6003d C6080l<? super Character, Boolean> lVar) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(lVar, "predicate");
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return "";
            }
        } while (((Boolean) lVar.invoke(Character.valueOf(charSequence.charAt(length)))).booleanValue());
        return charSequence.subSequence(0, length + 1).toString();
    }

    @C6003d
    /* renamed from: c */
    public static final CharSequence m28040c(@C6003d CharSequence charSequence, @C6003d C6080l<? super Character, Boolean> lVar) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(lVar, "predicate");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!((Boolean) lVar.invoke(Character.valueOf(charSequence.charAt(i)))).booleanValue()) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    @C6041f
    /* renamed from: d */
    private static final boolean m28068d(@C6003d CharSequence charSequence) {
        return charSequence.length() == 0;
    }

    @C6041f
    /* renamed from: e */
    private static final boolean m28073e(@C6003d CharSequence charSequence) {
        return !C6111y.m27897a(charSequence);
    }

    @C6041f
    /* renamed from: f */
    private static final String m28076f(@C6004e String str) {
        return str != null ? str : "";
    }

    @C6041f
    /* renamed from: f */
    private static final boolean m28077f(@C6003d CharSequence charSequence) {
        return charSequence.length() > 0;
    }

    @C6041f
    /* renamed from: g */
    private static final String m28078g(@C6003d String str) {
        if (str != null) {
            return m28086l(str).toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    @C6041f
    /* renamed from: h */
    private static final boolean m28080h(@C6004e CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    @C6041f
    /* renamed from: i */
    private static final String m28081i(@C6003d String str) {
        if (str != null) {
            return m28087m(str).toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    @C6003d
    /* renamed from: j */
    public static final C14594m<String> m28083j(@C6003d CharSequence charSequence) {
        C14445h0.m62478f(charSequence, "$receiver");
        return m28027b(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    @C6041f
    /* renamed from: k */
    private static final String m28084k(@C6003d String str) {
        if (str != null) {
            return m28088n(str).toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    @C6003d
    /* renamed from: l */
    public static final CharSequence m28086l(@C6003d CharSequence charSequence) {
        C14445h0.m62478f(charSequence, "$receiver");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean p = C14661d.m63553p(charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!p) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!p) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    @C6003d
    /* renamed from: m */
    public static final CharSequence m28087m(@C6003d CharSequence charSequence) {
        C14445h0.m62478f(charSequence, "$receiver");
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return "";
            }
        } while (C14661d.m63553p(charSequence.charAt(length)));
        return charSequence.subSequence(0, length + 1).toString();
    }

    @C6003d
    /* renamed from: n */
    public static final CharSequence m28088n(@C6003d CharSequence charSequence) {
        C14445h0.m62478f(charSequence, "$receiver");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!C14661d.m63553p(charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    @C6003d
    /* renamed from: a */
    public static final CharSequence m27948a(@C6003d CharSequence charSequence, @C6003d C6080l<? super Character, Boolean> lVar) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(lVar, "predicate");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean booleanValue = ((Boolean) lVar.invoke(Character.valueOf(charSequence.charAt(!z ? i : length)))).booleanValue();
            if (!z) {
                if (!booleanValue) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!booleanValue) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    @C6003d
    /* renamed from: d */
    public static /* synthetic */ String m28065d(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m28064d(str, str2, str3);
    }

    @C6003d
    /* renamed from: e */
    public static /* synthetic */ String m28072e(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m28071e(str, str2, str3);
    }

    @C6041f
    /* renamed from: g */
    private static final boolean m28079g(@C6004e CharSequence charSequence) {
        return charSequence == null || C6111y.m27897a(charSequence);
    }

    @C6003d
    /* renamed from: i */
    public static final C14838s m28082i(@C6003d CharSequence charSequence) {
        C14445h0.m62478f(charSequence, "$receiver");
        return new C6113a(charSequence);
    }

    @C6003d
    /* renamed from: k */
    public static final List<String> m28085k(@C6003d CharSequence charSequence) {
        C14445h0.m62478f(charSequence, "$receiver");
        return C14604p.m63210K(m28083j(charSequence));
    }

    @C6003d
    /* renamed from: d */
    public static final String m28064d(@C6003d String str, @C6003d String str2, @C6003d String str3) {
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(str2, "delimiter");
        C14445h0.m62478f(str3, "missingDelimiterValue");
        int a = m27939a((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (a == -1) {
            return str3;
        }
        String substring = str.substring(0, a);
        C14445h0.m62453a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @C6003d
    /* renamed from: e */
    public static final String m28071e(@C6003d String str, @C6003d String str2, @C6003d String str3) {
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(str2, "delimiter");
        C14445h0.m62478f(str3, "missingDelimiterValue");
        int b = m27995b((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (b == -1) {
            return str3;
        }
        String substring = str.substring(0, b);
        C14445h0.m62453a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @C6003d
    /* renamed from: b */
    public static /* synthetic */ CharSequence m27999b(CharSequence charSequence, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return m27998b(charSequence, i, c);
    }

    /* renamed from: c */
    public static final int m28036c(@C6003d CharSequence charSequence) {
        C14445h0.m62478f(charSequence, "$receiver");
        return charSequence.length() - 1;
    }

    @C6003d
    /* renamed from: a */
    public static /* synthetic */ CharSequence m27943a(CharSequence charSequence, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return m27942a(charSequence, i, c);
    }

    @C6003d
    /* renamed from: b */
    public static final CharSequence m27998b(@C6003d CharSequence charSequence, int i, char c) {
        C14445h0.m62478f(charSequence, "$receiver");
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Desired length ");
            sb.append(i);
            sb.append(" is less than zero.");
            throw new IllegalArgumentException(sb.toString());
        } else if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i);
            int length = i - charSequence.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append(c);
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            sb2.append(charSequence);
            return sb2;
        }
    }

    @C6003d
    /* renamed from: c */
    public static final String m28042c(@C6003d CharSequence charSequence, @C6003d C14525k kVar) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(kVar, RangeValidateElement.METHOD);
        return charSequence.subSequence(kVar.mo45695b().intValue(), kVar.mo45696c().intValue() + 1).toString();
    }

    @C6003d
    /* renamed from: d */
    public static /* synthetic */ String m28061d(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m28060d(str, c, str2);
    }

    /* renamed from: e */
    public static /* synthetic */ boolean m28075e(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m28074e(charSequence, charSequence2, z);
    }

    @C6003d
    /* renamed from: a */
    public static final CharSequence m27942a(@C6003d CharSequence charSequence, int i, char c) {
        C14445h0.m62478f(charSequence, "$receiver");
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Desired length ");
            sb.append(i);
            sb.append(" is less than zero.");
            throw new IllegalArgumentException(sb.toString());
        } else if (i <= charSequence.length()) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i);
            sb2.append(charSequence);
            int length = i - charSequence.length();
            int i2 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append(c);
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
            return sb2;
        }
    }

    @C6003d
    /* renamed from: c */
    public static /* synthetic */ String m28044c(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m28043c(str, c, str2);
    }

    @C6003d
    /* renamed from: d */
    public static final String m28060d(@C6003d String str, char c, @C6003d String str2) {
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(str2, "missingDelimiterValue");
        int b = m27993b((CharSequence) str, c, 0, false, 6, (Object) null);
        if (b == -1) {
            return str2;
        }
        String substring = str.substring(0, b);
        C14445h0.m62453a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: e */
    public static final boolean m28074e(@C6003d CharSequence charSequence, @C6003d CharSequence charSequence2, boolean z) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(charSequence2, "prefix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C6111y.m27927d((String) charSequence, (String) charSequence2, false, 2, null);
        }
        return m28034b(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    @C6003d
    /* renamed from: c */
    public static final String m28043c(@C6003d String str, char c, @C6003d String str2) {
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(str2, "missingDelimiterValue");
        int a = m27935a((CharSequence) str, c, 0, false, 6, (Object) null);
        if (a == -1) {
            return str2;
        }
        String substring = str.substring(0, a);
        C14445h0.m62453a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @C6003d
    /* renamed from: d */
    public static /* synthetic */ String m28063d(String str, char c, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return m28062d(str, c, str2, str3);
    }

    @C6003d
    /* renamed from: c */
    public static /* synthetic */ String m28049c(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m28048c(str, str2, str3);
    }

    @C6003d
    /* renamed from: d */
    public static final String m28062d(@C6003d String str, char c, @C6003d String str2, @C6003d String str3) {
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(str2, "replacement");
        C14445h0.m62478f(str3, "missingDelimiterValue");
        int b = m27993b((CharSequence) str, c, 0, false, 6, (Object) null);
        return b == -1 ? str3 : m27945a((CharSequence) str, 0, b, (CharSequence) str2).toString();
    }

    @C6003d
    /* renamed from: c */
    public static final String m28048c(@C6003d String str, @C6003d String str2, @C6003d String str3) {
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(str2, "delimiter");
        C14445h0.m62478f(str3, "missingDelimiterValue");
        int b = m27995b((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (b == -1) {
            return str3;
        }
        String substring = str.substring(b + str2.length(), str.length());
        C14445h0.m62453a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @C6003d
    /* renamed from: d */
    public static /* synthetic */ String m28067d(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return m28066d(str, str2, str3, str4);
    }

    @C6003d
    /* renamed from: b */
    public static /* synthetic */ String m28014b(String str, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return m28013b(str, i, c);
    }

    @C6003d
    /* renamed from: c */
    public static final CharSequence m28039c(@C6003d CharSequence charSequence, @C6003d CharSequence charSequence2) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(charSequence2, "delimiter");
        return m27947a(charSequence, charSequence2, charSequence2);
    }

    @C6003d
    /* renamed from: d */
    public static final String m28066d(@C6003d String str, @C6003d String str2, @C6003d String str3, @C6003d String str4) {
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(str2, "delimiter");
        C14445h0.m62478f(str3, "replacement");
        C14445h0.m62478f(str4, "missingDelimiterValue");
        int b = m27995b((CharSequence) str, str2, 0, false, 6, (Object) null);
        return b == -1 ? str4 : m27945a((CharSequence) str, 0, b, (CharSequence) str3).toString();
    }

    @C6003d
    /* renamed from: a */
    public static /* synthetic */ String m27962a(String str, int i, char c, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            c = ' ';
        }
        return m27961a(str, i, c);
    }

    @C6003d
    /* renamed from: b */
    public static final String m28013b(@C6003d String str, int i, char c) {
        C14445h0.m62478f(str, "$receiver");
        return m27998b((CharSequence) str, i, c).toString();
    }

    @C6003d
    /* renamed from: c */
    public static final String m28047c(@C6003d String str, @C6003d CharSequence charSequence) {
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(charSequence, "delimiter");
        return m27966a(str, charSequence, charSequence);
    }

    @C6003d
    /* renamed from: a */
    public static final String m27961a(@C6003d String str, int i, char c) {
        C14445h0.m62478f(str, "$receiver");
        return m27942a((CharSequence) str, i, c).toString();
    }

    @C6003d
    /* renamed from: b */
    public static final C14525k m28023b(@C6003d CharSequence charSequence) {
        C14445h0.m62478f(charSequence, "$receiver");
        return new C14525k(0, charSequence.length() - 1);
    }

    @C6003d
    /* renamed from: c */
    public static /* synthetic */ String m28046c(String str, char c, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return m28045c(str, c, str2, str3);
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m28070d(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m28069d(charSequence, charSequence2, z);
    }

    @C6041f
    /* renamed from: a */
    static /* synthetic */ String m27952a(CharSequence charSequence, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = charSequence.length();
        }
        return charSequence.subSequence(i, i2).toString();
    }

    /* renamed from: b */
    public static final boolean m28033b(@C6003d CharSequence charSequence, int i) {
        C14445h0.m62478f(charSequence, "$receiver");
        int length = charSequence.length() - 2;
        if (i >= 0 && length >= i && Character.isHighSurrogate(charSequence.charAt(i)) && Character.isLowSurrogate(charSequence.charAt(i + 1))) {
            return true;
        }
        return false;
    }

    @C6003d
    /* renamed from: c */
    public static final String m28045c(@C6003d String str, char c, @C6003d String str2, @C6003d String str3) {
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(str2, "replacement");
        C14445h0.m62478f(str3, "missingDelimiterValue");
        int a = m27935a((CharSequence) str, c, 0, false, 6, (Object) null);
        return a == -1 ? str3 : m27945a((CharSequence) str, 0, a, (CharSequence) str2).toString();
    }

    /* renamed from: d */
    public static final boolean m28069d(@C6003d CharSequence charSequence, @C6003d CharSequence charSequence2, boolean z) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(charSequence2, "suffix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C6111y.m27920b((String) charSequence, (String) charSequence2, false, 2, null);
        }
        return m28034b(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z);
    }

    @C6003d
    /* renamed from: a */
    public static /* synthetic */ String m27958a(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m27957a(str, c, str2);
    }

    @C6003d
    /* renamed from: c */
    public static /* synthetic */ String m28051c(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return m28050c(str, str2, str3, str4);
    }

    @C6003d
    /* renamed from: a */
    public static final String m27957a(@C6003d String str, char c, @C6003d String str2) {
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(str2, "missingDelimiterValue");
        int a = m27935a((CharSequence) str, c, 0, false, 6, (Object) null);
        if (a == -1) {
            return str2;
        }
        String substring = str.substring(a + 1, str.length());
        C14445h0.m62453a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @C6003d
    /* renamed from: b */
    public static final String m28021b(@C6003d String str, @C6003d C14525k kVar) {
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(kVar, RangeValidateElement.METHOD);
        String substring = str.substring(kVar.mo45695b().intValue(), kVar.mo45696c().intValue() + 1);
        C14445h0.m62453a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @C6003d
    /* renamed from: c */
    public static final String m28050c(@C6003d String str, @C6003d String str2, @C6003d String str3, @C6003d String str4) {
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(str2, "delimiter");
        C14445h0.m62478f(str3, "replacement");
        C14445h0.m62478f(str4, "missingDelimiterValue");
        int a = m27939a((CharSequence) str, str2, 0, false, 6, (Object) null);
        return a == -1 ? str4 : m27945a((CharSequence) str, 0, a, (CharSequence) str3).toString();
    }

    /* renamed from: d */
    public static /* synthetic */ int m28059d(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m28036c(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m28058d(charSequence, collection, i, z);
    }

    @C6003d
    /* renamed from: b */
    public static final CharSequence m28002b(@C6003d CharSequence charSequence, @C6003d C14525k kVar) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(kVar, RangeValidateElement.METHOD);
        return charSequence.subSequence(kVar.mo45695b().intValue(), kVar.mo45696c().intValue() + 1);
    }

    /* renamed from: d */
    public static final int m28058d(@C6003d CharSequence charSequence, @C6003d Collection<String> collection, int i, boolean z) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(collection, "strings");
        C14854w b = m28030b(charSequence, collection, i, z, true);
        if (b != null) {
            Integer num = (Integer) b.mo46307e();
            if (num != null) {
                return num.intValue();
            }
        }
        return -1;
    }

    @C6003d
    /* renamed from: a */
    public static final CharSequence m27945a(@C6003d CharSequence charSequence, int i, int i2, @C6003d CharSequence charSequence2) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(charSequence2, "replacement");
        if (i2 >= i) {
            StringBuilder sb = new StringBuilder();
            sb.append(charSequence, 0, i);
            sb.append(charSequence2);
            sb.append(charSequence, i2, charSequence.length());
            return sb;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("End index (");
        sb2.append(i2);
        sb2.append(") is less than start index (");
        sb2.append(i);
        sb2.append(").");
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    @C6041f
    @C6049b(message = "Use parameters named startIndex and endIndex.", replaceWith = @C6094c0(expression = "subSequence(startIndex = start, endIndex = end)", imports = {}))
    /* renamed from: b */
    private static final CharSequence m28004b(@C6003d String str, int i, int i2) {
        return str.subSequence(i, i2);
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m28055c(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m28054c(charSequence, c, z);
    }

    @C6041f
    /* renamed from: b */
    private static final String m28005b(@C6003d CharSequence charSequence, int i, int i2) {
        return charSequence.subSequence(i, i2).toString();
    }

    /* renamed from: c */
    public static final boolean m28054c(@C6003d CharSequence charSequence, char c, boolean z) {
        C14445h0.m62478f(charSequence, "$receiver");
        return charSequence.length() > 0 && C14663e.m63558a(charSequence.charAt(0), c, z);
    }

    @C6003d
    /* renamed from: b */
    public static /* synthetic */ String m28017b(String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str3 = str;
        }
        return m28016b(str, str2, str3);
    }

    /* renamed from: c */
    public static /* synthetic */ int m28038c(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m28037c(charSequence, collection, i, z);
    }

    @C6003d
    /* renamed from: b */
    public static final String m28016b(@C6003d String str, @C6003d String str2, @C6003d String str3) {
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(str2, "delimiter");
        C14445h0.m62478f(str3, "missingDelimiterValue");
        int a = m27939a((CharSequence) str, str2, 0, false, 6, (Object) null);
        if (a == -1) {
            return str3;
        }
        String substring = str.substring(a + str2.length(), str.length());
        C14445h0.m62453a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: c */
    public static final int m28037c(@C6003d CharSequence charSequence, @C6003d Collection<String> collection, int i, boolean z) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(collection, "strings");
        C14854w b = m28030b(charSequence, collection, i, z, false);
        if (b != null) {
            Integer num = (Integer) b.mo46307e();
            if (num != null) {
                return num.intValue();
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static /* synthetic */ boolean m28057c(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m28056c(charSequence, charSequence2, z);
    }

    @C6041f
    /* renamed from: a */
    private static final String m27964a(@C6003d String str, int i, int i2, CharSequence charSequence) {
        if (str != null) {
            return m27945a((CharSequence) str, i, i2, charSequence).toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    @C6003d
    /* renamed from: b */
    public static /* synthetic */ String m28010b(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m28009b(str, c, str2);
    }

    /* renamed from: c */
    public static final boolean m28056c(@C6003d CharSequence charSequence, @C6003d CharSequence charSequence2, boolean z) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(charSequence2, FacebookRequestErrorClassification.KEY_OTHER);
        if (charSequence2 instanceof String) {
            if (m27939a(charSequence, (String) charSequence2, 0, z, 2, (Object) null) >= 0) {
                return true;
            }
        } else {
            if (m27937a(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) >= 0) {
                return true;
            }
        }
        return false;
    }

    @C6003d
    /* renamed from: a */
    public static final CharSequence m27950a(@C6003d CharSequence charSequence, @C6003d C14525k kVar, @C6003d CharSequence charSequence2) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(kVar, RangeValidateElement.METHOD);
        C14445h0.m62478f(charSequence2, "replacement");
        return m27945a(charSequence, kVar.mo45695b().intValue(), kVar.mo45696c().intValue() + 1, charSequence2);
    }

    @C6003d
    /* renamed from: b */
    public static String m28009b(@C6003d String str, char c, @C6003d String str2) {
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(str2, "missingDelimiterValue");
        int b = m27993b((CharSequence) str, c, 0, false, 6, (Object) null);
        if (b == -1) {
            return str2;
        }
        String substring = str.substring(b + 1, str.length());
        C14445h0.m62453a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @C6041f
    /* renamed from: a */
    private static final String m27971a(@C6003d String str, C14525k kVar, CharSequence charSequence) {
        if (str != null) {
            return m27950a((CharSequence) str, kVar, charSequence).toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    @C6003d
    /* renamed from: a */
    public static final CharSequence m27944a(@C6003d CharSequence charSequence, int i, int i2) {
        C14445h0.m62478f(charSequence, "$receiver");
        if (i2 < i) {
            StringBuilder sb = new StringBuilder();
            sb.append("End index (");
            sb.append(i2);
            sb.append(") is less than start index (");
            sb.append(i);
            sb.append(").");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 == i) {
            return charSequence.subSequence(0, charSequence.length());
        } else {
            StringBuilder sb2 = new StringBuilder(charSequence.length() - (i2 - i));
            sb2.append(charSequence, 0, i);
            sb2.append(charSequence, i2, charSequence.length());
            return sb2;
        }
    }

    @C6003d
    /* renamed from: b */
    public static final CharSequence m28000b(@C6003d CharSequence charSequence, @C6003d CharSequence charSequence2) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(charSequence2, "suffix");
        if (m28070d(charSequence, charSequence2, false, 2, (Object) null)) {
            return charSequence.subSequence(0, charSequence.length() - charSequence2.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @C6003d
    /* renamed from: c */
    public static final String m28052c(@C6003d String str, @C6003d C6080l<? super Character, Boolean> lVar) {
        Object obj;
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(lVar, "predicate");
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = "";
                break;
            } else if (!((Boolean) lVar.invoke(Character.valueOf(str.charAt(i)))).booleanValue()) {
                obj = str.subSequence(i, str.length());
                break;
            } else {
                i++;
            }
        }
        return obj.toString();
    }

    @C6003d
    /* renamed from: b */
    public static final String m28015b(@C6003d String str, @C6003d CharSequence charSequence) {
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(charSequence, "suffix");
        if (!m28070d((CharSequence) str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - charSequence.length());
        C14445h0.m62453a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    @C6003d
    /* renamed from: c */
    public static final CharSequence m28041c(@C6003d CharSequence charSequence, @C6003d char... cArr) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(cArr, "chars");
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!C14794o.m64544a(cArr, charSequence.charAt(i))) {
                return charSequence.subSequence(i, charSequence.length());
            }
        }
        return "";
    }

    @C6041f
    /* renamed from: a */
    private static final String m27963a(@C6003d String str, int i, int i2) {
        if (str != null) {
            return m27944a((CharSequence) str, i, i2).toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    @C6003d
    /* renamed from: b */
    public static /* synthetic */ String m28019b(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return m28018b(str, str2, str3, str4);
    }

    @C6003d
    /* renamed from: a */
    public static final CharSequence m27949a(@C6003d CharSequence charSequence, @C6003d C14525k kVar) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(kVar, RangeValidateElement.METHOD);
        return m27944a(charSequence, kVar.mo45695b().intValue(), kVar.mo45696c().intValue() + 1);
    }

    @C6003d
    /* renamed from: b */
    public static final String m28018b(@C6003d String str, @C6003d String str2, @C6003d String str3, @C6003d String str4) {
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(str2, "delimiter");
        C14445h0.m62478f(str3, "replacement");
        C14445h0.m62478f(str4, "missingDelimiterValue");
        int b = m27995b((CharSequence) str, str2, 0, false, 6, (Object) null);
        return b == -1 ? str4 : m27945a((CharSequence) str, b + str2.length(), str.length(), (CharSequence) str3).toString();
    }

    @C6041f
    /* renamed from: a */
    private static final String m27970a(@C6003d String str, C14525k kVar) {
        if (str != null) {
            return m27949a((CharSequence) str, kVar).toString();
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }

    @C6003d
    /* renamed from: a */
    public static final CharSequence m27946a(@C6003d CharSequence charSequence, @C6003d CharSequence charSequence2) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(charSequence2, "prefix");
        if (m28075e(charSequence, charSequence2, false, 2, (Object) null)) {
            return charSequence.subSequence(charSequence2.length(), charSequence.length());
        }
        return charSequence.subSequence(0, charSequence.length());
    }

    @C6003d
    /* renamed from: b */
    public static /* synthetic */ String m28012b(String str, char c, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return m28011b(str, c, str2, str3);
    }

    @C6003d
    /* renamed from: c */
    public static final String m28053c(@C6003d String str, @C6003d char... cArr) {
        Object obj;
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(cArr, "chars");
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                obj = "";
                break;
            } else if (!C14794o.m64544a(cArr, str.charAt(i))) {
                obj = str.subSequence(i, str.length());
                break;
            } else {
                i++;
            }
        }
        return obj.toString();
    }

    @C6003d
    /* renamed from: b */
    public static final String m28011b(@C6003d String str, char c, @C6003d String str2, @C6003d String str3) {
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(str2, "replacement");
        C14445h0.m62478f(str3, "missingDelimiterValue");
        int b = m27993b((CharSequence) str, c, 0, false, 6, (Object) null);
        return b == -1 ? str3 : m27945a((CharSequence) str, b + 1, str.length(), (CharSequence) str2).toString();
    }

    @C6003d
    /* renamed from: a */
    public static final String m27965a(@C6003d String str, @C6003d CharSequence charSequence) {
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(charSequence, "prefix");
        if (!m28075e((CharSequence) str, charSequence, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length());
        C14445h0.m62453a((Object) substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    @C6041f
    /* renamed from: b */
    private static final String m28008b(@C6003d CharSequence charSequence, C14679o oVar, String str) {
        return oVar.mo45923b(charSequence, str);
    }

    @C6041f
    /* renamed from: b */
    private static final boolean m28035b(@C6003d CharSequence charSequence, C14679o oVar) {
        return oVar.mo45927c(charSequence);
    }

    @C6003d
    /* renamed from: a */
    public static final CharSequence m27947a(@C6003d CharSequence charSequence, @C6003d CharSequence charSequence2, @C6003d CharSequence charSequence3) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(charSequence2, "prefix");
        C14445h0.m62478f(charSequence3, "suffix");
        if (charSequence.length() < charSequence2.length() + charSequence3.length() || !m28075e(charSequence, charSequence2, false, 2, (Object) null) || !m28070d(charSequence, charSequence3, false, 2, (Object) null)) {
            return charSequence.subSequence(0, charSequence.length());
        }
        return charSequence.subSequence(charSequence2.length(), charSequence.length() - charSequence3.length());
    }

    /* renamed from: b */
    public static final boolean m28034b(@C6003d CharSequence charSequence, int i, @C6003d CharSequence charSequence2, int i2, int i3, boolean z) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(charSequence2, FacebookRequestErrorClassification.KEY_OTHER);
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C14663e.m63558a(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    @C6003d
    /* renamed from: a */
    public static final String m27966a(@C6003d String str, @C6003d CharSequence charSequence, @C6003d CharSequence charSequence2) {
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(charSequence, "prefix");
        C14445h0.m62478f(charSequence2, "suffix");
        if (str.length() < charSequence.length() + charSequence2.length() || !m28075e((CharSequence) str, charSequence, false, 2, (Object) null) || !m28070d((CharSequence) str, charSequence2, false, 2, (Object) null)) {
            return str;
        }
        String substring = str.substring(charSequence.length(), str.length() - charSequence2.length());
        C14445h0.m62453a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m28032b(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m28031b(charSequence, c, z);
    }

    /* renamed from: b */
    public static final boolean m28031b(@C6003d CharSequence charSequence, char c, boolean z) {
        C14445h0.m62478f(charSequence, "$receiver");
        return charSequence.length() > 0 && C14663e.m63558a(charSequence.charAt(m28036c(charSequence)), c, z);
    }

    @C6003d
    /* renamed from: a */
    public static /* synthetic */ String m27960a(String str, char c, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = str;
        }
        return m27959a(str, c, str2, str3);
    }

    @C6003d
    /* renamed from: b */
    public static /* synthetic */ String m28007b(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m28006b(charSequence, charSequence2, z);
    }

    @C6003d
    /* renamed from: a */
    public static final String m27959a(@C6003d String str, char c, @C6003d String str2, @C6003d String str3) {
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(str2, "replacement");
        C14445h0.m62478f(str3, "missingDelimiterValue");
        int a = m27935a((CharSequence) str, c, 0, false, 6, (Object) null);
        return a == -1 ? str3 : m27945a((CharSequence) str, a + 1, str.length(), (CharSequence) str2).toString();
    }

    @C6003d
    /* renamed from: b */
    public static final String m28006b(@C6003d CharSequence charSequence, @C6003d CharSequence charSequence2, boolean z) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(charSequence2, FacebookRequestErrorClassification.KEY_OTHER);
        int length = charSequence.length();
        int length2 = charSequence2.length();
        int min = Math.min(length, length2);
        int i = 0;
        while (i < min && C14663e.m63558a(charSequence.charAt((length - i) - 1), charSequence2.charAt((length2 - i) - 1), z)) {
            i++;
        }
        if (m28033b(charSequence, (length - i) - 1) || m28033b(charSequence2, (length2 - i) - 1)) {
            i--;
        }
        return charSequence.subSequence(length - i, length).toString();
    }

    @C6003d
    /* renamed from: a */
    public static /* synthetic */ String m27968a(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str4 = str;
        }
        return m27967a(str, str2, str3, str4);
    }

    @C6003d
    /* renamed from: a */
    public static final String m27967a(@C6003d String str, @C6003d String str2, @C6003d String str3, @C6003d String str4) {
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(str2, "delimiter");
        C14445h0.m62478f(str3, "replacement");
        C14445h0.m62478f(str4, "missingDelimiterValue");
        int a = m27939a((CharSequence) str, str2, 0, false, 6, (Object) null);
        return a == -1 ? str4 : m27945a((CharSequence) str, a + str2.length(), str.length(), (CharSequence) str3).toString();
    }

    @C6041f
    /* renamed from: a */
    private static final String m27955a(@C6003d CharSequence charSequence, C14679o oVar, String str) {
        return oVar.mo45918a(charSequence, str);
    }

    @C6041f
    /* renamed from: a */
    private static final String m27956a(@C6003d CharSequence charSequence, C14679o oVar, C6080l<? super C14672m, ? extends CharSequence> lVar) {
        return oVar.mo45919a(charSequence, lVar);
    }

    /* renamed from: b */
    public static /* synthetic */ int m27997b(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m28036c(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m27996b(charSequence, cArr, i, z);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m27990a(CharSequence charSequence, CharSequence charSequence2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m27989a(charSequence, charSequence2, i, z);
    }

    /* renamed from: b */
    public static final int m27996b(@C6003d CharSequence charSequence, @C6003d char[] cArr, int i, boolean z) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int b = C14534q.m62946b(i, m28036c(charSequence)); b >= 0; b--) {
                char charAt = charSequence.charAt(b);
                int length = cArr.length;
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (C14663e.m63558a(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return b;
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(C14794o.m64112C(cArr), i);
    }

    /* renamed from: a */
    public static final boolean m27989a(@C6003d CharSequence charSequence, @C6003d CharSequence charSequence2, int i, boolean z) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(charSequence2, "prefix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C6111y.m27904a((String) charSequence, (String) charSequence2, i, false, 4, (Object) null);
        }
        return m28034b(charSequence, i, charSequence2, 0, charSequence2.length(), z);
    }

    @C6003d
    /* renamed from: a */
    public static /* synthetic */ String m27954a(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m27953a(charSequence, charSequence2, z);
    }

    @C6003d
    /* renamed from: a */
    public static final String m27953a(@C6003d CharSequence charSequence, @C6003d CharSequence charSequence2, boolean z) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(charSequence2, FacebookRequestErrorClassification.KEY_OTHER);
        int min = Math.min(charSequence.length(), charSequence2.length());
        int i = 0;
        while (i < min && C14663e.m63558a(charSequence.charAt(i), charSequence2.charAt(i), z)) {
            i++;
        }
        int i2 = i - 1;
        if (m28033b(charSequence, i2) || m28033b(charSequence2, i2)) {
            i--;
        }
        return charSequence.subSequence(0, i).toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C14854w<Integer, String> m28030b(@C6003d CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        Object obj;
        Object obj2;
        C14854w<Integer, String> wVar = null;
        if (z || collection.size() != 1) {
            C14522i kVar = !z2 ? new C14525k(C14534q.m62902a(i, 0), charSequence.length()) : C14534q.m62980c(C14534q.m62946b(i, m28036c(charSequence)), 0);
            if (charSequence instanceof String) {
                int first = kVar.getFirst();
                int last = kVar.getLast();
                int e = kVar.mo45712e();
                if (e <= 0 ? first >= last : first <= last) {
                    while (true) {
                        Iterator it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            String str = (String) obj2;
                            if (C6111y.m27900a(str, 0, (String) charSequence, first, str.length(), z)) {
                                break;
                            }
                        }
                        String str2 = (String) obj2;
                        if (str2 == null) {
                            if (first == last) {
                                break;
                            }
                            first += e;
                        } else {
                            return C14731m0.m63872a(Integer.valueOf(first), str2);
                        }
                    }
                }
            } else {
                int first2 = kVar.getFirst();
                int last2 = kVar.getLast();
                int e2 = kVar.mo45712e();
                if (e2 <= 0 ? first2 >= last2 : first2 <= last2) {
                    while (true) {
                        Iterator it2 = collection.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            String str3 = (String) obj;
                            if (m28034b((CharSequence) str3, 0, charSequence, first2, str3.length(), z)) {
                                break;
                            }
                        }
                        String str4 = (String) obj;
                        if (str4 == null) {
                            if (first2 == last2) {
                                break;
                            }
                            first2 += e2;
                        } else {
                            return C14731m0.m63872a(Integer.valueOf(first2), str4);
                        }
                    }
                }
            }
            return null;
        }
        String str5 = (String) C14848z.m65648B(collection);
        CharSequence charSequence2 = charSequence;
        String str6 = str5;
        int i2 = i;
        int a = !z2 ? m27939a(charSequence2, str6, i2, false, 4, (Object) null) : m27995b(charSequence2, str6, i2, false, 4, (Object) null);
        if (a >= 0) {
            wVar = C14731m0.m63872a(Integer.valueOf(a), str5);
        }
        return wVar;
    }

    /* renamed from: a */
    public static /* synthetic */ int m27941a(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m27940a(charSequence, cArr, i, z);
    }

    /* renamed from: a */
    public static final int m27940a(@C6003d CharSequence charSequence, @C6003d char[] cArr, int i, boolean z) {
        boolean z2;
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            int a = C14534q.m62902a(i, 0);
            int c = m28036c(charSequence);
            if (a <= c) {
                while (true) {
                    char charAt = charSequence.charAt(a);
                    int length = cArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z2 = false;
                            break;
                        } else if (C14663e.m63558a(cArr[i2], charAt, z)) {
                            z2 = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (!z2) {
                        if (a == c) {
                            break;
                        }
                        a++;
                    } else {
                        return a;
                    }
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(C14794o.m64112C(cArr), i);
    }

    /* renamed from: a */
    static /* synthetic */ int m27937a(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        return m27936a(charSequence, charSequence2, i, i2, z, (i3 & 16) != 0 ? false : z2);
    }

    /* renamed from: a */
    private static final int m27936a(@C6003d CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C14522i iVar;
        if (!z2) {
            iVar = new C14525k(C14534q.m62902a(i, 0), C14534q.m62946b(i2, charSequence.length()));
        } else {
            iVar = C14534q.m62980c(C14534q.m62946b(i, m28036c(charSequence)), C14534q.m62902a(i2, 0));
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int first = iVar.getFirst();
            int last = iVar.getLast();
            int e = iVar.mo45712e();
            if (e <= 0 ? first >= last : first <= last) {
                while (true) {
                    if (!m28034b(charSequence2, 0, charSequence, first, charSequence2.length(), z)) {
                        if (first == last) {
                            break;
                        }
                        first += e;
                    } else {
                        return first;
                    }
                }
            }
        } else {
            int first2 = iVar.getFirst();
            int last2 = iVar.getLast();
            int e2 = iVar.mo45712e();
            if (e2 <= 0 ? first2 >= last2 : first2 <= last2) {
                while (true) {
                    if (!C6111y.m27900a((String) charSequence2, 0, (String) charSequence, first2, charSequence2.length(), z)) {
                        if (first2 == last2) {
                            break;
                        }
                        first2 += e2;
                    } else {
                        return first2;
                    }
                }
            }
        }
        return -1;
    }

    @C6004e
    /* renamed from: b */
    public static /* synthetic */ C14854w m28029b(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m28036c(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m28028b(charSequence, collection, i, z);
    }

    @C6004e
    /* renamed from: b */
    public static final C14854w<Integer, String> m28028b(@C6003d CharSequence charSequence, @C6003d Collection<String> collection, int i, boolean z) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(collection, "strings");
        return m28030b(charSequence, collection, i, z, true);
    }

    /* renamed from: b */
    public static /* synthetic */ int m27993b(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m28036c(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m27992b(charSequence, c, i, z);
    }

    /* renamed from: b */
    public static final int m27992b(@C6003d CharSequence charSequence, char c, int i, boolean z) {
        C14445h0.m62478f(charSequence, "$receiver");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        return m27996b(charSequence, new char[]{c}, i, z);
    }

    @C6004e
    /* renamed from: a */
    public static /* synthetic */ C14854w m27985a(CharSequence charSequence, Collection collection, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m27984a(charSequence, collection, i, z);
    }

    @C6004e
    /* renamed from: a */
    public static final C14854w<Integer, String> m27984a(@C6003d CharSequence charSequence, @C6003d Collection<String> collection, int i, boolean z) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(collection, "strings");
        return m28030b(charSequence, collection, i, z, false);
    }

    /* renamed from: a */
    public static /* synthetic */ int m27935a(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m27934a(charSequence, c, i, z);
    }

    /* renamed from: b */
    public static /* synthetic */ int m27995b(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m28036c(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m27994b(charSequence, str, i, z);
    }

    /* renamed from: a */
    public static final int m27934a(@C6003d CharSequence charSequence, char c, int i, boolean z) {
        C14445h0.m62478f(charSequence, "$receiver");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return m27940a(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: b */
    public static final int m27994b(@C6003d CharSequence charSequence, @C6003d String str, int i, boolean z) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(str, "string");
        if (z || !(charSequence instanceof String)) {
            return m27936a(charSequence, (CharSequence) str, i, 0, z, true);
        }
        return ((String) charSequence).lastIndexOf(str, i);
    }

    /* renamed from: a */
    public static /* synthetic */ int m27939a(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m27938a(charSequence, str, i, z);
    }

    @C6003d
    /* renamed from: b */
    public static /* synthetic */ C14594m m28027b(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m28026b(charSequence, strArr, z, i);
    }

    /* renamed from: a */
    public static final int m27938a(@C6003d CharSequence charSequence, @C6003d String str, int i, boolean z) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return m27937a(charSequence, str, i, charSequence.length(), z, false, 16, null);
    }

    @C6003d
    /* renamed from: b */
    public static final C14594m<String> m28026b(@C6003d CharSequence charSequence, @C6003d String[] strArr, boolean z, int i) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(strArr, "delimiters");
        return C14604p.m63321v(m27983a(charSequence, strArr, 0, z, i, 2, (Object) null), new C6116d(charSequence));
    }

    @C6003d
    /* renamed from: b */
    public static /* synthetic */ C14594m m28025b(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m28024b(charSequence, cArr, z, i);
    }

    @C6003d
    /* renamed from: b */
    public static final C14594m<String> m28024b(@C6003d CharSequence charSequence, @C6003d char[] cArr, boolean z, int i) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(cArr, "delimiters");
        return C14604p.m63321v(m27981a(charSequence, cArr, 0, z, i, 2, (Object) null), new C6117e(charSequence));
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m27988a(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m27987a(charSequence, c, z);
    }

    @C6003d
    /* renamed from: b */
    public static final String m28020b(@C6003d String str, @C6003d C6080l<? super Character, Boolean> lVar) {
        String str2;
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(lVar, "predicate");
        int length = str.length();
        while (true) {
            length--;
            if (length >= 0) {
                if (!((Boolean) lVar.invoke(Character.valueOf(str.charAt(length)))).booleanValue()) {
                    str2 = str.subSequence(0, length + 1).toString();
                    break;
                }
            } else {
                str2 = "";
                break;
            }
        }
        return str2.toString();
    }

    /* renamed from: a */
    public static final boolean m27987a(@C6003d CharSequence charSequence, char c, boolean z) {
        C14445h0.m62478f(charSequence, "$receiver");
        return m27935a(charSequence, c, 0, z, 2, (Object) null) >= 0;
    }

    @C6041f
    /* renamed from: a */
    private static final boolean m27991a(@C6003d CharSequence charSequence, C14679o oVar) {
        C14445h0.m62478f(charSequence, "$receiver");
        return oVar.mo45922a(charSequence);
    }

    /* renamed from: a */
    static /* synthetic */ C14594m m27981a(CharSequence charSequence, char[] cArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m27980a(charSequence, cArr, i, z, i2);
    }

    /* renamed from: a */
    private static final C14594m<C14525k> m27980a(@C6003d CharSequence charSequence, char[] cArr, int i, boolean z, int i2) {
        if (i2 >= 0) {
            return new C14666h(charSequence, i, i2, new C6114b(cArr, z));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Limit must be non-negative, but was ");
        sb.append(i2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @C6003d
    /* renamed from: b */
    public static final CharSequence m28003b(@C6003d CharSequence charSequence, @C6003d char... cArr) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(cArr, "chars");
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return "";
            }
        } while (C14794o.m64544a(cArr, charSequence.charAt(length)));
        return charSequence.subSequence(0, length + 1).toString();
    }

    /* renamed from: a */
    static /* synthetic */ C14594m m27983a(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m27982a(charSequence, strArr, i, z, i2);
    }

    /* renamed from: a */
    private static final C14594m<C14525k> m27982a(@C6003d CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        if (i2 >= 0) {
            return new C14666h(charSequence, i, i2, new C6115c(C14794o.m64862c((Object[]) strArr), z));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Limit must be non-negative, but was ");
        sb.append(i2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @C6003d
    /* renamed from: b */
    public static final String m28022b(@C6003d String str, @C6003d char... cArr) {
        String str2;
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(cArr, "chars");
        int length = str.length();
        while (true) {
            length--;
            if (length >= 0) {
                if (!C14794o.m64544a(cArr, str.charAt(length))) {
                    str2 = str.subSequence(0, length + 1).toString();
                    break;
                }
            } else {
                str2 = "";
                break;
            }
        }
        return str2.toString();
    }

    @C6003d
    /* renamed from: a */
    public static /* synthetic */ List m27979a(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m27978a(charSequence, strArr, z, i);
    }

    @C6003d
    /* renamed from: a */
    public static final List<String> m27978a(@C6003d CharSequence charSequence, @C6003d String[] strArr, boolean z, int i) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(strArr, "delimiters");
        if (strArr.length == 1) {
            boolean z2 = false;
            String str = strArr[0];
            if (str.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                return m27973a(charSequence, str, z, i);
            }
        }
        Iterable<C14525k> f = C14604p.m63283f(m27983a(charSequence, strArr, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(C6131v.m28159a((Iterable) f, 10));
        for (C14525k c : f) {
            arrayList.add(m28042c(charSequence, c));
        }
        return arrayList;
    }

    @C6003d
    /* renamed from: a */
    public static /* synthetic */ List m27977a(CharSequence charSequence, char[] cArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m27976a(charSequence, cArr, z, i);
    }

    @C6003d
    /* renamed from: a */
    public static final List<String> m27976a(@C6003d CharSequence charSequence, @C6003d char[] cArr, boolean z, int i) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(cArr, "delimiters");
        if (cArr.length == 1) {
            return m27973a(charSequence, String.valueOf(cArr[0]), z, i);
        }
        Iterable<C14525k> f = C14604p.m63283f(m27981a(charSequence, cArr, 0, z, i, 2, (Object) null));
        ArrayList arrayList = new ArrayList(C6131v.m28159a((Iterable) f, 10));
        for (C14525k c : f) {
            arrayList.add(m28042c(charSequence, c));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static final List<String> m27973a(@C6003d CharSequence charSequence, String str, boolean z, int i) {
        int i2 = 0;
        if (i >= 0) {
            int a = m27938a(charSequence, str, 0, z);
            if (a == -1 || i == 1) {
                return C6129u.m28137a((Object) charSequence.toString());
            }
            boolean z2 = i > 0;
            int i3 = 10;
            if (z2) {
                i3 = C14534q.m62946b(i, 10);
            }
            ArrayList arrayList = new ArrayList(i3);
            do {
                arrayList.add(charSequence.subSequence(i2, a).toString());
                i2 = str.length() + a;
                if (z2 && arrayList.size() == i - 1) {
                    break;
                }
                a = m27938a(charSequence, str, i2, z);
            } while (a != -1);
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Limit must be non-negative, but was ");
        sb.append(i);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @C6041f
    /* renamed from: a */
    private static final List<String> m27974a(@C6003d CharSequence charSequence, C14679o oVar, int i) {
        return oVar.mo45926c(charSequence, i);
    }

    @C6003d
    /* renamed from: a */
    public static final String m27969a(@C6003d String str, @C6003d C6080l<? super Character, Boolean> lVar) {
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(lVar, "predicate");
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean booleanValue = ((Boolean) lVar.invoke(Character.valueOf(str.charAt(!z ? i : length)))).booleanValue();
            if (!z) {
                if (!booleanValue) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!booleanValue) {
                break;
            } else {
                length--;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    @C6003d
    /* renamed from: a */
    public static final CharSequence m27951a(@C6003d CharSequence charSequence, @C6003d char... cArr) {
        C14445h0.m62478f(charSequence, "$receiver");
        C14445h0.m62478f(cArr, "chars");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean a = C14794o.m64544a(cArr, charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!a) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!a) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    @C6003d
    /* renamed from: a */
    public static final String m27972a(@C6003d String str, @C6003d char... cArr) {
        C14445h0.m62478f(str, "$receiver");
        C14445h0.m62478f(cArr, "chars");
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean a = C14794o.m64544a(cArr, str.charAt(!z ? i : length));
            if (!z) {
                if (!a) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!a) {
                break;
            } else {
                length--;
            }
        }
        return str.subSequence(i, length + 1).toString();
    }

    @C6041f
    /* renamed from: a */
    static /* synthetic */ List m27975a(CharSequence charSequence, C14679o oVar, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return oVar.mo45926c(charSequence, i);
    }
}
