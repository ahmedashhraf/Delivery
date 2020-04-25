package org.jcodec.containers.mxf.model;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import org.jcodec.common.logging.Logger;
import org.jcodec.common.model.Rational;

public class GenericPictureEssenceDescriptor extends FileDescriptor {
    private byte activeFormatDescriptor;
    private byte alphaTransparency;
    private Rational aspectRatio;
    private C15568UL codingEquations;
    private C15568UL colorPrimaries;
    private int displayF2Offset;
    private int displayHeight;
    private int displayWidth;
    private int displayXOffset;
    private int displayYOffset;
    private byte fieldDominance;
    private LayoutType frameLayout;
    private int imageAlignmentOffset;
    private int imageEndOffset;
    private int imageStartOffset;
    private C15568UL pictureEssenceCoding;
    private int sampledHeight;
    private int sampledWidth;
    private int sampledXOffset;
    private int sampledYOffset;
    private byte signalStandard;
    private int storedF2Offset;
    private int storedHeight;
    private int storedWidth;
    private C15568UL transferCharacteristic;
    private int[] videoLineMap;

    public enum LayoutType {
        FullFrame,
        SeparateFields,
        OneField,
        MixedFields,
        SegmentedFrame
    }

    public GenericPictureEssenceDescriptor(C15568UL ul) {
        super(ul);
    }

    public byte getActiveFormatDescriptor() {
        return this.activeFormatDescriptor;
    }

    public byte getAlphaTransparency() {
        return this.alphaTransparency;
    }

    public Rational getAspectRatio() {
        return this.aspectRatio;
    }

    public C15568UL getCodingEquations() {
        return this.codingEquations;
    }

    public C15568UL getColorPrimaries() {
        return this.colorPrimaries;
    }

    public int getDisplayF2Offset() {
        return this.displayF2Offset;
    }

    public int getDisplayHeight() {
        return this.displayHeight;
    }

    public int getDisplayWidth() {
        return this.displayWidth;
    }

    public int getDisplayXOffset() {
        return this.displayXOffset;
    }

    public int getDisplayYOffset() {
        return this.displayYOffset;
    }

    public byte getFieldDominance() {
        return this.fieldDominance;
    }

    public LayoutType getFrameLayout() {
        return this.frameLayout;
    }

    public int getImageAlignmentOffset() {
        return this.imageAlignmentOffset;
    }

    public int getImageEndOffset() {
        return this.imageEndOffset;
    }

    public int getImageStartOffset() {
        return this.imageStartOffset;
    }

    public C15568UL getPictureEssenceCoding() {
        return this.pictureEssenceCoding;
    }

    public int getSampledHeight() {
        return this.sampledHeight;
    }

    public int getSampledWidth() {
        return this.sampledWidth;
    }

    public int getSampledXOffset() {
        return this.sampledXOffset;
    }

    public int getSampledYOffset() {
        return this.sampledYOffset;
    }

    public byte getSignalStandard() {
        return this.signalStandard;
    }

    public int getStoredF2Offset() {
        return this.storedF2Offset;
    }

    public int getStoredHeight() {
        return this.storedHeight;
    }

    public int getStoredWidth() {
        return this.storedWidth;
    }

    public C15568UL getTransferCharacteristic() {
        return this.transferCharacteristic;
    }

    public int[] getVideoLineMap() {
        return this.videoLineMap;
    }

    /* access modifiers changed from: protected */
    public void read(Map<Integer, ByteBuffer> map) {
        super.read(map);
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            ByteBuffer byteBuffer = (ByteBuffer) entry.getValue();
            switch (((Integer) entry.getKey()).intValue()) {
                case 12801:
                    this.pictureEssenceCoding = C15568UL.read(byteBuffer);
                    break;
                case 12802:
                    this.storedHeight = byteBuffer.getInt();
                    break;
                case 12803:
                    this.storedWidth = byteBuffer.getInt();
                    break;
                case 12804:
                    this.sampledHeight = byteBuffer.getInt();
                    break;
                case 12805:
                    this.sampledWidth = byteBuffer.getInt();
                    break;
                case 12806:
                    this.sampledXOffset = byteBuffer.getInt();
                    break;
                case 12807:
                    this.sampledYOffset = byteBuffer.getInt();
                    break;
                case 12808:
                    this.displayHeight = byteBuffer.getInt();
                    break;
                case 12809:
                    this.displayWidth = byteBuffer.getInt();
                    break;
                case 12810:
                    this.displayXOffset = byteBuffer.getInt();
                    break;
                case 12811:
                    this.displayYOffset = byteBuffer.getInt();
                    break;
                case 12812:
                    this.frameLayout = LayoutType.values()[byteBuffer.get()];
                    break;
                case 12813:
                    this.videoLineMap = MXFMetadata.readInt32Batch(byteBuffer);
                    break;
                case 12814:
                    this.aspectRatio = new Rational(byteBuffer.getInt(), byteBuffer.getInt());
                    break;
                case 12815:
                    this.alphaTransparency = byteBuffer.get();
                    break;
                case 12816:
                    this.transferCharacteristic = C15568UL.read(byteBuffer);
                    break;
                case 12817:
                    this.imageAlignmentOffset = byteBuffer.getInt();
                    break;
                case 12818:
                    this.fieldDominance = byteBuffer.get();
                    break;
                case 12819:
                    this.imageStartOffset = byteBuffer.getInt();
                    break;
                case 12820:
                    this.imageEndOffset = byteBuffer.getInt();
                    break;
                case 12821:
                    this.signalStandard = byteBuffer.get();
                    break;
                case 12822:
                    this.storedF2Offset = byteBuffer.getInt();
                    break;
                case 12823:
                    this.displayF2Offset = byteBuffer.getInt();
                    break;
                case 12824:
                    this.activeFormatDescriptor = byteBuffer.get();
                    break;
                case 12825:
                    this.colorPrimaries = C15568UL.read(byteBuffer);
                    break;
                case 12826:
                    this.codingEquations = C15568UL.read(byteBuffer);
                    break;
                default:
                    StringBuilder sb = new StringBuilder();
                    sb.append("Unknown tag [ ");
                    sb.append(this.f44898ul);
                    sb.append("]: %04x");
                    Logger.warn(String.format(sb.toString(), new Object[]{entry.getKey()}));
                    continue;
            }
            it.remove();
        }
    }
}
