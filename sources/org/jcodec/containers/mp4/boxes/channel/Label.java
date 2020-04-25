package org.jcodec.containers.mp4.boxes.channel;

import com.facebook.internal.NativeProtocol;
import java.util.regex.Pattern;
import org.apache.http.C15470v;

public enum Label {
    Unknown(-1),
    Unused(0),
    UseCoordinates(100),
    Left(1),
    Right(2),
    Center(3),
    LFEScreen(4),
    LeftSurround(5),
    RightSurround(6),
    LeftCenter(7),
    RightCenter(8),
    CenterSurround(9),
    LeftSurroundDirect(10),
    RightSurroundDirect(11),
    TopCenterSurround(12),
    VerticalHeightLeft(13),
    VerticalHeightCenter(14),
    VerticalHeightRight(15),
    TopBackLeft(16),
    TopBackCenter(17),
    TopBackRight(18),
    RearSurroundLeft(33),
    RearSurroundRight(34),
    LeftWide(35),
    RightWide(36),
    LFE2(37),
    LeftTotal(38),
    RightTotal(39),
    HearingImpaired(40),
    Narration(41),
    Mono(42),
    DialogCentricMix(43),
    CenterSurroundDirect(44),
    Ambisonic_W(200),
    Ambisonic_X(201),
    Ambisonic_Y(C15470v.f44665f),
    Ambisonic_Z(203),
    MS_Mid(204),
    MS_Side(C15470v.f44668i),
    XY_X(C15470v.f44669j),
    XY_Y(C15470v.f44670k),
    HeadphonesLeft(301),
    HeadphonesRight(302),
    ClickTrack(304),
    ForeignLanguage(C15470v.f44676q),
    Discrete(400),
    Discrete_0(65536),
    Discrete_1(NativeProtocol.MESSAGE_GET_ACCESS_TOKEN_REPLY),
    Discrete_2(65538),
    Discrete_3(65539),
    Discrete_4(65540),
    Discrete_5(NativeProtocol.MESSAGE_GET_INSTALL_DATA_REPLY),
    Discrete_6(NativeProtocol.MESSAGE_GET_LIKE_STATUS_REQUEST),
    Discrete_7(NativeProtocol.MESSAGE_GET_LIKE_STATUS_REPLY),
    Discrete_8(NativeProtocol.MESSAGE_GET_AK_SEAMLESS_TOKEN_REQUEST),
    Discrete_9(NativeProtocol.MESSAGE_GET_AK_SEAMLESS_TOKEN_REPLY),
    Discrete_10(NativeProtocol.MESSAGE_GET_LOGIN_STATUS_REQUEST),
    Discrete_11(NativeProtocol.MESSAGE_GET_LOGIN_STATUS_REPLY),
    Discrete_12(65548),
    Discrete_13(65549),
    Discrete_14(65550),
    Discrete_15(65551),
    Discrete_65535(131071);
    
    public static final Pattern channelMappingRegex = null;
    final long bitmapVal;
    final int labelVal;

    static {
        channelMappingRegex = Pattern.compile("[_\\ \\.][a-zA-Z]+$");
    }

    private Label(int i) {
        this.labelVal = i;
        int i2 = this.labelVal;
        this.bitmapVal = (i2 > 18 || i2 < 1) ? 0 : (long) (1 << (i2 - 1));
    }

    public static Label getByVal(int i) {
        Label[] values;
        for (Label label : values()) {
            if (label.labelVal == i) {
                return label;
            }
        }
        return Mono;
    }

    public int getVal() {
        return this.labelVal;
    }
}
