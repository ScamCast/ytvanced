package defpackage;

/* renamed from: aqjq */
public final class aqjq extends anxl implements anzf {
    public static final aqjq d;
    private static volatile anzq f;
    public int a;
    public aqjo b;
    public aqjy c;
    private byte e = (byte) 2;

    private aqjq() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001慠⑊㙁\u0002\u0000\u0000\u0002慠⑊Љ\u0000㙁Љ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new aqjq();
            case 4:
                return new aqjp();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (aqjq.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
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
        aqjq aqjq = new aqjq();
        d = aqjq;
        anxl.registerDefaultInstance(aqjq.class, aqjq);
    }
}
