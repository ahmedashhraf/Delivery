package p053b.p063d.p064b;

import android.content.res.AssetManager.AssetInputStream;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.util.Pair;
import androidx.annotation.C0193h0;
import androidx.annotation.C0195i0;
import androidx.annotation.C0207n0;
import androidx.annotation.C0207n0.C0208a;
import androidx.core.p034l.C0986h;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.cache.disk.DefaultDiskStorage.FileType;
import com.facebook.imagepipeline.common.RotationOptions;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.C15470v;
import org.jcodec.codecs.mjpeg.JpegConst;

/* renamed from: b.d.b.a */
/* compiled from: ExifInterface */
public class C2108a {

    /* renamed from: A */
    public static final String f7994A = "PlanarConfiguration";

    /* renamed from: A0 */
    public static final String f7995A0 = "ShutterSpeedValue";

    /* renamed from: A1 */
    public static final String f7996A1 = "GPSDOP";

    /* renamed from: A2 */
    public static final int f7997A2 = 3;

    /* renamed from: A3 */
    public static final short f7998A3 = 15;

    /* renamed from: A4 */
    public static final short f7999A4 = 0;

    /* renamed from: A5 */
    private static final short f8000A5 = 20306;

    /* renamed from: A6 */
    private static final C2112d f8001A6 = new C2112d(f8066J, C0986h.f4408j, 4);

    /* renamed from: B */
    public static final String f8002B = "YCbCrSubSampling";

    /* renamed from: B0 */
    public static final String f8003B0 = "ApertureValue";

    /* renamed from: B1 */
    public static final String f8004B1 = "GPSSpeedRef";

    /* renamed from: B2 */
    public static final int f8005B2 = 4;

    /* renamed from: B3 */
    public static final short f8006B3 = 16;

    /* renamed from: B4 */
    public static final short f8007B4 = 0;

    /* renamed from: B5 */
    private static final short f8008B5 = 21330;

    /* renamed from: B6 */
    private static final C2112d f8009B6 = new C2112d(f8074K, 514, 4);

    /* renamed from: C */
    public static final String f8010C = "YCbCrPositioning";

    /* renamed from: C0 */
    public static final String f8011C0 = "BrightnessValue";

    /* renamed from: C1 */
    public static final String f8012C1 = "GPSSpeed";

    /* renamed from: C2 */
    public static final int f8013C2 = 5;

    /* renamed from: C3 */
    public static final short f8014C3 = 17;

    /* renamed from: C4 */
    public static final short f8015C4 = 0;

    /* renamed from: C5 */
    private static final byte[] f8016C5 = {79, 76, 89, 77, 80, 0};

    /* renamed from: C6 */
    private static final HashMap<Integer, C2112d>[] f8017C6;

    /* renamed from: D */
    public static final String f8018D = "XResolution";

    /* renamed from: D0 */
    public static final String f8019D0 = "ExposureBiasValue";

    /* renamed from: D1 */
    public static final String f8020D1 = "GPSTrackRef";

    /* renamed from: D2 */
    public static final int f8021D2 = 6;

    /* renamed from: D3 */
    public static final short f8022D3 = 18;

    /* renamed from: D4 */
    public static final short f8023D4 = 0;

    /* renamed from: D5 */
    private static final byte[] f8024D5 = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: D6 */
    private static final HashMap<String, C2112d>[] f8025D6;

    /* renamed from: E */
    public static final String f8026E = "YResolution";

    /* renamed from: E0 */
    public static final String f8027E0 = "MaxApertureValue";

    /* renamed from: E1 */
    public static final String f8028E1 = "GPSTrack";

    /* renamed from: E2 */
    public static final int f8029E2 = 7;

    /* renamed from: E3 */
    public static final short f8030E3 = 19;

    /* renamed from: E4 */
    public static final short f8031E4 = 1;

    /* renamed from: E5 */
    private static final int f8032E5 = 8;

    /* renamed from: E6 */
    private static final HashSet<String> f8033E6 = new HashSet<>(Arrays.asList(new String[]{f8314o0, f8195Z0, f8306n0, f8035F0, f8378w1}));

    /* renamed from: F */
    public static final String f8034F = "ResolutionUnit";

    /* renamed from: F0 */
    public static final String f8035F0 = "SubjectDistance";

    /* renamed from: F1 */
    public static final String f8036F1 = "GPSImgDirectionRef";

    /* renamed from: F2 */
    public static final int f8037F2 = 8;

    /* renamed from: F3 */
    public static final short f8038F3 = 20;

    /* renamed from: F4 */
    public static final short f8039F4 = 2;

    /* renamed from: F5 */
    private static final int f8040F5 = 12;

    /* renamed from: F6 */
    private static final HashMap<Integer, Integer> f8041F6 = new HashMap<>();

    /* renamed from: G */
    public static final String f8042G = "StripOffsets";

    /* renamed from: G0 */
    public static final String f8043G0 = "MeteringMode";

    /* renamed from: G1 */
    public static final String f8044G1 = "GPSImgDirection";

    /* renamed from: G2 */
    private static final List<Integer> f8045G2;

    /* renamed from: G3 */
    public static final short f8046G3 = 21;

    /* renamed from: G4 */
    public static final short f8047G4 = 0;

    /* renamed from: G5 */
    private static final short f8048G5 = 85;

    /* renamed from: G6 */
    static final Charset f8049G6 = Charset.forName("US-ASCII");

    /* renamed from: H */
    public static final String f8050H = "RowsPerStrip";

    /* renamed from: H0 */
    public static final String f8051H0 = "LightSource";

    /* renamed from: H1 */
    public static final String f8052H1 = "GPSMapDatum";

    /* renamed from: H2 */
    private static final List<Integer> f8053H2;

    /* renamed from: H3 */
    public static final short f8054H3 = 22;

    /* renamed from: H4 */
    public static final short f8055H4 = 1;

    /* renamed from: H5 */
    private static final String f8056H5 = "PENTAX";

    /* renamed from: H6 */
    static final byte[] f8057H6 = "Exif\u0000\u0000".getBytes(f8049G6);

    /* renamed from: I */
    public static final String f8058I = "StripByteCounts";

    /* renamed from: I0 */
    public static final String f8059I0 = "Flash";

    /* renamed from: I1 */
    public static final String f8060I1 = "GPSDestLatitudeRef";

    /* renamed from: I2 */
    public static final short f8061I2 = 1;

    /* renamed from: I3 */
    public static final short f8062I3 = 23;

    /* renamed from: I4 */
    public static final short f8063I4 = 2;

    /* renamed from: I5 */
    private static final int f8064I5 = 6;

    /* renamed from: I6 */
    static final byte f8065I6 = -1;

    /* renamed from: J */
    public static final String f8066J = "JPEGInterchangeFormat";

    /* renamed from: J0 */
    public static final String f8067J0 = "SubjectArea";

    /* renamed from: J1 */
    public static final String f8068J1 = "GPSDestLatitude";

    /* renamed from: J2 */
    public static final short f8069J2 = 2;

    /* renamed from: J3 */
    public static final short f8070J3 = 24;

    /* renamed from: J4 */
    public static final short f8071J4 = 3;

    /* renamed from: J5 */
    private static SimpleDateFormat f8072J5 = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss");

    /* renamed from: J6 */
    private static final byte f8073J6 = -40;

    /* renamed from: K */
    public static final String f8074K = "JPEGInterchangeFormatLength";

    /* renamed from: K0 */
    public static final String f8075K0 = "FocalLength";

    /* renamed from: K1 */
    public static final String f8076K1 = "GPSDestLongitudeRef";

    /* renamed from: K2 */
    public static final short f8077K2 = 1;

    /* renamed from: K3 */
    public static final short f8078K3 = 255;

    /* renamed from: K4 */
    public static final String f8079K4 = "N";

    /* renamed from: K5 */
    static final short f8080K5 = 18761;

    /* renamed from: K6 */
    private static final byte f8081K6 = -64;

    /* renamed from: L */
    public static final String f8082L = "TransferFunction";

    /* renamed from: L0 */
    public static final String f8083L0 = "FlashEnergy";

    /* renamed from: L1 */
    public static final String f8084L1 = "GPSDestLongitude";

    /* renamed from: L2 */
    public static final short f8085L2 = 2;

    /* renamed from: L3 */
    public static final short f8086L3 = 1;

    /* renamed from: L4 */
    public static final String f8087L4 = "S";

    /* renamed from: L5 */
    static final short f8088L5 = 19789;

    /* renamed from: L6 */
    private static final byte f8089L6 = -63;

    /* renamed from: M */
    public static final String f8090M = "WhitePoint";

    /* renamed from: M0 */
    public static final String f8091M0 = "SpatialFrequencyResponse";

    /* renamed from: M1 */
    public static final String f8092M1 = "GPSDestBearingRef";

    /* renamed from: M2 */
    public static final short f8093M2 = 2;

    /* renamed from: M3 */
    public static final short f8094M3 = 4;

    /* renamed from: M4 */
    public static final String f8095M4 = "E";

    /* renamed from: M5 */
    static final byte f8096M5 = 42;

    /* renamed from: M6 */
    private static final byte f8097M6 = -62;

    /* renamed from: N */
    public static final String f8098N = "PrimaryChromaticities";

    /* renamed from: N0 */
    public static final String f8099N0 = "FocalPlaneXResolution";

    /* renamed from: N1 */
    public static final String f8100N1 = "GPSDestBearing";

    /* renamed from: N2 */
    public static final short f8101N2 = 3;

    /* renamed from: N3 */
    public static final short f8102N3 = 6;

    /* renamed from: N4 */
    public static final String f8103N4 = "W";

    /* renamed from: N5 */
    private static final int f8104N5 = 8;

    /* renamed from: N6 */
    private static final byte f8105N6 = -61;

    /* renamed from: O */
    public static final String f8106O = "YCbCrCoefficients";

    /* renamed from: O0 */
    public static final String f8107O0 = "FocalPlaneYResolution";

    /* renamed from: O1 */
    public static final String f8108O1 = "GPSDestDistanceRef";

    /* renamed from: O2 */
    public static final int f8109O2 = 1;

    /* renamed from: O3 */
    public static final short f8110O3 = 8;

    /* renamed from: O4 */
    public static final short f8111O4 = 0;

    /* renamed from: O5 */
    private static final int f8112O5 = 1;

    /* renamed from: O6 */
    private static final byte f8113O6 = -59;

    /* renamed from: P */
    public static final String f8114P = "ReferenceBlackWhite";

    /* renamed from: P0 */
    public static final String f8115P0 = "FocalPlaneResolutionUnit";

    /* renamed from: P1 */
    public static final String f8116P1 = "GPSDestDistance";

    /* renamed from: P2 */
    public static final int f8117P2 = 65535;

    /* renamed from: P3 */
    public static final short f8118P3 = 16;

    /* renamed from: P4 */
    public static final short f8119P4 = 1;

    /* renamed from: P5 */
    private static final int f8120P5 = 2;

    /* renamed from: P6 */
    private static final byte f8121P6 = -58;

    /* renamed from: Q */
    public static final String f8122Q = "DateTime";

    /* renamed from: Q0 */
    public static final String f8123Q0 = "SubjectLocation";

    /* renamed from: Q1 */
    public static final String f8124Q1 = "GPSProcessingMethod";

    /* renamed from: Q2 */
    public static final short f8125Q2 = 0;

    /* renamed from: Q3 */
    public static final short f8126Q3 = 24;

    /* renamed from: Q4 */
    public static final String f8127Q4 = "A";

    /* renamed from: Q5 */
    private static final int f8128Q5 = 3;

    /* renamed from: Q6 */
    private static final byte f8129Q6 = -57;

    /* renamed from: R */
    public static final String f8130R = "ImageDescription";

    /* renamed from: R0 */
    public static final String f8131R0 = "ExposureIndex";

    /* renamed from: R1 */
    public static final String f8132R1 = "GPSAreaInformation";

    /* renamed from: R2 */
    public static final short f8133R2 = 1;

    /* renamed from: R3 */
    public static final short f8134R3 = 32;

    /* renamed from: R4 */
    public static final String f8135R4 = "V";

    /* renamed from: R5 */
    private static final int f8136R5 = 4;

    /* renamed from: R6 */
    private static final byte f8137R6 = -55;

    /* renamed from: S */
    public static final String f8138S = "Make";

    /* renamed from: S0 */
    public static final String f8139S0 = "SensingMethod";

    /* renamed from: S1 */
    public static final String f8140S1 = "GPSDateStamp";

    /* renamed from: S2 */
    public static final short f8141S2 = 2;

    /* renamed from: S3 */
    public static final short f8142S3 = 64;

    /* renamed from: S4 */
    public static final String f8143S4 = "2";

    /* renamed from: S5 */
    private static final int f8144S5 = 5;

    /* renamed from: S6 */
    private static final byte f8145S6 = -54;

    /* renamed from: T */
    public static final String f8146T = "Model";

    /* renamed from: T0 */
    public static final String f8147T0 = "FileSource";

    /* renamed from: T1 */
    public static final String f8148T1 = "GPSDifferential";

    /* renamed from: T2 */
    public static final short f8149T2 = 3;

    /* renamed from: T3 */
    public static final short f8150T3 = 1;

    /* renamed from: T4 */
    public static final String f8151T4 = "3";

    /* renamed from: T5 */
    private static final int f8152T5 = 6;

    /* renamed from: T6 */
    private static final byte f8153T6 = -53;

    /* renamed from: U */
    public static final String f8154U = "Software";

    /* renamed from: U0 */
    public static final String f8155U0 = "SceneType";

    /* renamed from: U1 */
    public static final String f8156U1 = "GPSHPositioningError";

    /* renamed from: U2 */
    public static final short f8157U2 = 4;

    /* renamed from: U3 */
    public static final short f8158U3 = 2;

    /* renamed from: U4 */
    public static final String f8159U4 = "K";

    /* renamed from: U5 */
    private static final int f8160U5 = 7;

    /* renamed from: U6 */
    private static final byte f8161U6 = -51;

    /* renamed from: V */
    public static final String f8162V = "Artist";

    /* renamed from: V0 */
    public static final String f8163V0 = "CFAPattern";

    /* renamed from: V1 */
    public static final String f8164V1 = "InteroperabilityIndex";

    /* renamed from: V2 */
    public static final short f8165V2 = 5;

    /* renamed from: V3 */
    public static final short f8166V3 = 3;

    /* renamed from: V4 */
    public static final String f8167V4 = "M";

    /* renamed from: V5 */
    private static final int f8168V5 = 8;

    /* renamed from: V6 */
    private static final byte f8169V6 = -50;

    /* renamed from: W */
    public static final String f8170W = "Copyright";

    /* renamed from: W0 */
    public static final String f8171W0 = "CustomRendered";

    /* renamed from: W1 */
    public static final String f8172W1 = "ThumbnailImageLength";

    /* renamed from: W2 */
    public static final short f8173W2 = 6;

    /* renamed from: W3 */
    public static final short f8174W3 = 4;

    /* renamed from: W4 */
    public static final String f8175W4 = "N";

    /* renamed from: W5 */
    private static final int f8176W5 = 9;

    /* renamed from: W6 */
    private static final byte f8177W6 = -49;

    /* renamed from: X */
    public static final String f8178X = "ExifVersion";

    /* renamed from: X0 */
    public static final String f8179X0 = "ExposureMode";

    /* renamed from: X1 */
    public static final String f8180X1 = "ThumbnailImageWidth";

    /* renamed from: X2 */
    public static final short f8181X2 = 7;

    /* renamed from: X3 */
    public static final short f8182X3 = 5;

    /* renamed from: X4 */
    public static final String f8183X4 = "T";

    /* renamed from: X5 */
    private static final int f8184X5 = 10;

    /* renamed from: X6 */
    private static final byte f8185X6 = -38;

    /* renamed from: Y */
    public static final String f8186Y = "FlashpixVersion";

    /* renamed from: Y0 */
    public static final String f8187Y0 = "WhiteBalance";

    /* renamed from: Y1 */
    public static final String f8188Y1 = "DNGVersion";

    /* renamed from: Y2 */
    public static final short f8189Y2 = 8;

    /* renamed from: Y3 */
    public static final short f8190Y3 = 7;

    /* renamed from: Y4 */
    public static final String f8191Y4 = "M";

    /* renamed from: Y5 */
    private static final int f8192Y5 = 11;

    /* renamed from: Y6 */
    static final byte f8193Y6 = -31;

    /* renamed from: Z */
    public static final String f8194Z = "ColorSpace";

    /* renamed from: Z0 */
    public static final String f8195Z0 = "DigitalZoomRatio";

    /* renamed from: Z1 */
    public static final String f8196Z1 = "DefaultCropSize";

    /* renamed from: Z2 */
    public static final short f8197Z2 = 0;

    /* renamed from: Z3 */
    public static final short f8198Z3 = 8;

    /* renamed from: Z4 */
    public static final String f8199Z4 = "K";

    /* renamed from: Z5 */
    private static final int f8200Z5 = 12;

    /* renamed from: Z6 */
    private static final byte f8201Z6 = -2;

    /* renamed from: a0 */
    public static final String f8202a0 = "Gamma";

    /* renamed from: a1 */
    public static final String f8203a1 = "FocalLengthIn35mmFilm";

    /* renamed from: a2 */
    public static final String f8204a2 = "ThumbnailImage";

    /* renamed from: a3 */
    public static final short f8205a3 = 1;

    /* renamed from: a4 */
    public static final short f8206a4 = 0;

    /* renamed from: a5 */
    public static final String f8207a5 = "M";

    /* renamed from: a6 */
    private static final int f8208a6 = 13;

    /* renamed from: a7 */
    static final byte f8209a7 = -39;

    /* renamed from: b0 */
    public static final String f8210b0 = "PixelXDimension";

    /* renamed from: b1 */
    public static final String f8211b1 = "SceneCaptureType";

    /* renamed from: b2 */
    public static final String f8212b2 = "PreviewImageStart";

    /* renamed from: b3 */
    public static final short f8213b3 = 2;

