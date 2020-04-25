package org.jcodec.common.tools;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.util.HashMap;
import org.jcodec.codecs.wav.WavHeader;
import org.jcodec.common.Assert;
import org.jcodec.common.AudioFormat;
import org.jcodec.common.AudioUtil;
import org.jcodec.common.FileChannelWrapper;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.common.tools.MainUtils.Cmd;

public class WavSplit {

    /* renamed from: org.jcodec.common.tools.WavSplit$a */
    static class C15545a extends HashMap<String, String> {
        C15545a() {
            put("pattern", "Output file name pattern, i.e. out%02d.wav");
        }
    }

    private static void copy(AudioFormat audioFormat, ReadableByteChannel readableByteChannel, SeekableByteChannel[] seekableByteChannelArr) throws IOException {
        ByteBuffer[] byteBufferArr = new ByteBuffer[seekableByteChannelArr.length];
        for (int i = 0; i < seekableByteChannelArr.length; i++) {
            byteBufferArr[i] = ByteBuffer.allocate(audioFormat.framesToBytes(4096));
        }
        ByteBuffer allocate = ByteBuffer.allocate(audioFormat.framesToBytes(4096) * seekableByteChannelArr.length);
        while (readableByteChannel.read(allocate) != -1) {
            allocate.flip();
            AudioUtil.deinterleave(audioFormat, allocate, byteBufferArr);
            allocate.clear();
            for (int i2 = 0; i2 < seekableByteChannelArr.length; i2++) {
                byteBufferArr[i2].flip();
                seekableByteChannelArr[i2].write(byteBufferArr[i2]);
                byteBufferArr[i2].clear();
            }
        }
    }

    public static void main(String[] strArr) throws Exception {
        Cmd parseArguments = MainUtils.parseArguments(strArr);
        if (parseArguments.argsLength() < 1) {
            MainUtils.printHelp(new C15545a(), "filename.wav");
            System.exit(-1);
        }
        File file = new File(strArr[0]);
        String stringFlag = parseArguments.getStringFlag("pattern", "c%02d.wav");
        WavHeader read = WavHeader.read(file);
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder();
        sb.append("WAV: ");
        sb.append(read.getFormat());
        printStream.println(sb.toString());
        Assert.assertEquals(2, (int) read.fmt.numChannels);
        int i = read.dataOffset;
        FileChannelWrapper readableFileChannel = NIOUtils.readableFileChannel(file);
        readableFileChannel.position((long) i);
        int channels = read.getFormat().getChannels();
        SeekableByteChannel[] seekableByteChannelArr = new SeekableByteChannel[channels];
        for (int i2 = 0; i2 < channels; i2++) {
            seekableByteChannelArr[i2] = NIOUtils.writableFileChannel(new File(file.getParentFile(), String.format(stringFlag, new Object[]{Integer.valueOf(i2)})));
            WavHeader.copyWithChannels(read, 1).write(seekableByteChannelArr[i2]);
        }
        copy(read.getFormat(), readableFileChannel, seekableByteChannelArr);
        for (int i3 = 0; i3 < channels; i3++) {
            seekableByteChannelArr[i3].close();
        }
    }
}
