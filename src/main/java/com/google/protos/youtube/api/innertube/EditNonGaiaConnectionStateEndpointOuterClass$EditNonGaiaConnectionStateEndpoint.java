package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.arax;

public final class EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint extends anxl implements anzf {
    public static final EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint c;
    private static volatile anzq d;
    public static final anxr editNonGaiaConnectionStateEndpoint;
    public int a;
    public String b = "";

    private EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", new Object[]{"a", "b"});
            case 3:
                return new EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint();
            case 4:
                return new arax();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint editNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint = new EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint();
        c = editNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint;
        anxl.registerDefaultInstance(EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint.class, editNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint);
        apxu apxu = apxu.d;
        EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint editNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint2 = c;
        editNonGaiaConnectionStateEndpoint = anxl.newSingularGeneratedExtension(apxu, editNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint2, editNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint2, null, 129377887, aobm.MESSAGE, EditNonGaiaConnectionStateEndpointOuterClass$EditNonGaiaConnectionStateEndpoint.class);
    }
}
