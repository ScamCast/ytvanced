package defpackage;

/* renamed from: ayrl */
public final class ayrl extends anxl implements anzf {
    public static final ayrl d;
    private static volatile anzq f;
    public int a;
    public ashy b;
    public String c = "";
    private byte e = (byte) 2;

    private ayrl() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001Љ\u0000\u0002\b\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new ayrl();
            case 4:
                return new ayrk();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (ayrl.class) {
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
        ayrl ayrl = new ayrl();
        d = ayrl;
        anxl.registerDefaultInstance(ayrl.class, ayrl);
    }
}
