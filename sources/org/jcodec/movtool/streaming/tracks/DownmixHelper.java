package org.jcodec.movtool.streaming.tracks;

import com.google.common.base.C5785c;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import org.jcodec.common.IntArrayList;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.logging.Logger;
import org.jcodec.containers.mp4.boxes.EndianBox.Endian;
import org.jcodec.containers.mp4.boxes.channel.Label;
import org.jcodec.movtool.streaming.AudioCodecMeta;

public class DownmixHelper {
    private static float rev = 4.656613E-10f;
    private int[][] channels;
    private int[][] counts;
    private ThreadLocal<float[][]> fltBuf = new ThreadLocal<>();
    private float[][] matrix;
    private int nSamples;

    /* renamed from: se */
    private AudioCodecMeta[] f44920se;

    /* renamed from: org.jcodec.movtool.streaming.tracks.DownmixHelper$a */
    static /* synthetic */ class C15579a {

        /* renamed from: a */
        static final /* synthetic */ int[] f44921a = new int[Label.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|(3:31|32|34)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0086 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0092 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00aa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b6 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                org.jcodec.containers.mp4.boxes.channel.Label[] r0 = org.jcodec.containers.mp4.boxes.channel.Label.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44921a = r0
                int[] r0 = f44921a     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.jcodec.containers.mp4.boxes.channel.Label r1 = org.jcodec.containers.mp4.boxes.channel.Label.Left     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f44921a     // Catch:{ NoSuchFieldError -> 0x001f }
                org.jcodec.containers.mp4.boxes.channel.Label r1 = org.jcodec.containers.mp4.boxes.channel.Label.LeftTotal     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f44921a     // Catch:{ NoSuchFieldError -> 0x002a }
                org.jcodec.containers.mp4.boxes.channel.Label r1 = org.jcodec.containers.mp4.boxes.channel.Label.LeftCenter     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f44921a     // Catch:{ NoSuchFieldError -> 0x0035 }
                org.jcodec.containers.mp4.boxes.channel.Label r1 = org.jcodec.containers.mp4.boxes.channel.Label.LeftSurround     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f44921a     // Catch:{ NoSuchFieldError -> 0x0040 }
                org.jcodec.containers.mp4.boxes.channel.Label r1 = org.jcodec.containers.mp4.boxes.channel.Label.RearSurroundLeft     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f44921a     // Catch:{ NoSuchFieldError -> 0x004b }
                org.jcodec.containers.mp4.boxes.channel.Label r1 = org.jcodec.containers.mp4.boxes.channel.Label.Right     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f44921a     // Catch:{ NoSuchFieldError -> 0x0056 }
                org.jcodec.containers.mp4.boxes.channel.Label r1 = org.jcodec.containers.mp4.boxes.channel.Label.RightTotal     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f44921a     // Catch:{ NoSuchFieldError -> 0x0062 }
                org.jcodec.containers.mp4.boxes.channel.Label r1 = org.jcodec.containers.mp4.boxes.channel.Label.RightCenter     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f44921a     // Catch:{ NoSuchFieldError -> 0x006e }
                org.jcodec.containers.mp4.boxes.channel.Label r1 = org.jcodec.containers.mp4.boxes.channel.Label.RightSurround     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r0 = f44921a     // Catch:{ NoSuchFieldError -> 0x007a }
                org.jcodec.containers.mp4.boxes.channel.Label r1 = org.jcodec.containers.mp4.boxes.channel.Label.RearSurroundRight     // Catch:{ NoSuchFieldError -> 0x007a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007a }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007a }
            L_0x007a:
                int[] r0 = f44921a     // Catch:{ NoSuchFieldError -> 0x0086 }
                org.jcodec.containers.mp4.boxes.channel.Label r1 = org.jcodec.containers.mp4.boxes.channel.Label.Mono     // Catch:{ NoSuchFieldError -> 0x0086 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0086 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0086 }
            L_0x0086:
                int[] r0 = f44921a     // Catch:{ NoSuchFieldError -> 0x0092 }
                org.jcodec.containers.mp4.boxes.channel.Label r1 = org.jcodec.containers.mp4.boxes.channel.Label.LFEScreen     // Catch:{ NoSuchFieldError -> 0x0092 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0092 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0092 }
            L_0x0092:
                int[] r0 = f44921a     // Catch:{ NoSuchFieldError -> 0x009e }
                org.jcodec.containers.mp4.boxes.channel.Label r1 = org.jcodec.containers.mp4.boxes.channel.Label.Center     // Catch:{ NoSuchFieldError -> 0x009e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009e }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009e }
            L_0x009e:
                int[] r0 = f44921a     // Catch:{ NoSuchFieldError -> 0x00aa }
                org.jcodec.containers.mp4.boxes.channel.Label r1 = org.jcodec.containers.mp4.boxes.channel.Label.LFE2     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                int[] r0 = f44921a     // Catch:{ NoSuchFieldError -> 0x00b6 }
                org.jcodec.containers.mp4.boxes.channel.Label r1 = org.jcodec.containers.mp4.boxes.channel.Label.Discrete     // Catch:{ NoSuchFieldError -> 0x00b6 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b6 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b6 }
            L_0x00b6:
                int[] r0 = f44921a     // Catch:{ NoSuchFieldError -> 0x00c2 }
                org.jcodec.containers.mp4.boxes.channel.Label r1 = org.jcodec.containers.mp4.boxes.channel.Label.Unused     // Catch:{ NoSuchFieldError -> 0x00c2 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c2 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c2 }
            L_0x00c2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jcodec.movtool.streaming.tracks.DownmixHelper.C15579a.<clinit>():void");
        }
    }

