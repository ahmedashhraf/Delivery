package org.jcodec.containers.mxf.streaming;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.Arrays;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.common.model.Rational;
import org.jcodec.common.model.Size;
import org.jcodec.containers.mp4.MP4Util;
import org.jcodec.containers.mp4.boxes.EndianBox.Endian;
import org.jcodec.containers.mp4.boxes.channel.Label;
import org.jcodec.containers.mxf.MXFConst.MXFCodecMapping;
import org.jcodec.containers.mxf.MXFDemuxer;
import org.jcodec.containers.mxf.MXFDemuxer.MXFDemuxerTrack;
import org.jcodec.containers.mxf.MXFDemuxer.MXFPacket;
import org.jcodec.containers.mxf.model.C15568UL;
import org.jcodec.containers.mxf.model.GenericDescriptor;
import org.jcodec.containers.mxf.model.GenericPictureEssenceDescriptor;
import org.jcodec.containers.mxf.model.GenericSoundEssenceDescriptor;
import org.jcodec.containers.mxf.model.KLV;
import org.jcodec.containers.mxf.model.TimelineTrack;
import org.jcodec.movtool.streaming.AudioCodecMeta;
import org.jcodec.movtool.streaming.CodecMeta;
import org.jcodec.movtool.streaming.VideoCodecMeta;
import org.jcodec.movtool.streaming.VirtualPacket;
import org.jcodec.movtool.streaming.VirtualTrack;
import org.jcodec.movtool.streaming.VirtualTrack.VirtualEdit;
import org.jcodec.movtool.streaming.tracks.ByteChannelPool;

public class MXFVirtualTrack implements VirtualTrack {
    /* access modifiers changed from: private */
    public C15568UL essenceUL;
    /* access modifiers changed from: private */

    /* renamed from: fp */
    public ByteChannelPool f44901fp;
    private MXFDemuxerTrack track;

    public class MXFVirtualPacket implements VirtualPacket {
        private MXFPacket pkt;

        public MXFVirtualPacket(MXFPacket mXFPacket) {
            this.pkt = mXFPacket;
        }

        public ByteBuffer getData() throws IOException {
            SeekableByteChannel seekableByteChannel;
            Throwable th;
            ByteBuffer byteBuffer = null;
            try {
                seekableByteChannel = MXFVirtualTrack.this.f44901fp.getChannel();
                try {
                    seekableByteChannel.position(this.pkt.getOffset());
                    KLV readKL = KLV.readKL(seekableByteChannel);
                    while (readKL != null && !MXFVirtualTrack.this.essenceUL.equals(readKL.key)) {
                        seekableByteChannel.position(seekableByteChannel.position() + readKL.len);
                        readKL = KLV.readKL(seekableByteChannel);
                    }
                    if (readKL != null && MXFVirtualTrack.this.essenceUL.equals(readKL.key)) {
                        byteBuffer = NIOUtils.fetchFrom((ReadableByteChannel) seekableByteChannel, (int) readKL.len);
                    }
                    NIOUtils.closeQuietly((ReadableByteChannel) seekableByteChannel);
                    return byteBuffer;
                } catch (Throwable th2) {
                    th = th2;
                    NIOUtils.closeQuietly((ReadableByteChannel) seekableByteChannel);
                    throw th;
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                seekableByteChannel = null;
                th = th4;
                NIOUtils.closeQuietly((ReadableByteChannel) seekableByteChannel);
                throw th;
            }
        }

        public int getDataLen() throws IOException {
            return this.pkt.getLen();
        }

        public double getDuration() {
            return this.pkt.getDurationD();
        }

        public int getFrameNo() {
            return (int) this.pkt.getFrameNo();
        }

        public double getPts() {
            return this.pkt.getPtsD();
        }

        public boolean isKeyframe() {
            return this.pkt.isKeyFrame();
        }
    }

    public static class PatchedMXFDemuxer extends MXFDemuxer {

