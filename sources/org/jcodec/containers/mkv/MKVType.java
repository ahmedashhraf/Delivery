package org.jcodec.containers.mkv;

import com.google.common.base.C5785c;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.jcodec.containers.mkv.boxes.EbmlBase;
import org.jcodec.containers.mkv.boxes.EbmlBin;
import org.jcodec.containers.mkv.boxes.EbmlDate;
import org.jcodec.containers.mkv.boxes.EbmlFloat;
import org.jcodec.containers.mkv.boxes.EbmlMaster;
import org.jcodec.containers.mkv.boxes.EbmlSint;
import org.jcodec.containers.mkv.boxes.EbmlUint;
import org.jcodec.containers.mkv.boxes.EbmlVoid;
import org.jcodec.containers.mkv.boxes.MkvBlock;
import org.jcodec.containers.mkv.boxes.MkvSegment;
import org.jcodec.containers.mkv.util.EbmlUtil;

public enum MKVType {
    Void(new byte[]{-20}, EbmlVoid.class),
    CRC32(new byte[]{-65}, r0),
    EBML(new byte[]{C5785c.f16671D, 69, -33, -93}, r2),
    EBMLVersion(new byte[]{66, -122}),
    EBMLReadVersion(new byte[]{66, -9}),
    EBMLMaxIDLength(new byte[]{66, -14}),
    EBMLMaxSizeLength(new byte[]{66, -13}),
    DocType(new byte[]{66, -126}, r1),
    DocTypeVersion(new byte[]{66, -121}),
    DocTypeReadVersion(new byte[]{66, -123}),
    Segment(new byte[]{C5785c.f16669B, 83, Byte.MIN_VALUE, 103}, MkvSegment.class),
    SeekHead(new byte[]{17, 77, -101, 116}, r2),
    Seek(new byte[]{77, -69}, r2),
    SeekID(new byte[]{83, -85}, r0),
    SeekPosition(new byte[]{83, -84}),
    Info(new byte[]{C5785c.f16706y, 73, -87, 102}, r2),
    SegmentUID(new byte[]{115, -92}, r0),
    SegmentFilename(new byte[]{115, -124}, r1),
    PrevUID(new byte[]{60, -71, 35}, r0),
    PrevFilename(new byte[]{60, -125, -85}, r1),
    NextUID(new byte[]{62, -71, 35}, r0),
    NextFilenam(new byte[]{62, -125, -69}, r1),
    SegmentFamily(new byte[]{68, 68}, r0),
    ChapterTranslate(new byte[]{105, 36}, r2),
    ChapterTranslateEditionUID(new byte[]{105, -4}),
    ChapterTranslateCodec(new byte[]{105, -65}),
    ChapterTranslateID(new byte[]{105, -91}, r0),
    TimecodeScale(new byte[]{42, -41, -79}),
    Duration(new byte[]{68, -119}, EbmlFloat.class),
    DateUTC(new byte[]{68, 97}, EbmlDate.class),
    Title(new byte[]{123, -87}, r1),
    MuxingApp(new byte[]{77, Byte.MIN_VALUE}, r1),
    WritingApp(new byte[]{87, 65}, r1),
    Cluster(new byte[]{C5785c.f16676I, 67, -74, 117}, r2),
    Timecode(new byte[]{-25}),
    SilentTracks(new byte[]{88, 84}, r2),
    SilentTrackNumber(new byte[]{88, -41}),
    Position(new byte[]{-89}),
    PrevSize(new byte[]{-85}),
    SimpleBlock(new byte[]{-93}, MkvBlock.class),
    BlockGroup(new byte[]{-96}, r2),
    Block(new byte[]{-95}, MkvBlock.class),
    BlockAdditions(new byte[]{117, -95}, r2),
    BlockMore(new byte[]{-90}, r2),
    BlockAddID(new byte[]{-18}),
    BlockAdditional(new byte[]{-91}, r0),
    BlockDuration(new byte[]{-101}),
    ReferencePriority(new byte[]{-6}),
    ReferenceBlock(new byte[]{-5}, EbmlSint.class),
    CodecState(new byte[]{-92}, r0),
    Slices(new byte[]{-114}, r2),
    TimeSlice(new byte[]{-24}, r2),
    LaceNumber(new byte[]{-52}),
    Tracks(new byte[]{C5785c.f16707z, 84, -82, 107}, r2),
    TrackEntry(new byte[]{-82}, r2),
    TrackNumber(new byte[]{-41}),
    TrackUID(new byte[]{115, -59}),
    TrackType(new byte[]{-125}),
    FlagEnabled(new byte[]{-71}),
    FlagDefault(new byte[]{-120}),
    FlagForced(new byte[]{85, -86}),
    FlagLacing(new byte[]{-100}),
    MinCache(new byte[]{109, -25}),
    MaxCache(new byte[]{109, -8}),
    DefaultDuration(new byte[]{35, -29, -125}),
    MaxBlockAdditionID(new byte[]{85, -18}),
    Name(new byte[]{83, 110}, r1),
    Language(new byte[]{34, -75, -100}, r1),
    CodecID(new byte[]{-122}, r1),
    CodecPrivate(new byte[]{99, -94}, r0),
    CodecName(new byte[]{37, -122, -120}, r1),
    AttachmentLink(new byte[]{116, 70}),
    CodecDecodeAll(new byte[]{-86}),
    TrackOverlay(new byte[]{111, -85}),
    TrackTranslate(new byte[]{102, 36}, r2),
    TrackTranslateEditionUID(new byte[]{102, -4}),
    TrackTranslateCodec(new byte[]{102, -65}),
    TrackTranslateTrackID(new byte[]{102, -91}, r0),
    Video(new byte[]{-32}, r2),
    FlagInterlaced(new byte[]{-102}),
    StereoMode(new byte[]{83, -72}),
    AlphaMode(new byte[]{83, -64}),
    PixelWidth(new byte[]{-80}),
    PixelHeight(new byte[]{-70}),
    PixelCropBottom(new byte[]{84, -86}),
    PixelCropTop(new byte[]{84, -69}),
    PixelCropLeft(new byte[]{84, -52}),
    PixelCropRight(new byte[]{84, -35}),
    DisplayWidth(new byte[]{84, -80}),
    DisplayHeight(new byte[]{84, -70}),
    DisplayUnit(new byte[]{84, -78}),
    AspectRatioType(new byte[]{84, -77}),
    ColourSpace(new byte[]{46, -75, 36}, r0),
    Audio(new byte[]{-31}, r2),
    SamplingFrequency(new byte[]{-75}, EbmlFloat.class),
    OutputSamplingFrequency(new byte[]{120, -75}, EbmlFloat.class),
    Channels(new byte[]{-97}),
    BitDepth(new byte[]{98, 100}),
    TrackOperation(new byte[]{-30}, r2),
    TrackCombinePlanes(new byte[]{-29}, r2),
    TrackPlane(new byte[]{-28}, r2),
    TrackPlaneUID(new byte[]{-27}),
    TrackPlaneType(new byte[]{-26}),
    TrackJoinBlocks(new byte[]{-23}, r2),
    TrackJoinUID(new byte[]{-19}),
    ContentEncodings(new byte[]{109, Byte.MIN_VALUE}, r2),
    ContentEncoding(new byte[]{98, 64}, r2),
    ContentEncodingOrder(new byte[]{80, 49}),
    ContentEncodingScope(new byte[]{80, 50}),
    ContentEncodingType(new byte[]{80, 51}),
    ContentCompression(new byte[]{80, 52}, r2),
    ContentCompAlgo(new byte[]{66, 84}),
    ContentCompSettings(new byte[]{66, 85}, r0),
    ContentEncryption(new byte[]{80, 53}, r2),
    ContentEncAlgo(new byte[]{71, -31}),
    ContentEncKeyID(new byte[]{71, -30}, r0),
    ContentSignature(new byte[]{71, -29}, r0),
    ContentSigKeyID(new byte[]{71, -28}, r0),
    ContentSigAlgo(new byte[]{71, -27}),
    ContentSigHashAlgo(new byte[]{71, -26}),
    Cues(new byte[]{C5785c.f16673F, 83, -69, 107}, r2),
    CuePoint(new byte[]{-69}, r2),
    CueTime(new byte[]{-77}, EbmlUint.class),
    CueTrackPositions(new byte[]{-73}, r2),
    CueTrack(new byte[]{-9}, EbmlUint.class),
    CueClusterPosition(new byte[]{-15}, EbmlUint.class),
    CueRelativePosition(new byte[]{-16}),
    CueDuration(new byte[]{-78}),
    CueBlockNumber(new byte[]{83, 120}),
    CueCodecState(new byte[]{-22}),
    CueReference(new byte[]{-37}, r2),
    CueRefTime(new byte[]{-106}),
    Attachments(new byte[]{C5785c.f16670C, 65, -92, 105}, r2),
    AttachedFile(new byte[]{97, -89}, r2),
    FileDescription(new byte[]{70, 126}, r1),
    FileName(new byte[]{70, 110}, r1),
    FileMimeType(new byte[]{70, 96}, r1),
    FileData(new byte[]{70, 92}, r0),
    FileUID(new byte[]{70, -82}),
    Chapters(new byte[]{16, 67, -89, 112}, r2),
    EditionEntry(new byte[]{69, -71}, r2),
    EditionUID(new byte[]{69, -68}),
    EditionFlagHidden(new byte[]{69, -67}),
    EditionFlagDefault(new byte[]{69, -37}),
    EditionFlagOrdered(new byte[]{69, -35}),
    ChapterAtom(new byte[]{-74}, r2),
    ChapterUID(new byte[]{115, -60}),
    ChapterStringUID(new byte[]{86, 84}, r1),
    ChapterTimeStart(new byte[]{-111}),
    ChapterTimeEnd(new byte[]{-110}),
    ChapterFlagHidden(new byte[]{-104}),
    ChapterFlagEnabled(new byte[]{69, -104}),
    ChapterSegmentUID(new byte[]{110, 103}, r0),
    ChapterSegmentEditionUID(new byte[]{110, -68}),
    ChapterPhysicalEquiv(new byte[]{99, -61}),
    ChapterTrack(new byte[]{-113}, r2),
    ChapterTrackNumber(new byte[]{-119}),
    ChapterDisplay(new byte[]{Byte.MIN_VALUE}, r2),
    ChapString(new byte[]{-123}, r1),
    ChapLanguage(new byte[]{67, 124}, r1),
    ChapCountry(new byte[]{67, 126}, r1),
    ChapProcess(new byte[]{105, 68}, r2),
    ChapProcessCodecID(new byte[]{105, 85}),
    ChapProcessPrivate(new byte[]{69, 13}, r0),
    ChapProcessCommand(new byte[]{105, 17}, r2),
    ChapProcessTime(new byte[]{105, 34}),
    ChapProcessData(new byte[]{105, 51}, r0),
    Tags(new byte[]{C5785c.f16702u, 84, -61, 103}, r2),
    Tag(new byte[]{115, 115}, r2),
    Targets(new byte[]{99, -64}, r2),
    TargetTypeValue(new byte[]{104, -54}),
    TargetType(new byte[]{99, -54}, r1),
    TagTrackUID(new byte[]{99, -59}),
    TagEditionUID(new byte[]{99, -55}),
    TagChapterUID(new byte[]{99, -60}),
    TagAttachmentUID(new byte[]{99, -58}),
    SimpleTag(new byte[]{103, -56}, r2),
    TagName(new byte[]{69, -93}, r1),
    TagLanguage(new byte[]{68, 122}, r1),
    TagDefault(new byte[]{68, -124}),
    TagString(new byte[]{68, -121}, r1),
    TagBinary(new byte[]{68, -123}, r0);
    
