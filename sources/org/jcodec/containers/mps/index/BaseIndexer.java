package org.jcodec.containers.mps.index;

import androidx.core.p034l.C0986h;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.jcodec.common.ArrayUtil;
import org.jcodec.common.IntArrayList;
import org.jcodec.common.LongArrayList;
import org.jcodec.common.RunLength.Integer;
import org.jcodec.common.logging.Logger;
import org.jcodec.common.tools.MathUtil;
import org.jcodec.containers.mps.MPSDemuxer.PESPacket;
import org.jcodec.containers.mps.MPSUtils.PESReader;
import org.jcodec.containers.mps.index.MPSIndex.MPSStreamIndex;

public abstract class BaseIndexer extends PESReader {
    private Map<Integer, BaseAnalyser> analyzers = new HashMap();
    private Integer streams = new Integer();
    private LongArrayList tokens = new LongArrayList();

    protected abstract class BaseAnalyser {
        protected IntArrayList dur = new IntArrayList(250000);
        protected IntArrayList pts = new IntArrayList(250000);

        protected BaseAnalyser() {
        }

        public int estimateSize() {
            return (this.pts.size() << 2) + 4;
        }

        public abstract void finishAnalyse();

        public abstract void pkt(ByteBuffer byteBuffer, PESPacket pESPacket);

        public abstract MPSStreamIndex serialize(int i);
    }

    /* renamed from: org.jcodec.containers.mps.index.BaseIndexer$b */
    private class C15556b extends BaseAnalyser {

        /* renamed from: a */
        private IntArrayList f44865a;

        /* renamed from: b */
        private int f44866b;

        /* renamed from: c */
        private long f44867c;

        private C15556b() {
            super();
            this.f44865a = new IntArrayList(250000);
        }

        public int estimateSize() {
            return super.estimateSize() + (this.f44865a.size() << 2) + 32;
        }

        public void finishAnalyse() {
        }

        public void pkt(ByteBuffer byteBuffer, PESPacket pESPacket) {
            this.f44865a.add(byteBuffer.remaining());
            long j = pESPacket.pts;
            if (j == -1) {
                pESPacket.pts = this.f44867c + ((long) this.f44866b);
            } else {
                this.f44866b = (int) (j - this.f44867c);
                this.f44867c = j;
            }
            this.pts.add((int) pESPacket.pts);
            this.dur.add(this.f44866b);
        }

        public MPSStreamIndex serialize(int i) {
            MPSStreamIndex mPSStreamIndex = new MPSStreamIndex(i, this.f44865a.toArray(), this.pts.toArray(), this.dur.toArray(), new int[0]);
            return mPSStreamIndex;
        }
    }

    /* renamed from: org.jcodec.containers.mps.index.BaseIndexer$c */
    private class C15557c extends BaseAnalyser {

        /* renamed from: a */
        private int f44869a;

        /* renamed from: b */
        private long f44870b;

        /* renamed from: c */
        private IntArrayList f44871c;

        /* renamed from: d */
        private IntArrayList f44872d;

        /* renamed from: e */
        private int f44873e;

        /* renamed from: f */
        private boolean f44874f;

        /* renamed from: g */
        private C15559b f44875g;

        /* renamed from: h */
        private List<C15559b> f44876h;

        /* renamed from: i */
        private long f44877i;

        /* renamed from: j */
        private C15559b f44878j;

        /* renamed from: org.jcodec.containers.mps.index.BaseIndexer$c$a */
        class C15558a implements Comparator<C15559b> {
            C15558a() {
            }

            /* renamed from: a */
            public int compare(C15559b bVar, C15559b bVar2) {
                int i = bVar.f44884d;
                int i2 = bVar2.f44884d;
                if (i > i2) {
                    return 1;
                }
                return i == i2 ? 0 : -1;
            }
        }

        /* renamed from: org.jcodec.containers.mps.index.BaseIndexer$c$b */
        private class C15559b {

            /* renamed from: a */
            long f44881a;

            /* renamed from: b */
            int f44882b;

            /* renamed from: c */
            int f44883c;

            /* renamed from: d */
            int f44884d;

            private C15559b() {
            }
        }

        private C15557c() {
            super();
            this.f44869a = -1;
            this.f44871c = new IntArrayList(250000);
            this.f44872d = new IntArrayList(20000);
            this.f44876h = new ArrayList();
            this.f44877i = -1;
        }

        /* renamed from: a */
        private void m68691a() {
            m68692a(this.f44876h);
            for (C15559b bVar : this.f44876h) {
                this.f44871c.add(bVar.f44882b);
                this.pts.add(bVar.f44883c);
            }
            this.f44876h.clear();
        }

        public void finishAnalyse() {
            C15559b bVar = this.f44875g;
            if (bVar != null) {
                bVar.f44882b = (int) (this.f44870b - bVar.f44881a);
                this.f44876h.add(bVar);
                m68691a();
            }
        }

