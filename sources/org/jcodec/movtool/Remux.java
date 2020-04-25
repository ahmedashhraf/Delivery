package org.jcodec.movtool;

import java.io.File;
import java.io.IOException;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.List;
import org.jcodec.common.FileChannelWrapper;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.model.Rational;
import org.jcodec.containers.mp4.Brand;
import org.jcodec.containers.mp4.MP4Packet;
import org.jcodec.containers.mp4.TrackType;
import org.jcodec.containers.mp4.WebOptimizedMP4Muxer;
import org.jcodec.containers.mp4.boxes.AudioSampleEntry;
import org.jcodec.containers.mp4.boxes.Edit;
import org.jcodec.containers.mp4.boxes.MovieBox;
import org.jcodec.containers.mp4.demuxer.AbstractMP4DemuxerTrack;
import org.jcodec.containers.mp4.demuxer.MP4Demuxer;
import org.jcodec.containers.mp4.demuxer.TimecodeMP4DemuxerTrack;
import org.jcodec.containers.mp4.muxer.AbstractMP4MuxerTrack;
import org.jcodec.containers.mp4.muxer.FramesMP4MuxerTrack;
import org.jcodec.containers.mp4.muxer.PCMMP4MuxerTrack;

public class Remux {

    public interface Handler {
        void handle(MovieBox movieBox) throws IOException;
    }

    private void copyEdits(AbstractMP4DemuxerTrack abstractMP4DemuxerTrack, AbstractMP4MuxerTrack abstractMP4MuxerTrack, Rational rational) {
        List<Edit> edits = abstractMP4DemuxerTrack.getEdits();
        ArrayList arrayList = new ArrayList();
        if (edits != null) {
            for (Edit edit : edits) {
                Edit edit2 = new Edit(rational.multiply(edit.getDuration()), edit.getMediaTime(), edit.getRate());
                arrayList.add(edit2);
            }
            abstractMP4MuxerTrack.setEdits(arrayList);
        }
    }

    public static File hidFile(File file) {
        File parentFile = file.getParentFile();
        StringBuilder sb = new StringBuilder();
        String str = ".";
        sb.append(str);
        sb.append(file.getName());
        File file2 = new File(parentFile, sb.toString());
        if (!file2.exists()) {
            return file2;
        }
        int i = 1;
        while (true) {
            File parentFile2 = file.getParentFile();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(file.getName());
            sb2.append(str);
            int i2 = i + 1;
            sb2.append(i);
            File file3 = new File(parentFile2, sb2.toString());
            if (!file3.exists()) {
                return file3;
            }
            i = i2;
        }
    }

    public static void main1(String[] strArr) throws Exception {
        if (strArr.length < 1) {
            System.out.println("remux <movie>");
            return;
        }
        File file = new File(strArr[0]);
        File hidFile = hidFile(file);
        file.renameTo(hidFile);
        try {
            new Remux().remux(file, hidFile, null, null);
        } catch (Throwable unused) {
            File parentFile = file.getParentFile();
            StringBuilder sb = new StringBuilder();
            sb.append(file.getName());
            sb.append(".error");
            file.renameTo(new File(parentFile, sb.toString()));
            hidFile.renameTo(file);
        }
    }

    /* access modifiers changed from: protected */
    public MP4Packet processFrame(MP4Packet mP4Packet) {
        return mP4Packet;
    }

    public void remux(File file, File file2, File file3, Handler handler) throws IOException {
        FileChannelWrapper fileChannelWrapper;
        FileChannelWrapper fileChannelWrapper2;
        TimecodeMP4DemuxerTrack timecodeMP4DemuxerTrack;
        FileChannelWrapper fileChannelWrapper3 = null;
        try {
            fileChannelWrapper2 = NIOUtils.readableFileChannel(file2);
            try {
                fileChannelWrapper = NIOUtils.writableFileChannel(file);
            } catch (Throwable th) {
                th = th;
                fileChannelWrapper = null;
                NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper2);
                NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
                NIOUtils.closeQuietly((ReadableByteChannel) null);
                throw th;
            }
            try {
                MP4Demuxer mP4Demuxer = new MP4Demuxer(fileChannelWrapper2);
                if (file3 != null) {
                    fileChannelWrapper3 = NIOUtils.readableFileChannel(file2);
                    timecodeMP4DemuxerTrack = new MP4Demuxer(fileChannelWrapper3).getTimecodeTrack();
                } else {
                    timecodeMP4DemuxerTrack = null;
                }
                WebOptimizedMP4Muxer withOldHeader = WebOptimizedMP4Muxer.withOldHeader(fileChannelWrapper, Brand.MOV, mP4Demuxer.getMovie());
                List<AbstractMP4DemuxerTrack> audioTracks = mP4Demuxer.getAudioTracks();
                ArrayList arrayList = new ArrayList();
                for (AbstractMP4DemuxerTrack abstractMP4DemuxerTrack : audioTracks) {
                    PCMMP4MuxerTrack addPCMAudioTrack = withOldHeader.addPCMAudioTrack(((AudioSampleEntry) abstractMP4DemuxerTrack.getSampleEntries()[0]).getFormat());
                    arrayList.add(addPCMAudioTrack);
                    addPCMAudioTrack.setEdits(abstractMP4DemuxerTrack.getEdits());
                    addPCMAudioTrack.setName(abstractMP4DemuxerTrack.getName());
                }
                AbstractMP4DemuxerTrack videoTrack = mP4Demuxer.getVideoTrack();
                FramesMP4MuxerTrack addTrack = withOldHeader.addTrack(TrackType.VIDEO, (int) videoTrack.getTimescale());
                addTrack.setTimecode(withOldHeader.addTimecodeTrack((int) videoTrack.getTimescale()));
                copyEdits(videoTrack, addTrack, new Rational((int) videoTrack.getTimescale(), mP4Demuxer.getMovie().getTimescale()));
                addTrack.addSampleEntries(videoTrack.getSampleEntries());
                while (true) {
                    MP4Packet mP4Packet = (MP4Packet) videoTrack.nextFrame();
                    if (mP4Packet == null) {
                        break;
                    }
                    if (timecodeMP4DemuxerTrack != null) {
                        mP4Packet = timecodeMP4DemuxerTrack.getTimecode(mP4Packet);
                    }
                    MP4Packet processFrame = processFrame(mP4Packet);
                    addTrack.addFrame(processFrame);
                    for (int i = 0; i < audioTracks.size(); i++) {
                        ((AudioSampleEntry) ((AbstractMP4DemuxerTrack) audioTracks.get(i)).getSampleEntries()[0]).getSampleRate();
                        processFrame.getDuration();
                        videoTrack.getTimescale();
                        ((PCMMP4MuxerTrack) arrayList.get(i)).addSamples(((MP4Packet) ((AbstractMP4DemuxerTrack) audioTracks.get(i)).nextFrame()).getData());
                    }
                }
                MovieBox finalizeHeader = withOldHeader.finalizeHeader();
                if (handler != null) {
                    handler.handle(finalizeHeader);
                }
                withOldHeader.storeHeader(finalizeHeader);
                NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper2);
                NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
                NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper3);
            } catch (Throwable th2) {
                th = th2;
                NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper2);
                NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
                NIOUtils.closeQuietly((ReadableByteChannel) null);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileChannelWrapper = null;
            fileChannelWrapper2 = null;
            NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper2);
            NIOUtils.closeQuietly((ReadableByteChannel) fileChannelWrapper);
            NIOUtils.closeQuietly((ReadableByteChannel) null);
            throw th;
        }
    }
}