    public static final Map<MKVType, Set<MKVType>> children = null;
    public static MKVType[] firstLevelHeaders;
    public final Class<? extends EbmlBase> clazz;

    /* renamed from: id */
    public final byte[] f44835id;

    static {
        MKVType mKVType;
        MKVType mKVType2;
        MKVType mKVType3;
        MKVType mKVType4;
        MKVType mKVType5;
        MKVType mKVType6;
        MKVType mKVType7;
        MKVType mKVType8;
        MKVType mKVType9;
        MKVType mKVType10;
        MKVType mKVType11;
        MKVType mKVType12;
        MKVType mKVType13;
        MKVType mKVType14;
        MKVType mKVType15;
        firstLevelHeaders = new MKVType[]{mKVType8, mKVType9, mKVType10, mKVType11, mKVType12, mKVType13, mKVType14, mKVType15, mKVType, mKVType2, mKVType3, mKVType4, mKVType5, mKVType6, mKVType7};
        children = new HashMap();
        children.put(EBML, new HashSet(Arrays.asList(new MKVType[]{EBMLVersion, EBMLReadVersion, EBMLMaxIDLength, EBMLMaxSizeLength, DocType, DocTypeVersion, DocTypeReadVersion})));
        children.put(Segment, new HashSet(Arrays.asList(new MKVType[]{SeekHead, Info, Cluster, Tracks, Cues, Attachments, Chapters, Tags})));
        children.put(SeekHead, new HashSet(Arrays.asList(new MKVType[]{Seek})));
        children.put(Seek, new HashSet(Arrays.asList(new MKVType[]{SeekID, SeekPosition})));
        children.put(Info, new HashSet(Arrays.asList(new MKVType[]{SegmentUID, SegmentFilename, PrevUID, PrevFilename, NextUID, NextFilenam, SegmentFamily, ChapterTranslate, TimecodeScale, Duration, DateUTC, Title, MuxingApp, WritingApp})));
        children.put(ChapterTranslate, new HashSet(Arrays.asList(new MKVType[]{ChapterTranslateEditionUID, ChapterTranslateCodec, ChapterTranslateID})));
        children.put(Cluster, new HashSet(Arrays.asList(new MKVType[]{Timecode, SilentTracks, Position, PrevSize, SimpleBlock, BlockGroup})));
        children.put(SilentTracks, new HashSet(Arrays.asList(new MKVType[]{SilentTrackNumber})));
        children.put(BlockGroup, new HashSet(Arrays.asList(new MKVType[]{Block, BlockAdditions, BlockDuration, ReferencePriority, ReferenceBlock, CodecState, Slices})));
        children.put(BlockAdditions, new HashSet(Arrays.asList(new MKVType[]{BlockMore})));
        children.put(BlockMore, new HashSet(Arrays.asList(new MKVType[]{BlockAddID, BlockAdditional})));
        children.put(Slices, new HashSet(Arrays.asList(new MKVType[]{TimeSlice})));
        children.put(TimeSlice, new HashSet(Arrays.asList(new MKVType[]{LaceNumber})));
        children.put(Tracks, new HashSet(Arrays.asList(new MKVType[]{TrackEntry})));
        Map<MKVType, Set<MKVType>> map = children;
        MKVType mKVType16 = TrackEntry;
        MKVType mKVType17 = TrackType;
        map.put(mKVType16, new HashSet(Arrays.asList(new MKVType[]{TrackNumber, TrackUID, mKVType17, mKVType17, FlagDefault, FlagForced, FlagLacing, MinCache, MaxCache, DefaultDuration, MaxBlockAdditionID, Name, Language, CodecID, CodecPrivate, CodecName, AttachmentLink, CodecDecodeAll, TrackOverlay, TrackTranslate, Video, Audio, TrackOperation, ContentEncodings})));
        children.put(TrackTranslate, new HashSet(Arrays.asList(new MKVType[]{TrackTranslateEditionUID, TrackTranslateCodec, TrackTranslateTrackID})));
        children.put(Video, new HashSet(Arrays.asList(new MKVType[]{FlagInterlaced, StereoMode, AlphaMode, PixelWidth, PixelHeight, PixelCropBottom, PixelCropTop, PixelCropLeft, PixelCropRight, DisplayWidth, DisplayHeight, DisplayUnit, AspectRatioType, ColourSpace})));
        children.put(Audio, new HashSet(Arrays.asList(new MKVType[]{SamplingFrequency, OutputSamplingFrequency, Channels, BitDepth})));
        children.put(TrackOperation, new HashSet(Arrays.asList(new MKVType[]{TrackCombinePlanes, TrackJoinBlocks})));
        children.put(TrackCombinePlanes, new HashSet(Arrays.asList(new MKVType[]{TrackPlane})));
        children.put(TrackPlane, new HashSet(Arrays.asList(new MKVType[]{TrackPlaneUID, TrackPlaneType})));
        children.put(TrackJoinBlocks, new HashSet(Arrays.asList(new MKVType[]{TrackJoinUID})));
        children.put(ContentEncodings, new HashSet(Arrays.asList(new MKVType[]{ContentEncoding})));
        children.put(ContentEncoding, new HashSet(Arrays.asList(new MKVType[]{ContentEncodingOrder, ContentEncodingScope, ContentEncodingType, ContentCompression, ContentEncryption})));
        children.put(ContentCompression, new HashSet(Arrays.asList(new MKVType[]{ContentCompAlgo, ContentCompSettings})));
        children.put(ContentEncryption, new HashSet(Arrays.asList(new MKVType[]{ContentEncAlgo, ContentEncKeyID, ContentSignature, ContentSigKeyID, ContentSigAlgo, ContentSigHashAlgo})));
        children.put(Cues, new HashSet(Arrays.asList(new MKVType[]{CuePoint})));
        children.put(CuePoint, new HashSet(Arrays.asList(new MKVType[]{CueTime, CueTrackPositions})));
        children.put(CueTrackPositions, new HashSet(Arrays.asList(new MKVType[]{CueTrack, CueClusterPosition, CueRelativePosition, CueDuration, CueBlockNumber, CueCodecState, CueReference})));
        children.put(CueReference, new HashSet(Arrays.asList(new MKVType[]{CueRefTime})));
        children.put(Attachments, new HashSet(Arrays.asList(new MKVType[]{AttachedFile})));
        children.put(AttachedFile, new HashSet(Arrays.asList(new MKVType[]{FileDescription, FileName, FileMimeType, FileData, FileUID})));
        children.put(Chapters, new HashSet(Arrays.asList(new MKVType[]{EditionEntry})));
        children.put(EditionEntry, new HashSet(Arrays.asList(new MKVType[]{EditionUID, EditionFlagHidden, EditionFlagDefault, EditionFlagOrdered, ChapterAtom})));
        children.put(ChapterAtom, new HashSet(Arrays.asList(new MKVType[]{ChapterUID, ChapterStringUID, ChapterTimeStart, ChapterTimeEnd, ChapterFlagHidden, ChapterFlagEnabled, ChapterSegmentUID, ChapterSegmentEditionUID, ChapterPhysicalEquiv, ChapterTrack, ChapterDisplay, ChapProcess})));
        children.put(ChapterTrack, new HashSet(Arrays.asList(new MKVType[]{ChapterTrackNumber})));
        children.put(ChapterDisplay, new HashSet(Arrays.asList(new MKVType[]{ChapString, ChapLanguage, ChapCountry})));
        children.put(ChapProcess, new HashSet(Arrays.asList(new MKVType[]{ChapProcessCodecID, ChapProcessPrivate, ChapProcessCommand})));
        children.put(ChapProcessCommand, new HashSet(Arrays.asList(new MKVType[]{ChapProcessTime, ChapProcessData})));
        children.put(Tags, new HashSet(Arrays.asList(new MKVType[]{Tag})));
        children.put(Tag, new HashSet(Arrays.asList(new MKVType[]{Targets, SimpleTag})));
        children.put(Targets, new HashSet(Arrays.asList(new MKVType[]{TargetTypeValue, TargetType, TagTrackUID, TagEditionUID, TagChapterUID, TagAttachmentUID})));
        children.put(SimpleTag, new HashSet(Arrays.asList(new MKVType[]{TagName, TagLanguage, TagDefault, TagString, TagBinary})));
    }

