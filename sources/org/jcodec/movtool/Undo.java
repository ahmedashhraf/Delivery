package org.jcodec.movtool;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.RandomAccessFile;
import java.nio.channels.ReadableByteChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jcodec.common.FileChannelWrapper;
import org.jcodec.common.NIOUtils;
import org.jcodec.common.SeekableByteChannel;
import org.jcodec.containers.mp4.MP4Util;
import org.jcodec.containers.mp4.MP4Util.Atom;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.BoxFactory;
import org.jcodec.containers.mp4.boxes.Header;
import org.jcodec.containers.mp4.boxes.MovieBox;
import org.jcodec.containers.mp4.boxes.NodeBox;

public class Undo {
    private boolean isMoov(SeekableByteChannel seekableByteChannel, Atom atom) throws IOException {
        seekableByteChannel.position(atom.getOffset() + atom.getHeader().headerSize());
        try {
            Box parseBox = NodeBox.parseBox(NIOUtils.fetchFrom((ReadableByteChannel) seekableByteChannel, (int) atom.getHeader().getSize()), new Header("moov", atom.getHeader().getSize()), BoxFactory.getDefault());
            if (!(parseBox instanceof MovieBox)) {
                return false;
            }
            if (Box.findFirst((NodeBox) parseBox, "mvhd") != null) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    private List<Atom> list(String str) throws IOException {
        ArrayList arrayList = new ArrayList();
        FileChannelWrapper fileChannelWrapper = null;
        try {
            fileChannelWrapper = NIOUtils.readableFileChannel(new File(str));
            Iterator it = MP4Util.getRootAtoms(fileChannelWrapper).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Atom atom = (Atom) it.next();
                if ("free".equals(atom.getHeader().getFourcc()) && isMoov(fileChannelWrapper, atom)) {
                    arrayList.add(atom);
                }
                if ("moov".equals(atom.getHeader().getFourcc())) {
                    arrayList.add(atom);
                    break;
                }
            }
            return arrayList;
        } finally {
            fileChannelWrapper.close();
        }
    }

    public static void main(String[] strArr) throws IOException {
        if (strArr.length < 1) {
            System.err.println("Syntax: qt-undo [-l] <movie>");
            System.err.println("\t-l\t\tList all the previous versions of this movie.");
            System.exit(-1);
        }
        Undo undo = new Undo();
        if ("-l".equals(strArr[0])) {
            List list = undo.list(strArr[1]);
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append(list.size() - 1);
            sb.append(" versions.");
            printStream.println(sb.toString());
            return;
        }
        undo.undo(strArr[0]);
    }

    private void undo(String str) throws IOException {
        RandomAccessFile randomAccessFile;
        List list = list(str);
        if (list.size() < 2) {
            System.err.println("Nowhere to rollback.");
            return;
        }
        try {
            randomAccessFile = new RandomAccessFile(new File(str), "rw");
            try {
                randomAccessFile.seek(((Atom) list.get(list.size() - 2)).getOffset() + 4);
                randomAccessFile.write(new byte[]{109, 111, 111, 118});
                randomAccessFile.seek(((Atom) list.get(list.size() - 1)).getOffset() + 4);
                randomAccessFile.write(new byte[]{102, 114, 101, 101});
                randomAccessFile.close();
            } catch (Throwable th) {
                th = th;
                randomAccessFile.close();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile = null;
            randomAccessFile.close();
            throw th;
        }
    }
}
