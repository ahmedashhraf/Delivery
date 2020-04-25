package org.jcodec.movtool;

import java.io.File;
import org.jcodec.common.model.Rational;
import org.jcodec.common.model.Size;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.MovieBox;
import org.jcodec.containers.mp4.boxes.MovieFragmentBox;
import org.jcodec.containers.mp4.boxes.SampleDescriptionBox;
import org.jcodec.containers.mp4.boxes.TrakBox;
import org.jcodec.containers.mp4.boxes.VideoSampleEntry;

public class SetPAR {

    /* renamed from: org.jcodec.movtool.SetPAR$a */
    static class C15572a implements MP4Edit {

        /* renamed from: a */
        final /* synthetic */ Rational f44906a;

        C15572a(Rational rational) {
            this.f44906a = rational;
        }

        public void apply(MovieBox movieBox) {
            TrakBox videoTrack = movieBox.getVideoTrack();
            videoTrack.setPAR(this.f44906a);
            Box box = (Box) ((SampleDescriptionBox) Box.findFirst(videoTrack, SampleDescriptionBox.class, "mdia", "minf", "stbl", "stsd")).getBoxes().get(0);
            if (box != null && (box instanceof VideoSampleEntry)) {
                VideoSampleEntry videoSampleEntry = (VideoSampleEntry) box;
                int width = videoSampleEntry.getWidth();
                int height = videoSampleEntry.getHeight();
                int num = (this.f44906a.getNum() * width) / this.f44906a.getDen();
                videoTrack.getTrackHeader().setWidth((float) num);
                if (Box.findFirst(videoTrack, "tapt") != null) {
                    videoTrack.setAperture(new Size(width, height), new Size(num, height));
                }
            }
        }

        public void apply(MovieBox movieBox, MovieFragmentBox[] movieFragmentBoxArr) {
            throw new RuntimeException("Unsupported");
        }
    }

    public static void main(String[] strArr) throws Exception {
        if (strArr.length < 2) {
            System.out.println("Syntax: setpasp <movie> <num:den>");
            System.exit(-1);
        }
        new InplaceMP4Editor().modify(new File(strArr[0]), new C15572a(Rational.parse(strArr[1])));
    }
}