    public DownmixHelper(AudioCodecMeta[] audioCodecMetaArr, int i, boolean[][] zArr) {
        this.nSamples = i;
        this.f44920se = audioCodecMetaArr;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i2 = 0; i2 < audioCodecMetaArr.length; i2++) {
            Label[] channelLabels = audioCodecMetaArr[i2].getChannelLabels();
            IntArrayList intArrayList = new IntArrayList();
            for (int i3 = 0; i3 < channelLabels.length; i3++) {
                if (zArr == null || zArr[i2][i3]) {
                    intArrayList.add(i3);
                    switch (C15579a.f44921a[channelLabels[i3].ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                            arrayList.add(new float[]{1.0f, 0.0f});
                            arrayList2.add(new int[]{1, 0});
                            break;
                        case 4:
                        case 5:
                            arrayList.add(new float[]{0.7f, 0.0f});
                            arrayList2.add(new int[]{1, 0});
                            break;
                        case 6:
                        case 7:
                        case 8:
                            arrayList.add(new float[]{0.0f, 1.0f});
                            arrayList2.add(new int[]{0, 1});
                            break;
                        case 9:
                        case 10:
                            arrayList.add(new float[]{0.0f, 0.7f});
                            arrayList2.add(new int[]{0, 1});
                            break;
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            arrayList.add(new float[]{0.7f, 0.7f});
                            arrayList2.add(new int[]{1, 1});
                            break;
                        case 16:
                            break;
                        default:
                            if ((channelLabels[i3].getVal() >>> 16) != 1) {
                                break;
                            } else {
                                arrayList.add(new float[]{0.7f, 0.7f});
                                arrayList2.add(new int[]{1, 1});
                                StringBuilder sb = new StringBuilder();
                                sb.append("Discrete");
                                sb.append(channelLabels[i3].getVal() & 65535);
                                Logger.info(sb.toString());
                                break;
                            }
                    }
                }
            }
            arrayList3.add(intArrayList.toArray());
        }
        this.matrix = (float[][]) arrayList.toArray(new float[0][]);
        this.counts = (int[][]) arrayList2.toArray(new int[0][]);
        this.channels = (int[][]) arrayList3.toArray(new int[0][]);
    }

    public static final float clamp1f(float f) {
        if (f > 1.0f) {
            return 1.0f;
        }
        if (f < -1.0f) {
            return -1.0f;
        }
        return f;
    }

