package defpackage;

/* renamed from: awrm */
public final class awrm extends anxl implements anzf {
    public static final awrm g;
    private static volatile anzq i;
    public int a;
    public awra b;
    public awpy c;
    public axak d;
    public aojc e;
    public axak f;
    private byte h = (byte) 2;

    private awrm() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0005\u0001Љ\u0000\u0002Љ\u0001\u0004Љ\u0002\u0007Љ\u0003\bЉ\u0007", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new awrm();
            case 4:
                return new awrp();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (awrm.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        awrm awrm = new awrm();
        g = awrm;
        anxl.registerDefaultInstance(awrm.class, awrm);
    }
}
