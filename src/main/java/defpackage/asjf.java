package defpackage;

/* renamed from: asjf */
public final class asjf extends anxl implements anzf {
    public static final asjf h;
    private static volatile anzq i;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;

    private asjf() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0002\u0003\u0007\u0003\u0004\u0007\u0004\u0005\u0007\u0005\u0006\u0007\u0001", new Object[]{"a", "b", "d", "e", "f", "g", "c"});
            case 3:
                return new asjf();
            case 4:
                return new asje();
            case 5:
                return h;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (asjf.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
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
        asjf asjf = new asjf();
        h = asjf;
        anxl.registerDefaultInstance(asjf.class, asjf);
    }
}
