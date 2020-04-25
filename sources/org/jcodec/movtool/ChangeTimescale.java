package org.jcodec.movtool;

import java.io.File;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.MediaHeaderBox;
import org.jcodec.containers.mp4.boxes.MovieBox;
import org.jcodec.containers.mp4.boxes.MovieFragmentBox;
import org.jcodec.containers.mp4.boxes.TrakBox;

public class ChangeTimescale {

    /* renamed from: org.jcodec.movtool.ChangeTimescale$a */
    static class C15570a implements MP4Edit {

        /* renamed from: a */
        final /* synthetic */ int f44903a;

        C15570a(int i) {
            this.f44903a = i;
        }

        public void apply(MovieBox movieBox) {
            TrakBox videoTrack = movieBox.getVideoTrack();
            int timescale = ((MediaHeaderBox) Box.findFirst(videoTrack, MediaHeaderBox.class, "mdia", "mdhd")).getTimescale();
            int i = this.f44903a;
            if (timescale <= i) {
                videoTrack.fixMediaTimescale(i);
                movieBox.fixTimescale(this.f44903a);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Old timescale (");
            sb.append(timescale);
            sb.append(") is greater then new timescale (");
            sb.append(this.f44903a);
            sb.append("), not touching.");
            throw new RuntimeException(sb.toString());
        }

        public void apply(MovieBox movieBox, MovieFragmentBox[] movieFragmentBoxArr) {
            throw new RuntimeException("Unsupported");
        }
    }

    public static void main(String[] strArr) throws Exception {
        if (strArr.length < 2) {
            System.out.println("Syntax: chts <movie> <timescale>");
            System.exit(-1);
        }
        int parseInt = Integer.parseInt(strArr[1]);
        if (parseInt < 600) {
            System.out.println("Could not set timescale < 600");
            System.exit(-1);
        }
        new InplaceMP4Editor().modify(new File(strArr[0]), new C15570a(parseInt));
    }
}
