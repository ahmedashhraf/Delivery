package org.jcodec.containers.mps;

import com.mrsool.utils.C11644i;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.HashMap;
import org.jcodec.codecs.mpeg12.MPEGUtil;
import org.jcodec.codecs.mpeg12.bitstream.CopyrightExtension;
import org.jcodec.codecs.mpeg12.bitstream.GOPHeader;
import org.jcodec.codecs.mpeg12.bitstream.PictureCodingExtension;
import org.jcodec.codecs.mpeg12.bitstream.PictureDisplayExtension;
import org.jcodec.codecs.mpeg12.bitstream.PictureHeader;
import org.jcodec.codecs.mpeg12.bitstream.PictureSpatialScalableExtension;
import org.jcodec.codecs.mpeg12.bitstream.PictureTemporalScalableExtension;
import org.jcodec.codecs.mpeg12.bitstream.QuantMatrixExtension;
import org.jcodec.codecs.mpeg12.bitstream.SequenceDisplayExtension;
import org.jcodec.codecs.mpeg12.bitstream.SequenceExtension;
import org.jcodec.codecs.mpeg12.bitstream.SequenceHeader;
import org.jcodec.codecs.mpeg12.bitstream.SequenceScalableExtension;
import org.jcodec.common.FileChannelWrapper;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.p554io.BitReader;
import org.jcodec.common.tools.MainUtils;
import org.jcodec.common.tools.MainUtils.ANSIColor;
import org.jcodec.common.tools.MainUtils.Cmd;
import org.jcodec.containers.mps.MPSDemuxer.PESPacket;

public class MPSDump {
    private static final String DUMP_FROM = "dump-from";
    private static final String STOP_AT = "stop-at";

    /* renamed from: ch */
    protected ReadableByteChannel f44848ch;

    /* renamed from: org.jcodec.containers.mps.MPSDump$a */
    static class C15549a extends HashMap<String, String> {
        C15549a() {
            put(MPSDump.STOP_AT, "Stop reading at timestamp");
            put(MPSDump.DUMP_FROM, "Start dumping from timestamp");
        }
    }

    /* renamed from: org.jcodec.containers.mps.MPSDump$b */
    private static class C15550b {

        /* renamed from: a */
        private int f44849a;

        /* renamed from: b */
        private ByteBuffer f44850b;

        /* renamed from: c */
        private int f44851c;

        /* renamed from: d */
        private int f44852d;

        /* renamed from: e */
        private int f44853e;

        /* renamed from: f */
        private int f44854f;

        /* renamed from: g */
        private int f44855g;

        /* renamed from: h */
        private PictureHeader f44856h;

        /* renamed from: i */
        private SequenceHeader f44857i;

        /* renamed from: j */
        private PictureCodingExtension f44858j;

        /* renamed from: k */
        private SequenceExtension f44859k;

        private C15550b() {
            this.f44849a = -1;
            this.f44850b = ByteBuffer.allocate(1048576);
        }

        /* renamed from: b */
        private void m68684b(ByteBuffer byteBuffer) {
            BitReader bitReader = new BitReader(byteBuffer);
            int readNBit = bitReader.readNBit(4);
            String str = "extension ";
            if (this.f44856h == null) {
                if (this.f44857i == null) {
                    PrintStream printStream = System.out;
                    StringBuilder sb = new StringBuilder();
                    sb.append("dangling extension ");
                    sb.append(readNBit);
                    printStream.print(MainUtils.color(sb.toString(), ANSIColor.GREEN, true));
                } else if (readNBit == 1) {
                    this.f44859k = SequenceExtension.read(bitReader);
                    m68681a(this.f44859k);
                } else if (readNBit == 2) {
                    m68680a(SequenceDisplayExtension.read(bitReader));
                } else if (readNBit != 5) {
                    PrintStream printStream2 = System.out;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(readNBit);
                    printStream2.print(MainUtils.color(sb2.toString(), ANSIColor.GREEN, true));
                } else {
                    m68682a(SequenceScalableExtension.read(bitReader));
                }
            } else if (readNBit == 3) {
                m68679a(QuantMatrixExtension.read(bitReader));
            } else if (readNBit == 4) {
                m68674a(CopyrightExtension.read(bitReader));
            } else if (readNBit != 7) {
                if (readNBit == 8) {
                    this.f44858j = PictureCodingExtension.read(bitReader);
                    m68675a(this.f44858j);
                } else if (readNBit == 9) {
                    m68677a(PictureSpatialScalableExtension.read(bitReader));
                } else if (readNBit != 16) {
                    PrintStream printStream3 = System.out;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append(readNBit);
                    printStream3.print(MainUtils.color(sb3.toString(), ANSIColor.GREEN, true));
                } else {
                    m68678a(PictureTemporalScalableExtension.read(bitReader));
                }
            } else if (this.f44857i != null) {
                PictureCodingExtension pictureCodingExtension = this.f44858j;
                if (pictureCodingExtension != null) {
                    m68676a(PictureDisplayExtension.read(bitReader, this.f44859k, pictureCodingExtension));
                }
            }
        }

