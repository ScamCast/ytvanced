package defpackage;

/* renamed from: atcg */
public final class atcg extends anxl implements anzf {
    public static final atcg f;
    private static volatile anzq h;
    public int a;
    public ashy b;
    public anyd c = anxl.emptyProtobufList();
    public String d = "";
    public boolean e;
    private byte g = (byte) 2;

    private atcg() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001Љ\u0000\u0002\u001b\u0003\b\u0001\u0004\u0007\u0002", new Object[]{"a", "b", "c", atcu.class, "d", "e"});
            case 3:
                return new atcg();
            case 4:
                return new atcf();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (atcg.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atcg atcg = new atcg();
        f = atcg;
        anxl.registerDefaultInstance(atcg.class, atcg);
    }
}