        public void pkt(ByteBuffer byteBuffer, PESPacket pESPacket) {
            PESPacket pESPacket2 = pESPacket;
            while (byteBuffer.hasRemaining()) {
                byte b = byteBuffer.get() & 255;
                this.f44870b++;
                this.f44869a = (this.f44869a << 8) | b;
                long j = this.f44877i;
                if (j != -1) {
                    long j2 = this.f44870b - j;
                    if (j2 == 5) {
                        this.f44875g.f44884d = b << 2;
                    } else if (j2 == 6) {
                        int i = (b >> 3) & 7;
                        C15559b bVar = this.f44875g;
                        bVar.f44884d = (b >> 6) | bVar.f44884d;
                        if (i == 1) {
                            this.f44872d.add(this.f44873e - 1);
                            if (this.f44876h.size() > 0) {
                                m68691a();
                            }
                        }
                    }
                }
                int i2 = this.f44869a;
                if ((i2 & C0986h.f4419u) == 256) {
                    if (this.f44874f && (i2 == 256 || i2 > 431)) {
                        C15559b bVar2 = this.f44875g;
                        bVar2.f44882b = (int) ((this.f44870b - 4) - bVar2.f44881a);
                        this.f44876h.add(bVar2);
                        this.f44875g = null;
                        this.f44874f = false;
                    } else if (!this.f44874f) {
                        int i3 = this.f44869a;
                        if (i3 > 256 && i3 <= 431) {
                            this.f44874f = true;
                        }
                    }
                    if (this.f44875g == null) {
                        int i4 = this.f44869a;
                        if (i4 == 435 || i4 == 440 || i4 == 256) {
                            C15559b bVar3 = new C15559b();
                            bVar3.f44883c = (int) pESPacket2.pts;
                            bVar3.f44881a = this.f44870b - 4;
                            Logger.info(String.format("FRAME[%d]: %012x, %d", new Object[]{Integer.valueOf(this.f44873e), Long.valueOf((pESPacket2.pos + ((long) byteBuffer.position())) - 4), Long.valueOf(pESPacket2.pts)}));
                            this.f44873e++;
                            this.f44875g = bVar3;
                        }
                    }
                    C15559b bVar4 = this.f44875g;
                    if (bVar4 != null && bVar4.f44883c == -1 && this.f44869a == 256) {
                        bVar4.f44883c = (int) pESPacket2.pts;
                    }
                    this.f44877i = this.f44869a == 256 ? this.f44870b - 4 : -1;
                }
            }
        }

        public MPSStreamIndex serialize(int i) {
            MPSStreamIndex mPSStreamIndex = new MPSStreamIndex(i, this.f44871c.toArray(), this.pts.toArray(), this.dur.toArray(), this.f44872d.toArray());
            return mPSStreamIndex;
        }

        /* renamed from: a */
        private void m68692a(List<C15559b> list) {
            C15559b[] bVarArr = (C15559b[]) list.toArray(new C15559b[0]);
            Arrays.sort(bVarArr, new C15558a());
            for (int i = 0; i < 3; i++) {
                int i2 = -1;
                int i3 = -1;
                int i4 = -1;
                int i5 = -1;
                for (int i6 = 0; i6 < bVarArr.length; i6++) {
                    if (!(bVarArr[i6].f44883c != -1 || i2 == -1 || i3 == -1)) {
                        bVarArr[i6].f44883c = ((i2 - i3) / MathUtil.abs(i4 - i5)) + i2;
                    }
                    if (bVarArr[i6].f44883c != -1) {
                        int i7 = bVarArr[i6].f44883c;
                        i3 = i2;
                        i2 = i7;
                        i5 = i4;
                        i4 = bVarArr[i6].f44884d;
                    }
                }
                ArrayUtil.reverse(bVarArr);
            }
            C15559b bVar = this.f44878j;
            if (bVar != null) {
                this.dur.add(bVarArr[0].f44883c - bVar.f44883c);
            }
            for (int i8 = 1; i8 < bVarArr.length; i8++) {
                this.dur.add(bVarArr[i8].f44883c - bVarArr[i8 - 1].f44883c);
            }
            this.f44878j = bVarArr[bVarArr.length - 1];
        }
    }

    public int estimateSize() {
        int size = (this.tokens.size() << 3) + this.streams.estimateSize() + 128;
        for (Integer num : this.analyzers.keySet()) {
            size += ((BaseAnalyser) this.analyzers.get(num)).estimateSize();
        }
        return size;
    }

    /* access modifiers changed from: 0000 */
    public void finishAnalyse() {
        super.finishRead();
        for (BaseAnalyser finishAnalyse : this.analyzers.values()) {
            finishAnalyse.finishAnalyse();
        }
    }

    /* access modifiers changed from: protected */
    public BaseAnalyser getAnalyser(int i) {
        if (((BaseAnalyser) this.analyzers.get(Integer.valueOf(i))) == null) {
            this.analyzers.put(Integer.valueOf(i), (i < 224 || i > 239) ? new C15556b() : new C15557c());
        }
        return (BaseAnalyser) this.analyzers.get(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    public void savePESMeta(int i, long j) {
        this.tokens.add(j);
        this.streams.add(i);
    }

    public MPSIndex serialize() {
        ArrayList arrayList = new ArrayList();
        for (Entry entry : this.analyzers.entrySet()) {
            arrayList.add(((BaseAnalyser) entry.getValue()).serialize(((Integer) entry.getKey()).intValue()));
        }
        return new MPSIndex(this.tokens.toArray(), this.streams, (MPSStreamIndex[]) arrayList.toArray(new MPSStreamIndex[0]));
    }
}
