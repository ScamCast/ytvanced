package defpackage;

/* renamed from: azvr */
public final class azvr extends anxl implements anzf {
    public static final azvr d;
    private static volatile anzq e;
    public int a;
    public float b;
    public float c;

    private azvr() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0000\u0002\u0001\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new azvr();
            case 4:
                return new azvq();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (azvr.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        azvr azvr = new azvr();
        d = azvr;
        anxl.registerDefaultInstance(azvr.class, azvr);
    }
}