        /* renamed from: c */
        private void m68685c(ByteBuffer byteBuffer) {
            String str;
            GOPHeader read = GOPHeader.read(byteBuffer);
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("group header <closed:");
            sb.append(read.isClosedGop());
            sb.append(",broken link:");
            sb.append(read.isBrokenLink());
            if (read.getTimeCode() != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(",timecode:");
                sb2.append(read.getTimeCode().toString());
                str = sb2.toString();
            } else {
                str = "";
            }
            sb.append(str);
            sb.append(">");
            printStream.print(MainUtils.color(sb.toString(), ANSIColor.MAGENTA, true));
        }

        /* renamed from: d */
        private void m68686d(ByteBuffer byteBuffer) {
            this.f44856h = PictureHeader.read(byteBuffer);
            this.f44858j = null;
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("picture header <type:");
            int i = this.f44856h.picture_coding_type;
            String str = i == 1 ? "I" : i == 2 ? C11644i.f33192S6 : "B";
            sb.append(str);
            sb.append(", temp_ref:");
            sb.append(this.f44856h.temporal_reference);
            sb.append(">");
            printStream.print(MainUtils.color(sb.toString(), ANSIColor.BROWN, true));
        }

        /* renamed from: e */
        private void m68687e(ByteBuffer byteBuffer) {
            this.f44856h = null;
            this.f44858j = null;
            this.f44859k = null;
            this.f44857i = SequenceHeader.read(byteBuffer);
            System.out.print(MainUtils.color("sequence header", ANSIColor.BLUE, true));
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m68673a(ByteBuffer byteBuffer) {
            int position = byteBuffer.position();
            int remaining = byteBuffer.remaining();
            while (byteBuffer.hasRemaining()) {
                this.f44850b.put((byte) (this.f44849a >> 24));
                this.f44849a = (this.f44849a << 8) | (byteBuffer.get() & 255);
                int i = this.f44849a;
                if (i >= 256 && i <= 440) {
                    this.f44850b.flip();
                    this.f44850b.getInt();
                    if (this.f44851c != 0) {
                        if (this.f44853e != this.f44855g) {
                            this.f44852d -= this.f44854f;
                        }
                        m68672a(this.f44851c, this.f44852d, this.f44850b);
                    }
                    this.f44850b.clear();
                    this.f44851c = this.f44849a;
                    this.f44852d = (byteBuffer.position() - 4) - position;
                    this.f44853e = this.f44855g;
                }
            }
            this.f44855g++;
            this.f44854f = remaining;
        }

        /* synthetic */ C15550b(C15549a aVar) {
            this();
        }

        /* renamed from: a */
        private void m68672a(int i, int i2, ByteBuffer byteBuffer) {
            System.out.print(String.format("marker: 0x%02x [@%d] ( ", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
            if (i == 256) {
                m68686d(byteBuffer);
            } else if (i <= 431) {
                System.out.print(MainUtils.color(String.format("slice @0x%02x", new Object[]{Integer.valueOf(i - 257)}), ANSIColor.BLACK, true));
            } else if (i == 435) {
                m68687e(byteBuffer);
            } else if (i == 437) {
                m68684b(byteBuffer);
            } else if (i == 440) {
                m68685c(byteBuffer);
            } else {
                System.out.print("--");
            }
            System.out.println(" )");
        }

        /* renamed from: a */
        private void m68680a(SequenceDisplayExtension sequenceDisplayExtension) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("sequence display extension ");
            sb.append(m68670a((Object) sequenceDisplayExtension));
            printStream.print(MainUtils.color(sb.toString(), ANSIColor.GREEN, true));
        }

        /* renamed from: a */
        private void m68682a(SequenceScalableExtension sequenceScalableExtension) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("sequence scalable extension ");
            sb.append(m68670a((Object) sequenceScalableExtension));
            printStream.print(MainUtils.color(sb.toString(), ANSIColor.GREEN, true));
        }

        /* renamed from: a */
        private void m68681a(SequenceExtension sequenceExtension) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("sequence extension ");
            sb.append(m68670a((Object) sequenceExtension));
            printStream.print(MainUtils.color(sb.toString(), ANSIColor.GREEN, true));
        }

