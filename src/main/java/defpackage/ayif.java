package defpackage;

/* renamed from: ayif */
public final class ayif extends anxl implements anzf {
    public static final ayif c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private ayif() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.d = b;
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0002\u0001\u0000ᣑ⮀\u0002\u0000\u0000\u0001ᣑм\u0000⮀<\u0000", new Object[]{"b", "a", avkc.class, avta.class});
            case 3:
                return new ayif();
            case 4:
                return new ayie();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ayif.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
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
        ayif ayif = new ayif();
        c = ayif;
        anxl.registerDefaultInstance(ayif.class, ayif);
    }
}
