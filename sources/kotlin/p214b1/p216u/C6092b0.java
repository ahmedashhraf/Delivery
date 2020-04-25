package kotlin.p214b1.p216u;

import java.io.Serializable;
import kotlin.C6049b;
import kotlin.C6093c;
import kotlin.C6101i;
import kotlin.p214b1.p215t.C6069a;
import kotlin.p214b1.p215t.C6070b;
import kotlin.p214b1.p215t.C6071c;
import kotlin.p214b1.p215t.C6072d;
import kotlin.p214b1.p215t.C6073e;
import kotlin.p214b1.p215t.C6074f;
import kotlin.p214b1.p215t.C6075g;
import kotlin.p214b1.p215t.C6076h;
import kotlin.p214b1.p215t.C6077i;
import kotlin.p214b1.p215t.C6078j;
import kotlin.p214b1.p215t.C6079k;
import kotlin.p214b1.p215t.C6080l;
import kotlin.p214b1.p215t.C6081m;
import kotlin.p214b1.p215t.C6082n;
import kotlin.p214b1.p215t.C6083o;
import kotlin.p214b1.p215t.C6084p;
import kotlin.p214b1.p215t.C6085q;
import kotlin.p214b1.p215t.C6086r;
import kotlin.p214b1.p215t.C6087s;
import kotlin.p214b1.p215t.C6088t;
import kotlin.p214b1.p215t.C6089u;
import kotlin.p214b1.p215t.C6090v;
import kotlin.p214b1.p215t.C6091w;

@Deprecated
@C6049b(level = C6093c.ERROR, message = "This class is no longer supported, do not use it.")
/* renamed from: kotlin.b1.u.b0 */
/* compiled from: FunctionImpl */
public abstract class C6092b0 implements C6101i, Serializable, C6069a, C6080l, C6084p, C6085q, C6086r, C6087s, C6088t, C6089u, C6090v, C6091w, C6070b, C6071c, C6072d, C6073e, C6074f, C6075g, C6076h, C6077i, C6078j, C6079k, C6081m, C6082n, C6083o {
    /* renamed from: b */
    private void m27766b(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("Wrong function arity, expected: ");
        sb.append(i);
        sb.append(", actual: ");
        sb.append(getArity());
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public Object mo24970a(Object... objArr) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public Object mo24962d(Object obj, Object obj2) {
        m27765a(2);
        return mo24970a(obj, obj2);
    }

    public abstract int getArity();

    public Object invoke(Object obj) {
        m27765a(1);
        return mo24970a(obj);
    }

    /* renamed from: p */
    public Object mo24947p() {
        m27765a(0);
        return mo24970a(new Object[0]);
    }

    /* renamed from: a */
    private void m27765a(int i) {
        if (getArity() != i) {
            m27766b(i);
        }
    }

    /* renamed from: b */
    public Object mo24963b(Object obj, Object obj2, Object obj3) {
        m27765a(3);
        return mo24970a(obj, obj2, obj3);
    }

    /* renamed from: a */
    public Object mo24964a(Object obj, Object obj2, Object obj3, Object obj4) {
        m27765a(4);
        return mo24970a(obj, obj2, obj3, obj4);
    }

    /* renamed from: a */
    public Object mo24965a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        m27765a(5);
        return mo24970a(obj, obj2, obj3, obj4, obj5);
    }

    /* renamed from: a */
    public Object mo24966a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        m27765a(6);
        return mo24970a(obj, obj2, obj3, obj4, obj5, obj6);
    }

    /* renamed from: a */
    public Object mo24967a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        m27765a(7);
        return mo24970a(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    /* renamed from: a */
    public Object mo24968a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        m27765a(8);
        return mo24970a(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    /* renamed from: a */
    public Object mo24969a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
        m27765a(9);
        return mo24970a(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    /* renamed from: a */
    public Object mo24948a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        m27765a(10);
        return mo24970a(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    /* renamed from: a */
    public Object mo24949a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
        m27765a(11);
        return mo24970a(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
    }

    /* renamed from: a */
    public Object mo24950a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12) {
        m27765a(12);
        return mo24970a(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12);
    }

    /* renamed from: a */
    public Object mo24951a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
        m27765a(13);
        return mo24970a(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13);
    }

    /* renamed from: a */
    public Object mo24952a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14) {
        m27765a(14);
        return mo24970a(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14);
    }

    /* renamed from: a */
    public Object mo24953a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15) {
        m27765a(15);
        return mo24970a(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15);
    }

    /* renamed from: a */
    public Object mo24954a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16) {
        m27765a(16);
        return mo24970a(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16);
    }

    /* renamed from: a */
    public Object mo24955a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17) {
        m27765a(17);
        return mo24970a(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17);
    }

    /* renamed from: a */
    public Object mo24956a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18) {
        m27765a(18);
        return mo24970a(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18);
    }

    /* renamed from: a */
    public Object mo24957a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19) {
        m27765a(19);
        return mo24970a(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19);
    }

    /* renamed from: a */
    public Object mo24959a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20) {
        m27765a(20);
        return mo24970a(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20);
    }

    /* renamed from: a */
    public Object mo24960a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21) {
        m27765a(21);
        return mo24970a(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21);
    }

    /* renamed from: a */
    public Object mo24961a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13, Object obj14, Object obj15, Object obj16, Object obj17, Object obj18, Object obj19, Object obj20, Object obj21, Object obj22) {
        m27765a(22);
        return mo24970a(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21, obj22);
    }
}
