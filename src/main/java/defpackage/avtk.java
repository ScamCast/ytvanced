package defpackage;

/* renamed from: avtk */
public final class avtk extends anxl implements anzf {
    public static final avtk f;
    private static volatile anzq g;
    public int a;
    public String b = "";
    public boolean c;
    public boolean d;
    public avti e;

    private avtk() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\t\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new avtk();
            case 4:
                return new avtn();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (avtk.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avtk avtk = new avtk();
        f = avtk;
        anxl.registerDefaultInstance(avtk.class, avtk);
    }
}
