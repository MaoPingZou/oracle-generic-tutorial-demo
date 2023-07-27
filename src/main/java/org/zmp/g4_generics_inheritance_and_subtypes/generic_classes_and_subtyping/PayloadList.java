package org.zmp.g4_generics_inheritance_and_subtypes.generic_classes_and_subtyping;

import java.util.List;

public interface PayloadList<E, P> extends List<E> {
    void setPayload(int index, P val);

    // ...

    /*
     *                                           [ Collection<String> ]
     *                                                     ↑
     *                                              [ List<String> ]
     *                  ↑                                  ↑                                ↑
     *    [ PayloadList<String, String> ]   [ PayloadList<String, Integer> ] [ PayloadList<String, Exception> ]
     *
     */
}