        /* renamed from: org.jcodec.containers.mxf.streaming.MXFVirtualTrack$PatchedMXFDemuxer$a */
        class C15569a extends MXFDemuxerTrack {
            C15569a(C15568UL ul, TimelineTrack timelineTrack, GenericDescriptor genericDescriptor) {
                super(ul, timelineTrack, genericDescriptor);
            }

            public MXFPacket readPacket(long j, int i, long j2, int i2, int i3, int i4, boolean z) throws IOException {
                MXFPacket mXFPacket = new MXFPacket(null, j2, (long) i2, (long) i3, (long) i4, z, null, j, i);
                return mXFPacket;
            }
        }

        public PatchedMXFDemuxer(SeekableByteChannel seekableByteChannel) throws IOException {
            super(seekableByteChannel);
        }

        /* access modifiers changed from: protected */
        public MXFDemuxerTrack createTrack(C15568UL ul, TimelineTrack timelineTrack, GenericDescriptor genericDescriptor) throws IOException {
            return new C15569a(ul, timelineTrack, genericDescriptor);
        }
    }

    public MXFVirtualTrack(MXFDemuxerTrack mXFDemuxerTrack, ByteChannelPool byteChannelPool) throws IOException {
        this.f44901fp = byteChannelPool;
        this.track = mXFDemuxerTrack;
        this.essenceUL = mXFDemuxerTrack.getEssenceUL();
    }

    public static MXFDemuxer createDemuxer(SeekableByteChannel seekableByteChannel) throws IOException {
        return new PatchedMXFDemuxer(seekableByteChannel);
    }

    private CodecMeta toSampleEntry(GenericDescriptor genericDescriptor) {
        if (this.track.isVideo()) {
            GenericPictureEssenceDescriptor genericPictureEssenceDescriptor = (GenericPictureEssenceDescriptor) genericDescriptor;
            Rational aspectRatio = genericPictureEssenceDescriptor.getAspectRatio();
            return new VideoCodecMeta(MP4Util.getFourcc(this.track.getCodec().getCodec()), null, new Size(genericPictureEssenceDescriptor.getDisplayWidth(), genericPictureEssenceDescriptor.getDisplayHeight()), new Rational(((aspectRatio.getNum() * 1000) * genericPictureEssenceDescriptor.getDisplayHeight()) / (aspectRatio.getDen() * genericPictureEssenceDescriptor.getDisplayWidth()), 1000));
        } else if (this.track.isAudio()) {
            GenericSoundEssenceDescriptor genericSoundEssenceDescriptor = (GenericSoundEssenceDescriptor) genericDescriptor;
            int quantizationBits = genericSoundEssenceDescriptor.getQuantizationBits() >> 3;
            MXFCodecMapping codec = this.track.getCodec();
            Label[] labelArr = new Label[genericSoundEssenceDescriptor.getChannelCount()];
            Arrays.fill(labelArr, Label.Mono);
            AudioCodecMeta audioCodecMeta = new AudioCodecMeta(quantizationBits == 3 ? "in24" : "sowt", quantizationBits, genericSoundEssenceDescriptor.getChannelCount(), (int) genericSoundEssenceDescriptor.getAudioSamplingRate().scalar(), codec == MXFCodecMapping.PCM_S16BE ? Endian.BIG_ENDIAN : Endian.LITTLE_ENDIAN, true, labelArr, null);
            return audioCodecMeta;
        } else {
            throw new RuntimeException("Can't get sample entry");
        }
    }

    public void close() {
        this.f44901fp.close();
    }

    public CodecMeta getCodecMeta() {
        return toSampleEntry(this.track.getDescriptor());
    }

    public VirtualEdit[] getEdits() {
        return null;
    }

    public int getPreferredTimescale() {
        return -1;
    }

    public int getTrackId() {
        return this.track.getTrackId();
    }

    public VirtualPacket nextPacket() throws IOException {
        MXFPacket mXFPacket = (MXFPacket) this.track.nextFrame();
        if (mXFPacket == null) {
            return null;
        }
        return new MXFVirtualPacket(mXFPacket);
    }
}