        /* renamed from: a */
        private void m68678a(PictureTemporalScalableExtension pictureTemporalScalableExtension) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("picture temporal scalable extension ");
            sb.append(m68670a((Object) pictureTemporalScalableExtension));
            printStream.print(MainUtils.color(sb.toString(), ANSIColor.GREEN, true));
        }

        /* renamed from: a */
        private void m68677a(PictureSpatialScalableExtension pictureSpatialScalableExtension) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("picture spatial scalable extension ");
            sb.append(m68670a((Object) pictureSpatialScalableExtension));
            printStream.print(MainUtils.color(sb.toString(), ANSIColor.GREEN, true));
        }

        /* renamed from: a */
        private void m68675a(PictureCodingExtension pictureCodingExtension) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("picture coding extension ");
            sb.append(m68670a((Object) pictureCodingExtension));
            printStream.print(MainUtils.color(sb.toString(), ANSIColor.GREEN, true));
        }

        /* renamed from: a */
        private void m68676a(PictureDisplayExtension pictureDisplayExtension) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("picture display extension ");
            sb.append(m68670a((Object) pictureDisplayExtension));
            printStream.print(MainUtils.color(sb.toString(), ANSIColor.GREEN, true));
        }

        /* renamed from: a */
        private void m68674a(CopyrightExtension copyrightExtension) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("copyright extension ");
            sb.append(m68670a((Object) copyrightExtension));
            printStream.print(MainUtils.color(sb.toString(), ANSIColor.GREEN, true));
        }

        /* renamed from: a */
        private void m68679a(QuantMatrixExtension quantMatrixExtension) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("quant matrix extension ");
            sb.append(m68670a((Object) quantMatrixExtension));
            printStream.print(MainUtils.color(sb.toString(), ANSIColor.GREEN, true));
        }

        /* renamed from: a */
        private String m68670a(Object obj) {
            StringBuilder sb = new StringBuilder();
            sb.append("<");
            Field[] fields = obj.getClass().getFields();
            for (int i = 0; i < fields.length; i++) {
                if (Modifier.isPublic(fields[i].getModifiers()) && !Modifier.isStatic(fields[i].getModifiers())) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m68671a(fields[i].getName()));
                    sb2.append(": ");
                    sb.append(sb2.toString());
                    if (fields[i].getType().isPrimitive()) {
                        try {
                            sb.append(fields[i].get(obj));
                        } catch (IllegalAccessException | IllegalArgumentException unused) {
                        }
                    } else {
                        Object obj2 = fields[i].get(obj);
                        if (obj2 != null) {
                            sb.append(m68670a(obj2));
                        } else {
                            sb.append("N/A");
                        }
                    }
                    if (i < fields.length - 1) {
                        sb.append(",");
                    }
                }
            }
            sb.append(">");
            return sb.toString();
        }

        /* renamed from: a */
        private String m68671a(String str) {
            return str.replaceAll("([A-Z])", " $1").replaceFirst("^ ", "").toLowerCase();
        }
    }

    public MPSDump(ReadableByteChannel readableByteChannel) {
        this.f44848ch = readableByteChannel;
    }

    private static ByteBuffer getPesPayload(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        ByteBuffer duplicate2 = byteBuffer.duplicate();
        while (duplicate.hasRemaining()) {
            if (duplicate.duplicate().getInt() >= 441) {
                duplicate2.limit(duplicate.position());
                byteBuffer.position(duplicate.position());
                return duplicate2;
            }
            duplicate.getInt();
            MPEGUtil.gotoNextMarker(duplicate);
        }
        return null;
    }

    public static void main(String[] strArr) throws IOException {
        FileChannelWrapper fileChannelWrapper = null;
        try {
            Cmd parseArguments = MainUtils.parseArguments(strArr);
            if (parseArguments.args.length < 1) {
                MainUtils.printHelp(new C15549a(), "file name");
                return;
            }
            fileChannelWrapper = NIOUtils.readableFileChannel(new File(parseArguments.args[0]));
            new MPSDump(fileChannelWrapper).dump(parseArguments.getLongFlag(DUMP_FROM), parseArguments.getLongFlag(STOP_AT));
            NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
        } finally {
            NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
        }
    }

    private static void skipToNextPES(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining()) {
            int i = byteBuffer.duplicate().getInt();
            if (i < 445 || i > 511 || i == 446) {
                byteBuffer.getInt();
                MPEGUtil.gotoNextMarker(byteBuffer);
            } else {
                return;
            }
        }
    }

    private ByteBuffer transferRemainder(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.clear();
        while (byteBuffer.hasRemaining()) {
            duplicate.put(byteBuffer.get());
        }
        return duplicate;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x006d A[EDGE_INSN: B:41:0x006d->B:28:0x006d ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dump(java.lang.Long r13, java.lang.Long r14) throws java.io.IOException {
        /*
            r12 = this;
            r0 = 1048576(0x100000, float:1.469368E-39)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = r1
            r6 = r5
        L_0x000c:
            int r7 = r0.position()
            long r7 = (long) r7
            long r3 = r3 - r7
            r12.fillBuffer(r0)
            r0.flip()
            int r7 = r0.remaining()
            r8 = 4
            if (r7 >= r8) goto L_0x0020
            return
        L_0x0020:
            int r7 = r0.remaining()
            long r7 = (long) r7
            long r3 = r3 + r7
        L_0x0026:
            if (r6 == 0) goto L_0x003c
            int r7 = r6.length
            if (r7 <= 0) goto L_0x003c
            int r7 = r7 - r2
            int r7 = r7 + 6
            int r8 = r0.remaining()
            if (r7 > r8) goto L_0x003a
            java.nio.ByteBuffer r7 = org.jcodec.common.NIOUtils.read(r0, r7)
            goto L_0x0040
        L_0x003a:
            r7 = r1
            goto L_0x0040
        L_0x003c:
            java.nio.ByteBuffer r7 = getPesPayload(r0)
        L_0x0040:
            if (r7 != 0) goto L_0x0043
            goto L_0x006d
        L_0x0043:
            if (r6 == 0) goto L_0x0048
            r12.logPes(r6, r2, r7)
        L_0x0048:
            if (r5 == 0) goto L_0x0059
            if (r6 == 0) goto L_0x0059
            int r6 = r6.streamId
            r8 = 224(0xe0, float:3.14E-43)
            if (r6 < r8) goto L_0x0059
            r8 = 239(0xef, float:3.35E-43)
            if (r6 > r8) goto L_0x0059
            r5.m68673a(r7)
        L_0x0059:
            int r6 = r0.remaining()
            r7 = 32
            if (r6 >= r7) goto L_0x0063
        L_0x0061:
            r6 = r1
            goto L_0x006d
        L_0x0063:
            skipToNextPES(r0)
            int r6 = r0.remaining()
            if (r6 >= r7) goto L_0x0072
            goto L_0x0061
        L_0x006d:
            java.nio.ByteBuffer r0 = r12.transferRemainder(r0)
            goto L_0x000c
        L_0x0072:
            int r2 = r0.position()
            int r6 = r0.remaining()
            long r6 = (long) r6
            long r6 = r3 - r6
            org.jcodec.containers.mps.MPSDemuxer$PESPacket r6 = org.jcodec.containers.mps.MPSUtils.readPESHeader(r0, r6)
            int r7 = r0.position()
            int r2 = r7 - r2
            if (r13 == 0) goto L_0x0098
            long r7 = r6.pts
            long r9 = r13.longValue()
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x0098
            org.jcodec.containers.mps.MPSDump$b r5 = new org.jcodec.containers.mps.MPSDump$b
            r5.<init>(r1)
        L_0x0098:
            if (r14 == 0) goto L_0x0026
            long r7 = r6.pts
            long r9 = r14.longValue()
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x0026
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jcodec.containers.mps.MPSDump.dump(java.lang.Long, java.lang.Long):void");
    }

    /* access modifiers changed from: protected */
    public int fillBuffer(ByteBuffer byteBuffer) throws IOException {
        return this.f44848ch.read(byteBuffer);
    }

    /* access modifiers changed from: protected */
    public void logPes(PESPacket pESPacket, int i, ByteBuffer byteBuffer) {
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder();
        sb.append(pESPacket.streamId);
        sb.append("(");
        sb.append(pESPacket.streamId >= 224 ? "video" : "audio");
        sb.append(")");
        sb.append(" [");
        sb.append(pESPacket.pos);
        sb.append(", ");
        sb.append(byteBuffer.remaining() + i);
        sb.append("], pts: ");
        sb.append(pESPacket.pts);
        sb.append(", dts: ");
        sb.append(pESPacket.dts);
        printStream.println(sb.toString());
    }
}