    private static final float nextSample16BE(byte[] bArr, int i) {
        return rev * ((float) (((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << C5785c.f16669B)));
    }

    private static final float nextSample16LE(byte[] bArr, int i) {
        return rev * ((float) (((bArr[i + 1] & 255) << C5785c.f16669B) | ((bArr[i] & 255) << 16)));
    }

    private static final float nextSample24BE(byte[] bArr, int i) {
        return rev * ((float) (((bArr[i + 2] & 255) << 8) | ((bArr[i] & 255) << C5785c.f16669B) | ((bArr[i + 1] & 255) << 16)));
    }

    private static final float nextSample24LE(byte[] bArr, int i) {
        return rev * ((float) (((bArr[i + 2] & 255) << C5785c.f16669B) | ((bArr[i] & 255) << 8) | ((bArr[i + 1] & 255) << 16)));
    }

    private void toFloat(float[] fArr, AudioCodecMeta audioCodecMeta, ByteBuffer byteBuffer, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr;
        int i5;
        int i6 = 0;
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i4 = byteBuffer.arrayOffset() + byteBuffer.position();
            i3 = byteBuffer.remaining();
        } else {
            bArr = NIOUtils.toArray(byteBuffer);
            i3 = bArr.length;
            i4 = 0;
        }
        if (audioCodecMeta.getSampleSize() == 3) {
            int i7 = i2 * 3;
            i5 = Math.min(this.nSamples, i3 / i7);
            if (audioCodecMeta.getEndian() == Endian.BIG_ENDIAN) {
                int i8 = i4 + (i * 3);
                while (i6 < i5) {
                    fArr[i6] = nextSample24BE(bArr, i8);
                    i6++;
                    i8 += i7;
                }
            } else {
                int i9 = i4 + (i * 3);
                while (i6 < i5) {
                    fArr[i6] = nextSample24LE(bArr, i9);
                    i6++;
                    i9 += i7;
                }
            }
        } else {
            int i10 = i2 * 2;
            i5 = Math.min(this.nSamples, i3 / i10);
            if (audioCodecMeta.getEndian() == Endian.BIG_ENDIAN) {
                int i11 = i4 + (i * 2);
                while (i6 < i5) {
                    fArr[i6] = nextSample16BE(bArr, i11);
                    i6++;
                    i11 += i10;
                }
            } else {
                int i12 = i4 + (i * 2);
                while (i6 < i5) {
                    fArr[i6] = nextSample16LE(bArr, i12);
                    i6++;
                    i12 += i10;
                }
            }
        }
        while (i5 < this.nSamples) {
            fArr[i5] = 0.0f;
            i5++;
        }
    }

    public void downmix(ByteBuffer[] byteBufferArr, ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        if (this.matrix.length == 0) {
            byteBuffer.limit(this.nSamples << 2);
            return;
        }
        float[][] fArr = (float[][]) this.fltBuf.get();
        if (fArr == null) {
            fArr = (float[][]) Array.newInstance(float.class, new int[]{this.matrix.length, this.nSamples});
            this.fltBuf.set(fArr);
        }
        int i = 0;
        int i2 = 0;
        while (i < this.f44920se.length) {
            int i3 = i2;
            int i4 = 0;
            while (true) {
                int[][] iArr = this.channels;
                if (i4 >= iArr[i].length) {
                    break;
                }
                float[] fArr2 = fArr[i3];
                AudioCodecMeta[] audioCodecMetaArr = this.f44920se;
                toFloat(fArr2, audioCodecMetaArr[i], byteBufferArr[i], iArr[i][i4], audioCodecMetaArr[i].getChannelCount());
                i4++;
                i3++;
            }
            i++;
            i2 = i3;
        }
        for (int i5 = 0; i5 < this.nSamples; i5++) {
            int i6 = 0;
            int i7 = 0;
            float f = 0.0f;
            float f2 = 1.0f;
            float f3 = 0.0f;
            float f4 = 1.0f;
            int i8 = 0;
            while (true) {
                float[][] fArr3 = this.matrix;
                if (i6 >= fArr3.length) {
                    break;
                }
                float f5 = fArr[i6][i5];
                float f6 = fArr3[i6][0] * f5;
                float f7 = fArr3[i6][1] * f5;
                f += f6;
                f2 *= f6;
                f3 += f7;
                f4 *= f7;
                int[][] iArr2 = this.counts;
                i7 += iArr2[i6][0];
                i8 += iArr2[i6][1];
                i6++;
            }
            if (i7 > 1) {
                f = clamp1f(f - f2);
            }
            if (i8 > 1) {
                f3 = clamp1f(f3 - f4);
            }
            short s = (short) ((int) (f3 * 32767.0f));
            byteBuffer.putShort((short) ((int) (f * 32767.0f)));
            byteBuffer.putShort(s);
        }
        byteBuffer.flip();
    }
}
