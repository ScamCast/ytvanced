package defpackage;

/* renamed from: aylu */
public final class aylu extends anxl implements anzf {
    public static final aylu e;
    private static volatile anzq g;
    public int a;
    public ayls b;
    public ayme c;
    public aylc d;
    private byte f = (byte) 2;

    private aylu() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001Љ\u0001\u0002Љ\u0002\u0005Љ\u0000", new Object[]{"a", "c", "d", "b"});
            case 3:
                return new aylu();
            case 4:
                return new aylx();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aylu.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
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
        aylu aylu = new aylu();
        e = aylu;
        anxl.registerDefaultInstance(aylu.class, aylu);
    }
}