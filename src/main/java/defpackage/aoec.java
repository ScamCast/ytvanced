package defpackage;

/* renamed from: aoec */
public final class aoec extends anxl implements anzf {
    public static final aoec e;
    private static volatile anzq f;
    public int a;
    public int b;
    public int c;
    public aoxs d;

    private aoec() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\f\u0001\u0004\t\u0003", new Object[]{"a", "b", aoek.a, "c", aoei.a, "d"});
            case 3:
                return new aoec();
            case 4:
                return new aoef();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (aoec.class) {
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
        aoec aoec = new aoec();
        e = aoec;
        anxl.registerDefaultInstance(aoec.class, aoec);
    }
}
