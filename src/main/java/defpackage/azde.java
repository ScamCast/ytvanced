package defpackage;

/* renamed from: azde */
public final class azde extends anxl implements anzf {
    public static final azde d;
    private static volatile anzq f;
    public int a;
    public ayxj b;
    public auvn c;
    private byte e = (byte) 2;

    private azde() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001ᾮ⿙\u0002\u0000\u0000\u0002ᾮЉ\u0001⿙Љ\u0000", new Object[]{"a", "c", "b"});
            case 3:
                return new azde();
            case 4:
                return new azdd();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (azde.class) {
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
        azde azde = new azde();
        d = azde;
        anxl.registerDefaultInstance(azde.class, azde);
    }
}
