package org.jcodec.containers.mp4.boxes.channel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import org.jcodec.containers.mp4.boxes.AudioSampleEntry;
import org.jcodec.containers.mp4.boxes.Box;
import org.jcodec.containers.mp4.boxes.ChannelBox;
import org.jcodec.containers.mp4.boxes.ChannelBox.ChannelDescription;
import org.jcodec.containers.mp4.boxes.SampleEntry;
import org.jcodec.containers.mp4.boxes.TrakBox;

public class ChannelUtils {
    private static final Label[] EMPTY = new Label[0];
    private static final List<Label> MATRIX_STEREO = Arrays.asList(new Label[]{Label.LeftTotal, Label.RightTotal});
    private static final List<Label> MONO = Arrays.asList(new Label[]{Label.Mono});
    private static final List<Label> STEREO = Arrays.asList(new Label[]{Label.Left, Label.Right});

    /* renamed from: org.jcodec.containers.mp4.boxes.channel.ChannelUtils$a */
    static /* synthetic */ class C15546a {

        /* renamed from: a */
        static final /* synthetic */ int[] f44843a = new int[ChannelLayout.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                org.jcodec.containers.mp4.boxes.channel.ChannelLayout[] r0 = org.jcodec.containers.mp4.boxes.channel.ChannelLayout.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44843a = r0
                int[] r0 = f44843a     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.jcodec.containers.mp4.boxes.channel.ChannelLayout r1 = org.jcodec.containers.mp4.boxes.channel.ChannelLayout.kCAFChannelLayoutTag_UseChannelDescriptions     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f44843a     // Catch:{ NoSuchFieldError -> 0x001f }
                org.jcodec.containers.mp4.boxes.channel.ChannelLayout r1 = org.jcodec.containers.mp4.boxes.channel.ChannelLayout.kCAFChannelLayoutTag_UseChannelBitmap     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jcodec.containers.mp4.boxes.channel.ChannelUtils.C15546a.<clinit>():void");
        }
    }

    private static Label[] extractLabels(ChannelDescription[] channelDescriptionArr) {
        Label[] labelArr = new Label[channelDescriptionArr.length];
        for (int i = 0; i < channelDescriptionArr.length; i++) {
            labelArr[i] = channelDescriptionArr[i].getLabel();
        }
        return labelArr;
    }

    public static Label[] getLabels(AudioSampleEntry audioSampleEntry) {
        ChannelBox channelBox = (ChannelBox) Box.findFirst(audioSampleEntry, ChannelBox.class, "chan");
        if (channelBox != null) {
            return getLabels(channelBox);
        }
        short channelCount = audioSampleEntry.getChannelCount();
        switch (channelCount) {
            case 1:
                return new Label[]{Label.Mono};
            case 2:
                return new Label[]{Label.Left, Label.Right};
            case 3:
                return new Label[]{Label.Left, Label.Right, Label.Center};
            case 4:
                return new Label[]{Label.Left, Label.Right, Label.LeftSurround, Label.RightSurround};
            case 5:
                return new Label[]{Label.Left, Label.Right, Label.Center, Label.LeftSurround, Label.RightSurround};
            case 6:
                return new Label[]{Label.Left, Label.Right, Label.Center, Label.LFEScreen, Label.LeftSurround, Label.RightSurround};
            default:
                Label[] labelArr = new Label[channelCount];
                Arrays.fill(labelArr, Label.Mono);
                return labelArr;
        }
    }

    public static Label[] getLabelsByBitmap(long j) {
        Label[] values;
        ArrayList arrayList = new ArrayList();
        for (Label label : Label.values()) {
            if ((label.bitmapVal & j) != 0) {
                arrayList.add(label);
            }
        }
        return (Label[]) arrayList.toArray(new Label[0]);
    }

    public static void setLabel(TrakBox trakBox, int i, Label label) {
        Label[] labels = getLabels(trakBox);
        labels[i] = label;
        setLabels(trakBox, labels);
    }

    private static void setLabels(TrakBox trakBox, Label[] labelArr) {
        String str = "mdia";
        String str2 = "minf";
        String str3 = "stbl";
        String str4 = "stsd";
        ChannelBox channelBox = (ChannelBox) Box.findFirst(trakBox, ChannelBox.class, str, str2, str3, str4, null, "chan");
        if (channelBox == null) {
            channelBox = new ChannelBox();
            ((SampleEntry) Box.findFirst(trakBox, SampleEntry.class, str, str2, str3, str4, null)).add(channelBox);
        }
        setLabels(labelArr, channelBox);
    }

    public static void setLabels(Label[] labelArr, ChannelBox channelBox) {
        channelBox.setChannelLayout(ChannelLayout.kCAFChannelLayoutTag_UseChannelDescriptions.getCode());
        ChannelDescription[] channelDescriptionArr = new ChannelDescription[labelArr.length];
        for (int i = 0; i < labelArr.length; i++) {
            channelDescriptionArr[i] = new ChannelDescription(labelArr[i].getVal(), 0, new float[]{0.0f, 0.0f, 0.0f});
        }
        channelBox.setDescriptions(channelDescriptionArr);
    }

    public static Label[] getLabels(TrakBox trakBox) {
        return getLabels((AudioSampleEntry) trakBox.getSampleEntries()[0]);
    }

    public static Label[] getLabels(ChannelBox channelBox) {
        long channelLayout = (long) channelBox.getChannelLayout();
        if ((channelLayout >> 16) == 147) {
            int i = ((int) channelLayout) & 65535;
            Label[] labelArr = new Label[i];
            for (int i2 = 0; i2 < i; i2++) {
                labelArr[i2] = Label.getByVal(65536 | i2);
            }
            return labelArr;
        }
        Iterator it = EnumSet.allOf(ChannelLayout.class).iterator();
        while (it.hasNext()) {
            ChannelLayout channelLayout2 = (ChannelLayout) it.next();
            if (((long) channelLayout2.getCode()) == channelLayout) {
                int i3 = C15546a.f44843a[channelLayout2.ordinal()];
                if (i3 == 1) {
                    return extractLabels(channelBox.getDescriptions());
                }
                if (i3 != 2) {
                    return channelLayout2.getLabels();
                }
                return getLabelsByBitmap((long) channelBox.getChannelBitmap());
            }
        }
        return EMPTY;
    }
}