    private MKVType(byte[] bArr) {
        this.f44835id = bArr;
        this.clazz = EbmlUint.class;
    }

    private static <T extends EbmlBase> T create(Class<T> cls, byte[] bArr) throws SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return (EbmlBase) cls.getConstructor(new Class[]{byte[].class}).newInstance(new Object[]{bArr});
    }

    public static <T extends EbmlBase> T createById(byte[] bArr, long j) {
        MKVType[] values;
        for (MKVType mKVType : values()) {
            if (Arrays.equals(mKVType.f44835id, bArr)) {
                return createByType(mKVType);
            }
        }
        PrintStream printStream = System.err;
        StringBuilder sb = new StringBuilder();
        sb.append("WARNING: unspecified ebml ID (");
        sb.append(EbmlUtil.toHexString(bArr));
        sb.append(") encountered at position 0x");
        sb.append(Long.toHexString(j).toUpperCase());
        printStream.println(sb.toString());
        T ebmlVoid = new EbmlVoid(bArr);
        ebmlVoid.type = Void;
        return ebmlVoid;
    }

    public static <T extends EbmlBase> T createByType(MKVType mKVType) {
        try {
            T create = create(mKVType.clazz, mKVType.f44835id);
            create.type = mKVType;
            return create;
        } catch (SecurityException e) {
            e.printStackTrace();
            return new EbmlBin(mKVType.f44835id);
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return new EbmlBin(mKVType.f44835id);
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            return new EbmlBin(mKVType.f44835id);
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            return new EbmlBin(mKVType.f44835id);
        } catch (InstantiationException e5) {
            e5.printStackTrace();
            return new EbmlBin(mKVType.f44835id);
        } catch (IllegalAccessException e6) {
            e6.printStackTrace();
            return new EbmlBin(mKVType.f44835id);
        }
    }

    public static <T> T[] findAll(List<? extends EbmlBase> list, Class<T> cls, MKVType... mKVTypeArr) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList(Arrays.asList(mKVTypeArr));
        if (linkedList2.size() > 0) {
            for (EbmlBase ebmlBase : list) {
                MKVType mKVType = (MKVType) linkedList2.remove(0);
                if (mKVType == null || mKVType.equals(ebmlBase.type)) {
                    findSub(ebmlBase, linkedList2, linkedList);
                }
                linkedList2.add(0, mKVType);
            }
        }
        return linkedList.toArray((Object[]) Array.newInstance(cls, 0));
    }

    public static EbmlBase findFirst(EbmlBase ebmlBase, MKVType... mKVTypeArr) {
        return findFirstSub(ebmlBase, new LinkedList(Arrays.asList(mKVTypeArr)));
    }

    private static EbmlBase findFirstSub(EbmlBase ebmlBase, List<MKVType> list) {
        EbmlBase ebmlBase2 = null;
        if (list.size() == 0 || !ebmlBase.type.equals(list.get(0))) {
            return null;
        }
        if (list.size() == 1) {
            return ebmlBase;
        }
        MKVType mKVType = (MKVType) list.remove(0);
        if (ebmlBase instanceof EbmlMaster) {
            Iterator it = ((EbmlMaster) ebmlBase).children.iterator();
            while (it.hasNext() && ebmlBase2 == null) {
                ebmlBase2 = findFirstSub((EbmlBase) it.next(), list);
            }
        }
        list.add(0, mKVType);
        return ebmlBase2;
    }

    public static <T> List<T> findList(List<? extends EbmlBase> list, Class<T> cls, MKVType... mKVTypeArr) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList(Arrays.asList(mKVTypeArr));
        if (linkedList2.size() > 0) {
            for (EbmlBase ebmlBase : list) {
                MKVType mKVType = (MKVType) linkedList2.remove(0);
                if (mKVType == null || mKVType.equals(ebmlBase.type)) {
                    findSubList(ebmlBase, linkedList2, linkedList);
                }
                linkedList2.add(0, mKVType);
            }
        }
        return linkedList;
    }

    private static void findSub(EbmlBase ebmlBase, List<MKVType> list, Collection<EbmlBase> collection) {
        if (list.size() > 0) {
            MKVType mKVType = (MKVType) list.remove(0);
            if (ebmlBase instanceof EbmlMaster) {
                Iterator it = ((EbmlMaster) ebmlBase).children.iterator();
                while (it.hasNext()) {
                    EbmlBase ebmlBase2 = (EbmlBase) it.next();
                    if (mKVType == null || mKVType.equals(ebmlBase2.type)) {
                        findSub(ebmlBase2, list, collection);
                    }
                }
            }
            list.add(0, mKVType);
            return;
        }
        collection.add(ebmlBase);
    }

    private static <T> void findSubList(EbmlBase ebmlBase, List<MKVType> list, Collection<T> collection) {
        if (list.size() > 0) {
            MKVType mKVType = (MKVType) list.remove(0);
            if (ebmlBase instanceof EbmlMaster) {
                Iterator it = ((EbmlMaster) ebmlBase).children.iterator();
                while (it.hasNext()) {
                    EbmlBase ebmlBase2 = (EbmlBase) it.next();
                    if (mKVType == null || mKVType.equals(ebmlBase2.type)) {
                        findSubList(ebmlBase2, list, collection);
                    }
                }
            }
            list.add(0, mKVType);
            return;
        }
        collection.add(ebmlBase);
    }

    public static MKVType getParent(MKVType mKVType) {
        for (Entry entry : children.entrySet()) {
            if (((Set) entry.getValue()).contains(mKVType)) {
                return (MKVType) entry.getKey();
            }
        }
        return null;
    }

    public static boolean isFirstLevelHeader(byte[] bArr) {
        for (MKVType mKVType : firstLevelHeaders) {
            if (Arrays.equals(mKVType.f44835id, bArr)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isHeaderFirstByte(byte b) {
        for (MKVType mKVType : values()) {
            if (mKVType.f44835id[0] == b) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSpecifiedHeader(byte[] bArr) {
        for (MKVType mKVType : values()) {
            if (Arrays.equals(mKVType.f44835id, bArr)) {
                return true;
            }
        }
        return false;
    }

    public static boolean possibleChild(EbmlMaster ebmlMaster, EbmlBase ebmlBase) {
        boolean z = false;
        if (ebmlMaster == null) {
            MKVType mKVType = ebmlBase.type;
            return mKVType == EBML || mKVType == Segment;
        } else if (Arrays.equals(ebmlBase.f44838id, Void.f44835id) || Arrays.equals(ebmlBase.f44838id, CRC32.f44835id)) {
            if (ebmlBase.offset != ebmlMaster.dataOffset + ((long) ebmlMaster.dataLen)) {
                z = true;
            }
            return z;
        } else {
            MKVType mKVType2 = ebmlBase.type;
            if (mKVType2 == Void || mKVType2 == CRC32) {
                return true;
            }
            Set set = (Set) children.get(ebmlMaster.type);
            if (set != null && set.contains(ebmlBase.type)) {
                z = true;
            }
            return z;
        }
    }

    public static <T> T findFirst(List<? extends EbmlBase> list, MKVType... mKVTypeArr) {
        LinkedList linkedList = new LinkedList(Arrays.asList(mKVTypeArr));
        for (EbmlBase findFirstSub : list) {
            T findFirstSub2 = findFirstSub(findFirstSub, linkedList);
            if (findFirstSub2 != null) {
                return findFirstSub2;
            }
        }
        return null;
    }

    private MKVType(byte[] bArr, Class<? extends EbmlBase> cls) {
        this.f44835id = bArr;
        this.clazz = cls;
    }

    public static boolean possibleChild(EbmlMaster ebmlMaster, byte[] bArr) {
        if (ebmlMaster == null && (Arrays.equals(EBML.f44835id, bArr) || Arrays.equals(Segment.f44835id, bArr))) {
            return true;
        }
        if (ebmlMaster == null) {
            return false;
        }
        if (Arrays.equals(Void.f44835id, bArr) || Arrays.equals(CRC32.f44835id, bArr)) {
            return true;
        }
        for (MKVType mKVType : (Set) children.get(ebmlMaster.type)) {
            if (Arrays.equals(mKVType.f44835id, bArr)) {
                return true;
            }
        }
        return false;
    }

    public static <T> T[] findAll(EbmlBase ebmlBase, Class<T> cls, MKVType... mKVTypeArr) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList(Arrays.asList(mKVTypeArr));
        if (!ebmlBase.type.equals(linkedList2.get(0))) {
            return linkedList.toArray((Object[]) Array.newInstance(cls, 0));
        }
        linkedList2.remove(0);
        findSub(ebmlBase, linkedList2, linkedList);
        return linkedList.toArray((Object[]) Array.newInstance(cls, 0));
    }
}
