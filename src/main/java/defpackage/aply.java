package defpackage;

/* renamed from: aply */
public final class aply extends anxl implements anzf {
    public static final aply b;
    private static volatile anzq d;
    public anyd a = anxl.emptyProtobufList();
    private byte c = (byte) 2;

    private aply() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.c = b;
                return null;
            case 2:
                return anxl.newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", apma.class});
            case 3:
                return new aply();
            case 4:
                return new apmb();
            case 5:
                return b;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (aply.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(b);
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
        aply aply = new aply();
        b = aply;
        anxl.registerDefaultInstance(aply.class, aply);
    }
}
