package p076c.p112d.p113a.p114a.p118d.p124f;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C4519d;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: c.d.a.a.d.f.s */
public interface C2666s extends IInterface {
    /* renamed from: A0 */
    float mo10296A0() throws RemoteException;

    /* renamed from: R */
    float mo10297R() throws RemoteException;

    /* renamed from: a */
    void mo10298a(float f) throws RemoteException;

    /* renamed from: a */
    void mo10299a(C4519d dVar) throws RemoteException;

    /* renamed from: a */
    void mo10300a(LatLngBounds latLngBounds) throws RemoteException;

    /* renamed from: a */
    boolean mo10301a(C2666s sVar) throws RemoteException;

    /* renamed from: b */
    int mo10302b() throws RemoteException;

    /* renamed from: b */
    void mo10303b(float f) throws RemoteException;

    /* renamed from: b */
    void mo10304b(C4519d dVar) throws RemoteException;

    /* renamed from: c */
    void mo10305c(float f, float f2) throws RemoteException;

    /* renamed from: c */
    void mo10306c(boolean z) throws RemoteException;

    /* renamed from: d */
    void mo10307d(float f) throws RemoteException;

    /* renamed from: e */
    void mo10308e(float f) throws RemoteException;

    /* renamed from: f */
    C4519d mo10309f() throws RemoteException;

    /* renamed from: g */
    float mo10310g() throws RemoteException;

    LatLngBounds getBounds() throws RemoteException;

    float getHeight() throws RemoteException;

    String getId() throws RemoteException;

    LatLng getPosition() throws RemoteException;

    float getWidth() throws RemoteException;

    boolean isVisible() throws RemoteException;

    void remove() throws RemoteException;

    void setPosition(LatLng latLng) throws RemoteException;

    void setVisible(boolean z) throws RemoteException;

    /* renamed from: x */
    boolean mo10320x() throws RemoteException;
}
