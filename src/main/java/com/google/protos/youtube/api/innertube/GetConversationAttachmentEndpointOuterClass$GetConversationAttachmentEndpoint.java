package com.google.protos.youtube.api.innertube;

import defpackage.anxl;
import defpackage.anxn;
import defpackage.anxr;
import defpackage.anxu;
import defpackage.anzf;
import defpackage.anzq;
import defpackage.aobm;
import defpackage.apxu;
import defpackage.arqx;

public final class GetConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint extends anxl implements anzf {
    public static final GetConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint e;
    private static volatile anzq f;
    public static final anxr getConversationAttachmentEndpoint;
    public int a;
    public String b;
    public String c;
    public String d;

    private GetConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint() {
        String str = "";
        this.b = str;
        this.c = str;
        this.d = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\b\u0000\u0003\b\u0001\u0004\b\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new GetConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint();
            case 4:
                return new arqx();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (GetConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        GetConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint getConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint = new GetConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint();
        e = getConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint;
        anxl.registerDefaultInstance(GetConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint.class, getConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint);
        apxu apxu = apxu.d;
        GetConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint getConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint2 = e;
        getConversationAttachmentEndpoint = anxl.newSingularGeneratedExtension(apxu, getConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint2, getConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint2, null, 156805104, aobm.MESSAGE, GetConversationAttachmentEndpointOuterClass$GetConversationAttachmentEndpoint.class);
    }
}
