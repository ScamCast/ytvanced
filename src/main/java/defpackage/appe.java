package defpackage;

/* renamed from: appe */
public final class appe extends anxl implements anzf {
    public static final appe c;
    private static volatile anzq e;
    public int a;
    public aphg b;
    private byte d = (byte) 2;

    private appe() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001ἑἑ\u0001\u0000\u0000\u0001ἑЉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new appe();
            case 4:
                return new apph();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (appe.class) {
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
        appe appe = new appe();
        c = appe;
        anxl.registerDefaultInstance(appe.class, appe);
    }
}
