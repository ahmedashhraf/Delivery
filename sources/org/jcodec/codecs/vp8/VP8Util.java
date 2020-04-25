package org.jcodec.codecs.vp8;

import androidx.recyclerview.widget.C1744m.C1750f;
import com.mrsool.utils.C11644i;
import java.lang.reflect.Array;
import org.apache.http.C15470v;
import org.jcodec.codecs.mjpeg.JpegConst;
import p205i.p471b.p472a.p473a.p474c.p475i.C13959t;

public class VP8Util {
    public static int BLOCK_TYPES = 4;
    public static int COEF_BANDS = 8;
    public static int MAX_ENTROPY_TOKENS = 12;
    public static int MAX_MODE_LF_DELTAS = 4;
    public static int MAX_REF_LF_DELTAS = 4;
    public static final int MB_FEATURE_TREE_PROBS = 3;
    public static final int[] PRED_BLOCK_127 = {C13959t.f40827P1, C13959t.f40827P1, C13959t.f40827P1, C13959t.f40827P1, C13959t.f40827P1, C13959t.f40827P1, C13959t.f40827P1, C13959t.f40827P1, C13959t.f40827P1, C13959t.f40827P1, C13959t.f40827P1, C13959t.f40827P1, C13959t.f40827P1, C13959t.f40827P1, C13959t.f40827P1, C13959t.f40827P1};
    public static final int[] PRED_BLOCK_129 = {C13959t.f40835R1, C13959t.f40835R1, C13959t.f40835R1, C13959t.f40835R1, C13959t.f40835R1, C13959t.f40835R1, C13959t.f40835R1, C13959t.f40835R1, C13959t.f40835R1, C13959t.f40835R1, C13959t.f40835R1, C13959t.f40835R1, C13959t.f40835R1, C13959t.f40835R1, C13959t.f40835R1, C13959t.f40835R1};
    public static int PREV_COEF_CONTEXTS = 3;
    public static int[] keyFrameYModeProb = {C13959t.f40907h2, C13959t.f40953s2, C13959t.f40981z2, 128};
    public static int[] keyFrameYModeTree = {-4, 2, 4, 6, 0, -1, -2, -3};
    static int[][][][] vp8CoefUpdateProbs = {new int[][][]{new int[][]{new int[]{255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}}, new int[][]{new int[]{C13959t.f40816M2, 246, 255, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{223, 241, 252, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{249, 253, 253, 255, 255, 255, 255, 255, 255, 255, 255}}, new int[][]{new int[]{255, 244, 252, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{JpegConst.APPA, JpegConst.COM, JpegConst.COM, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{253, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}}, new int[][]{new int[]{255, 246, JpegConst.COM, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{JpegConst.APPF, 253, JpegConst.COM, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{JpegConst.COM, 255, JpegConst.COM, 255, 255, 255, 255, 255, 255, 255, 255}}, new int[][]{new int[]{255, 248, JpegConst.COM, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{251, 255, JpegConst.COM, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}}, new int[][]{new int[]{255, 253, JpegConst.COM, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{251, JpegConst.COM, JpegConst.COM, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{JpegConst.COM, 255, JpegConst.COM, 255, 255, 255, 255, 255, 255, 255, 255}}, new int[][]{new int[]{255, JpegConst.COM, 253, 255, JpegConst.COM, 255, 255, 255, 255, 255, 255}, new int[]{C1750f.f6813c, 255, JpegConst.COM, 255, JpegConst.COM, 255, 255, 255, 255, 255, 255}, new int[]{JpegConst.COM, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}}, new int[][]{new int[]{255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}}}, new int[][][]{new int[][]{new int[]{217, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{225, 252, 241, 253, 255, 255, JpegConst.COM, 255, 255, 255, 255}, new int[]{JpegConst.APPA, C1750f.f6813c, 241, C1750f.f6813c, 253, 255, 253, JpegConst.COM, 255, 255, 255}}, new int[][]{new int[]{255, JpegConst.COM, 255, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{223, JpegConst.COM, JpegConst.COM, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{JpegConst.APPE, 253, JpegConst.COM, JpegConst.COM, 255, 255, 255, 255, 255, 255, 255}}, new int[][]{new int[]{255, 248, JpegConst.COM, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{249, JpegConst.COM, 255, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}}, new int[][]{new int[]{255, 253, 255, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{247, JpegConst.COM, 255, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}}, new int[][]{new int[]{255, 253, JpegConst.COM, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{252, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}}, new int[][]{new int[]{255, JpegConst.COM, JpegConst.COM, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{253, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}}, new int[][]{new int[]{255, JpegConst.COM, 253, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{C1750f.f6813c, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{JpegConst.COM, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}}, new int[][]{new int[]{255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}}}, new int[][][]{new int[][]{new int[]{C13959t.f40856W2, 251, C1750f.f6813c, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{JpegConst.APPA, 251, 244, JpegConst.COM, 255, 255, 255, 255, 255, 255, 255}, new int[]{251, 251, 243, 253, JpegConst.COM, 255, JpegConst.COM, 255, 255, 255, 255}}, new int[][]{new int[]{255, 253, JpegConst.COM, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{JpegConst.APPC, 253, JpegConst.COM, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{251, 253, 253, JpegConst.COM, JpegConst.COM, 255, 255, 255, 255, 255, 255}}, new int[][]{new int[]{255, JpegConst.COM, JpegConst.COM, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{JpegConst.COM, JpegConst.COM, JpegConst.COM, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}}, new int[][]{new int[]{255, JpegConst.COM, 255, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{JpegConst.COM, JpegConst.COM, 255, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{JpegConst.COM, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}}, new int[][]{new int[]{255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{JpegConst.COM, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}}, new int[][]{new int[]{255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}}, new int[][]{new int[]{255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}}, new int[][]{new int[]{255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}}}, new int[][][]{new int[][]{new int[]{248, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{C1750f.f6813c, JpegConst.COM, 252, JpegConst.COM, 255, 255, 255, 255, 255, 255, 255}, new int[]{248, JpegConst.COM, 249, 253, 255, 255, 255, 255, 255, 255, 255}}, new int[][]{new int[]{255, 253, 253, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{246, 253, 253, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{252, JpegConst.COM, 251, JpegConst.COM, JpegConst.COM, 255, 255, 255, 255, 255, 255}}, new int[][]{new int[]{255, JpegConst.COM, 252, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{248, JpegConst.COM, 253, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{253, 255, JpegConst.COM, JpegConst.COM, 255, 255, 255, 255, 255, 255, 255}}, new int[][]{new int[]{255, 251, JpegConst.COM, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{245, 251, JpegConst.COM, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{253, 253, JpegConst.COM, 255, 255, 255, 255, 255, 255, 255, 255}}, new int[][]{new int[]{255, 251, 253, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{252, 253, JpegConst.COM, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{255, JpegConst.COM, 255, 255, 255, 255, 255, 255, 255, 255, 255}}, new int[][]{new int[]{255, 252, 255, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{249, 255, JpegConst.COM, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{255, 255, JpegConst.COM, 255, 255, 255, 255, 255, 255, 255, 255}}, new int[][]{new int[]{255, 255, 253, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{C1750f.f6813c, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}}, new int[][]{new int[]{255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{JpegConst.COM, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}, new int[]{255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255}}}};
    private static int[][][][] vp8DefaultCoefProbs = {new int[][][]{new int[][]{new int[]{128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128}, new int[]{128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128}, new int[]{128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128}}, new int[][]{new int[]{253, C13959t.f40863Y1, JpegConst.COM, 255, JpegConst.APP4, JpegConst.DQT, 128, 128, 128, 128, 128}, new int[]{C13959t.f40868Z2, C13959t.f40835R1, 242, 255, JpegConst.APP3, JpegConst.RST5, 255, JpegConst.DQT, 128, 128, 128}, new int[]{106, C13959t.f40823O1, JpegConst.APP3, 252, JpegConst.RST6, JpegConst.RST1, 255, 255, 128, 128, 128}}, new int[][]{new int[]{1, 98, 248, 255, JpegConst.APPC, JpegConst.APP2, 255, 255, 128, 128, 128}, new int[]{181, C13959t.f40851V1, JpegConst.APPE, JpegConst.COM, JpegConst.DRI, JpegConst.APPA, 255, C13959t.f40945q2, 128, 128, 128}, new int[]{78, C13959t.f40855W1, C15470v.f44665f, 247, C13959t.f40908h3, 180, 255, JpegConst.DQT, 128, 128, 128}}, new int[][]{new int[]{1, C13959t.f40852V2, 249, 255, 243, 255, 128, 128, 128, 128, 128}, new int[]{184, C13959t.f40929m2, 247, 255, JpegConst.APPC, JpegConst.APP0, 128, 128, 128, 128, 128}, new int[]{77, 110, 216, 255, JpegConst.APPC, JpegConst.APP6, 128, 128, 128, 128, 128}}, new int[][]{new int[]{1, 101, 251, 255, 241, 255, 128, 128, 128, 128, 128}, new int[]{C13959t.f40792G2, C13959t.f40877b2, 241, 252, JpegConst.APPC, JpegConst.RST1, 255, 255, 128, 128, 128}, new int[]{37, 116, JpegConst.DHT, 243, JpegConst.APP4, 255, 255, 255, 128, 128, 128}}, new int[][]{new int[]{1, 204, JpegConst.COM, 255, 245, 255, 128, 128, 128, 128, 128}, new int[]{C15470v.f44670k, C13959t.f40969w2, C1750f.f6813c, 255, JpegConst.APPE, 128, 128, 128, 128, 128, 128}, new int[]{102, 103, JpegConst.APP7, 255, JpegConst.RST3, C13959t.f40796H2, 128, 128, 128, 128, 128}}, new int[][]{new int[]{1, C13959t.f40937o2, 252, 255, 240, 255, 128, 128, 128, 128, 128}, new int[]{C13959t.f40820N2, C13959t.f40859X1, 243, 255, JpegConst.APPA, 225, 128, 128, 128, 128, 128}, new int[]{80, C13959t.f40835R1, JpegConst.RST3, 255, 194, JpegConst.APP0, 128, 128, 128, 128, 128}}, new int[][]{new int[]{1, 1, 255, 128, 128, 128, 128, 128, 128, 128, 128}, new int[]{246, 1, 255, 128, 128, 128, 128, 128, 128, 128, 128}, new int[]{255, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128}}}, new int[][][]{new int[][]{new int[]{C13959t.f40908h3, 35, JpegConst.APPD, 223, 193, C13959t.f40860X2, C13959t.f40977y2, C13959t.f40969w2, C13959t.f40907h2, C13959t.f40949r2, 62}, new int[]{C13959t.f40843T1, 45, C13959t.f40908h3, JpegConst.DRI, C13959t.f40800I2, C13959t.f40816M2, 220, C13959t.f40957t2, 252, JpegConst.DRI, 1}, new int[]{68, 47, C13959t.f40912i2, 208, C13959t.f40925l2, C13959t.f40780D2, JpegConst.DRI, C13959t.f40977y2, 255, 223, 128}}, new int[][]{new int[]{1, C13959t.f40925l2, 241, 255, JpegConst.DRI, JpegConst.APP0, 255, 255, 128, 128, 128}, new int[]{184, C13959t.f40887d2, JpegConst.APPA, 253, C11644i.f33366n0, 220, 255, C13959t.f40913i3, 128, 128, 128}, new int[]{81, 99, 181, 242, C13959t.f40816M2, 190, 249, C15470v.f44665f, 255, 255, 128}}, new int[][]{new int[]{1, C13959t.f40835R1, JpegConst.APP8, 253, JpegConst.RST6, C13959t.f40903g3, 242, JpegConst.DHT, 255, 255, 128}, new int[]{99, 121, JpegConst.RST2, C1750f.f6813c, 201, C13959t.f40908h3, 255, C15470v.f44665f, 128, 128, 128}, new int[]{23, 91, C13959t.f40981z2, 242, C13959t.f40792G2, C13959t.f40860X2, 247, JpegConst.RST2, 255, 255, 128}}, new int[][]{new int[]{1, 200, 246, 255, JpegConst.APPA, 255, 128, 128, 128, 128, 128}, new int[]{109, 178, 241, 255, JpegConst.APP7, 245, 255, 255, 128, 128, 128}, new int[]{44, C13959t.f40839S1, 201, 253, C15470v.f44668i, 192, 255, 255, 128, 128, 128}}, new int[][]{new int[]{1, C13959t.f40847U1, JpegConst.APPF, 251, JpegConst.DQT, JpegConst.RST1, 255, C13959t.f40772B2, 128, 128, 128}, new int[]{94, C13959t.f40863Y1, 225, 251, 218, 190, 255, 255, 128, 128, 128}, new int[]{22, 100, C13959t.f40808K2, 245, C13959t.f40856W2, C13959t.f40973x2, 255, C13959t.f40913i3, 128, 128, 128}}, new int[][]{new int[]{1, C13959t.f40840S2, 249, 255, JpegConst.APP8, JpegConst.APPB, 128, 128, 128, 128, 128}, new int[]{124, C13959t.f40897f2, 241, 255, JpegConst.APP3, JpegConst.APPA, 128, 128, 128, 128, 128}, new int[]{35, 77, 181, 251, 193, JpegConst.RST3, 255, C15470v.f44668i, 128, 128, 128}}, new int[][]{new int[]{1, C13959t.f40957t2, 247, 255, JpegConst.APPC, JpegConst.APP7, 255, 255, 128, 128, 128}, new int[]{121, C13959t.f40887d2, JpegConst.APPB, 255, 225, JpegConst.APP3, 255, 255, 128, 128, 128}, new int[]{45, 99, C13959t.f40864Y2, 251, 195, 217, 255, JpegConst.APP0, 128, 128, 128}}, new int[][]{new int[]{1, 1, 251, 255, JpegConst.RST5, 255, 128, 128, 128, 128, 128}, new int[]{203, 1, 248, 255, 255, 128, 128, 128, 128, 128, 128}, new int[]{C13959t.f40867Z1, 1, C13959t.f40820N2, 255, JpegConst.APP0, 255, 128, 128, 128, 128, 128}}}, new int[][][]{new int[][]{new int[]{253, 9, 248, 251, C15470v.f44670k, 208, 255, 192, 128, 128, 128}, new int[]{175, 13, JpegConst.APP0, 243, 193, C13959t.f40852V2, 249, C13959t.f40908h3, 255, 255, 128}, new int[]{73, 17, C13959t.f40796H2, JpegConst.DRI, C13959t.f40973x2, 179, JpegConst.APPC, C13959t.f40780D2, 255, JpegConst.APPA, 128}}, new int[][]{new int[]{1, 95, 247, 253, JpegConst.RST4, 183, 255, 255, 128, 128, 128}, new int[]{JpegConst.APPF, 90, 244, C1750f.f6813c, JpegConst.RST3, JpegConst.RST1, 255, 255, 128, 128, 128}, new int[]{C13959t.f40949r2, 77, 195, 248, C13959t.f40864Y2, 195, 255, 255, 128, 128, 128}}, new int[][]{new int[]{1, 24, JpegConst.APPF, 251, 218, JpegConst.DQT, 255, C15470v.f44668i, 128, 128, 128}, new int[]{201, 51, JpegConst.DQT, 255, JpegConst.DHT, C13959t.f40856W2, 128, 128, 128, 128, 128}, new int[]{69, 46, 190, JpegConst.APPF, 201, 218, 255, JpegConst.APP4, 128, 128, 128}}, new int[][]{new int[]{1, C13959t.f40878b3, 251, 255, 255, 128, 128, 128, 128, 128, 128}, new int[]{223, C13959t.f40772B2, 249, 255, JpegConst.RST5, 255, 128, 128, 128, 128, 128}, new int[]{C13959t.f40887d2, 124, 248, 255, 255, 128, 128, 128, 128, 128, 128}}, new int[][]{new int[]{1, 16, 248, 255, 255, 128, 128, 128, 128, 128, 128}, new int[]{190, 36, JpegConst.APP6, 255, JpegConst.APPC, 255, 128, 128, 128, 128, 128}, new int[]{C13959t.f40925l2, 1, 255, 128, 128, 128, 128, 128, 128, 128, 128}}, new int[][]{new int[]{1, JpegConst.APP2, 255, 128, 128, 128, 128, 128, 128, 128, 128}, new int[]{247, 192, 255, 128, 128, 128, 128, 128, 128, 128, 128}, new int[]{240, 128, 255, 128, 128, 128, 128, 128, 128, 128, 128}}, new int[][]{new int[]{1, C13959t.f40855W1, 252, 255, 255, 128, 128, 128, 128, 128, 128}, new int[]{JpegConst.RST5, 62, C1750f.f6813c, 255, 255, 128, 128, 128, 128, 128, 128}, new int[]{55, 93, 255, 128, 128, 128, 128, 128, 128, 128, 128}}, new int[][]{new int[]{128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128}, new int[]{128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128}, new int[]{128, 128, 128, 128, 128, 128, 128, 128, 128, 128, 128}}}, new int[][][]{new int[][]{new int[]{C15470v.f44665f, 24, JpegConst.RST5, JpegConst.APPB, C13959t.f40856W2, C13959t.f40878b3, 220, C13959t.f40969w2, 240, 175, 255}, new int[]{C13959t.f40823O1, 38, C13959t.f40840S2, JpegConst.APP8, C13959t.f40788F2, 184, JpegConst.APP4, C13959t.f40808K2, 255, C13959t.f40860X2, 128}, new int[]{61, 46, C13959t.f40872a2, JpegConst.DQT, C13959t.f40933n2, 178, 240, C13959t.f40792G2, 255, 216, 128}}, new int[][]{new int[]{1, 112, JpegConst.APP6, C1750f.f6813c, C13959t.f40913i3, C13959t.f40878b3, 247, C13959t.f40965v2, 255, 255, 128}, new int[]{C13959t.f40776C2, 109, JpegConst.APP4, 252, JpegConst.RST3, 215, 255, C13959t.f40808K2, 128, 128, 128}, new int[]{39, 77, C13959t.f40977y2, JpegConst.APP8, C13959t.f40800I2, 180, 245, 178, 255, 255, 128}}, new int[][]{new int[]{1, 52, 220, 246, C13959t.f40908h3, C13959t.f40913i3, 249, 220, 255, 255, 128}, new int[]{124, 74, C13959t.f40878b3, 243, 183, 193, C1750f.f6813c, JpegConst.DRI, 255, 255, 128}, new int[]{24, 71, C13959t.f40839S1, JpegConst.DQT, C13959t.f40945q2, C13959t.f40792G2, 243, C13959t.f40840S2, 255, 255, 128}}, new int[][]{new int[]{1, C13959t.f40840S2, 225, 249, JpegConst.DQT, 240, 255, JpegConst.APP0, 128, 128, 128}, new int[]{C13959t.f40925l2, C13959t.f40929m2, JpegConst.APP2, 252, 216, C15470v.f44668i, 255, C13959t.f40796H2, 128, 128, 128}, new int[]{28, 108, C13959t.f40792G2, 242, 183, 194, JpegConst.COM, 223, 255, 255, 128}}, new int[][]{new int[]{1, 81, JpegConst.APP6, 252, 204, 203, 255, 192, 128, 128, 128}, new int[]{123, 102, JpegConst.RST1, 247, C13959t.f40864Y2, JpegConst.DHT, 255, JpegConst.APP9, 128, 128, 128}, new int[]{20, 95, C13959t.f40941p2, 243, C13959t.f40768A2, C13959t.f40804J2, 255, 203, 128, 128, 128}}, new int[][]{new int[]{1, C11644i.f33366n0, 248, 255, 216, JpegConst.RST5, 128, 128, 128, 128, 128}, new int[]{C13959t.f40784E2, 175, 246, 252, JpegConst.APPB, C15470v.f44668i, 255, 255, 128, 128, 128}, new int[]{47, 116, 215, 255, JpegConst.RST3, JpegConst.RST4, 255, 255, 128, 128, 128}}, new int[][]{new int[]{1, 121, JpegConst.APPC, 253, JpegConst.RST4, JpegConst.RST6, 255, 255, 128, 128, 128}, new int[]{C13959t.f40887d2, 84, JpegConst.RST5, 252, 201, C15470v.f44665f, 255, JpegConst.DQT, 128, 128, 128}, new int[]{42, 80, C13959t.f40969w2, 240, C13959t.f40977y2, C13959t.f40852V2, 255, C15470v.f44668i, 128, 128, 128}}, new int[][]{new int[]{1, 1, 255, 128, 128, 128, 128, 128, 128, 128, 128}, new int[]{244, 1, 255, 128, 128, 128, 128, 128, 128, 128, 128}, new int[]{JpegConst.APPE, 1, 255, 128, 128, 128, 128, 128, 128, 128, 128}}}};
    public static int[] vp8KeyFrameUVModeProb = {C13959t.f40892e2, 114, 183};
    public static int[] vp8UVModeTree = {0, 2, -1, 4, -2, -3};

    public enum PLANE {
        U,
        V,
        Y1,
        Y2
    }

    public static class QuantizationParams {
        public static final int[] acQLookup = {4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 60, 62, 64, 66, 68, 70, 72, 74, 76, 78, 80, 82, 84, 86, 88, 90, 92, 94, 96, 98, 100, 102, 104, 106, 108, 110, 112, 114, 116, 119, 122, C13959t.f40819N1, 128, C13959t.f40843T1, C13959t.f40855W1, C13959t.f40867Z1, C13959t.f40882c2, C13959t.f40897f2, C13959t.f40912i2, C13959t.f40925l2, C13959t.f40937o2, C13959t.f40949r2, C13959t.f40961u2, C13959t.f40973x2, C13959t.f40768A2, C13959t.f40780D2, C13959t.f40792G2, C13959t.f40804J2, C13959t.f40820N2, 181, C13959t.f40852V2, C13959t.f40868Z2, 193, C13959t.f40903g3, 201, C15470v.f44668i, JpegConst.RST1, JpegConst.RST5, 217, JpegConst.DRI, 225, JpegConst.APP5, JpegConst.APPA, JpegConst.APPF, 245, 249, JpegConst.COM, 259, 264, 269, TiffUtil.TIFF_TAG_ORIENTATION, 279, 284};
        public static final int[] dcQLookup = {4, 5, 6, 7, 8, 9, 10, 10, 11, 12, 13, 14, 15, 16, 17, 17, 18, 19, 20, 20, 21, 21, 22, 22, 23, 23, 24, 25, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 91, 93, 95, 96, 98, 100, 101, 102, 104, 106, 108, 110, 112, 114, 116, 118, 122, 124, C13959t.f40823O1, 128, C13959t.f40839S1, C13959t.f40847U1, C13959t.f40855W1, C13959t.f40863Y1, C13959t.f40872a2, C13959t.f40882c2, C13959t.f40897f2, C13959t.f40907h2, C13959t.f40921k2, C13959t.f40933n2, C13959t.f40945q2, C13959t.f40957t2};
        int chromaAC;
        int chromaDC;
        int y2AC;
        int y2DC;
        int yAC;
        int yDC;

        public QuantizationParams(int i, int i2, int i3, int i4, int i5, int i6) {
            this.yAC = acQLookup[clip(i, C13959t.f40827P1)];
            this.yDC = dcQLookup[clip(i2 + i, C13959t.f40827P1)];
            this.y2DC = dcQLookup[clip(i3 + i, C13959t.f40827P1)] * 2;
            this.y2AC = (acQLookup[clip(i4 + i, C13959t.f40827P1)] * C13959t.f40949r2) / 100;
            if (this.y2AC < 8) {
                this.y2AC = 8;
            }
            this.chromaDC = dcQLookup[clip(i5 + i, C13959t.f40827P1)];
            this.chromaAC = acQLookup[clip(i + i6, C13959t.f40827P1)];
        }

        private static int clip(int i, int i2) {
            if (i > i2) {
                return i2;
            }
            if (i < 0) {
                i = 0;
            }
            return i;
        }

        public static int clip255(int i) {
            if (i > 255) {
                return 255;
            }
            if (i < 0) {
                i = 0;
            }
            return i;
        }
    }

    public static class SubblockConstants {
        public static final int B_DC_PRED = 0;
        public static final int B_HD_PRED = 8;
        public static final int B_HE_PRED = 3;
        public static final int B_HU_PRED = 9;
        public static final int B_LD_PRED = 4;
        public static final int B_PRED = 4;
        public static final int B_RD_PRED = 5;
        public static final int B_TM_PRED = 1;
        public static final int B_VE_PRED = 2;
        public static final int B_VL_PRED = 7;
        public static final int B_VR_PRED = 6;
        public static final int DCT_0 = 0;
        public static final int DCT_1 = 1;
        public static final int DCT_2 = 2;
        public static final int DCT_3 = 3;
        public static final int DCT_4 = 4;
        public static final int DC_PRED = 0;
        public static final int H_PRED = 2;
        public static final int[] Pcat1 = {C13959t.f40965v2, 0};
        public static final int[] Pcat2 = {C13959t.f40772B2, C13959t.f40907h2, 0};
        public static final int[] Pcat3 = {C13959t.f40804J2, C13959t.f40921k2, C13959t.f40882c2, 0};
        public static final int[] Pcat4 = {C13959t.f40816M2, C13959t.f40949r2, C13959t.f40882c2, C13959t.f40859X1, 0};
        public static final int[] Pcat5 = {180, C13959t.f40957t2, C13959t.f40887d2, C13959t.f40855W1, C13959t.f40839S1, 0};
        public static final int[] Pcat6 = {JpegConst.COM, JpegConst.COM, 243, JpegConst.APP6, JpegConst.DHT, C13959t.f40820N2, C13959t.f40941p2, C13959t.f40882c2, C13959t.f40851V1, C13959t.f40839S1, C13959t.f40835R1, 0};
        public static final int TM_PRED = 3;
        public static final int V_PRED = 1;
        public static final int cat_11_18 = 7;
        public static final int cat_19_34 = 8;
        public static final int cat_35_66 = 9;
        public static final int cat_5_6 = 5;
        public static final int cat_67_2048 = 10;
        public static final int cat_7_10 = 6;
        public static final int dct_eob = 11;
        public static int[][][] keyFrameSubblockModeProb = {new int[][]{new int[]{JpegConst.APP7, 120, 48, 89, 115, 113, 120, C13959t.f40937o2, 112}, new int[]{C13959t.f40937o2, 179, 64, C13959t.f40823O1, C13959t.f40792G2, 118, 46, 70, 95}, new int[]{175, 69, C13959t.f40897f2, 80, 85, 82, 72, C13959t.f40949r2, 103}, new int[]{56, 58, 10, C13959t.f40796H2, 218, C13959t.f40868Z2, 17, 13, C13959t.f40937o2}, new int[]{C13959t.f40902g2, 71, 10, 38, C13959t.f40796H2, JpegConst.RST5, C13959t.f40902g2, 34, 26}, new int[]{114, 26, 17, C13959t.f40981z2, 44, 195, 21, 10, C13959t.f40804J2}, new int[]{121, 24, 80, 195, 26, 62, 44, 64, 85}, new int[]{C13959t.f40792G2, 46, 55, 19, C13959t.f40863Y1, C13959t.f40969w2, 33, C15470v.f44669j, 71}, new int[]{63, 20, 8, 114, 114, 208, 12, 9, JpegConst.APP2}, new int[]{81, 40, 11, 96, C13959t.f40840S2, 84, 29, 16, 36}}, new int[][]{new int[]{C13959t.f40855W1, 183, 89, C13959t.f40867Z1, 98, 101, 106, C13959t.f40772B2, C13959t.f40921k2}, new int[]{72, C13959t.f40860X2, 100, C13959t.f40839S1, C13959t.f40957t2, 111, 32, 75, 80}, new int[]{66, 102, C13959t.f40780D2, 99, 74, 62, 40, JpegConst.APPA, 128}, new int[]{41, 53, 9, 178, 241, C13959t.f40887d2, 26, 8, 107}, new int[]{104, 79, 12, 27, 217, 255, 87, 17, 7}, new int[]{74, 43, 26, C13959t.f40912i2, 73, C13959t.f40776C2, 49, 23, C13959t.f40957t2}, new int[]{65, 38, 105, C13959t.f40969w2, 51, 52, 31, 115, 128}, new int[]{87, 68, 71, 44, 114, 51, 15, C13959t.f40856W2, 23}, new int[]{47, 41, 14, 110, C13959t.f40840S2, 183, 21, 17, 194}, new int[]{66, 45, 25, 102, C13959t.f40903g3, C13959t.f40868Z2, 23, 18, 22}}, new int[][]{new int[]{88, 88, C13959t.f40917j2, C13959t.f40929m2, 42, 46, 45, JpegConst.DHT, C15470v.f44668i}, new int[]{43, 97, 183, 117, 85, 38, 35, 179, 61}, new int[]{39, 53, 200, 87, 26, 21, 43, JpegConst.APP8, C13959t.f40796H2}, new int[]{56, 34, 51, 104, 114, 102, 29, 93, 77}, new int[]{107, 54, 32, 26, 51, 1, 81, 43, 31}, new int[]{39, 28, 85, C13959t.f40796H2, 58, C13959t.f40772B2, 90, 98, 64}, new int[]{34, 22, 116, C15470v.f44669j, 23, 34, 43, C13959t.f40776C2, 73}, new int[]{68, 25, 106, 22, 64, C13959t.f40796H2, 36, 225, 114}, new int[]{34, 19, 21, 102, C13959t.f40847U1, C13959t.f40864Y2, 16, 76, 124}, new int[]{62, 18, 78, 95, 85, 57, 50, 48, 51}}, new int[][]{new int[]{193, 101, 35, C13959t.f40965v2, 215, 111, 89, 46, 111}, new int[]{60, C13959t.f40921k2, 31, C13959t.f40800I2, JpegConst.DQT, JpegConst.APP4, 21, 18, 111}, new int[]{112, 113, 77, 85, 179, 255, 38, 120, 114}, new int[]{40, 42, 1, JpegConst.DHT, 245, JpegConst.RST1, 10, 25, 109}, new int[]{100, 80, 8, 43, C13959t.f40945q2, 1, 51, 26, 71}, new int[]{88, 43, 29, C13959t.f40882c2, C13959t.f40776C2, JpegConst.RST5, 37, 43, C13959t.f40945q2}, new int[]{61, 63, 30, C13959t.f40949r2, 67, 45, 68, 1, JpegConst.RST1}, new int[]{C13959t.f40892e2, 78, 78, 16, 255, 128, 34, C13959t.f40903g3, C13959t.f40796H2}, new int[]{41, 40, 5, 102, JpegConst.RST3, 183, 4, 1, JpegConst.DRI}, new int[]{51, 50, 17, C13959t.f40784E2, JpegConst.RST1, 192, 23, 25, 82}}, new int[][]{new int[]{C13959t.f40819N1, 98, 42, 88, 104, 85, 117, 175, 82}, new int[]{95, 84, 53, 89, 128, 100, 113, 101, 45}, new int[]{75, 79, 123, 47, 51, 128, 81, C13959t.f40796H2, 1}, new int[]{57, 17, 5, 71, 102, 57, 53, 41, 49}, new int[]{115, 21, 2, 10, 102, 255, C13959t.f40776C2, 23, 6}, new int[]{38, 33, 13, 121, 57, 73, 26, 1, 85}, new int[]{41, 10, 67, C13959t.f40872a2, 77, 110, 90, 47, 114}, new int[]{101, 29, 16, 10, 85, 128, 101, JpegConst.DHT, 26}, new int[]{57, 18, 10, 102, 102, JpegConst.RST5, 34, 20, 43}, new int[]{117, 20, 15, 36, C13959t.f40981z2, 128, 68, 1, 26}}, new int[][]{new int[]{C13959t.f40872a2, 31, 36, C13959t.f40796H2, 27, C13959t.f40776C2, 38, 44, JpegConst.APP5}, new int[]{67, 87, 58, C13959t.f40788F2, 82, 115, 26, 59, 179}, new int[]{63, 59, 90, 180, 59, C13959t.f40776C2, 93, 73, C13959t.f40945q2}, new int[]{40, 40, 21, 116, C13959t.f40897f2, JpegConst.RST1, 34, 39, 175}, new int[]{57, 46, 22, 24, 128, 1, 54, 17, 37}, new int[]{47, 15, 16, 183, 34, 223, 49, 45, 183}, new int[]{46, 17, 33, 183, 6, 98, 15, 32, 183}, new int[]{65, 32, 73, 115, 28, 128, 23, 128, C15470v.f44668i}, new int[]{40, 3, 9, 115, 51, 192, 18, 6, 223}, new int[]{87, 37, 9, 115, 59, 77, 64, 21, 47}}, new int[][]{new int[]{104, 55, 44, 218, 9, 54, 53, C13959t.f40839S1, JpegConst.APP2}, new int[]{64, 90, 70, C15470v.f44668i, 40, 41, 23, 26, 57}, new int[]{54, 57, 112, 184, 5, 41, 38, C13959t.f40776C2, JpegConst.RST5}, new int[]{30, 34, 26, C13959t.f40851V1, C13959t.f40937o2, 116, 10, 32, C13959t.f40855W1}, new int[]{75, 32, 12, 51, 192, 255, C13959t.f40969w2, 43, 51}, new int[]{39, 19, 53, JpegConst.DRI, 26, 114, 32, 73, 255}, new int[]{31, 9, 65, JpegConst.APPA, 2, 15, 1, 118, 73}, new int[]{88, 31, 35, 67, 102, 85, 55, C13959t.f40856W2, 85}, new int[]{56, 21, 23, 111, 59, C15470v.f44668i, 45, 37, 192}, new int[]{55, 38, 70, 124, 73, 102, 1, 34, 98}}, new int[][]{new int[]{102, 61, 71, 37, 34, 53, 31, 243, 192}, new int[]{69, 60, 71, 38, 73, 119, 28, C11644i.f33366n0, 37}, new int[]{68, 45, 128, 34, 1, 47, 11, 245, C13959t.f40796H2}, new int[]{62, 17, 19, 70, C13959t.f40912i2, 85, 55, 62, 70}, new int[]{75, 15, 9, 9, 64, 255, 184, 119, 16}, new int[]{37, 43, 37, C13959t.f40945q2, 100, C13959t.f40981z2, 85, C13959t.f40969w2, 1}, new int[]{63, 9, 92, C13959t.f40863Y1, 28, 64, 32, 201, 85}, new int[]{86, 6, 28, 5, 64, 255, 25, 248, 1}, new int[]{56, 8, 17, C13959t.f40847U1, C13959t.f40867Z1, 255, 55, 116, 128}, new int[]{58, 15, 20, 82, C13959t.f40859X1, 57, 26, 121, 40}}, new int[][]{new int[]{C13959t.f40768A2, 50, 31, C13959t.f40867Z1, C13959t.f40945q2, C13959t.f40851V1, 25, 35, 218}, new int[]{51, 103, 44, C13959t.f40843T1, C13959t.f40843T1, 123, 31, 6, C13959t.f40961u2}, new int[]{86, 40, 64, C13959t.f40859X1, C13959t.f40921k2, JpegConst.APP0, 45, 183, 128}, new int[]{22, 26, 17, C13959t.f40843T1, 240, C13959t.f40945q2, 14, 1, JpegConst.RST1}, new int[]{83, 12, 13, 54, 192, 255, 68, 47, 28}, new int[]{45, 16, 21, 91, 64, C11644i.f33366n0, 7, 1, C13959t.f40903g3}, new int[]{56, 21, 39, C13959t.f40949r2, 60, C13959t.f40872a2, 23, 102, JpegConst.RST5}, new int[]{85, 26, 85, 85, 128, 128, 32, C13959t.f40912i2, C13959t.f40796H2}, new int[]{18, 11, 7, 63, C13959t.f40902g2, C13959t.f40796H2, 4, 4, 246}, new int[]{35, 27, 10, C13959t.f40912i2, C13959t.f40808K2, C13959t.f40796H2, 12, 26, 128}}, new int[][]{new int[]{190, 80, 35, 99, 180, 80, C13959t.f40823O1, 54, 45}, new int[]{85, C13959t.f40823O1, 47, 87, C13959t.f40816M2, 51, 41, 20, 32}, new int[]{101, 75, 128, C13959t.f40877b2, 118, C13959t.f40912i2, 116, 128, 85}, new int[]{56, 41, 15, C13959t.f40816M2, JpegConst.APPC, 85, 37, 9, 62}, new int[]{C13959t.f40912i2, 36, 19, 30, C13959t.f40796H2, 255, 97, 27, 20}, new int[]{71, 30, 17, 119, 118, 255, 17, 18, C13959t.f40872a2}, new int[]{101, 38, 60, C13959t.f40872a2, 55, 70, 43, 26, C13959t.f40892e2}, new int[]{C13959t.f40872a2, 45, 61, 62, JpegConst.DQT, 1, 81, C13959t.f40864Y2, 64}, new int[]{32, 41, 20, 117, C13959t.f40933n2, C13959t.f40892e2, 20, 21, C13959t.f40981z2}, new int[]{112, 19, 12, 61, 195, 128, 48, 4, 24}}};
        public static int[] subblockModeTree = {0, 2, -1, 4, -2, 6, 8, 12, -3, 10, -5, -6, -4, 14, -7, 16, -8, -9};
        public static final int[] vp8CoefBands = {0, 1, 2, 3, 6, 4, 5, 6, 6, 6, 6, 6, 6, 6, 6, 7};
        public static final int[] vp8CoefTree = {-11, 2, 0, 4, -1, 6, 8, 12, -2, 10, -3, -4, 14, 16, -5, -6, 18, 20, -7, -8, -9, -10};
        public static final int[] vp8defaultZigZag1d = {0, 1, 4, 8, 5, 2, 3, 6, 9, 12, 13, 10, 7, 11, 14, 15};
    }

    /* renamed from: org.jcodec.codecs.vp8.VP8Util$a */
    static /* synthetic */ class C15534a {

        /* renamed from: a */
        static final /* synthetic */ int[] f44786a = new int[PLANE.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                org.jcodec.codecs.vp8.VP8Util$PLANE[] r0 = org.jcodec.codecs.vp8.VP8Util.PLANE.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44786a = r0
                int[] r0 = f44786a     // Catch:{ NoSuchFieldError -> 0x0014 }
                org.jcodec.codecs.vp8.VP8Util$PLANE r1 = org.jcodec.codecs.vp8.VP8Util.PLANE.Y2     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f44786a     // Catch:{ NoSuchFieldError -> 0x001f }
                org.jcodec.codecs.vp8.VP8Util$PLANE r1 = org.jcodec.codecs.vp8.VP8Util.PLANE.Y1     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f44786a     // Catch:{ NoSuchFieldError -> 0x002a }
                org.jcodec.codecs.vp8.VP8Util$PLANE r1 = org.jcodec.codecs.vp8.VP8Util.PLANE.U     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f44786a     // Catch:{ NoSuchFieldError -> 0x0035 }
                org.jcodec.codecs.vp8.VP8Util$PLANE r1 = org.jcodec.codecs.vp8.VP8Util.PLANE.V     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jcodec.codecs.vp8.VP8Util.C15534a.<clinit>():void");
        }
    }

    public static int avg2(int i, int i2) {
        return ((i + i2) + 1) >> 1;
    }

    public static int avg3(int i, int i2, int i3) {
        return ((((i + i2) + i2) + i3) + 2) >> 2;
    }

    public static int delta(BooleanArithmeticDecoder booleanArithmeticDecoder) {
        int decodeInt = booleanArithmeticDecoder.decodeInt(4);
        return booleanArithmeticDecoder.decodeBit() > 0 ? -decodeInt : decodeInt;
    }

    public static int getBitInBytes(byte[] bArr, int i) {
        int i2 = i >> 3;
        return (bArr[i2] >> (i & 7)) & 1;
    }

    public static int getBitsInBytes(byte[] bArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 |= getBitInBytes(bArr, i + i4) << i4;
        }
        return i3;
    }

    public static int[][][][] getDefaultCoefProbs() {
        int[][][][] iArr = vp8DefaultCoefProbs;
        int[][][][] iArr2 = (int[][][][]) Array.newInstance(int.class, new int[]{iArr.length, iArr[0].length, iArr[0][0].length, iArr[0][0][0].length});
        for (int i = 0; i < vp8DefaultCoefProbs.length; i++) {
            for (int i2 = 0; i2 < vp8DefaultCoefProbs[0].length; i2++) {
                for (int i3 = 0; i3 < vp8DefaultCoefProbs[0][0].length; i3++) {
                    int i4 = 0;
                    while (true) {
                        int[][][][] iArr3 = vp8DefaultCoefProbs;
                        if (i4 >= iArr3[0][0][0].length) {
                            break;
                        }
                        iArr2[i][i2][i3][i4] = iArr3[i][i2][i3][i4];
                        i4++;
                    }
                }
            }
        }
        return iArr2;
    }

    public static int getMacroblockCount(int i) {
        int i2 = i & 15;
        if (i2 != 0) {
            i += 16 - i2;
        }
        return i >> 4;
    }

    public static int[] pickDefaultPrediction(int i) {
        if (i == 1 || i == 0 || i == 2 || i == 3 || i == 6 || i == 5 || i == 8) {
            return PRED_BLOCK_129;
        }
        return PRED_BLOCK_127;
    }

    public static int planeToType(PLANE plane, Boolean bool) {
        int i = C15534a.f44786a[plane.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 3;
            if (i != 2) {
                return (i == 3 || i == 4) ? 2 : -1;
            }
            if (bool.booleanValue()) {
                return 0;
            }
        }
        return i2;
    }

    public static int[] predictDC(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        int i = 4;
        int i2 = 0;
        do {
            i += iArr[i2] + iArr2[i2];
            i2++;
        } while (i2 < 4);
        int i3 = i >> 3;
        for (int i4 = 0; i4 < 4; i4++) {
            for (int i5 = 0; i5 < 4; i5++) {
                iArr3[(i4 * 4) + i5] = i3;
            }
        }
        return iArr3;
    }

    public static int[] predictHD(int[] iArr, int[] iArr2, int i) {
        int[] iArr3 = new int[16];
        int[] iArr4 = {iArr2[3], iArr2[2], iArr2[1], iArr2[0], i, iArr[0], iArr[1], iArr[2], iArr[3]};
        iArr3[12] = avg2(iArr4[0], iArr4[1]);
        iArr3[13] = avg3(iArr4[0], iArr4[1], iArr4[2]);
        int avg2 = avg2(iArr4[1], iArr4[2]);
        iArr3[14] = avg2;
        iArr3[8] = avg2;
        int avg3 = avg3(iArr4[1], iArr4[2], iArr4[3]);
        iArr3[15] = avg3;
        iArr3[9] = avg3;
        int avg22 = avg2(iArr4[2], iArr4[3]);
        iArr3[4] = avg22;
        iArr3[10] = avg22;
        int avg32 = avg3(iArr4[2], iArr4[3], iArr4[4]);
        iArr3[5] = avg32;
        iArr3[11] = avg32;
        int avg23 = avg2(iArr4[3], iArr4[4]);
        iArr3[0] = avg23;
        iArr3[6] = avg23;
        int avg33 = avg3(iArr4[3], iArr4[4], iArr4[5]);
        iArr3[1] = avg33;
        iArr3[7] = avg33;
        iArr3[2] = avg3(iArr4[4], iArr4[5], iArr4[6]);
        iArr3[3] = avg3(iArr4[5], iArr4[6], iArr4[7]);
        return iArr3;
    }

    public static int[] predictHE(int[] iArr, int i) {
        int[] iArr2 = new int[16];
        avg3(iArr[2], iArr[3], iArr[3]);
        int avg3 = avg3(iArr[2], iArr[3], iArr[3]);
        iArr2[15] = avg3;
        iArr2[14] = avg3;
        iArr2[13] = avg3;
        iArr2[12] = avg3;
        int avg32 = avg3(iArr[1], iArr[2], iArr[3]);
        iArr2[11] = avg32;
        iArr2[10] = avg32;
        iArr2[9] = avg32;
        iArr2[8] = avg32;
        int avg33 = avg3(iArr[0], iArr[1], iArr[2]);
        iArr2[7] = avg33;
        iArr2[6] = avg33;
        iArr2[5] = avg33;
        iArr2[4] = avg33;
        int avg34 = avg3(i, iArr[0], iArr[1]);
        iArr2[3] = avg34;
        iArr2[2] = avg34;
        iArr2[1] = avg34;
        iArr2[0] = avg34;
        return iArr2;
    }

    public static int[] predictHU(int[] iArr) {
        int[] iArr2 = new int[16];
        iArr2[0] = avg2(iArr[0], iArr[1]);
        iArr2[1] = avg3(iArr[0], iArr[1], iArr[2]);
        int avg2 = avg2(iArr[1], iArr[2]);
        iArr2[4] = avg2;
        iArr2[2] = avg2;
        int avg3 = avg3(iArr[1], iArr[2], iArr[3]);
        iArr2[5] = avg3;
        iArr2[3] = avg3;
        int avg22 = avg2(iArr[2], iArr[3]);
        iArr2[8] = avg22;
        iArr2[6] = avg22;
        int avg32 = avg3(iArr[2], iArr[3], iArr[3]);
        iArr2[9] = avg32;
        iArr2[7] = avg32;
        int i = iArr[3];
        iArr2[15] = i;
        iArr2[14] = i;
        iArr2[13] = i;
        iArr2[12] = i;
        iArr2[11] = i;
        iArr2[10] = i;
        return iArr2;
    }

    public static int[] predictLD(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        iArr3[0] = avg3(iArr[0], iArr[1], iArr[2]);
        int avg3 = avg3(iArr[1], iArr[2], iArr[3]);
        iArr3[4] = avg3;
        iArr3[1] = avg3;
        int avg32 = avg3(iArr[2], iArr[3], iArr2[0]);
        iArr3[8] = avg32;
        iArr3[5] = avg32;
        iArr3[2] = avg32;
        int avg33 = avg3(iArr[3], iArr2[0], iArr2[1]);
        iArr3[12] = avg33;
        iArr3[9] = avg33;
        iArr3[6] = avg33;
        iArr3[3] = avg33;
        int avg34 = avg3(iArr2[0], iArr2[1], iArr2[2]);
        iArr3[13] = avg34;
        iArr3[10] = avg34;
        iArr3[7] = avg34;
        int avg35 = avg3(iArr2[1], iArr2[2], iArr2[3]);
        iArr3[14] = avg35;
        iArr3[11] = avg35;
        iArr3[15] = avg3(iArr2[2], iArr2[3], iArr2[3]);
        return iArr3;
    }

    public static int[] predictRD(int[] iArr, int[] iArr2, int i) {
        int[] iArr3 = new int[16];
        int[] iArr4 = {iArr2[3], iArr2[2], iArr2[1], iArr2[0], i, iArr[0], iArr[1], iArr[2], iArr[3]};
        iArr3[12] = avg3(iArr4[0], iArr4[1], iArr4[2]);
        int avg3 = avg3(iArr4[1], iArr4[2], iArr4[3]);
        iArr3[8] = avg3;
        iArr3[13] = avg3;
        int avg32 = avg3(iArr4[2], iArr4[3], iArr4[4]);
        iArr3[4] = avg32;
        iArr3[9] = avg32;
        iArr3[14] = avg32;
        int avg33 = avg3(iArr4[3], iArr4[4], iArr4[5]);
        iArr3[0] = avg33;
        iArr3[5] = avg33;
        iArr3[10] = avg33;
        iArr3[15] = avg33;
        int avg34 = avg3(iArr4[4], iArr4[5], iArr4[6]);
        iArr3[1] = avg34;
        iArr3[6] = avg34;
        iArr3[11] = avg34;
        int avg35 = avg3(iArr4[5], iArr4[6], iArr4[7]);
        iArr3[2] = avg35;
        iArr3[7] = avg35;
        iArr3[3] = avg3(iArr4[6], iArr4[7], iArr4[8]);
        return iArr3;
    }

    public static int[] predictTM(int[] iArr, int[] iArr2, int i) {
        int[] iArr3 = new int[16];
        for (int i2 = 0; i2 < 4; i2++) {
            for (int i3 = 0; i3 < 4; i3++) {
                iArr3[(i2 * 4) + i3] = QuantizationParams.clip255((iArr2[i2] + iArr[i3]) - i);
            }
        }
        return iArr3;
    }

    public static int[] predictVE(int[] iArr, int i, int[] iArr2) {
        int[] iArr3 = new int[16];
        int avg3 = avg3(i, iArr[0], iArr[1]);
        iArr3[12] = avg3;
        iArr3[8] = avg3;
        iArr3[4] = avg3;
        iArr3[0] = avg3;
        int avg32 = avg3(iArr[0], iArr[1], iArr[2]);
        iArr3[13] = avg32;
        iArr3[9] = avg32;
        iArr3[5] = avg32;
        iArr3[1] = avg32;
        int avg33 = avg3(iArr[1], iArr[2], iArr[3]);
        iArr3[14] = avg33;
        iArr3[10] = avg33;
        iArr3[6] = avg33;
        iArr3[2] = avg33;
        int avg34 = avg3(iArr[2], iArr[3], iArr2[0]);
        iArr3[15] = avg34;
        iArr3[11] = avg34;
        iArr3[7] = avg34;
        iArr3[3] = avg34;
        return iArr3;
    }

    public static int[] predictVL(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        iArr3[0] = avg2(iArr[0], iArr[1]);
        iArr3[4] = avg3(iArr[0], iArr[1], iArr[2]);
        int avg2 = avg2(iArr[1], iArr[2]);
        iArr3[1] = avg2;
        iArr3[8] = avg2;
        int avg3 = avg3(iArr[1], iArr[2], iArr[3]);
        iArr3[12] = avg3;
        iArr3[5] = avg3;
        int avg22 = avg2(iArr[2], iArr[3]);
        iArr3[2] = avg22;
        iArr3[9] = avg22;
        int avg32 = avg3(iArr[2], iArr[3], iArr2[0]);
        iArr3[6] = avg32;
        iArr3[13] = avg32;
        int avg23 = avg2(iArr[3], iArr2[0]);
        iArr3[3] = avg23;
        iArr3[10] = avg23;
        int avg33 = avg3(iArr[3], iArr2[0], iArr2[1]);
        iArr3[7] = avg33;
        iArr3[14] = avg33;
        iArr3[11] = avg3(iArr2[0], iArr2[1], iArr2[2]);
        iArr3[15] = avg3(iArr2[1], iArr2[2], iArr2[3]);
        return iArr3;
    }

    public static int[] predictVR(int[] iArr, int[] iArr2, int i) {
        int[] iArr3 = new int[16];
        int[] iArr4 = {iArr2[3], iArr2[2], iArr2[1], iArr2[0], i, iArr[0], iArr[1], iArr[2], iArr[3]};
        iArr3[12] = avg3(iArr4[1], iArr4[2], iArr4[3]);
        iArr3[8] = avg3(iArr4[2], iArr4[3], iArr4[4]);
        int avg3 = avg3(iArr4[3], iArr4[4], iArr4[5]);
        iArr3[4] = avg3;
        iArr3[13] = avg3;
        int avg2 = avg2(iArr4[4], iArr4[5]);
        iArr3[0] = avg2;
        iArr3[9] = avg2;
        int avg32 = avg3(iArr4[4], iArr4[5], iArr4[6]);
        iArr3[5] = avg32;
        iArr3[14] = avg32;
        int avg22 = avg2(iArr4[5], iArr4[6]);
        iArr3[1] = avg22;
        iArr3[10] = avg22;
        int avg33 = avg3(iArr4[5], iArr4[6], iArr4[7]);
        iArr3[6] = avg33;
        iArr3[15] = avg33;
        int avg23 = avg2(iArr4[6], iArr4[7]);
        iArr3[2] = avg23;
        iArr3[11] = avg23;
        iArr3[7] = avg3(iArr4[6], iArr4[7], iArr4[8]);
        iArr3[3] = avg2(iArr4[7], iArr4[8]);
        return iArr3;
    }
}
