package org.jcodec.containers.mp4.boxes;

import java.util.HashMap;
import java.util.Map;

public class BoxFactory {
    private static BoxFactory instance = new BoxFactory();
    private Map<String, Class<? extends Box>> mappings = new HashMap();

    public BoxFactory() {
        Class<LeafBox> cls = LeafBox.class;
        Class<NodeBox> cls2 = NodeBox.class;
        this.mappings.put(MovieExtendsBox.fourcc(), MovieExtendsBox.class);
        this.mappings.put(MovieExtendsHeaderBox.fourcc(), MovieExtendsHeaderBox.class);
        this.mappings.put(SegmentIndexBox.fourcc(), SegmentIndexBox.class);
        this.mappings.put(SegmentTypeBox.fourcc(), SegmentTypeBox.class);
        this.mappings.put(TrackExtendsBox.fourcc(), TrackExtendsBox.class);
        this.mappings.put(VideoMediaHeaderBox.fourcc(), VideoMediaHeaderBox.class);
        this.mappings.put(FileTypeBox.fourcc(), FileTypeBox.class);
        this.mappings.put(MovieBox.fourcc(), MovieBox.class);
        this.mappings.put(MovieHeaderBox.fourcc(), MovieHeaderBox.class);
        this.mappings.put(TrakBox.fourcc(), TrakBox.class);
        this.mappings.put(TrackHeaderBox.fourcc(), TrackHeaderBox.class);
        this.mappings.put("edts", cls2);
        this.mappings.put(EditListBox.fourcc(), EditListBox.class);
        this.mappings.put(MediaBox.fourcc(), MediaBox.class);
        this.mappings.put(MediaHeaderBox.fourcc(), MediaHeaderBox.class);
        this.mappings.put(MediaInfoBox.fourcc(), MediaInfoBox.class);
        this.mappings.put(HandlerBox.fourcc(), HandlerBox.class);
        this.mappings.put(DataInfoBox.fourcc(), DataInfoBox.class);
        this.mappings.put("stbl", cls2);
        this.mappings.put(SampleDescriptionBox.fourcc(), SampleDescriptionBox.class);
        this.mappings.put(TimeToSampleBox.fourcc(), TimeToSampleBox.class);
        this.mappings.put(SyncSamplesBox.fourcc(), SyncSamplesBox.class);
        this.mappings.put(PartialSyncSamplesBox.fourcc(), PartialSyncSamplesBox.class);
        this.mappings.put(SampleToChunkBox.fourcc(), SampleToChunkBox.class);
        this.mappings.put(SampleSizesBox.fourcc(), SampleSizesBox.class);
        this.mappings.put(ChunkOffsetsBox.fourcc(), ChunkOffsetsBox.class);
        this.mappings.put("mvex", cls2);
        this.mappings.put("moof", cls2);
        this.mappings.put("traf", cls2);
        this.mappings.put("mfra", cls2);
        this.mappings.put("skip", cls2);
        this.mappings.put("meta", cls);
        this.mappings.put(DataRefBox.fourcc(), DataRefBox.class);
        this.mappings.put("ipro", cls2);
        this.mappings.put("sinf", cls2);
        this.mappings.put(ChunkOffsets64Box.fourcc(), ChunkOffsets64Box.class);
        this.mappings.put(SoundMediaHeaderBox.fourcc(), SoundMediaHeaderBox.class);
        this.mappings.put("clip", cls2);
        this.mappings.put(ClipRegionBox.fourcc(), ClipRegionBox.class);
        this.mappings.put(LoadSettingsBox.fourcc(), LoadSettingsBox.class);
        this.mappings.put("tapt", cls2);
        this.mappings.put("gmhd", cls2);
        this.mappings.put("tmcd", cls);
        this.mappings.put("tref", cls2);
        this.mappings.put(ClearApertureBox.fourcc(), ClearApertureBox.class);
        this.mappings.put(ProductionApertureBox.fourcc(), ProductionApertureBox.class);
        this.mappings.put(EncodedPixelBox.fourcc(), EncodedPixelBox.class);
        this.mappings.put(GenericMediaInfoBox.fourcc(), GenericMediaInfoBox.class);
        this.mappings.put(TimecodeMediaInfoBox.fourcc(), TimecodeMediaInfoBox.class);
        this.mappings.put("udta", cls2);
        this.mappings.put(CompositionOffsetsBox.fourcc(), CompositionOffsetsBox.class);
        this.mappings.put(NameBox.fourcc(), NameBox.class);
        this.mappings.put(MovieFragmentHeaderBox.fourcc(), MovieFragmentHeaderBox.class);
        this.mappings.put(TrackFragmentHeaderBox.fourcc(), TrackFragmentHeaderBox.class);
        this.mappings.put(MovieFragmentBox.fourcc(), MovieFragmentBox.class);
        this.mappings.put(TrackFragmentBox.fourcc(), TrackFragmentBox.class);
        this.mappings.put(TrackFragmentBaseMediaDecodeTimeBox.fourcc(), TrackFragmentBaseMediaDecodeTimeBox.class);
        this.mappings.put(TrunBox.fourcc(), TrunBox.class);
    }

    public static BoxFactory getDefault() {
        return instance;
    }

    public void clear() {
        this.mappings.clear();
    }

    public void override(String str, Class<? extends Box> cls) {
        this.mappings.put(str, cls);
    }

    public Class<? extends Box> toClass(String str) {
        return (Class) this.mappings.get(str);
    }
}
