package com.google.android.gms.auth;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.io.IOException;

/* renamed from: com.google.android.gms.auth.m */
final class C4046m implements C4047n<Boolean> {

    /* renamed from: a */
    private final /* synthetic */ String f12740a;

    C4046m(String str) {
        this.f12740a = str;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo17573a(IBinder iBinder) throws RemoteException, IOException, GoogleAuthException {
        Bundle bundle = (Bundle) 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000e: CHECK_CAST  (r8v4 'bundle' android.os.Bundle) = (android.os.Bundle) (wrap: java.lang.Object
              0x000a: INVOKE  (r8v3 java.lang.Object) = (wrap: android.os.Bundle
              0x0006: INVOKE  (r8v2 android.os.Bundle) = (wrap: com.google.android.gms.internal.auth.z
              0x0000: INVOKE  (r8v1 com.google.android.gms.internal.auth.z) = (r8v0 'iBinder' android.os.IBinder) com.google.android.gms.internal.auth.a0.a(android.os.IBinder):com.google.android.gms.internal.auth.z type: STATIC), (wrap: java.lang.String
              0x0004: IGET  (r0v0 java.lang.String) = (r7v0 'this' com.google.android.gms.auth.m A[THIS]) com.google.android.gms.auth.m.a java.lang.String) com.google.android.gms.internal.auth.z.a(java.lang.String):android.os.Bundle type: INTERFACE) com.google.android.gms.auth.h.b(java.lang.Object):java.lang.Object type: STATIC) in method: com.google.android.gms.auth.m.a(android.os.IBinder):java.lang.Object, dex: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:245)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:213)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:210)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:203)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:316)
            	at jadx.core.codegen.ClassGen.addMethods(ClassGen.java:262)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:225)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:110)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:76)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:32)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:20)
            	at jadx.core.ProcessClass.process(ProcessClass.java:36)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
            Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x000a: INVOKE  (r8v3 java.lang.Object) = (wrap: android.os.Bundle
              0x0006: INVOKE  (r8v2 android.os.Bundle) = (wrap: com.google.android.gms.internal.auth.z
              0x0000: INVOKE  (r8v1 com.google.android.gms.internal.auth.z) = (r8v0 'iBinder' android.os.IBinder) com.google.android.gms.internal.auth.a0.a(android.os.IBinder):com.google.android.gms.internal.auth.z type: STATIC), (wrap: java.lang.String
              0x0004: IGET  (r0v0 java.lang.String) = (r7v0 'this' com.google.android.gms.auth.m A[THIS]) com.google.android.gms.auth.m.a java.lang.String) com.google.android.gms.internal.auth.z.a(java.lang.String):android.os.Bundle type: INTERFACE) com.google.android.gms.auth.h.b(java.lang.Object):java.lang.Object type: STATIC in method: com.google.android.gms.auth.m.a(android.os.IBinder):java.lang.Object, dex: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:245)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:105)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:280)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:239)
            	... 19 more
            Caused by: java.util.ConcurrentModificationException
            	at java.base/java.util.ArrayList.removeIf(ArrayList.java:1714)
            	at java.base/java.util.ArrayList.removeIf(ArrayList.java:1689)
            	at jadx.core.dex.instructions.args.SSAVar.removeUse(SSAVar.java:86)
            	at jadx.core.utils.InsnRemover.unbindArgUsage(InsnRemover.java:90)
            	at jadx.core.dex.nodes.InsnNode.replaceArg(InsnNode.java:130)
            	at jadx.core.dex.nodes.InsnNode.replaceArg(InsnNode.java:134)
            	at jadx.core.codegen.InsnGen.inlineMethod(InsnGen.java:892)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:669)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:357)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:223)
            	... 22 more
            */
        /*
            this = this;
            com.google.android.gms.internal.auth.z r8 = com.google.android.gms.internal.auth.C4573a0.m19635a(r8)
            java.lang.String r0 = r7.f12740a
            android.os.Bundle r8 = r8.mo18677a(r0)
            java.lang.Object r8 = com.google.android.gms.auth.C4041h.m17492a(r8)
            android.os.Bundle r8 = (android.os.Bundle) r8
            java.lang.String r0 = "Error"
            java.lang.String r0 = r8.getString(r0)
            java.lang.String r1 = "userRecoveryIntent"
            android.os.Parcelable r8 = r8.getParcelable(r1)
            android.content.Intent r8 = (android.content.Intent) r8
            com.google.android.gms.internal.auth.v r1 = com.google.android.gms.internal.auth.C4613v.m19725b(r0)
            com.google.android.gms.internal.auth.v r2 = com.google.android.gms.internal.auth.C4613v.SUCCESS
            boolean r2 = r2.equals(r1)
            r3 = 1
            if (r2 == 0) goto L_0x0030
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        L_0x0030:
            boolean r2 = com.google.android.gms.internal.auth.C4613v.m19724a(r1)
            if (r2 == 0) goto L_0x0069
            com.google.android.gms.common.n.a r2 = com.google.android.gms.auth.C4041h.f12731l
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r5 = java.lang.String.valueOf(r1)
            int r5 = r5.length()
            int r5 = r5 + 31
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "isUserRecoverableError status: "
            r6.append(r5)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            r3[r4] = r1
            java.lang.String r1 = "GoogleAuthUtil"
            r2.mo18437e(r1, r3)
            com.google.android.gms.auth.UserRecoverableAuthException r1 = new com.google.android.gms.auth.UserRecoverableAuthException
            r1.<init>(r0, r8)
            throw r1
        L_0x0069:
            com.google.android.gms.auth.GoogleAuthException r8 = new com.google.android.gms.auth.GoogleAuthException
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.C4046m.mo17573a(android.os.IBinder):java.lang.Object");
    }
}
