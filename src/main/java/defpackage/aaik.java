package defpackage;

import java.util.Collections;
import java.util.HashSet;

/* renamed from: aaik */
final class aaik extends xto {
    aaik(String str) {
        super(str);
    }

    public final /* synthetic */ Object a() {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(aahv.a));
        hashSet.add(Integer.valueOf(aahv.at));
        hashSet.add(Integer.valueOf(aahv.f));
        hashSet.add(Integer.valueOf(aahv.g));
        return Collections.unmodifiableSet(hashSet);
    }
}
