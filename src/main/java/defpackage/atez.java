package defpackage;

/* renamed from: atez */
public final class atez extends anxl implements anzf {
    public static final atez d;
    private static volatile anzq f;
    public int a;
    public asic b;
    public anyd c;
    private byte e = (byte) 2;

    private atez() {
        anxl.emptyProtobufList();
        this.c = anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0006\u0002\u0000\u0001\u0002\u0001Љ\u0000\u0006Л", new Object[]{"a", "b", "c", apxu.class});
            case 3:
                return new atez();
            case 4:
                return new atfc();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (atez.class) {
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
        atez atez = new atez();
        d = atez;
        anxl.registerDefaultInstance(atez.class, atez);
    }
}