    /* renamed from: b4 */
    public static final short f8214b4 = 1;

    /* renamed from: b5 */
    public static final String f8215b5 = "N";

    /* renamed from: b6 */
    static final String[] f8216b6 = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE"};

    /* renamed from: b7 */
    private static final int f8217b7 = 0;

    /* renamed from: c0 */
    public static final String f8218c0 = "PixelYDimension";

    /* renamed from: c1 */
    public static final String f8219c1 = "GainControl";

    /* renamed from: c2 */
    public static final String f8220c2 = "PreviewImageLength";

    /* renamed from: c3 */
    public static final short f8221c3 = 3;

    /* renamed from: c4 */
    public static final short f8222c4 = 2;

    /* renamed from: c5 */
    public static final short f8223c5 = 0;

    /* renamed from: c6 */
    static final int[] f8224c6 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: c7 */
    private static final int f8225c7 = 1;

    /* renamed from: d0 */
    public static final String f8226d0 = "ComponentsConfiguration";

    /* renamed from: d1 */
    public static final String f8227d1 = "Contrast";

    /* renamed from: d2 */
    public static final String f8228d2 = "AspectFrame";

    /* renamed from: d3 */
    public static final short f8229d3 = 4;

    /* renamed from: d4 */
    public static final short f8230d4 = 3;

    /* renamed from: d5 */
    public static final short f8231d5 = 1;

    /* renamed from: d6 */
    static final byte[] f8232d6 = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: d7 */
    private static final int f8233d7 = 2;

    /* renamed from: e0 */
    public static final String f8234e0 = "CompressedBitsPerPixel";

    /* renamed from: e1 */
    public static final String f8235e1 = "Saturation";

    /* renamed from: e2 */
    public static final String f8236e2 = "SensorBottomBorder";

    /* renamed from: e3 */
    public static final short f8237e3 = 5;

    /* renamed from: e4 */
    public static final short f8238e4 = 1;

    /* renamed from: e5 */
    public static final int f8239e5 = 1;

    /* renamed from: e6 */
    private static final C2112d[] f8240e6 = {new C2112d(f8284k2, JpegConst.COM, 4), new C2112d(f8292l2, 255, 4), new C2112d(f8352t, 256, 3, 4), new C2112d(f8360u, C0986h.f4407i, 3, 4), new C2112d(f8368v, 258, 3), new C2112d(f8376w, 259, 3), new C2112d(f8384x, 262, 3), new C2112d(f8130R, RotationOptions.ROTATE_270, 2), new C2112d(f8138S, 271, 2), new C2112d(f8146T, 272, 2), new C2112d(f8042G, 273, 3, 4), new C2112d(f8392y, TiffUtil.TIFF_TAG_ORIENTATION, 3), new C2112d(f8400z, 277, 3), new C2112d(f8050H, 278, 3, 4), new C2112d(f8058I, 279, 3, 4), new C2112d(f8018D, 282, 5), new C2112d(f8026E, 283, 5), new C2112d(f7994A, 284, 3), new C2112d(f8034F, 296, 3), new C2112d(f8082L, 301, 3), new C2112d(f8154U, C15470v.f44676q, 2), new C2112d(f8122Q, 306, 2), new C2112d(f8162V, 315, 2), new C2112d(f8090M, 318, 5), new C2112d(f8098N, 319, 5), new C2112d(f8324p2, 330, 4), new C2112d(f8066J, C0986h.f4408j, 4), new C2112d(f8074K, 514, 4), new C2112d(f8106O, 529, 5), new C2112d(f8002B, 530, 3), new C2112d(f8010C, 531, 3), new C2112d(f8114P, 532, 5), new C2112d(f8170W, 33432, 2), new C2112d(f8300m2, 34665, 4), new C2112d(f8308n2, 34853, 4), new C2112d(f8260h2, 4, 4), new C2112d(f8244f2, 5, 4), new C2112d(f8236e2, 6, 4), new C2112d(f8252g2, 7, 4), new C2112d(f8268i2, 23, 3), new C2112d(f8276j2, 46, 7)};

    /* renamed from: e7 */
    private static final int f8241e7 = 3;

    /* renamed from: f0 */
    public static final String f8242f0 = "MakerNote";

    /* renamed from: f1 */
    public static final String f8243f1 = "Sharpness";

    /* renamed from: f2 */
    public static final String f8244f2 = "SensorLeftBorder";

    /* renamed from: f3 */
    public static final short f8245f3 = 6;

    /* renamed from: f4 */
    public static final short f8246f4 = 0;

    /* renamed from: f5 */
    public static final int f8247f5 = 2;

    /* renamed from: f6 */
    private static final C2112d[] f8248f6 = {new C2112d(f8306n0, 33434, 5), new C2112d(f8314o0, 33437, 5), new C2112d(f8322p0, 34850, 3), new C2112d(f8329q0, 34852, 2), new C2112d(f8345s0, 34855, 3), new C2112d(f8353t0, 34856, 7), new C2112d(f8178X, 36864, 2), new C2112d(f8266i0, 36867, 2), new C2112d(f8274j0, 36868, 2), new C2112d(f8226d0, 37121, 7), new C2112d(f8234e0, 37122, 5), new C2112d(f7995A0, 37377, 10), new C2112d(f8003B0, 37378, 5), new C2112d(f8011C0, 37379, 10), new C2112d(f8019D0, 37380, 10), new C2112d(f8027E0, 37381, 5), new C2112d(f8035F0, 37382, 5), new C2112d(f8043G0, 37383, 3), new C2112d(f8051H0, 37384, 3), new C2112d(f8059I0, 37385, 3), new C2112d(f8075K0, 37386, 5), new C2112d(f8067J0, 37396, 3), new C2112d(f8242f0, 37500, 7), new C2112d(f8250g0, 37510, 7), new C2112d(f8282k0, 37520, 2), new C2112d(f8290l0, 37521, 2), new C2112d(f8298m0, 37522, 2), new C2112d(f8186Y, 40960, 7), new C2112d(f8194Z, 40961, 3), new C2112d(f8210b0, 40962, 3, 4), new C2112d(f8218c0, 40963, 3, 4), new C2112d(f8258h0, 40964, 2), new C2112d(f8316o2, 40965, 4), new C2112d(f8083L0, 41483, 5), new C2112d(f8091M0, 41484, 7), new C2112d(f8099N0, 41486, 5), new C2112d(f8107O0, 41487, 5), new C2112d(f8115P0, 41488, 3), new C2112d(f8123Q0, 41492, 3), new C2112d(f8131R0, 41493, 5), new C2112d(f8139S0, 41495, 3), new C2112d(f8147T0, 41728, 7), new C2112d(f8155U0, 41729, 7), new C2112d(f8163V0, 41730, 7), new C2112d(f8171W0, 41985, 3), new C2112d(f8179X0, 41986, 3), new C2112d(f8187Y0, 41987, 3), new C2112d(f8195Z0, 41988, 5), new C2112d(f8203a1, 41989, 3), new C2112d(f8211b1, 41990, 3), new C2112d(f8219c1, 41991, 3), new C2112d(f8227d1, 41992, 3), new C2112d(f8235e1, 41993, 3), new C2112d(f8243f1, 41994, 3), new C2112d(f8251g1, 41995, 7), new C2112d(f8259h1, 41996, 3), new C2112d(f8267i1, 42016, 2), new C2112d(f8188Y1, 50706, 1), new C2112d(f8196Z1, 50720, 3, 4)};

    /* renamed from: f7 */
    private static final int f8249f7 = 4;

    /* renamed from: g0 */
    public static final String f8250g0 = "UserComment";

    /* renamed from: g1 */
    public static final String f8251g1 = "DeviceSettingDescription";

    /* renamed from: g2 */
    public static final String f8252g2 = "SensorRightBorder";

    /* renamed from: g3 */
    public static final short f8253g3 = 7;

    /* renamed from: g4 */
    public static final short f8254g4 = 1;

    /* renamed from: g5 */
    public static final int f8255g5 = 6;

    /* renamed from: g6 */
    private static final C2112d[] f8256g6 = {new C2112d(f8323p1, 0, 1), new C2112d(f8330q1, 1, 2), new C2112d(f8338r1, 2, 5), new C2112d(f8346s1, 3, 2), new C2112d(f8354t1, 4, 5), new C2112d(f8362u1, 5, 1), new C2112d(f8370v1, 6, 5), new C2112d(f8378w1, 7, 5), new C2112d(f8386x1, 8, 2), new C2112d(f8394y1, 9, 2), new C2112d(f8402z1, 10, 2), new C2112d(f7996A1, 11, 5), new C2112d(f8004B1, 12, 2), new C2112d(f8012C1, 13, 5), new C2112d(f8020D1, 14, 2), new C2112d(f8028E1, 15, 5), new C2112d(f8036F1, 16, 2), new C2112d(f8044G1, 17, 5), new C2112d(f8052H1, 18, 2), new C2112d(f8060I1, 19, 2), new C2112d(f8068J1, 20, 5), new C2112d(f8076K1, 21, 2), new C2112d(f8084L1, 22, 5), new C2112d(f8092M1, 23, 2), new C2112d(f8100N1, 24, 5), new C2112d(f8108O1, 25, 2), new C2112d(f8116P1, 26, 5), new C2112d(f8124Q1, 27, 7), new C2112d(f8132R1, 28, 7), new C2112d(f8140S1, 29, 2), new C2112d(f8148T1, 30, 3)};

    /* renamed from: g7 */
    private static final int f8257g7 = 5;

    /* renamed from: h0 */
    public static final String f8258h0 = "RelatedSoundFile";

    /* renamed from: h1 */
    public static final String f8259h1 = "SubjectDistanceRange";

    /* renamed from: h2 */
    public static final String f8260h2 = "SensorTopBorder";

    /* renamed from: h3 */
    public static final short f8261h3 = 0;

    /* renamed from: h4 */
    public static final short f8262h4 = 0;

    /* renamed from: h5 */
    public static final int f8263h5 = 7;

    /* renamed from: h6 */
    private static final C2112d[] f8264h6 = {new C2112d(f8164V1, 1, 2)};

    /* renamed from: h7 */
    private static final int f8265h7 = 6;

    /* renamed from: i0 */
    public static final String f8266i0 = "DateTimeOriginal";

    /* renamed from: i1 */
    public static final String f8267i1 = "ImageUniqueID";

    /* renamed from: i2 */
    public static final String f8268i2 = "ISO";

    /* renamed from: i3 */
    public static final short f8269i3 = 1;

    /* renamed from: i4 */
    public static final short f8270i4 = 1;

    /* renamed from: i5 */
    public static final int f8271i5 = 8;

    /* renamed from: i6 */
    private static final C2112d[] f8272i6 = {new C2112d(f8284k2, JpegConst.COM, 4), new C2112d(f8292l2, 255, 4), new C2112d(f8180X1, 256, 3, 4), new C2112d(f8172W1, C0986h.f4407i, 3, 4), new C2112d(f8368v, 258, 3), new C2112d(f8376w, 259, 3), new C2112d(f8384x, 262, 3), new C2112d(f8130R, RotationOptions.ROTATE_270, 2), new C2112d(f8138S, 271, 2), new C2112d(f8146T, 272, 2), new C2112d(f8042G, 273, 3, 4), new C2112d(f8392y, TiffUtil.TIFF_TAG_ORIENTATION, 3), new C2112d(f8400z, 277, 3), new C2112d(f8050H, 278, 3, 4), new C2112d(f8058I, 279, 3, 4), new C2112d(f8018D, 282, 5), new C2112d(f8026E, 283, 5), new C2112d(f7994A, 284, 3), new C2112d(f8034F, 296, 3), new C2112d(f8082L, 301, 3), new C2112d(f8154U, C15470v.f44676q, 2), new C2112d(f8122Q, 306, 2), new C2112d(f8162V, 315, 2), new C2112d(f8090M, 318, 5), new C2112d(f8098N, 319, 5), new C2112d(f8324p2, 330, 4), new C2112d(f8066J, C0986h.f4408j, 4), new C2112d(f8074K, 514, 4), new C2112d(f8106O, 529, 5), new C2112d(f8002B, 530, 3), new C2112d(f8010C, 531, 3), new C2112d(f8114P, 532, 5), new C2112d(f8170W, 33432, 2), new C2112d(f8300m2, 34665, 4), new C2112d(f8308n2, 34853, 4), new C2112d(f8188Y1, 50706, 1), new C2112d(f8196Z1, 50720, 3, 4)};

    /* renamed from: i7 */
    private static final int f8273i7 = 7;

    /* renamed from: j0 */
    public static final String f8274j0 = "DateTimeDigitized";

    /* renamed from: j1 */
    public static final String f8275j1 = "CameraOwnerName";

    /* renamed from: j2 */
    public static final String f8276j2 = "JpgFromRaw";

    /* renamed from: j3 */
    public static final short f8277j3 = 2;

    /* renamed from: j4 */
    public static final short f8278j4 = 2;

    /* renamed from: j5 */
    public static final int f8279j5 = 32773;

    /* renamed from: j6 */
    private static final C2112d f8280j6 = new C2112d(f8042G, 273, 3);

    /* renamed from: j7 */
    private static final int f8281j7 = 8;

    /* renamed from: k0 */
    public static final String f8282k0 = "SubSecTime";

    /* renamed from: k1 */
    public static final String f8283k1 = "BodySerialNumber";

    /* renamed from: k2 */
    public static final String f8284k2 = "NewSubfileType";

    /* renamed from: k3 */
    public static final short f8285k3 = 3;
    @Deprecated

    /* renamed from: k4 */
    public static final int f8286k4 = 0;

    /* renamed from: k5 */
    public static final int f8287k5 = 34892;

    /* renamed from: k6 */
    private static final C2112d[] f8288k6 = {new C2112d(f8204a2, 256, 7), new C2112d(f8331q2, 8224, 4), new C2112d(f8339r2, 8256, 4)};

    /* renamed from: k7 */
    private static final int f8289k7 = 9;

    /* renamed from: l0 */
    public static final String f8290l0 = "SubSecTimeOriginal";

    /* renamed from: l1 */
    public static final String f8291l1 = "LensSpecification";

    /* renamed from: l2 */
    public static final String f8292l2 = "SubfileType";

    /* renamed from: l3 */
    public static final short f8293l3 = 4;
    @Deprecated

    /* renamed from: l4 */
    public static final int f8294l4 = 1;

    /* renamed from: l5 */
    public static final int[] f8295l5 = {8, 8, 8};

    /* renamed from: l6 */
    private static final C2112d[] f8296l6 = {new C2112d(f8212b2, C0986h.f4407i, 4), new C2112d(f8220c2, 258, 4)};

    /* renamed from: l7 */
    private static final int f8297l7 = 10;

    /* renamed from: m0 */
    public static final String f8298m0 = "SubSecTimeDigitized";

    /* renamed from: m1 */
    public static final String f8299m1 = "LensMake";

    /* renamed from: m2 */
    private static final String f8300m2 = "ExifIFDPointer";

    /* renamed from: m3 */
    public static final short f8301m3 = 5;

    /* renamed from: m4 */
    public static final short f8302m4 = 0;

    /* renamed from: m5 */
    public static final int[] f8303m5 = {4};

    /* renamed from: m6 */
    private static final C2112d[] f8304m6 = {new C2112d(f8228d2, 4371, 3)};

    /* renamed from: m7 */
    private static final int f8305m7 = 11;

    /* renamed from: n0 */
    public static final String f8306n0 = "ExposureTime";

    /* renamed from: n1 */
    public static final String f8307n1 = "LensModel";

    /* renamed from: n2 */
    private static final String f8308n2 = "GPSInfoIFDPointer";

    /* renamed from: n3 */
    public static final short f8309n3 = 6;

    /* renamed from: n4 */
    public static final short f8310n4 = 1;

    /* renamed from: n5 */
    public static final int[] f8311n5 = {8};

    /* renamed from: n6 */
    private static final C2112d[] f8312n6 = {new C2112d(f8194Z, 55, 3)};

    /* renamed from: n7 */
    private static final Pattern f8313n7 = Pattern.compile(".*[1-9].*");

    /* renamed from: o0 */
    public static final String f8314o0 = "FNumber";

    /* renamed from: o1 */
    public static final String f8315o1 = "LensSerialNumber";

    /* renamed from: o2 */
    private static final String f8316o2 = "InteroperabilityIFDPointer";

    /* renamed from: o3 */
    public static final short f8317o3 = 255;

    /* renamed from: o4 */
    public static final short f8318o4 = 0;

    /* renamed from: o5 */
    public static final int f8319o5 = 0;

    /* renamed from: o6 */
    static final int f8320o6 = 0;

    /* renamed from: o7 */
    private static final Pattern f8321o7 = Pattern.compile("^([0-9][0-9]):([0-9][0-9]):([0-9][0-9])$");

    /* renamed from: p0 */
    public static final String f8322p0 = "ExposureProgram";

    /* renamed from: p1 */
    public static final String f8323p1 = "GPSVersionID";

    /* renamed from: p2 */
    private static final String f8324p2 = "SubIFDPointer";

    /* renamed from: p3 */
    public static final short f8325p3 = 0;

    /* renamed from: p4 */
    public static final short f8326p4 = 1;

    /* renamed from: p5 */
    public static final int f8327p5 = 1;

    /* renamed from: p6 */
    private static final int f8328p6 = 1;

    /* renamed from: q0 */
    public static final String f8329q0 = "SpectralSensitivity";

    /* renamed from: q1 */
    public static final String f8330q1 = "GPSLatitudeRef";

    /* renamed from: q2 */
    private static final String f8331q2 = "CameraSettingsIFDPointer";

    /* renamed from: q3 */
    public static final short f8332q3 = 1;

    /* renamed from: q4 */
    public static final short f8333q4 = 2;

    /* renamed from: q5 */
    public static final int f8334q5 = 2;

    /* renamed from: q6 */
    private static final int f8335q6 = 2;

    /* renamed from: r */
    private static final String f8336r = "ExifInterface";
    @Deprecated

    /* renamed from: r0 */
    public static final String f8337r0 = "ISOSpeedRatings";

    /* renamed from: r1 */
    public static final String f8338r1 = "GPSLatitude";

    /* renamed from: r2 */
    private static final String f8339r2 = "ImageProcessingIFDPointer";

    /* renamed from: r3 */
    public static final short f8340r3 = 2;

    /* renamed from: r4 */
    public static final short f8341r4 = 3;

    /* renamed from: r5 */
    public static final int f8342r5 = 6;

    /* renamed from: r6 */
    private static final int f8343r6 = 3;

    /* renamed from: s */
    private static final boolean f8344s = false;

    /* renamed from: s0 */
    public static final String f8345s0 = "PhotographicSensitivity";

    /* renamed from: s1 */
    public static final String f8346s1 = "GPSLongitudeRef";

    /* renamed from: s2 */
    private static final String f8347s2 = "HasThumbnail";

    /* renamed from: s3 */
    public static final short f8348s3 = 3;

    /* renamed from: s4 */
    public static final short f8349s4 = 0;

    /* renamed from: s5 */
    public static final int f8350s5 = 0;

    /* renamed from: s6 */
    static final int f8351s6 = 4;

    /* renamed from: t */
    public static final String f8352t = "ImageWidth";

    /* renamed from: t0 */
    public static final String f8353t0 = "OECF";

    /* renamed from: t1 */
    public static final String f8354t1 = "GPSLongitude";

    /* renamed from: t2 */
    private static final String f8355t2 = "ThumbnailOffset";

    /* renamed from: t3 */
    public static final short f8356t3 = 4;

    /* renamed from: t4 */
    public static final short f8357t4 = 1;

    /* renamed from: t5 */
    public static final int f8358t5 = 1;

    /* renamed from: t6 */
    static final int f8359t6 = 5;

    /* renamed from: u */
    public static final String f8360u = "ImageLength";

    /* renamed from: u0 */
    public static final String f8361u0 = "SensitivityType";

    /* renamed from: u1 */
    public static final String f8362u1 = "GPSAltitudeRef";

    /* renamed from: u2 */
    private static final String f8363u2 = "ThumbnailLength";

    /* renamed from: u3 */
    public static final short f8364u3 = 9;

    /* renamed from: u4 */
    public static final short f8365u4 = 2;

    /* renamed from: u5 */
    private static final int f8366u5 = 5000;

    /* renamed from: u6 */
    private static final int f8367u6 = 6;

    /* renamed from: v */
    public static final String f8368v = "BitsPerSample";

    /* renamed from: v0 */
    public static final String f8369v0 = "StandardOutputSensitivity";

    /* renamed from: v1 */
    public static final String f8370v1 = "GPSAltitude";

    /* renamed from: v2 */
    private static final String f8371v2 = "ThumbnailData";

    /* renamed from: v3 */
    public static final short f8372v3 = 10;

    /* renamed from: v4 */
    public static final short f8373v4 = 3;

    /* renamed from: v5 */
    static final byte[] f8374v5 = {-1, f8073J6, -1};

    /* renamed from: v6 */
    private static final int f8375v6 = 7;

    /* renamed from: w */
    public static final String f8376w = "Compression";

    /* renamed from: w0 */
    public static final String f8377w0 = "RecommendedExposureIndex";

    /* renamed from: w1 */
    public static final String f8378w1 = "GPSTimeStamp";

    /* renamed from: w2 */
    private static final int f8379w2 = 512;

    /* renamed from: w3 */
    public static final short f8380w3 = 11;

    /* renamed from: w4 */
    public static final short f8381w4 = 4;

    /* renamed from: w5 */
    private static final String f8382w5 = "FUJIFILMCCD-RAW";

    /* renamed from: w6 */
    private static final int f8383w6 = 8;

    /* renamed from: x */
    public static final String f8384x = "PhotometricInterpretation";

    /* renamed from: x0 */
    public static final String f8385x0 = "ISOSpeed";

    /* renamed from: x1 */
    public static final String f8386x1 = "GPSSatellites";

    /* renamed from: x2 */
    public static final int f8387x2 = 0;

    /* renamed from: x3 */
    public static final short f8388x3 = 12;

    /* renamed from: x4 */
    public static final short f8389x4 = 0;

    /* renamed from: x5 */
    private static final int f8390x5 = 84;

    /* renamed from: x6 */
    private static final int f8391x6 = 9;

    /* renamed from: y */
    public static final String f8392y = "Orientation";

    /* renamed from: y0 */
    public static final String f8393y0 = "ISOSpeedLatitudeyyy";

    /* renamed from: y1 */
    public static final String f8394y1 = "GPSStatus";

    /* renamed from: y2 */
    public static final int f8395y2 = 1;

    /* renamed from: y3 */
    public static final short f8396y3 = 13;

    /* renamed from: y4 */
    public static final short f8397y4 = 1;

    /* renamed from: y5 */
    private static final int f8398y5 = 160;

    /* renamed from: y6 */
    static final C2112d[][] f8399y6;

    /* renamed from: z */
    public static final String f8400z = "SamplesPerPixel";

    /* renamed from: z0 */
    public static final String f8401z0 = "ISOSpeedLatitudezzz";

    /* renamed from: z1 */
    public static final String f8402z1 = "GPSMeasureMode";

    /* renamed from: z2 */
    public static final int f8403z2 = 2;

    /* renamed from: z3 */
    public static final short f8404z3 = 14;

    /* renamed from: z4 */
    public static final short f8405z4 = 2;

    /* renamed from: z5 */
    private static final int f8406z5 = 4;

    /* renamed from: z6 */
    private static final C2112d[] f8407z6 = {new C2112d(f8324p2, 330, 4), new C2112d(f8300m2, 34665, 4), new C2112d(f8308n2, 34853, 4), new C2112d(f8316o2, 40965, 4), new C2112d(f8331q2, 8224, 1), new C2112d(f8339r2, 8256, 1)};

    /* renamed from: a */
    private final String f8408a;

    /* renamed from: b */
    private final AssetInputStream f8409b;

    /* renamed from: c */
    private int f8410c;

    /* renamed from: d */
    private final HashMap<String, C2111c>[] f8411d;

    /* renamed from: e */
    private Set<Integer> f8412e;

    /* renamed from: f */
    private ByteOrder f8413f = ByteOrder.BIG_ENDIAN;

    /* renamed from: g */
    private boolean f8414g;

    /* renamed from: h */
    private int f8415h;

    /* renamed from: i */
    private int f8416i;

    /* renamed from: j */
    private byte[] f8417j;

    /* renamed from: k */
    private int f8418k;

    /* renamed from: l */
    private int f8419l;

    /* renamed from: m */
    private int f8420m;

    /* renamed from: n */
    private int f8421n;

    /* renamed from: o */
    private int f8422o;

    /* renamed from: p */
    private int f8423p;

    /* renamed from: q */
    private boolean f8424q;

    /* renamed from: b.d.b.a$a */
    /* compiled from: ExifInterface */
    private static class C2109a extends InputStream implements DataInput {

        /* renamed from: P */
        private static final ByteOrder f8425P = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: Q */
        private static final ByteOrder f8426Q = ByteOrder.BIG_ENDIAN;

        /* renamed from: N */
        final int f8427N;

        /* renamed from: O */
        int f8428O;

        /* renamed from: a */
        private DataInputStream f8429a;

        /* renamed from: b */
        private ByteOrder f8430b;

        public C2109a(InputStream inputStream) throws IOException {
            this.f8430b = ByteOrder.BIG_ENDIAN;
            this.f8429a = new DataInputStream(inputStream);
            this.f8427N = this.f8429a.available();
            this.f8428O = 0;
            this.f8429a.mark(this.f8427N);
        }

        /* renamed from: a */
        public void mo9161a(ByteOrder byteOrder) {
            this.f8430b = byteOrder;
        }

        public int available() throws IOException {
            return this.f8429a.available();
        }

        public int peek() {
            return this.f8428O;
        }

        public int read() throws IOException {
            this.f8428O++;
            return this.f8429a.read();
        }

        public boolean readBoolean() throws IOException {
            this.f8428O++;
            return this.f8429a.readBoolean();
        }

        public byte readByte() throws IOException {
            this.f8428O++;
            if (this.f8428O <= this.f8427N) {
                int read = this.f8429a.read();
                if (read >= 0) {
                    return (byte) read;
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public char readChar() throws IOException {
            this.f8428O += 2;
            return this.f8429a.readChar();
        }

        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        public void readFully(byte[] bArr, int i, int i2) throws IOException {
            this.f8428O += i2;
            if (this.f8428O > this.f8427N) {
                throw new EOFException();
            } else if (this.f8429a.read(bArr, i, i2) != i2) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public int readInt() throws IOException {
            this.f8428O += 4;
            if (this.f8428O <= this.f8427N) {
                int read = this.f8429a.read();
                int read2 = this.f8429a.read();
                int read3 = this.f8429a.read();
                int read4 = this.f8429a.read();
                if ((read | read2 | read3 | read4) >= 0) {
                    ByteOrder byteOrder = this.f8430b;
                    if (byteOrder == f8425P) {
                        return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                    }
                    if (byteOrder == f8426Q) {
                        return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid byte order: ");
                    sb.append(this.f8430b);
                    throw new IOException(sb.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readLine() throws IOException {
            return null;
        }

        public long readLong() throws IOException {
            this.f8428O += 8;
            if (this.f8428O <= this.f8427N) {
                int read = this.f8429a.read();
                int read2 = this.f8429a.read();
                int read3 = this.f8429a.read();
                int read4 = this.f8429a.read();
                int read5 = this.f8429a.read();
                int read6 = this.f8429a.read();
                int read7 = this.f8429a.read();
                int read8 = this.f8429a.read();
                if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                    ByteOrder byteOrder = this.f8430b;
                    if (byteOrder == f8425P) {
                        return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                    }
                    int i = read2;
                    if (byteOrder == f8426Q) {
                        return (((long) read) << 56) + (((long) i) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid byte order: ");
                    sb.append(this.f8430b);
                    throw new IOException(sb.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public short readShort() throws IOException {
            this.f8428O += 2;
            if (this.f8428O <= this.f8427N) {
                int read = this.f8429a.read();
                int read2 = this.f8429a.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f8430b;
                    if (byteOrder == f8425P) {
                        return (short) ((read2 << 8) + read);
                    }
                    if (byteOrder == f8426Q) {
                        return (short) ((read << 8) + read2);
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid byte order: ");
                    sb.append(this.f8430b);
                    throw new IOException(sb.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public String readUTF() throws IOException {
            this.f8428O += 2;
            return this.f8429a.readUTF();
        }

        public int readUnsignedByte() throws IOException {
            this.f8428O++;
            return this.f8429a.readUnsignedByte();
        }

        public int readUnsignedShort() throws IOException {
            this.f8428O += 2;
            if (this.f8428O <= this.f8427N) {
                int read = this.f8429a.read();
                int read2 = this.f8429a.read();
                if ((read | read2) >= 0) {
                    ByteOrder byteOrder = this.f8430b;
                    if (byteOrder == f8425P) {
                        return (read2 << 8) + read;
                    }
                    if (byteOrder == f8426Q) {
                        return (read << 8) + read2;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid byte order: ");
                    sb.append(this.f8430b);
                    throw new IOException(sb.toString());
                }
                throw new EOFException();
            }
            throw new EOFException();
        }

        public int skipBytes(int i) throws IOException {
            int min = Math.min(i, this.f8427N - this.f8428O);
            int i2 = 0;
            while (i2 < min) {
                i2 += this.f8429a.skipBytes(min - i2);
            }
            this.f8428O += i2;
            return i2;
        }

        /* renamed from: a */
        public void mo9160a(long j) throws IOException {
            int i = this.f8428O;
            if (((long) i) > j) {
                this.f8428O = 0;
                this.f8429a.reset();
                this.f8429a.mark(this.f8427N);
            } else {
                j -= (long) i;
            }
            int i2 = (int) j;
            if (skipBytes(i2) != i2) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = this.f8429a.read(bArr, i, i2);
            this.f8428O += read;
            return read;
        }

        public void readFully(byte[] bArr) throws IOException {
            this.f8428O += bArr.length;
            if (this.f8428O > this.f8427N) {
                throw new EOFException();
            } else if (this.f8429a.read(bArr, 0, bArr.length) != bArr.length) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        public C2109a(byte[] bArr) throws IOException {
            this((InputStream) new ByteArrayInputStream(bArr));
        }

        /* renamed from: a */
        public long mo9159a() throws IOException {
            return ((long) readInt()) & 4294967295L;
        }
    }

    /* renamed from: b.d.b.a$b */
    /* compiled from: ExifInterface */
    private static class C2110b extends FilterOutputStream {

        /* renamed from: a */
        private final OutputStream f8431a;

        /* renamed from: b */
        private ByteOrder f8432b;

        public C2110b(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f8431a = outputStream;
            this.f8432b = byteOrder;
        }

        /* renamed from: a */
        public void mo9183a(ByteOrder byteOrder) {
            this.f8432b = byteOrder;
        }

        public void write(byte[] bArr) throws IOException {
            this.f8431a.write(bArr);
        }

        public void writeByte(int i) throws IOException {
            this.f8431a.write(i);
        }

        public void writeInt(int i) throws IOException {
            ByteOrder byteOrder = this.f8432b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f8431a.write((i >>> 0) & 255);
                this.f8431a.write((i >>> 8) & 255);
                this.f8431a.write((i >>> 16) & 255);
                this.f8431a.write((i >>> 24) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f8431a.write((i >>> 24) & 255);
                this.f8431a.write((i >>> 16) & 255);
                this.f8431a.write((i >>> 8) & 255);
                this.f8431a.write((i >>> 0) & 255);
            }
        }

        /* renamed from: a */
        public void mo9184a(short s) throws IOException {
            ByteOrder byteOrder = this.f8432b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f8431a.write((s >>> 0) & 255);
                this.f8431a.write((s >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f8431a.write((s >>> 8) & 255);
                this.f8431a.write((s >>> 0) & 255);
            }
        }

        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f8431a.write(bArr, i, i2);
        }

        /* renamed from: a */
        public void mo9181a(int i) throws IOException {
            mo9184a((short) i);
        }

        /* renamed from: a */
        public void mo9182a(long j) throws IOException {
            writeInt((int) j);
        }
    }

    /* renamed from: b.d.b.a$c */
    /* compiled from: ExifInterface */
    private static class C2111c {

        /* renamed from: a */
        public final int f8433a;

        /* renamed from: b */
        public final int f8434b;

        /* renamed from: c */
        public final byte[] f8435c;

        C2111c(int i, int i2, byte[] bArr) {
            this.f8433a = i;
            this.f8434b = i2;
            this.f8435c = bArr;
        }

        /* renamed from: a */
        public static C2111c m11051a(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C2108a.f8224c6[4] * jArr.length)]);
            wrap.order(byteOrder);
            for (long j : jArr) {
                wrap.putInt((int) j);
            }
            return new C2111c(4, jArr.length, wrap.array());
        }

        /* renamed from: b */
        public static C2111c m11056b(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C2108a.f8224c6[3] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i : iArr) {
                wrap.putShort((short) i);
            }
            return new C2111c(3, iArr.length, wrap.array());
        }

        /* renamed from: c */
        public String mo9192c(ByteOrder byteOrder) {
            Object d = mo9193d(byteOrder);
            if (d == null) {
                return null;
            }
            if (d instanceof String) {
                return (String) d;
            }
            StringBuilder sb = new StringBuilder();
            String str = ",";
            int i = 0;
            if (d instanceof long[]) {
                long[] jArr = (long[]) d;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(str);
                    }
                }
                return sb.toString();
            } else if (d instanceof int[]) {
                int[] iArr = (int[]) d;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(str);
                    }
                }
                return sb.toString();
            } else if (d instanceof double[]) {
                double[] dArr = (double[]) d;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(str);
                    }
                }
                return sb.toString();
            } else if (!(d instanceof C2114f[])) {
                return null;
            } else {
                C2114f[] fVarArr = (C2114f[]) d;
                while (i < fVarArr.length) {
                    sb.append(fVarArr[i].f8440a);
                    sb.append('/');
                    sb.append(fVarArr[i].f8441b);
                    i++;
                    if (i != fVarArr.length) {
                        sb.append(str);
                    }
                }
                return sb.toString();
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:140:0x0157 A[SYNTHETIC, Splitter:B:140:0x0157] */
        /* JADX WARNING: Removed duplicated region for block: B:148:0x015e A[SYNTHETIC, Splitter:B:148:0x015e] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object mo9193d(java.nio.ByteOrder r9) {
            /*
                r8 = this;
                r0 = 0
                b.d.b.a$a r1 = new b.d.b.a$a     // Catch:{ IOException -> 0x015b, all -> 0x0153 }
                byte[] r2 = r8.f8435c     // Catch:{ IOException -> 0x015b, all -> 0x0153 }
                r1.<init>(r2)     // Catch:{ IOException -> 0x015b, all -> 0x0153 }
                r1.mo9161a(r9)     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int r9 = r8.f8433a     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r2 = 1
                r3 = 0
                switch(r9) {
                    case 1: goto L_0x011b;
                    case 2: goto L_0x00d1;
                    case 3: goto L_0x00bc;
                    case 4: goto L_0x00a7;
                    case 5: goto L_0x0089;
                    case 6: goto L_0x011b;
                    case 7: goto L_0x00d1;
                    case 8: goto L_0x0074;
                    case 9: goto L_0x005f;
                    case 10: goto L_0x003f;
                    case 11: goto L_0x0029;
                    case 12: goto L_0x0014;
                    default: goto L_0x0012;
                }     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
            L_0x0012:
                goto L_0x014d
            L_0x0014:
                int r9 = r8.f8434b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                double[] r9 = new double[r9]     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
            L_0x0018:
                int r2 = r8.f8434b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                if (r3 >= r2) goto L_0x0025
                double r4 = r1.readDouble()     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r9[r3] = r4     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int r3 = r3 + 1
                goto L_0x0018
            L_0x0025:
                r1.close()     // Catch:{ IOException -> 0x0028 }
            L_0x0028:
                return r9
            L_0x0029:
                int r9 = r8.f8434b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                double[] r9 = new double[r9]     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
            L_0x002d:
                int r2 = r8.f8434b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                if (r3 >= r2) goto L_0x003b
                float r2 = r1.readFloat()     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                double r4 = (double) r2     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r9[r3] = r4     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int r3 = r3 + 1
                goto L_0x002d
            L_0x003b:
                r1.close()     // Catch:{ IOException -> 0x003e }
            L_0x003e:
                return r9
            L_0x003f:
                int r9 = r8.f8434b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                b.d.b.a$f[] r9 = new p053b.p063d.p064b.C2108a.C2114f[r9]     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
            L_0x0043:
                int r2 = r8.f8434b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                if (r3 >= r2) goto L_0x005b
                int r2 = r1.readInt()     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                long r4 = (long) r2     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int r2 = r1.readInt()     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                long r6 = (long) r2     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                b.d.b.a$f r2 = new b.d.b.a$f     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r2.<init>(r4, r6)     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r9[r3] = r2     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int r3 = r3 + 1
                goto L_0x0043
            L_0x005b:
                r1.close()     // Catch:{ IOException -> 0x005e }
            L_0x005e:
                return r9
            L_0x005f:
                int r9 = r8.f8434b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int[] r9 = new int[r9]     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
            L_0x0063:
                int r2 = r8.f8434b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                if (r3 >= r2) goto L_0x0070
                int r2 = r1.readInt()     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r9[r3] = r2     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int r3 = r3 + 1
                goto L_0x0063
            L_0x0070:
                r1.close()     // Catch:{ IOException -> 0x0073 }
            L_0x0073:
                return r9
            L_0x0074:
                int r9 = r8.f8434b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int[] r9 = new int[r9]     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
            L_0x0078:
                int r2 = r8.f8434b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                if (r3 >= r2) goto L_0x0085
                short r2 = r1.readShort()     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r9[r3] = r2     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int r3 = r3 + 1
                goto L_0x0078
            L_0x0085:
                r1.close()     // Catch:{ IOException -> 0x0088 }
            L_0x0088:
                return r9
            L_0x0089:
                int r9 = r8.f8434b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                b.d.b.a$f[] r9 = new p053b.p063d.p064b.C2108a.C2114f[r9]     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
            L_0x008d:
                int r2 = r8.f8434b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                if (r3 >= r2) goto L_0x00a3
                long r4 = r1.mo9159a()     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                long r6 = r1.mo9159a()     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                b.d.b.a$f r2 = new b.d.b.a$f     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r2.<init>(r4, r6)     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r9[r3] = r2     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int r3 = r3 + 1
                goto L_0x008d
            L_0x00a3:
                r1.close()     // Catch:{ IOException -> 0x00a6 }
            L_0x00a6:
                return r9
            L_0x00a7:
                int r9 = r8.f8434b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                long[] r9 = new long[r9]     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
            L_0x00ab:
                int r2 = r8.f8434b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                if (r3 >= r2) goto L_0x00b8
                long r4 = r1.mo9159a()     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r9[r3] = r4     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int r3 = r3 + 1
                goto L_0x00ab
            L_0x00b8:
                r1.close()     // Catch:{ IOException -> 0x00bb }
            L_0x00bb:
                return r9
            L_0x00bc:
                int r9 = r8.f8434b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int[] r9 = new int[r9]     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
            L_0x00c0:
                int r2 = r8.f8434b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                if (r3 >= r2) goto L_0x00cd
                int r2 = r1.readUnsignedShort()     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r9[r3] = r2     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int r3 = r3 + 1
                goto L_0x00c0
            L_0x00cd:
                r1.close()     // Catch:{ IOException -> 0x00d0 }
            L_0x00d0:
                return r9
            L_0x00d1:
                int r9 = r8.f8434b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                byte[] r4 = p053b.p063d.p064b.C2108a.f8232d6     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int r4 = r4.length     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                if (r9 < r4) goto L_0x00f2
                r9 = 0
            L_0x00d9:
                byte[] r4 = p053b.p063d.p064b.C2108a.f8232d6     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int r4 = r4.length     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                if (r9 >= r4) goto L_0x00ed
                byte[] r4 = r8.f8435c     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                byte r4 = r4[r9]     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                byte[] r5 = p053b.p063d.p064b.C2108a.f8232d6     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                byte r5 = r5[r9]     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                if (r4 == r5) goto L_0x00ea
                r2 = 0
                goto L_0x00ed
            L_0x00ea:
                int r9 = r9 + 1
                goto L_0x00d9
            L_0x00ed:
                if (r2 == 0) goto L_0x00f2
                byte[] r9 = p053b.p063d.p064b.C2108a.f8232d6     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int r3 = r9.length     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
            L_0x00f2:
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r9.<init>()     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
            L_0x00f7:
                int r2 = r8.f8434b     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                if (r3 >= r2) goto L_0x0113
                byte[] r2 = r8.f8435c     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                byte r2 = r2[r3]     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                if (r2 != 0) goto L_0x0102
                goto L_0x0113
            L_0x0102:
                r4 = 32
                if (r2 < r4) goto L_0x010b
                char r2 = (char) r2     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r9.append(r2)     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                goto L_0x0110
            L_0x010b:
                r2 = 63
                r9.append(r2)     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
            L_0x0110:
                int r3 = r3 + 1
                goto L_0x00f7
            L_0x0113:
                java.lang.String r9 = r9.toString()     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r1.close()     // Catch:{ IOException -> 0x011a }
            L_0x011a:
                return r9
            L_0x011b:
                byte[] r9 = r8.f8435c     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int r9 = r9.length     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                if (r9 != r2) goto L_0x0140
                byte[] r9 = r8.f8435c     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                byte r9 = r9[r3]     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                if (r9 < 0) goto L_0x0140
                byte[] r9 = r8.f8435c     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                byte r9 = r9[r3]     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                if (r9 > r2) goto L_0x0140
                java.lang.String r9 = new java.lang.String     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                char[] r2 = new char[r2]     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                byte[] r4 = r8.f8435c     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                byte r4 = r4[r3]     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                int r4 = r4 + 48
                char r4 = (char) r4     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r2[r3] = r4     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r9.<init>(r2)     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r1.close()     // Catch:{ IOException -> 0x013f }
            L_0x013f:
                return r9
            L_0x0140:
                java.lang.String r9 = new java.lang.String     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                byte[] r2 = r8.f8435c     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                java.nio.charset.Charset r3 = p053b.p063d.p064b.C2108a.f8049G6     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r9.<init>(r2, r3)     // Catch:{ IOException -> 0x015c, all -> 0x0151 }
                r1.close()     // Catch:{ IOException -> 0x014c }
            L_0x014c:
                return r9
            L_0x014d:
                r1.close()     // Catch:{ IOException -> 0x0150 }
            L_0x0150:
                return r0
            L_0x0151:
                r9 = move-exception
                goto L_0x0155
            L_0x0153:
                r9 = move-exception
                r1 = r0
            L_0x0155:
                if (r1 == 0) goto L_0x015a
                r1.close()     // Catch:{ IOException -> 0x015a }
            L_0x015a:
                throw r9
            L_0x015b:
                r1 = r0
            L_0x015c:
                if (r1 == 0) goto L_0x0161
                r1.close()     // Catch:{ IOException -> 0x0161 }
            L_0x0161:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p053b.p063d.p064b.C2108a.C2111c.mo9193d(java.nio.ByteOrder):java.lang.Object");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("(");
            sb.append(C2108a.f8216b6[this.f8433a]);
            sb.append(", data length:");
            sb.append(this.f8435c.length);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: a */
        public static C2111c m11046a(long j, ByteOrder byteOrder) {
            return m11051a(new long[]{j}, byteOrder);
        }

        /* renamed from: b */
        public static C2111c m11053b(int i, ByteOrder byteOrder) {
            return m11056b(new int[]{i}, byteOrder);
        }

        /* renamed from: a */
        public static C2111c m11050a(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C2108a.f8224c6[9] * iArr.length)]);
            wrap.order(byteOrder);
            for (int putInt : iArr) {
                wrap.putInt(putInt);
            }
            return new C2111c(9, iArr.length, wrap.array());
        }

        /* renamed from: b */
        public static C2111c m11055b(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(0);
            byte[] bytes = sb.toString().getBytes(C2108a.f8049G6);
            return new C2111c(2, bytes.length, bytes);
        }

        /* renamed from: b */
        public static C2111c m11057b(C2114f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C2108a.f8224c6[5] * fVarArr.length)]);
            wrap.order(byteOrder);
            for (C2114f fVar : fVarArr) {
                wrap.putInt((int) fVar.f8440a);
                wrap.putInt((int) fVar.f8441b);
            }
            return new C2111c(5, fVarArr.length, wrap.array());
        }

        /* renamed from: a */
        public static C2111c m11045a(int i, ByteOrder byteOrder) {
            return m11050a(new int[]{i}, byteOrder);
        }

        /* renamed from: a */
        public static C2111c m11048a(String str) {
            if (str.length() != 1 || str.charAt(0) < '0' || str.charAt(0) > '1') {
                byte[] bytes = str.getBytes(C2108a.f8049G6);
                return new C2111c(1, bytes.length, bytes);
            }
            byte[] bArr = {(byte) (str.charAt(0) - '0')};
            return new C2111c(1, bArr.length, bArr);
        }

        /* renamed from: b */
        public static C2111c m11054b(C2114f fVar, ByteOrder byteOrder) {
            return m11057b(new C2114f[]{fVar}, byteOrder);
        }

        /* renamed from: b */
        public int mo9191b(ByteOrder byteOrder) {
            Object d = mo9193d(byteOrder);
            if (d == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (d instanceof String) {
                return Integer.parseInt((String) d);
            } else {
                String str = "There are more than one component";
                if (d instanceof long[]) {
                    long[] jArr = (long[]) d;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException(str);
                } else if (d instanceof int[]) {
                    int[] iArr = (int[]) d;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException(str);
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        /* renamed from: a */
        public static C2111c m11052a(C2114f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C2108a.f8224c6[10] * fVarArr.length)]);
            wrap.order(byteOrder);
            for (C2114f fVar : fVarArr) {
                wrap.putInt((int) fVar.f8440a);
                wrap.putInt((int) fVar.f8441b);
            }
            return new C2111c(10, fVarArr.length, wrap.array());
        }

        /* renamed from: a */
        public static C2111c m11047a(C2114f fVar, ByteOrder byteOrder) {
            return m11052a(new C2114f[]{fVar}, byteOrder);
        }

        /* renamed from: a */
        public static C2111c m11049a(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(C2108a.f8224c6[12] * dArr.length)]);
            wrap.order(byteOrder);
            for (double putDouble : dArr) {
                wrap.putDouble(putDouble);
            }
            return new C2111c(12, dArr.length, wrap.array());
        }

        /* renamed from: a */
        public static C2111c m11044a(double d, ByteOrder byteOrder) {
            return m11049a(new double[]{d}, byteOrder);
        }

        /* renamed from: a */
        public double mo9189a(ByteOrder byteOrder) {
            Object d = mo9193d(byteOrder);
            if (d == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (d instanceof String) {
                return Double.parseDouble((String) d);
            } else {
                String str = "There are more than one component";
                if (d instanceof long[]) {
                    long[] jArr = (long[]) d;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException(str);
                } else if (d instanceof int[]) {
                    int[] iArr = (int[]) d;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException(str);
                } else if (d instanceof double[]) {
                    double[] dArr = (double[]) d;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException(str);
                } else if (d instanceof C2114f[]) {
                    C2114f[] fVarArr = (C2114f[]) d;
                    if (fVarArr.length == 1) {
                        return fVarArr[0].mo9196a();
                    }
                    throw new NumberFormatException(str);
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        /* renamed from: a */
        public int mo9190a() {
            return C2108a.f8224c6[this.f8433a] * this.f8434b;
        }
    }

    /* renamed from: b.d.b.a$d */
    /* compiled from: ExifInterface */
    static class C2112d {

        /* renamed from: a */
        public final int f8436a;

        /* renamed from: b */
        public final String f8437b;

        /* renamed from: c */
        public final int f8438c;

        /* renamed from: d */
        public final int f8439d;

        C2112d(String str, int i, int i2) {
            this.f8437b = str;
            this.f8436a = i;
            this.f8438c = i2;
            this.f8439d = -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo9195a(int i) {
            int i2 = this.f8438c;
            if (!(i2 == 7 || i == 7 || i2 == i)) {
                int i3 = this.f8439d;
                if (i3 != i) {
                    if ((i2 == 4 || i3 == 4) && i == 3) {
                        return true;
                    }
                    if ((this.f8438c == 9 || this.f8439d == 9) && i == 8) {
                        return true;
                    }
                    if ((this.f8438c == 12 || this.f8439d == 12) && i == 11) {
                        return true;
                    }
                    return false;
                }
            }
            return true;
        }

        C2112d(String str, int i, int i2, int i3) {
            this.f8437b = str;
            this.f8436a = i;
            this.f8438c = i2;
            this.f8439d = i3;
        }
    }

    @C0207n0({C0208a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: b.d.b.a$e */
    /* compiled from: ExifInterface */
    public @interface C2113e {
    }

    /* renamed from: b.d.b.a$f */
    /* compiled from: ExifInterface */
    private static class C2114f {

        /* renamed from: a */
        public final long f8440a;

        /* renamed from: b */
        public final long f8441b;

        C2114f(double d) {
            this((long) (d * 10000.0d), 10000);
        }

        /* renamed from: a */
        public double mo9196a() {
            double d = (double) this.f8440a;
            double d2 = (double) this.f8441b;
            Double.isNaN(d);
            Double.isNaN(d2);
            return d / d2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f8440a);
            sb.append("/");
            sb.append(this.f8441b);
            return sb.toString();
        }

        C2114f(long j, long j2) {
            if (j2 == 0) {
                this.f8440a = 0;
                this.f8441b = 1;
                return;
            }
            this.f8440a = j;
            this.f8441b = j2;
        }
    }

    static {
        C2112d[] dVarArr;
        Integer valueOf = Integer.valueOf(1);
        Integer valueOf2 = Integer.valueOf(3);
        Integer valueOf3 = Integer.valueOf(2);
        Integer valueOf4 = Integer.valueOf(8);
        f8045G2 = Arrays.asList(new Integer[]{valueOf, Integer.valueOf(6), valueOf2, valueOf4});
        Integer valueOf5 = Integer.valueOf(7);
        Integer valueOf6 = Integer.valueOf(5);
        f8053H2 = Arrays.asList(new Integer[]{valueOf3, valueOf5, Integer.valueOf(4), valueOf6});
        C2112d[] dVarArr2 = f8240e6;
        f8399y6 = new C2112d[][]{dVarArr2, f8248f6, f8256g6, f8264h6, f8272i6, dVarArr2, f8288k6, f8296l6, f8304m6, f8312n6};
        C2112d[][] dVarArr3 = f8399y6;
        f8017C6 = new HashMap[dVarArr3.length];
        f8025D6 = new HashMap[dVarArr3.length];
        f8072J5.setTimeZone(TimeZone.getTimeZone("UTC"));
        for (int i = 0; i < f8399y6.length; i++) {
            f8017C6[i] = new HashMap<>();
            f8025D6[i] = new HashMap<>();
            for (C2112d dVar : f8399y6[i]) {
                f8017C6[i].put(Integer.valueOf(dVar.f8436a), dVar);
                f8025D6[i].put(dVar.f8437b, dVar);
            }
        }
        f8041F6.put(Integer.valueOf(f8407z6[0].f8436a), valueOf6);
        f8041F6.put(Integer.valueOf(f8407z6[1].f8436a), valueOf);
        f8041F6.put(Integer.valueOf(f8407z6[2].f8436a), valueOf3);
        f8041F6.put(Integer.valueOf(f8407z6[3].f8436a), valueOf2);
        f8041F6.put(Integer.valueOf(f8407z6[4].f8436a), valueOf5);
        f8041F6.put(Integer.valueOf(f8407z6[5].f8436a), valueOf4);
    }

    public C2108a(@C0193h0 String str) throws IOException {
        C2112d[][] dVarArr = f8399y6;
        this.f8411d = new HashMap[dVarArr.length];
        this.f8412e = new HashSet(dVarArr.length);
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.f8409b = null;
            this.f8408a = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    m10983a((InputStream) fileInputStream2);
                    m10982a((Closeable) fileInputStream2);
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    m10982a((Closeable) fileInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                m10982a((Closeable) fileInputStream);
                throw th;
            }
        } else {
            throw new IllegalArgumentException("filename cannot be null");
        }
    }

    @C0195i0
    /* renamed from: b */
    private C2111c m10990b(@C0193h0 String str) {
        if (f8337r0.equals(str)) {
            str = f8345s0;
        }
        for (int i = 0; i < f8399y6.length; i++) {
            C2111c cVar = (C2111c) this.f8411d[i].get(str);
            if (cVar != null) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: d */
    private void m11005d(String str) {
        for (int i = 0; i < f8399y6.length; i++) {
            this.f8411d[i].remove(str);
        }
    }

    /* renamed from: p */
    private void m11009p() {
        String a = mo9136a(f8266i0);
        if (a != null) {
            String str = f8122Q;
            if (mo9136a(str) == null) {
                this.f8411d[0].put(str, C2111c.m11055b(a));
            }
        }
        String str2 = f8352t;
        if (mo9136a(str2) == null) {
            this.f8411d[0].put(str2, C2111c.m11046a(0, this.f8413f));
        }
        String str3 = f8360u;
        if (mo9136a(str3) == null) {
            this.f8411d[0].put(str3, C2111c.m11046a(0, this.f8413f));
        }
        String str4 = f8392y;
        if (mo9136a(str4) == null) {
            this.f8411d[0].put(str4, C2111c.m11046a(0, this.f8413f));
        }
        String str5 = f8051H0;
        if (mo9136a(str5) == null) {
            this.f8411d[1].put(str5, C2111c.m11046a(0, this.f8413f));
        }
    }

    /* renamed from: q */
    private void m11010q() {
        for (int i = 0; i < this.f8411d.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("The size of tag group[");
            sb.append(i);
            sb.append("]: ");
            sb.append(this.f8411d[i].size());
            sb.toString();
            for (Entry entry : this.f8411d[i].entrySet()) {
                C2111c cVar = (C2111c) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("tagName: ");
                sb2.append((String) entry.getKey());
                sb2.append(", tagType: ");
                sb2.append(cVar.toString());
                sb2.append(", tagValue: '");
                sb2.append(cVar.mo9192c(this.f8413f));
                sb2.append("'");
                sb2.toString();
            }
        }
    }

    @C0195i0
    /* renamed from: a */
    public String mo9136a(@C0193h0 String str) {
        C2111c b = m10990b(str);
        if (b != null) {
            if (!f8033E6.contains(str)) {
                return b.mo9192c(this.f8413f);
            }
            if (str.equals(f8378w1)) {
                int i = b.f8433a;
                if (i == 5 || i == 10) {
                    C2114f[] fVarArr = (C2114f[]) b.mo9193d(this.f8413f);
                    if (fVarArr == null || fVarArr.length != 3) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid GPS Timestamp array. array=");
                        sb.append(Arrays.toString(fVarArr));
                        sb.toString();
                        return null;
                    }
                    return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf((int) (((float) fVarArr[0].f8440a) / ((float) fVarArr[0].f8441b))), Integer.valueOf((int) (((float) fVarArr[1].f8440a) / ((float) fVarArr[1].f8441b))), Integer.valueOf((int) (((float) fVarArr[2].f8440a) / ((float) fVarArr[2].f8441b)))});
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("GPS Timestamp format is not rational. format=");
                sb2.append(b.f8433a);
                sb2.toString();
                return null;
            }
            try {
                return Double.toString(b.mo9189a(this.f8413f));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    @C0207n0({C0208a.LIBRARY})
    /* renamed from: c */
    public long mo9146c() {
        String a = mo9136a(f8122Q);
        if (a != null && f8313n7.matcher(a).matches()) {
            try {
                Date parse = f8072J5.parse(a, new ParsePosition(0));
                if (parse == null) {
                    return -1;
                }
                long time = parse.getTime();
                String a2 = mo9136a(f8282k0);
                if (a2 != null) {
                    try {
                        long parseLong = Long.parseLong(a2);
                        while (parseLong > 1000) {
                            parseLong /= 10;
                        }
                        time += parseLong;
                    } catch (NumberFormatException unused) {
                    }
                }
                return time;
            } catch (IllegalArgumentException unused2) {
            }
        }
        return -1;
    }

    @C0195i0
    /* renamed from: e */
    public double[] mo9148e() {
        String a = mo9136a(f8338r1);
        String a2 = mo9136a(f8330q1);
        String a3 = mo9136a(f8354t1);
        String a4 = mo9136a(f8346s1);
        if (!(a == null || a2 == null || a3 == null || a4 == null)) {
            try {
                return new double[]{m10989b(a, a2), m10989b(a3, a4)};
            } catch (IllegalArgumentException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Latitude/longitude values are not parseable. ");
                sb.append(String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", new Object[]{a, a2, a3, a4}));
                sb.toString();
            }
        }
        return null;
    }

    /* renamed from: f */
    public int mo9149f() {
        switch (mo9135a(f8392y, 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return RotationOptions.ROTATE_270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    @C0195i0
    /* renamed from: g */
    public byte[] mo9150g() {
        int i = this.f8418k;
        if (i == 6 || i == 7) {
            return mo9152i();
        }
        return null;
    }

    @C0195i0
    /* renamed from: h */
    public Bitmap mo9151h() {
        if (!this.f8414g) {
            return null;
        }
        if (this.f8417j == null) {
            this.f8417j = mo9152i();
        }
        int i = this.f8418k;
        if (i == 6 || i == 7) {
            return BitmapFactory.decodeByteArray(this.f8417j, 0, this.f8416i);
        }
        if (i == 1) {
            int[] iArr = new int[(this.f8417j.length / 3)];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                byte[] bArr = this.f8417j;
                int i3 = i2 * 3;
                iArr[i2] = (bArr[i3] << 16) + 0 + (bArr[i3 + 1] << 8) + bArr[i3 + 2];
            }
            C2111c cVar = (C2111c) this.f8411d[4].get(f8360u);
            C2111c cVar2 = (C2111c) this.f8411d[4].get(f8352t);
            if (!(cVar == null || cVar2 == null)) {
                return Bitmap.createBitmap(iArr, cVar2.mo9191b(this.f8413f), cVar.mo9191b(this.f8413f), Config.ARGB_8888);
            }
        }
        return null;
    }

    @C0195i0
    /* renamed from: i */
    public byte[] mo9152i() {
        InputStream inputStream;
        Throwable th;
        if (!this.f8414g) {
            return null;
        }
        byte[] bArr = this.f8417j;
        if (bArr != null) {
            return bArr;
        }
        try {
            if (this.f8409b != null) {
                inputStream = this.f8409b;
                try {
                    if (inputStream.markSupported()) {
                        inputStream.reset();
                    } else {
                        m10982a((Closeable) inputStream);
                        return null;
                    }
                } catch (IOException unused) {
                    m10982a((Closeable) inputStream);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    m10982a((Closeable) inputStream);
                    throw th;
                }
            } else {
                inputStream = this.f8408a != null ? new FileInputStream(this.f8408a) : null;
            }
            if (inputStream != null) {
                String str = "Corrupted image";
                if (inputStream.skip((long) this.f8415h) == ((long) this.f8415h)) {
                    byte[] bArr2 = new byte[this.f8416i];
                    if (inputStream.read(bArr2) == this.f8416i) {
                        this.f8417j = bArr2;
                        m10982a((Closeable) inputStream);
                        return bArr2;
                    }
                    throw new IOException(str);
                }
                throw new IOException(str);
            }
            throw new FileNotFoundException();
        } catch (IOException unused2) {
            inputStream = null;
            m10982a((Closeable) inputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            m10982a((Closeable) inputStream);
            throw th;
        }
    }

    @C0195i0
    /* renamed from: j */
    public long[] mo9153j() {
        if (!this.f8414g) {
            return null;
        }
        return new long[]{(long) this.f8415h, (long) this.f8416i};
    }

    /* renamed from: k */
    public boolean mo9154k() {
        return this.f8414g;
    }

    /* renamed from: l */
    public boolean mo9155l() {
        int a = mo9135a(f8392y, 1);
        return a == 2 || a == 7 || a == 4 || a == 5;
    }

    /* renamed from: m */
    public boolean mo9156m() {
        int i = this.f8418k;
        return i == 6 || i == 7;
    }

    /* renamed from: n */
    public void mo9157n() {
        mo9142a(f8392y, Integer.toString(1));
    }

    /* renamed from: o */
    public void mo9158o() throws IOException {
        Throwable th;
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        if (!this.f8424q || this.f8410c != 4) {
            throw new IOException("ExifInterface only supports saving attributes on JPEG formats.");
        } else if (this.f8408a != null) {
            this.f8417j = mo9150g();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f8408a);
            sb.append(FileType.TEMP);
            File file = new File(sb.toString());
            if (new File(this.f8408a).renameTo(file)) {
                FileOutputStream fileOutputStream2 = null;
                try {
                    fileInputStream = new FileInputStream(file);
                    try {
                        fileOutputStream = new FileOutputStream(this.f8408a);
                    } catch (Throwable th2) {
                        th = th2;
                        m10982a((Closeable) fileInputStream);
                        m10982a((Closeable) fileOutputStream2);
                        file.delete();
                        throw th;
                    }
                    try {
                        m10995b((InputStream) fileInputStream, (OutputStream) fileOutputStream);
                        m10982a((Closeable) fileInputStream);
                        m10982a((Closeable) fileOutputStream);
                        file.delete();
                        this.f8417j = null;
                    } catch (Throwable th3) {
                        FileOutputStream fileOutputStream3 = fileOutputStream;
                        th = th3;
                        fileOutputStream2 = fileOutputStream3;
                        m10982a((Closeable) fileInputStream);
                        m10982a((Closeable) fileOutputStream2);
                        file.delete();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    fileInputStream = null;
                    m10982a((Closeable) fileInputStream);
                    m10982a((Closeable) fileOutputStream2);
                    file.delete();
                    throw th;
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Could not rename to ");
                sb2.append(file.getAbsolutePath());
                throw new IOException(sb2.toString());
            }
        } else {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
    }

    /* renamed from: f */
    private void m11008f(C2109a aVar) throws IOException {
        HashMap<String, C2111c> hashMap = this.f8411d[4];
        C2111c cVar = (C2111c) hashMap.get(f8376w);
        if (cVar != null) {
            this.f8418k = cVar.mo9191b(this.f8413f);
            int i = this.f8418k;
            if (i != 1) {
                if (i == 6) {
                    m10981a(aVar, (HashMap) hashMap);
                    return;
                } else if (i != 7) {
                    return;
                }
            }
            if (m10986a((HashMap) hashMap)) {
                m10993b(aVar, (HashMap) hashMap);
                return;
            }
            return;
        }
        this.f8418k = 6;
        m10981a(aVar, (HashMap) hashMap);
    }

    @C0207n0({C0208a.LIBRARY})
    /* renamed from: d */
    public long mo9147d() {
        String a = mo9136a(f8140S1);
        String a2 = mo9136a(f8378w1);
        if (!(a == null || a2 == null || (!f8313n7.matcher(a).matches() && !f8313n7.matcher(a2).matches()))) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append(' ');
            sb.append(a2);
            try {
                Date parse = f8072J5.parse(sb.toString(), new ParsePosition(0));
                if (parse == null) {
                    return -1;
                }
                return parse.getTime();
            } catch (IllegalArgumentException unused) {
            }
        }
        return -1;
    }

    /* renamed from: b */
    public void mo9144b() {
        int i = 1;
        String str = f8392y;
        switch (mo9135a(str, 1)) {
            case 1:
                i = 4;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                break;
            case 5:
                i = 8;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 5;
                break;
            default:
                i = 0;
                break;
        }
        mo9142a(str, Integer.toString(i));
    }

    /* renamed from: b */
    public void mo9145b(double d) {
        String str = d >= 0.0d ? AppEventsConstants.EVENT_PARAM_VALUE_NO : "1";
        mo9142a(f8370v1, new C2114f(Math.abs(d)).toString());
        mo9142a(f8362u1, str);
    }

    /* renamed from: b */
    private static double m10989b(String str, String str2) {
        String str3 = "/";
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split(str3, -1);
            double parseDouble = Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim());
            String[] split3 = split[1].split(str3, -1);
            double parseDouble2 = Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim());
            String[] split4 = split[2].split(str3, -1);
            double parseDouble3 = parseDouble + (parseDouble2 / 60.0d) + ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d);
            if (!str2.equals(f8087L4)) {
                if (!str2.equals(f8103N4)) {
                    if (!str2.equals("N")) {
                        if (!str2.equals(f8095M4)) {
                            throw new IllegalArgumentException();
                        }
                    }
                    return parseDouble3;
                }
            }
            return -parseDouble3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: e */
    private ByteOrder m11007e(C2109a aVar) throws IOException {
        short readShort = aVar.readShort();
        if (readShort == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid byte order: ");
        sb.append(Integer.toHexString(readShort));
        throw new IOException(sb.toString());
    }

    /* renamed from: c */
    private String m10999c(double d) {
        long j = (long) d;
        double d2 = (double) j;
        Double.isNaN(d2);
        double d3 = d - d2;
        long j2 = (long) (d3 * 60.0d);
        double d4 = (double) j2;
        Double.isNaN(d4);
        long round = Math.round((d3 - (d4 / 60.0d)) * 3600.0d * 1.0E7d);
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        String str = "/1,";
        sb.append(str);
        sb.append(j2);
        sb.append(str);
        sb.append(round);
        sb.append("/10000000");
        return sb.toString();
    }

    public C2108a(@C0193h0 InputStream inputStream) throws IOException {
        C2112d[][] dVarArr = f8399y6;
        this.f8411d = new HashMap[dVarArr.length];
        this.f8412e = new HashSet(dVarArr.length);
        if (inputStream != null) {
            this.f8408a = null;
            if (inputStream instanceof AssetInputStream) {
                this.f8409b = (AssetInputStream) inputStream;
            } else {
                this.f8409b = null;
            }
            m10983a(inputStream);
            return;
        }
        throw new IllegalArgumentException("inputStream cannot be null");
    }

    /* renamed from: d */
    private boolean m11006d(byte[] bArr) throws IOException {
        C2109a aVar = new C2109a(bArr);
        this.f8413f = m11007e(aVar);
        aVar.mo9161a(this.f8413f);
        short readShort = aVar.readShort();
        aVar.close();
        return readShort == 85;
    }

    /* renamed from: c */
    private boolean m11002c(byte[] bArr) throws IOException {
        byte[] bytes = f8382w5.getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private void m11000c(C2109a aVar) throws IOException {
        m10979a(aVar, aVar.available());
        m10992b(aVar, 0);
        m11004d(aVar, 0);
        m11004d(aVar, 5);
        m11004d(aVar, 4);
        m10994b((InputStream) aVar);
        if (this.f8410c == 8) {
            C2111c cVar = (C2111c) this.f8411d[1].get(f8242f0);
            if (cVar != null) {
                C2109a aVar2 = new C2109a(cVar.f8435c);
                aVar2.mo9161a(this.f8413f);
                aVar2.mo9160a(6);
                m10992b(aVar2, 9);
                HashMap<String, C2111c> hashMap = this.f8411d[9];
                String str = f8194Z;
                C2111c cVar2 = (C2111c) hashMap.get(str);
                if (cVar2 != null) {
                    this.f8411d[1].put(str, cVar2);
                }
            }
        }
    }

    /* renamed from: a */
    public int mo9135a(@C0193h0 String str, int i) {
        C2111c b = m10990b(str);
        if (b == null) {
            return i;
        }
        try {
            return b.mo9191b(this.f8413f);
        } catch (NumberFormatException unused) {
            return i;
        }
    }

    /* renamed from: d */
    private void m11003d(C2109a aVar) throws IOException {
        m11000c(aVar);
        if (((C2111c) this.f8411d[0].get(f8276j2)) != null) {
            m10980a(aVar, this.f8423p, 5);
        }
        C2111c cVar = (C2111c) this.f8411d[0].get(f8268i2);
        HashMap<String, C2111c> hashMap = this.f8411d[1];
        String str = f8345s0;
        C2111c cVar2 = (C2111c) hashMap.get(str);
        if (cVar != null && cVar2 == null) {
            this.f8411d[1].put(str, cVar);
        }
    }

    /* renamed from: a */
    public double mo9134a(@C0193h0 String str, double d) {
        C2111c b = m10990b(str);
        if (b == null) {
            return d;
        }
        try {
            return b.mo9189a(this.f8413f);
        } catch (NumberFormatException unused) {
            return d;
        }
    }

    /* renamed from: a */
    public void mo9142a(@C0193h0 String str, @C0195i0 String str2) {
        int i;
        String str3;
        String str4 = str2;
        String str5 = str;
        String str6 = f8337r0.equals(str5) ? f8345s0 : str5;
        int i2 = 2;
        int i3 = 1;
        if (str4 != null && f8033E6.contains(str6)) {
            String str7 = " : ";
            String str8 = "Invalid value for ";
            if (str6.equals(f8378w1)) {
                Matcher matcher = f8321o7.matcher(str4);
                if (!matcher.find()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str8);
                    sb.append(str6);
                    sb.append(str7);
                    sb.append(str4);
                    sb.toString();
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Integer.parseInt(matcher.group(1)));
                String str9 = "/1,";
                sb2.append(str9);
                sb2.append(Integer.parseInt(matcher.group(2)));
                sb2.append(str9);
                sb2.append(Integer.parseInt(matcher.group(3)));
                sb2.append("/1");
                str4 = sb2.toString();
            } else {
                try {
                    str4 = new C2114f(Double.parseDouble(str2)).toString();
                } catch (NumberFormatException unused) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str8);
                    sb3.append(str6);
                    sb3.append(str7);
                    sb3.append(str4);
                    sb3.toString();
                    return;
                }
            }
        }
        int i4 = 0;
        while (i4 < f8399y6.length) {
            if (i4 != 4 || this.f8414g) {
                C2112d dVar = (C2112d) f8025D6[i4].get(str6);
                if (dVar != null) {
                    if (str4 != null) {
                        Pair c = m10998c(str4);
                        if (dVar.f8438c == ((Integer) c.first).intValue() || dVar.f8438c == ((Integer) c.second).intValue()) {
                            i = dVar.f8438c;
                        } else {
                            int i5 = dVar.f8439d;
                            if (i5 == -1 || !(i5 == ((Integer) c.first).intValue() || dVar.f8439d == ((Integer) c.second).intValue())) {
                                int i6 = dVar.f8438c;
                                if (i6 == i3 || i6 == 7 || i6 == i2) {
                                    i = dVar.f8438c;
                                } else {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("Given tag (");
                                    sb4.append(str6);
                                    sb4.append(") value didn't match with one of expected ");
                                    sb4.append("formats: ");
                                    sb4.append(f8216b6[dVar.f8438c]);
                                    String str10 = "";
                                    String str11 = ", ";
                                    if (dVar.f8439d == -1) {
                                        str3 = str10;
                                    } else {
                                        StringBuilder sb5 = new StringBuilder();
                                        sb5.append(str11);
                                        sb5.append(f8216b6[dVar.f8439d]);
                                        str3 = sb5.toString();
                                    }
                                    sb4.append(str3);
                                    sb4.append(" (guess: ");
                                    sb4.append(f8216b6[((Integer) c.first).intValue()]);
                                    if (((Integer) c.second).intValue() != -1) {
                                        StringBuilder sb6 = new StringBuilder();
                                        sb6.append(str11);
                                        sb6.append(f8216b6[((Integer) c.second).intValue()]);
                                        str10 = sb6.toString();
                                    }
                                    sb4.append(str10);
                                    sb4.append(")");
                                    sb4.toString();
                                }
                            } else {
                                i = dVar.f8439d;
                            }
                        }
                        String str12 = "/";
                        String str13 = ",";
                        switch (i) {
                            case 1:
                                this.f8411d[i4].put(str6, C2111c.m11048a(str4));
                                break;
                            case 2:
                            case 7:
                                this.f8411d[i4].put(str6, C2111c.m11055b(str4));
                                break;
                            case 3:
                                String[] split = str4.split(str13, -1);
                                int[] iArr = new int[split.length];
                                for (int i7 = 0; i7 < split.length; i7++) {
                                    iArr[i7] = Integer.parseInt(split[i7]);
                                }
                                this.f8411d[i4].put(str6, C2111c.m11056b(iArr, this.f8413f));
                                break;
                            case 4:
                                String[] split2 = str4.split(str13, -1);
                                long[] jArr = new long[split2.length];
                                for (int i8 = 0; i8 < split2.length; i8++) {
                                    jArr[i8] = Long.parseLong(split2[i8]);
                                }
                                this.f8411d[i4].put(str6, C2111c.m11051a(jArr, this.f8413f));
                                break;
                            case 5:
                                String[] split3 = str4.split(str13, -1);
                                C2114f[] fVarArr = new C2114f[split3.length];
                                for (int i9 = 0; i9 < split3.length; i9++) {
                                    String[] split4 = split3[i9].split(str12, -1);
                                    fVarArr[i9] = new C2114f((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[1]));
                                }
                                this.f8411d[i4].put(str6, C2111c.m11057b(fVarArr, this.f8413f));
                                break;
                            case 9:
                                String[] split5 = str4.split(str13, -1);
                                int[] iArr2 = new int[split5.length];
                                for (int i10 = 0; i10 < split5.length; i10++) {
                                    iArr2[i10] = Integer.parseInt(split5[i10]);
                                }
                                this.f8411d[i4].put(str6, C2111c.m11050a(iArr2, this.f8413f));
                                break;
                            case 10:
                                String[] split6 = str4.split(str13, -1);
                                C2114f[] fVarArr2 = new C2114f[split6.length];
                                int i11 = 0;
                                while (i11 < split6.length) {
                                    String[] split7 = split6[i11].split(str12, -1);
                                    fVarArr2[i11] = new C2114f((long) Double.parseDouble(split7[0]), (long) Double.parseDouble(split7[i3]));
                                    i11++;
                                    i3 = 1;
                                }
                                this.f8411d[i4].put(str6, C2111c.m11052a(fVarArr2, this.f8413f));
                                break;
                            case 12:
                                String[] split8 = str4.split(str13, -1);
                                double[] dArr = new double[split8.length];
                                for (int i12 = 0; i12 < split8.length; i12++) {
                                    dArr[i12] = Double.parseDouble(split8[i12]);
                                }
                                this.f8411d[i4].put(str6, C2111c.m11049a(dArr, this.f8413f));
                                break;
                            default:
                                StringBuilder sb7 = new StringBuilder();
                                sb7.append("Data format isn't one of expected formats: ");
                                sb7.append(i);
                                sb7.toString();
                                break;
                        }
                    } else {
                        this.f8411d[i4].remove(str6);
                    }
                }
            }
            i4++;
            i2 = 2;
            i3 = 1;
        }
    }

    /* renamed from: b */
    private boolean m10997b(byte[] bArr) throws IOException {
        C2109a aVar = new C2109a(bArr);
        this.f8413f = m11007e(aVar);
        aVar.mo9161a(this.f8413f);
        short readShort = aVar.readShort();
        aVar.close();
        return readShort == 20306 || readShort == 21330;
    }

    /* renamed from: d */
    private void m11004d(C2109a aVar, int i) throws IOException {
        C2111c cVar;
        C2111c cVar2;
        C2111c cVar3 = (C2111c) this.f8411d[i].get(f8196Z1);
        C2111c cVar4 = (C2111c) this.f8411d[i].get(f8260h2);
        C2111c cVar5 = (C2111c) this.f8411d[i].get(f8244f2);
        C2111c cVar6 = (C2111c) this.f8411d[i].get(f8236e2);
        C2111c cVar7 = (C2111c) this.f8411d[i].get(f8252g2);
        String str = f8360u;
        String str2 = f8352t;
        if (cVar3 != null) {
            String str3 = "Invalid crop size values. cropSize=";
            if (cVar3.f8433a == 5) {
                C2114f[] fVarArr = (C2114f[]) cVar3.mo9193d(this.f8413f);
                if (fVarArr == null || fVarArr.length != 2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(Arrays.toString(fVarArr));
                    sb.toString();
                    return;
                }
                cVar2 = C2111c.m11054b(fVarArr[0], this.f8413f);
                cVar = C2111c.m11054b(fVarArr[1], this.f8413f);
            } else {
                int[] iArr = (int[]) cVar3.mo9193d(this.f8413f);
                if (iArr == null || iArr.length != 2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str3);
                    sb2.append(Arrays.toString(iArr));
                    sb2.toString();
                    return;
                }
                cVar2 = C2111c.m11053b(iArr[0], this.f8413f);
                cVar = C2111c.m11053b(iArr[1], this.f8413f);
            }
            this.f8411d[i].put(str2, cVar2);
            this.f8411d[i].put(str, cVar);
        } else if (cVar4 == null || cVar5 == null || cVar6 == null || cVar7 == null) {
            m11001c(aVar, i);
        } else {
            int b = cVar4.mo9191b(this.f8413f);
            int b2 = cVar6.mo9191b(this.f8413f);
            int b3 = cVar7.mo9191b(this.f8413f);
            int b4 = cVar5.mo9191b(this.f8413f);
            if (b2 > b && b3 > b4) {
                int i2 = b3 - b4;
                C2111c b5 = C2111c.m11053b(b2 - b, this.f8413f);
                C2111c b6 = C2111c.m11053b(i2, this.f8413f);
                this.f8411d[i].put(str, b5);
                this.f8411d[i].put(str2, b6);
            }
        }
    }

    /* renamed from: b */
    private void m10991b(C2109a aVar) throws IOException {
        aVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        aVar.read(bArr);
        aVar.skipBytes(4);
        aVar.read(bArr2);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        m10980a(aVar, i, 5);
        aVar.mo9160a((long) i2);
        aVar.mo9161a(ByteOrder.BIG_ENDIAN);
        int readInt = aVar.readInt();
        for (int i3 = 0; i3 < readInt; i3++) {
            int readUnsignedShort = aVar.readUnsignedShort();
            int readUnsignedShort2 = aVar.readUnsignedShort();
            if (readUnsignedShort == f8280j6.f8436a) {
                short readShort = aVar.readShort();
                short readShort2 = aVar.readShort();
                C2111c b = C2111c.m11053b((int) readShort, this.f8413f);
                C2111c b2 = C2111c.m11053b((int) readShort2, this.f8413f);
                this.f8411d[0].put(f8360u, b);
                this.f8411d[0].put(f8352t, b2);
                return;
            }
            aVar.skipBytes(readUnsignedShort2);
        }
    }

    /* renamed from: c */
    private void m11001c(C2109a aVar, int i) throws IOException {
        C2111c cVar = (C2111c) this.f8411d[i].get(f8352t);
        if (((C2111c) this.f8411d[i].get(f8360u)) == null || cVar == null) {
            C2111c cVar2 = (C2111c) this.f8411d[i].get(f8066J);
            if (cVar2 != null) {
                m10980a(aVar, cVar2.mo9191b(this.f8413f), i);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:68|69|70) */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        java.lang.Double.parseDouble(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015c, code lost:
        return new android.util.Pair<>(java.lang.Integer.valueOf(12), r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0162, code lost:
        return new android.util.Pair<>(r5, r7);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:68:0x014e */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair<java.lang.Integer, java.lang.Integer> m10998c(java.lang.String r12) {
        /*
            java.lang.String r0 = ","
            boolean r1 = r12.contains(r0)
            r2 = 0
            r3 = 1
            r4 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = -1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            if (r1 == 0) goto L_0x00a6
            java.lang.String[] r12 = r12.split(r0, r6)
            r0 = r12[r2]
            android.util.Pair r0 = m10998c(r0)
            java.lang.Object r1 = r0.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r4) goto L_0x0029
            return r0
        L_0x0029:
            int r1 = r12.length
            if (r3 >= r1) goto L_0x00a5
            r1 = r12[r3]
            android.util.Pair r1 = m10998c(r1)
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x004d
            java.lang.Object r2 = r1.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r2 = -1
            goto L_0x0055
        L_0x004d:
            java.lang.Object r2 = r0.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
        L_0x0055:
            java.lang.Object r4 = r0.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 == r6) goto L_0x0080
            java.lang.Object r4 = r1.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r8 = r0.second
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x0077
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r4 = r0.second
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0080
        L_0x0077:
            java.lang.Object r1 = r0.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x0081
        L_0x0080:
            r1 = -1
        L_0x0081:
            if (r2 != r6) goto L_0x008b
            if (r1 != r6) goto L_0x008b
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        L_0x008b:
            if (r2 != r6) goto L_0x0097
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r1, r7)
            goto L_0x00a2
        L_0x0097:
            if (r1 != r6) goto L_0x00a2
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.<init>(r1, r7)
        L_0x00a2:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x00a5:
            return r0
        L_0x00a6:
            java.lang.String r0 = "/"
            boolean r1 = r12.contains(r0)
            r8 = 0
            if (r1 == 0) goto L_0x0105
            java.lang.String[] r12 = r12.split(r0, r6)
            int r0 = r12.length
            if (r0 != r4) goto L_0x00ff
            r0 = r12[r2]     // Catch:{ NumberFormatException -> 0x00ff }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            long r0 = (long) r0     // Catch:{ NumberFormatException -> 0x00ff }
            r12 = r12[r3]     // Catch:{ NumberFormatException -> 0x00ff }
            double r2 = java.lang.Double.parseDouble(r12)     // Catch:{ NumberFormatException -> 0x00ff }
            long r2 = (long) r2     // Catch:{ NumberFormatException -> 0x00ff }
            r12 = 10
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x00f5
            int r4 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r4 >= 0) goto L_0x00d0
            goto L_0x00f5
        L_0x00d0:
            r4 = 5
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r6 > 0) goto L_0x00eb
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x00dd
            goto L_0x00eb
        L_0x00dd:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
            r0.<init>(r12, r1)     // Catch:{ NumberFormatException -> 0x00ff }
            return r0
        L_0x00eb:
            android.util.Pair r12 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
            r12.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
            return r12
        L_0x00f5:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ NumberFormatException -> 0x00ff }
            r0.<init>(r12, r7)     // Catch:{ NumberFormatException -> 0x00ff }
            return r0
        L_0x00ff:
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        L_0x0105:
            long r0 = java.lang.Long.parseLong(r12)     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ NumberFormatException -> 0x014e }
            long r1 = r0.longValue()     // Catch:{ NumberFormatException -> 0x014e }
            r3 = 4
            int r4 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x0130
            long r1 = r0.longValue()     // Catch:{ NumberFormatException -> 0x014e }
            r10 = 65535(0xffff, double:3.23786E-319)
            int r4 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r4 > 0) goto L_0x0130
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014e }
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x014e }
            r0.<init>(r1, r2)     // Catch:{ NumberFormatException -> 0x014e }
            return r0
        L_0x0130:
            long r0 = r0.longValue()     // Catch:{ NumberFormatException -> 0x014e }
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0144
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014e }
            r1 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x014e }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x014e }
            return r0
        L_0x0144:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x014e }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x014e }
            return r0
        L_0x014e:
            java.lang.Double.parseDouble(r12)     // Catch:{ NumberFormatException -> 0x015d }
            android.util.Pair r12 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x015d }
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x015d }
            r12.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x015d }
            return r12
        L_0x015d:
            android.util.Pair r12 = new android.util.Pair
            r12.<init>(r5, r7)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p053b.p063d.p064b.C2108a.m10998c(java.lang.String):android.util.Pair");
    }

    /* renamed from: b */
    private void m10995b(InputStream inputStream, OutputStream outputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        C2110b bVar = new C2110b(outputStream, ByteOrder.BIG_ENDIAN);
        String str = "Invalid marker";
        if (dataInputStream.readByte() == -1) {
            bVar.writeByte(-1);
            if (dataInputStream.readByte() == -40) {
                bVar.writeByte(-40);
                bVar.writeByte(-1);
                bVar.writeByte(-31);
                m10974a(bVar, 6);
                byte[] bArr = new byte[4096];
                while (dataInputStream.readByte() == -1) {
                    byte readByte = dataInputStream.readByte();
                    if (readByte == -39 || readByte == -38) {
                        bVar.writeByte(-1);
                        bVar.writeByte(readByte);
                        m10976a((InputStream) dataInputStream, (OutputStream) bVar);
                        return;
                    }
                    String str2 = "Invalid length";
                    if (readByte != -31) {
                        bVar.writeByte(-1);
                        bVar.writeByte(readByte);
                        int readUnsignedShort = dataInputStream.readUnsignedShort();
                        bVar.mo9181a(readUnsignedShort);
                        int i = readUnsignedShort - 2;
                        if (i >= 0) {
                            while (i > 0) {
                                int read = dataInputStream.read(bArr, 0, Math.min(i, bArr.length));
                                if (read < 0) {
                                    break;
                                }
                                bVar.write(bArr, 0, read);
                                i -= read;
                            }
                        } else {
                            throw new IOException(str2);
                        }
                    } else {
                        int readUnsignedShort2 = dataInputStream.readUnsignedShort() - 2;
                        if (readUnsignedShort2 >= 0) {
                            byte[] bArr2 = new byte[6];
                            if (readUnsignedShort2 >= 6) {
                                if (dataInputStream.read(bArr2) != 6) {
                                    throw new IOException("Invalid exif");
                                } else if (Arrays.equals(bArr2, f8057H6)) {
                                    int i2 = readUnsignedShort2 - 6;
                                    if (dataInputStream.skipBytes(i2) != i2) {
                                        throw new IOException(str2);
                                    }
                                }
                            }
                            bVar.writeByte(-1);
                            bVar.writeByte(readByte);
                            bVar.mo9181a(readUnsignedShort2 + 2);
                            if (readUnsignedShort2 >= 6) {
                                readUnsignedShort2 -= 6;
                                bVar.write(bArr2);
                            }
                            while (readUnsignedShort2 > 0) {
                                int read2 = dataInputStream.read(bArr, 0, Math.min(readUnsignedShort2, bArr.length));
                                if (read2 < 0) {
                                    break;
                                }
                                bVar.write(bArr, 0, read2);
                                readUnsignedShort2 -= read2;
                            }
                        } else {
                            throw new IOException(str2);
                        }
                    }
                }
                throw new IOException(str);
            }
            throw new IOException(str);
        }
        throw new IOException(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0256, code lost:
        if (f8146T.equals(r4.f8437b) != false) goto L_0x0258;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0264, code lost:
        if (r6.mo9192c(r0.f8413f).contains(f8056H5) == false) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x026c, code lost:
        if (r14.equals(r4.f8437b) == false) goto L_0x027b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0277, code lost:
        if (r6.mo9191b(r0.f8413f) != 65535) goto L_0x027b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0279, code lost:
        r0.f8410c = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0282, code lost:
        if (((long) r25.peek()) == r12) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0284, code lost:
        r1.mo9160a(r12);
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e2  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m10992b(p053b.p063d.p064b.C2108a.C2109a r25, int r26) throws java.io.IOException {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            r2 = r26
            java.util.Set<java.lang.Integer> r3 = r0.f8412e
            int r4 = r1.f8428O
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            int r3 = r1.f8428O
            int r3 = r3 + 2
            int r4 = r1.f8427N
            if (r3 <= r4) goto L_0x001a
            return
        L_0x001a:
            short r3 = r25.readShort()
            int r4 = r1.f8428O
            int r5 = r3 * 12
            int r4 = r4 + r5
            int r5 = r1.f8427N
            if (r4 > r5) goto L_0x02f7
            if (r3 > 0) goto L_0x002b
            goto L_0x02f7
        L_0x002b:
            r5 = 0
        L_0x002c:
            r6 = 0
            if (r5 >= r3) goto L_0x0290
            int r9 = r25.readUnsignedShort()
            int r10 = r25.readUnsignedShort()
            int r11 = r25.readInt()
            int r12 = r25.peek()
            long r12 = (long) r12
            r14 = 4
            long r12 = r12 + r14
            java.util.HashMap<java.lang.Integer, b.d.b.a$d>[] r16 = f8017C6
            r4 = r16[r2]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            java.lang.Object r4 = r4.get(r8)
            b.d.b.a$d r4 = (p053b.p063d.p064b.C2108a.C2112d) r4
            r8 = 7
            if (r4 != 0) goto L_0x0069
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Skip the tag entry since tag number is not defined: "
            r14.append(r15)
            r14.append(r9)
            r14.toString()
        L_0x0065:
            r19 = r9
            goto L_0x00d5
        L_0x0069:
            if (r10 <= 0) goto L_0x00c3
            int[] r14 = f8224c6
            int r14 = r14.length
            if (r10 < r14) goto L_0x0071
            goto L_0x00c3
        L_0x0071:
            boolean r14 = r4.mo9195a(r10)
            if (r14 != 0) goto L_0x0096
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Skip the tag entry since data format ("
            r14.append(r15)
            java.lang.String[] r15 = f8216b6
            r15 = r15[r10]
            r14.append(r15)
            java.lang.String r15 = ") is unexpected for tag: "
            r14.append(r15)
            java.lang.String r15 = r4.f8437b
            r14.append(r15)
            r14.toString()
            goto L_0x0065
        L_0x0096:
            if (r10 != r8) goto L_0x009a
            int r10 = r4.f8438c
        L_0x009a:
            long r14 = (long) r11
            int[] r19 = f8224c6
            r8 = r19[r10]
            r19 = r9
            long r8 = (long) r8
            long r8 = r8 * r14
            int r14 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r14 < 0) goto L_0x00b2
            r14 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r21 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r21 <= 0) goto L_0x00b0
            goto L_0x00b2
        L_0x00b0:
            r14 = 1
            goto L_0x00d7
        L_0x00b2:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Skip the tag entry since the number of components is invalid: "
            r14.append(r15)
            r14.append(r11)
            r14.toString()
            goto L_0x00d6
        L_0x00c3:
            r19 = r9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Skip the tag entry since data format is invalid: "
            r8.append(r9)
            r8.append(r10)
            r8.toString()
        L_0x00d5:
            r8 = r6
        L_0x00d6:
            r14 = 0
        L_0x00d7:
            if (r14 != 0) goto L_0x00e2
            r1.mo9160a(r12)
            r20 = r3
            r22 = r5
            goto L_0x0287
        L_0x00e2:
            java.lang.String r14 = "Compression"
            r17 = 4
            int r15 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r15 <= 0) goto L_0x018a
            int r15 = r25.readInt()
            int r6 = r0.f8410c
            r7 = 7
            if (r6 != r7) goto L_0x0150
            java.lang.String r6 = r4.f8437b
            java.lang.String r7 = "MakerNote"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0100
            r0.f8420m = r15
            goto L_0x014a
        L_0x0100:
            r6 = 6
            if (r2 != r6) goto L_0x014a
            java.lang.String r7 = r4.f8437b
            java.lang.String r6 = "ThumbnailImage"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x014a
            r0.f8421n = r15
            r0.f8422o = r11
            java.nio.ByteOrder r6 = r0.f8413f
            r7 = 6
            b.d.b.a$c r6 = p053b.p063d.p064b.C2108a.C2111c.m11053b(r7, r6)
            int r7 = r0.f8421n
            r20 = r3
            long r2 = (long) r7
            java.nio.ByteOrder r7 = r0.f8413f
            b.d.b.a$c r2 = p053b.p063d.p064b.C2108a.C2111c.m11046a(r2, r7)
            int r3 = r0.f8422o
            r21 = r10
            r7 = r11
            long r10 = (long) r3
            java.nio.ByteOrder r3 = r0.f8413f
            b.d.b.a$c r3 = p053b.p063d.p064b.C2108a.C2111c.m11046a(r10, r3)
            java.util.HashMap<java.lang.String, b.d.b.a$c>[] r10 = r0.f8411d
            r11 = 4
            r10 = r10[r11]
            r10.put(r14, r6)
            java.util.HashMap<java.lang.String, b.d.b.a$c>[] r6 = r0.f8411d
            r6 = r6[r11]
            java.lang.String r10 = "JPEGInterchangeFormat"
            r6.put(r10, r2)
            java.util.HashMap<java.lang.String, b.d.b.a$c>[] r2 = r0.f8411d
            r2 = r2[r11]
            java.lang.String r6 = "JPEGInterchangeFormatLength"
            r2.put(r6, r3)
            goto L_0x0165
        L_0x014a:
            r20 = r3
            r21 = r10
            r7 = r11
            goto L_0x0165
        L_0x0150:
            r20 = r3
            r21 = r10
            r7 = r11
            r2 = 10
            if (r6 != r2) goto L_0x0165
            java.lang.String r2 = r4.f8437b
            java.lang.String r3 = "JpgFromRaw"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0165
            r0.f8423p = r15
        L_0x0165:
            long r2 = (long) r15
            long r10 = r2 + r8
            int r6 = r1.f8427N
            r22 = r5
            long r5 = (long) r6
            int r23 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r23 > 0) goto L_0x0175
            r1.mo9160a(r2)
            goto L_0x0191
        L_0x0175:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Skip the tag entry since data offset is invalid: "
            r2.append(r3)
            r2.append(r15)
            r2.toString()
            r1.mo9160a(r12)
            goto L_0x0287
        L_0x018a:
            r20 = r3
            r22 = r5
            r21 = r10
            r7 = r11
        L_0x0191:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r2 = f8041F6
            java.lang.Integer r3 = java.lang.Integer.valueOf(r19)
            java.lang.Object r2 = r2.get(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            r3 = 8
            r5 = 3
            if (r2 == 0) goto L_0x0222
            r6 = -1
            r10 = r21
            if (r10 == r5) goto L_0x01c7
            r4 = 4
            if (r10 == r4) goto L_0x01c2
            if (r10 == r3) goto L_0x01bd
            r3 = 9
            if (r10 == r3) goto L_0x01b8
            r3 = 13
            if (r10 == r3) goto L_0x01b8
        L_0x01b5:
            r3 = 0
            goto L_0x01cd
        L_0x01b8:
            int r3 = r25.readInt()
            goto L_0x01cb
        L_0x01bd:
            short r3 = r25.readShort()
            goto L_0x01cb
        L_0x01c2:
            long r6 = r25.mo9159a()
            goto L_0x01b5
        L_0x01c7:
            int r3 = r25.readUnsignedShort()
        L_0x01cb:
            long r6 = (long) r3
            goto L_0x01b5
        L_0x01cd:
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x020e
            int r3 = r1.f8427N
            long r3 = (long) r3
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x020e
            java.util.Set<java.lang.Integer> r3 = r0.f8412e
            int r4 = (int) r6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L_0x01f0
            r1.mo9160a(r6)
            int r2 = r2.intValue()
            r0.m10992b(r1, r2)
            goto L_0x021e
        L_0x01f0:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip jump into the IFD since it has already been read: IfdType "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = " (at "
            r3.append(r2)
            r3.append(r6)
            java.lang.String r2 = ")"
            r3.append(r2)
            r3.toString()
            goto L_0x021e
        L_0x020e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Skip jump into the IFD since its offset is invalid: "
            r2.append(r3)
            r2.append(r6)
            r2.toString()
        L_0x021e:
            r1.mo9160a(r12)
            goto L_0x0287
        L_0x0222:
            r10 = r21
            int r2 = (int) r8
            byte[] r2 = new byte[r2]
            r1.readFully(r2)
            b.d.b.a$c r6 = new b.d.b.a$c
            r6.<init>(r10, r7, r2)
            java.util.HashMap<java.lang.String, b.d.b.a$c>[] r2 = r0.f8411d
            r2 = r2[r26]
            java.lang.String r7 = r4.f8437b
            r2.put(r7, r6)
            java.lang.String r2 = r4.f8437b
            java.lang.String r7 = "DNGVersion"
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x0244
            r0.f8410c = r5
        L_0x0244:
            java.lang.String r2 = r4.f8437b
            java.lang.String r5 = "Make"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x0258
            java.lang.String r2 = r4.f8437b
            java.lang.String r5 = "Model"
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L_0x0266
        L_0x0258:
            java.nio.ByteOrder r2 = r0.f8413f
            java.lang.String r2 = r6.mo9192c(r2)
            java.lang.String r5 = "PENTAX"
            boolean r2 = r2.contains(r5)
            if (r2 != 0) goto L_0x0279
        L_0x0266:
            java.lang.String r2 = r4.f8437b
            boolean r2 = r14.equals(r2)
            if (r2 == 0) goto L_0x027b
            java.nio.ByteOrder r2 = r0.f8413f
            int r2 = r6.mo9191b(r2)
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r4) goto L_0x027b
        L_0x0279:
            r0.f8410c = r3
        L_0x027b:
            int r2 = r25.peek()
            long r2 = (long) r2
            int r4 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r4 == 0) goto L_0x0287
            r1.mo9160a(r12)
        L_0x0287:
            int r5 = r22 + 1
            short r5 = (short) r5
            r2 = r26
            r3 = r20
            goto L_0x002c
        L_0x0290:
            int r2 = r25.peek()
            r3 = 4
            int r2 = r2 + r3
            int r3 = r1.f8427N
            if (r2 > r3) goto L_0x02f7
            int r2 = r25.readInt()
            long r3 = (long) r2
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x02e7
            int r5 = r1.f8427N
            if (r2 >= r5) goto L_0x02e7
            java.util.Set<java.lang.Integer> r5 = r0.f8412e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L_0x02d6
            r1.mo9160a(r3)
            java.util.HashMap<java.lang.String, b.d.b.a$c>[] r2 = r0.f8411d
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x02c7
            r0.m10992b(r1, r3)
            goto L_0x02f7
        L_0x02c7:
            java.util.HashMap<java.lang.String, b.d.b.a$c>[] r2 = r0.f8411d
            r3 = 5
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x02f7
            r0.m10992b(r1, r3)
            goto L_0x02f7
        L_0x02d6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            r1.toString()
            goto L_0x02f7
        L_0x02e7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            r1.toString()
        L_0x02f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p053b.p063d.p064b.C2108a.m10992b(b.d.b.a$a, int):void");
    }

    /* renamed from: a */
    public void mo9139a(int i) {
        if (i % 90 == 0) {
            String str = f8392y;
            int a = mo9135a(str, 1);
            int i2 = 0;
            if (f8045G2.contains(Integer.valueOf(a))) {
                int indexOf = (f8045G2.indexOf(Integer.valueOf(a)) + (i / 90)) % 4;
                if (indexOf < 0) {
                    i2 = 4;
                }
                i2 = ((Integer) f8045G2.get(indexOf + i2)).intValue();
            } else if (f8053H2.contains(Integer.valueOf(a))) {
                int indexOf2 = (f8053H2.indexOf(Integer.valueOf(a)) + (i / 90)) % 4;
                if (indexOf2 < 0) {
                    i2 = 4;
                }
                i2 = ((Integer) f8053H2.get(indexOf2 + i2)).intValue();
            }
            mo9142a(str, Integer.toString(i2));
            return;
        }
        throw new IllegalArgumentException("degree should be a multiple of 90");
    }

    /* renamed from: a */
    public void mo9137a() {
        int i = 1;
        String str = f8392y;
        switch (mo9135a(str, 1)) {
            case 1:
                i = 2;
                break;
            case 2:
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 5;
                break;
            case 7:
                i = 8;
                break;
            case 8:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        mo9142a(str, Integer.toString(i));
    }

    /* renamed from: a */
    private boolean m10985a(String str, C2111c cVar) {
        boolean z = false;
        for (int i = 0; i < f8399y6.length; i++) {
            if (this.f8411d[i].containsKey(str)) {
                this.f8411d[i].put(str, cVar);
                z = true;
            }
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4.f8424q = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        m11009p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0051, code lost:
        throw r5;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0047 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m10983a(@androidx.annotation.C0193h0 java.io.InputStream r5) throws java.io.IOException {
        /*
            r4 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            b.d.b.a$d[][] r2 = f8399y6     // Catch:{ IOException -> 0x0047 }
            int r2 = r2.length     // Catch:{ IOException -> 0x0047 }
            if (r1 >= r2) goto L_0x0013
            java.util.HashMap<java.lang.String, b.d.b.a$c>[] r2 = r4.f8411d     // Catch:{ IOException -> 0x0047 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ IOException -> 0x0047 }
            r3.<init>()     // Catch:{ IOException -> 0x0047 }
            r2[r1] = r3     // Catch:{ IOException -> 0x0047 }
            int r1 = r1 + 1
            goto L_0x0002
        L_0x0013:
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0047 }
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r5, r2)     // Catch:{ IOException -> 0x0047 }
            int r5 = r4.m10975a(r1)     // Catch:{ IOException -> 0x0047 }
            r4.f8410c = r5     // Catch:{ IOException -> 0x0047 }
            b.d.b.a$a r5 = new b.d.b.a$a     // Catch:{ IOException -> 0x0047 }
            r5.<init>(r1)     // Catch:{ IOException -> 0x0047 }
            int r1 = r4.f8410c     // Catch:{ IOException -> 0x0047 }
            switch(r1) {
                case 0: goto L_0x003b;
                case 1: goto L_0x003b;
                case 2: goto L_0x003b;
                case 3: goto L_0x003b;
                case 4: goto L_0x0037;
                case 5: goto L_0x003b;
                case 6: goto L_0x003b;
                case 7: goto L_0x0033;
                case 8: goto L_0x003b;
                case 9: goto L_0x002f;
                case 10: goto L_0x002b;
                case 11: goto L_0x003b;
                default: goto L_0x002a;
            }     // Catch:{ IOException -> 0x0047 }
        L_0x002a:
            goto L_0x003e
        L_0x002b:
            r4.m11003d(r5)     // Catch:{ IOException -> 0x0047 }
            goto L_0x003e
        L_0x002f:
            r4.m10991b(r5)     // Catch:{ IOException -> 0x0047 }
            goto L_0x003e
        L_0x0033:
            r4.m10978a(r5)     // Catch:{ IOException -> 0x0047 }
            goto L_0x003e
        L_0x0037:
            r4.m10980a(r5, r0, r0)     // Catch:{ IOException -> 0x0047 }
            goto L_0x003e
        L_0x003b:
            r4.m11000c(r5)     // Catch:{ IOException -> 0x0047 }
        L_0x003e:
            r4.m11008f(r5)     // Catch:{ IOException -> 0x0047 }
            r5 = 1
            r4.f8424q = r5     // Catch:{ IOException -> 0x0047 }
            goto L_0x0049
        L_0x0045:
            r5 = move-exception
            goto L_0x004d
        L_0x0047:
            r4.f8424q = r0     // Catch:{ all -> 0x0045 }
        L_0x0049:
            r4.m11009p()
            return
        L_0x004d:
            r4.m11009p()
            goto L_0x0052
        L_0x0051:
            throw r5
        L_0x0052:
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: p053b.p063d.p064b.C2108a.m10983a(java.io.InputStream):void");
    }

    @Deprecated
    /* renamed from: a */
    public boolean mo9143a(float[] fArr) {
        double[] e = mo9148e();
        if (e == null) {
            return false;
        }
        fArr[0] = (float) e[0];
        fArr[1] = (float) e[1];
        return true;
    }

    /* renamed from: a */
    public void mo9141a(Location location) {
        if (location != null) {
            mo9142a(f8124Q1, location.getProvider());
            mo9138a(location.getLatitude(), location.getLongitude());
            mo9145b(location.getAltitude());
            mo9142a(f8004B1, "K");
            mo9142a(f8012C1, new C2114f((double) ((location.getSpeed() * ((float) TimeUnit.HOURS.toSeconds(1))) / 1000.0f)).toString());
            String[] split = f8072J5.format(new Date(location.getTime())).split("\\s+", -1);
            mo9142a(f8140S1, split[0]);
            mo9142a(f8378w1, split[1]);
        }
    }

    /* renamed from: a */
    public void mo9138a(double d, double d2) {
        String str = " is not valid.";
        if (d < -90.0d || d > 90.0d || Double.isNaN(d)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Latitude value ");
            sb.append(d);
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        } else if (d2 < -180.0d || d2 > 180.0d || Double.isNaN(d2)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Longitude value ");
            sb2.append(d2);
            sb2.append(str);
            throw new IllegalArgumentException(sb2.toString());
        } else {
            mo9142a(f8330q1, d >= 0.0d ? "N" : f8087L4);
            mo9142a(f8338r1, m10999c(Math.abs(d)));
            mo9142a(f8346s1, d2 >= 0.0d ? f8095M4 : f8103N4);
            mo9142a(f8354t1, m10999c(Math.abs(d2)));
        }
    }

    /* renamed from: a */
    public double mo9133a(double d) {
        double a = mo9134a(f8370v1, -1.0d);
        int a2 = mo9135a(f8362u1, -1);
        if (a < 0.0d || a2 < 0) {
            return d;
        }
        int i = 1;
        if (a2 == 1) {
            i = -1;
        }
        double d2 = (double) i;
        Double.isNaN(d2);
        return a * d2;
    }

    @C0207n0({C0208a.LIBRARY})
    /* renamed from: a */
    public void mo9140a(long j) {
        long j2 = j % 1000;
        mo9142a(f8122Q, f8072J5.format(new Date(j)));
        mo9142a(f8282k0, Long.toString(j2));
    }

    /* renamed from: a */
    private int m10975a(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (m10987a(bArr)) {
            return 4;
        }
        if (m11002c(bArr)) {
            return 9;
        }
        if (m10997b(bArr)) {
            return 7;
        }
        return m11006d(bArr) ? 10 : 0;
    }

    /* renamed from: a */
    private static boolean m10987a(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = f8374v5;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0088 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00f7 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m10980a(p053b.p063d.p064b.C2108a.C2109a r10, int r11, int r12) throws java.io.IOException {
        /*
            r9 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r10.mo9161a(r0)
            long r0 = (long) r11
            r10.mo9160a(r0)
            byte r0 = r10.readByte()
            java.lang.String r1 = "Invalid marker: "
            r2 = -1
            if (r0 != r2) goto L_0x0153
            r3 = 1
            int r11 = r11 + r3
            byte r4 = r10.readByte()
            r5 = -40
            if (r4 != r5) goto L_0x0138
            int r11 = r11 + r3
        L_0x001d:
            byte r0 = r10.readByte()
            if (r0 != r2) goto L_0x011b
            int r11 = r11 + r3
            byte r0 = r10.readByte()
            int r11 = r11 + r3
            r1 = -39
            if (r0 == r1) goto L_0x0115
            r1 = -38
            if (r0 != r1) goto L_0x0033
            goto L_0x0115
        L_0x0033:
            int r1 = r10.readUnsignedShort()
            int r1 = r1 + -2
            int r11 = r11 + 2
            java.lang.String r4 = "Invalid length"
            if (r1 < 0) goto L_0x010f
            r5 = -31
            r6 = 0
            java.lang.String r7 = "Invalid exif"
            if (r0 == r5) goto L_0x00ba
            r5 = -2
            if (r0 == r5) goto L_0x0090
            switch(r0) {
                case -64: goto L_0x0057;
                case -63: goto L_0x0057;
                case -62: goto L_0x0057;
                case -61: goto L_0x0057;
                default: goto L_0x004c;
            }
        L_0x004c:
            switch(r0) {
                case -59: goto L_0x0057;
                case -58: goto L_0x0057;
                case -57: goto L_0x0057;
                default: goto L_0x004f;
            }
        L_0x004f:
            switch(r0) {
                case -55: goto L_0x0057;
                case -54: goto L_0x0057;
                case -53: goto L_0x0057;
                default: goto L_0x0052;
            }
        L_0x0052:
            switch(r0) {
                case -51: goto L_0x0057;
                case -50: goto L_0x0057;
                case -49: goto L_0x0057;
                default: goto L_0x0055;
            }
        L_0x0055:
            goto L_0x00e4
        L_0x0057:
            int r0 = r10.skipBytes(r3)
            if (r0 != r3) goto L_0x0088
            java.util.HashMap<java.lang.String, b.d.b.a$c>[] r0 = r9.f8411d
            r0 = r0[r12]
            int r5 = r10.readUnsignedShort()
            long r5 = (long) r5
            java.nio.ByteOrder r7 = r9.f8413f
            b.d.b.a$c r5 = p053b.p063d.p064b.C2108a.C2111c.m11046a(r5, r7)
            java.lang.String r6 = "ImageLength"
            r0.put(r6, r5)
            java.util.HashMap<java.lang.String, b.d.b.a$c>[] r0 = r9.f8411d
            r0 = r0[r12]
            int r5 = r10.readUnsignedShort()
            long r5 = (long) r5
            java.nio.ByteOrder r7 = r9.f8413f
            b.d.b.a$c r5 = p053b.p063d.p064b.C2108a.C2111c.m11046a(r5, r7)
            java.lang.String r6 = "ImageWidth"
            r0.put(r6, r5)
            int r1 = r1 + -5
            goto L_0x00e4
        L_0x0088:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "Invalid SOFx"
            r10.<init>(r11)
            throw r10
        L_0x0090:
            byte[] r0 = new byte[r1]
            int r5 = r10.read(r0)
            if (r5 != r1) goto L_0x00b4
            java.lang.String r1 = "UserComment"
            java.lang.String r5 = r9.mo9136a(r1)
            if (r5 != 0) goto L_0x00b2
            java.util.HashMap<java.lang.String, b.d.b.a$c>[] r5 = r9.f8411d
            r5 = r5[r3]
            java.lang.String r7 = new java.lang.String
            java.nio.charset.Charset r8 = f8049G6
            r7.<init>(r0, r8)
            b.d.b.a$c r0 = p053b.p063d.p064b.C2108a.C2111c.m11055b(r7)
            r5.put(r1, r0)
        L_0x00b2:
            r1 = 0
            goto L_0x00e4
        L_0x00b4:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x00ba:
            r0 = 6
            if (r1 >= r0) goto L_0x00be
            goto L_0x00e4
        L_0x00be:
            byte[] r5 = new byte[r0]
            int r8 = r10.read(r5)
            if (r8 != r0) goto L_0x0109
            int r11 = r11 + 6
            int r1 = r1 + -6
            byte[] r0 = f8057H6
            boolean r0 = java.util.Arrays.equals(r5, r0)
            if (r0 != 0) goto L_0x00d3
            goto L_0x00e4
        L_0x00d3:
            if (r1 <= 0) goto L_0x0103
            r9.f8419l = r11
            byte[] r0 = new byte[r1]
            int r5 = r10.read(r0)
            if (r5 != r1) goto L_0x00fd
            int r11 = r11 + r1
            r9.m10984a(r0, r12)
            goto L_0x00b2
        L_0x00e4:
            if (r1 < 0) goto L_0x00f7
            int r0 = r10.skipBytes(r1)
            if (r0 != r1) goto L_0x00ef
            int r11 = r11 + r1
            goto L_0x001d
        L_0x00ef:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r11 = "Invalid JPEG segment"
            r10.<init>(r11)
            throw r10
        L_0x00f7:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r4)
            throw r10
        L_0x00fd:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x0103:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x0109:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r7)
            throw r10
        L_0x010f:
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r4)
            throw r10
        L_0x0115:
            java.nio.ByteOrder r11 = r9.f8413f
            r10.mo9161a(r11)
            return
        L_0x011b:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "Invalid marker:"
            r11.append(r12)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x0138:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x0153:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            r12 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r12 = java.lang.Integer.toHexString(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            goto L_0x016f
        L_0x016e:
            throw r10
        L_0x016f:
            goto L_0x016e
        */
        throw new UnsupportedOperationException("Method not decompiled: p053b.p063d.p064b.C2108a.m10980a(b.d.b.a$a, int, int):void");
    }

    /* renamed from: b */
    private void m10993b(C2109a aVar, HashMap hashMap) throws IOException {
        C2111c cVar = (C2111c) hashMap.get(f8042G);
        C2111c cVar2 = (C2111c) hashMap.get(f8058I);
        if (!(cVar == null || cVar2 == null)) {
            long[] a = m10988a(cVar.mo9193d(this.f8413f));
            long[] a2 = m10988a(cVar2.mo9193d(this.f8413f));
            if (a != null && a2 != null) {
                long j = 0;
                for (long j2 : a2) {
                    j += j2;
                }
                byte[] bArr = new byte[((int) j)];
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < a.length; i3++) {
                    int i4 = (int) a2[i3];
                    int i5 = ((int) a[i3]) - i;
                    aVar.mo9160a((long) i5);
                    int i6 = i + i5;
                    byte[] bArr2 = new byte[i4];
                    aVar.read(bArr2);
                    i = i6 + i4;
                    System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
                    i2 += bArr2.length;
                }
                this.f8414g = true;
                this.f8417j = bArr;
                this.f8416i = bArr.length;
            }
        }
    }

    /* renamed from: b */
    private boolean m10996b(HashMap hashMap) throws IOException {
        C2111c cVar = (C2111c) hashMap.get(f8360u);
        C2111c cVar2 = (C2111c) hashMap.get(f8352t);
        if (!(cVar == null || cVar2 == null)) {
            int b = cVar.mo9191b(this.f8413f);
            int b2 = cVar2.mo9191b(this.f8413f);
            if (b <= 512 && b2 <= 512) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m10994b(InputStream inputStream) throws IOException {
        m10977a(0, 5);
        m10977a(0, 4);
        m10977a(5, 4);
        C2111c cVar = (C2111c) this.f8411d[1].get(f8210b0);
        C2111c cVar2 = (C2111c) this.f8411d[1].get(f8218c0);
        if (!(cVar == null || cVar2 == null)) {
            this.f8411d[0].put(f8352t, cVar);
            this.f8411d[0].put(f8360u, cVar2);
        }
        if (this.f8411d[4].isEmpty() && m10996b((HashMap) this.f8411d[5])) {
            HashMap<String, C2111c>[] hashMapArr = this.f8411d;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        boolean b = m10996b((HashMap) this.f8411d[4]);
    }

    /* renamed from: a */
    private void m10978a(C2109a aVar) throws IOException {
        m11000c(aVar);
        C2111c cVar = (C2111c) this.f8411d[1].get(f8242f0);
        if (cVar != null) {
            C2109a aVar2 = new C2109a(cVar.f8435c);
            aVar2.mo9161a(this.f8413f);
            byte[] bArr = new byte[f8016C5.length];
            aVar2.readFully(bArr);
            aVar2.mo9160a(0);
            byte[] bArr2 = new byte[f8024D5.length];
            aVar2.readFully(bArr2);
            if (Arrays.equals(bArr, f8016C5)) {
                aVar2.mo9160a(8);
            } else if (Arrays.equals(bArr2, f8024D5)) {
                aVar2.mo9160a(12);
            }
            m10992b(aVar2, 6);
            C2111c cVar2 = (C2111c) this.f8411d[7].get(f8212b2);
            C2111c cVar3 = (C2111c) this.f8411d[7].get(f8220c2);
            if (!(cVar2 == null || cVar3 == null)) {
                this.f8411d[5].put(f8066J, cVar2);
                this.f8411d[5].put(f8074K, cVar3);
            }
            C2111c cVar4 = (C2111c) this.f8411d[8].get(f8228d2);
            if (cVar4 != null) {
                int[] iArr = (int[]) cVar4.mo9193d(this.f8413f);
                if (iArr == null || iArr.length != 4) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid aspect frame values. frame=");
                    sb.append(Arrays.toString(iArr));
                    sb.toString();
                } else if (iArr[2] > iArr[0] && iArr[3] > iArr[1]) {
                    int i = (iArr[2] - iArr[0]) + 1;
                    int i2 = (iArr[3] - iArr[1]) + 1;
                    if (i < i2) {
                        int i3 = i + i2;
                        i2 = i3 - i2;
                        i = i3 - i2;
                    }
                    C2111c b = C2111c.m11053b(i, this.f8413f);
                    C2111c b2 = C2111c.m11053b(i2, this.f8413f);
                    this.f8411d[0].put(f8352t, b);
                    this.f8411d[0].put(f8360u, b2);
                }
            }
        }
    }

    /* renamed from: a */
    private void m10984a(byte[] bArr, int i) throws IOException {
        C2109a aVar = new C2109a(bArr);
        m10979a(aVar, bArr.length);
        m10992b(aVar, i);
    }

    /* renamed from: a */
    private void m10979a(C2109a aVar, int i) throws IOException {
        this.f8413f = m11007e(aVar);
        aVar.mo9161a(this.f8413f);
        int readUnsignedShort = aVar.readUnsignedShort();
        int i2 = this.f8410c;
        if (i2 == 7 || i2 == 10 || readUnsignedShort == 42) {
            int readInt = aVar.readInt();
            if (readInt < 8 || readInt >= i) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid first Ifd offset: ");
                sb.append(readInt);
                throw new IOException(sb.toString());
            }
            int i3 = readInt - 8;
            if (i3 > 0 && aVar.skipBytes(i3) != i3) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Couldn't jump to first Ifd: ");
                sb2.append(i3);
                throw new IOException(sb2.toString());
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Invalid start code: ");
        sb3.append(Integer.toHexString(readUnsignedShort));
        throw new IOException(sb3.toString());
    }

    /* renamed from: a */
    private void m10981a(C2109a aVar, HashMap hashMap) throws IOException {
        int i;
        C2111c cVar = (C2111c) hashMap.get(f8066J);
        C2111c cVar2 = (C2111c) hashMap.get(f8074K);
        if (cVar != null && cVar2 != null) {
            int b = cVar.mo9191b(this.f8413f);
            int min = Math.min(cVar2.mo9191b(this.f8413f), aVar.available() - b);
            int i2 = this.f8410c;
            if (i2 == 4 || i2 == 9 || i2 == 10) {
                i = this.f8419l;
            } else {
                if (i2 == 7) {
                    i = this.f8420m;
                }
                if (b > 0 && min > 0) {
                    this.f8414g = true;
                    this.f8415h = b;
                    this.f8416i = min;
                    if (this.f8408a == null && this.f8409b == null) {
                        byte[] bArr = new byte[min];
                        aVar.mo9160a((long) b);
                        aVar.readFully(bArr);
                        this.f8417j = bArr;
                        return;
                    }
                    return;
                }
            }
            b += i;
            if (b > 0) {
            }
        }
    }

    /* renamed from: a */
    private boolean m10986a(HashMap hashMap) throws IOException {
        C2111c cVar = (C2111c) hashMap.get(f8368v);
        if (cVar != null) {
            int[] iArr = (int[]) cVar.mo9193d(this.f8413f);
            if (Arrays.equals(f8295l5, iArr)) {
                return true;
            }
            if (this.f8410c == 3) {
                C2111c cVar2 = (C2111c) hashMap.get(f8384x);
                if (cVar2 != null) {
                    int b = cVar2.mo9191b(this.f8413f);
                    if ((b == 1 && Arrays.equals(iArr, f8311n5)) || (b == 6 && Arrays.equals(iArr, f8295l5))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private int m10974a(C2110b bVar, int i) throws IOException {
        C2110b bVar2 = bVar;
        C2112d[][] dVarArr = f8399y6;
        int[] iArr = new int[dVarArr.length];
        int[] iArr2 = new int[dVarArr.length];
        for (C2112d dVar : f8407z6) {
            m11005d(dVar.f8437b);
        }
        m11005d(f8001A6.f8437b);
        m11005d(f8009B6.f8437b);
        for (int i2 = 0; i2 < f8399y6.length; i2++) {
            for (Object obj : this.f8411d[i2].entrySet().toArray()) {
                Entry entry = (Entry) obj;
                if (entry.getValue() == null) {
                    this.f8411d[i2].remove(entry.getKey());
                }
            }
        }
        if (!this.f8411d[1].isEmpty()) {
            this.f8411d[0].put(f8407z6[1].f8437b, C2111c.m11046a(0, this.f8413f));
        }
        if (!this.f8411d[2].isEmpty()) {
            this.f8411d[0].put(f8407z6[2].f8437b, C2111c.m11046a(0, this.f8413f));
        }
        if (!this.f8411d[3].isEmpty()) {
            this.f8411d[1].put(f8407z6[3].f8437b, C2111c.m11046a(0, this.f8413f));
        }
        if (this.f8414g) {
            this.f8411d[4].put(f8001A6.f8437b, C2111c.m11046a(0, this.f8413f));
            this.f8411d[4].put(f8009B6.f8437b, C2111c.m11046a((long) this.f8416i, this.f8413f));
        }
        for (int i3 = 0; i3 < f8399y6.length; i3++) {
            int i4 = 0;
            for (Entry value : this.f8411d[i3].entrySet()) {
                int a = ((C2111c) value.getValue()).mo9190a();
                if (a > 4) {
                    i4 += a;
                }
            }
            iArr2[i3] = iArr2[i3] + i4;
        }
        int i5 = 8;
        for (int i6 = 0; i6 < f8399y6.length; i6++) {
            if (!this.f8411d[i6].isEmpty()) {
                iArr[i6] = i5;
                i5 += (this.f8411d[i6].size() * 12) + 2 + 4 + iArr2[i6];
            }
        }
        if (this.f8414g) {
            this.f8411d[4].put(f8001A6.f8437b, C2111c.m11046a((long) i5, this.f8413f));
            this.f8415h = i + i5;
            i5 += this.f8416i;
        }
        int i7 = i5 + 8;
        if (!this.f8411d[1].isEmpty()) {
            this.f8411d[0].put(f8407z6[1].f8437b, C2111c.m11046a((long) iArr[1], this.f8413f));
        }
        if (!this.f8411d[2].isEmpty()) {
            this.f8411d[0].put(f8407z6[2].f8437b, C2111c.m11046a((long) iArr[2], this.f8413f));
        }
        if (!this.f8411d[3].isEmpty()) {
            this.f8411d[1].put(f8407z6[3].f8437b, C2111c.m11046a((long) iArr[3], this.f8413f));
        }
        bVar2.mo9181a(i7);
        bVar2.write(f8057H6);
        bVar2.mo9184a(this.f8413f == ByteOrder.BIG_ENDIAN ? f8088L5 : f8080K5);
        bVar2.mo9183a(this.f8413f);
        bVar2.mo9181a(42);
        bVar2.mo9182a(8);
        for (int i8 = 0; i8 < f8399y6.length; i8++) {
            if (!this.f8411d[i8].isEmpty()) {
                bVar2.mo9181a(this.f8411d[i8].size());
                int size = iArr[i8] + 2 + (this.f8411d[i8].size() * 12) + 4;
                for (Entry entry2 : this.f8411d[i8].entrySet()) {
                    int i9 = ((C2112d) f8025D6[i8].get(entry2.getKey())).f8436a;
                    C2111c cVar = (C2111c) entry2.getValue();
                    int a2 = cVar.mo9190a();
                    bVar2.mo9181a(i9);
                    bVar2.mo9181a(cVar.f8433a);
                    bVar2.writeInt(cVar.f8434b);
                    if (a2 > 4) {
                        bVar2.mo9182a((long) size);
                        size += a2;
                    } else {
                        bVar2.write(cVar.f8435c);
                        if (a2 < 4) {
                            while (a2 < 4) {
                                bVar2.writeByte(0);
                                a2++;
                            }
                        }
                    }
                }
                if (i8 != 0 || this.f8411d[4].isEmpty()) {
                    bVar2.mo9182a(0);
                } else {
                    bVar2.mo9182a((long) iArr[4]);
                }
                for (Entry value2 : this.f8411d[i8].entrySet()) {
                    byte[] bArr = ((C2111c) value2.getValue()).f8435c;
                    if (bArr.length > 4) {
                        bVar2.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f8414g) {
            bVar2.write(mo9152i());
        }
        bVar2.mo9183a(ByteOrder.BIG_ENDIAN);
        return i7;
    }

    /* renamed from: a */
    private void m10977a(int i, int i2) throws IOException {
        if (!this.f8411d[i].isEmpty() && !this.f8411d[i2].isEmpty()) {
            HashMap<String, C2111c> hashMap = this.f8411d[i];
            String str = f8360u;
            C2111c cVar = (C2111c) hashMap.get(str);
            HashMap<String, C2111c> hashMap2 = this.f8411d[i];
            String str2 = f8352t;
            C2111c cVar2 = (C2111c) hashMap2.get(str2);
            C2111c cVar3 = (C2111c) this.f8411d[i2].get(str);
            C2111c cVar4 = (C2111c) this.f8411d[i2].get(str2);
            if (cVar != null && cVar2 != null && cVar3 != null && cVar4 != null) {
                int b = cVar.mo9191b(this.f8413f);
                int b2 = cVar2.mo9191b(this.f8413f);
                int b3 = cVar3.mo9191b(this.f8413f);
                int b4 = cVar4.mo9191b(this.f8413f);
                if (b < b3 && b2 < b4) {
                    HashMap<String, C2111c>[] hashMapArr = this.f8411d;
                    HashMap<String, C2111c> hashMap3 = hashMapArr[i];
                    hashMapArr[i] = hashMapArr[i2];
                    hashMapArr[i2] = hashMap3;
                }
            }
        }
    }

    /* renamed from: a */
    private static void m10982a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static int m10976a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return i;
            }
            i += read;
            outputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: a */
    private static long[] m10988a(Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = (long) iArr[i];
            }
            return jArr;
        } else if (obj instanceof long[]) {
            return (long[]) obj;
        } else {
            return null;
        }
    }
}
