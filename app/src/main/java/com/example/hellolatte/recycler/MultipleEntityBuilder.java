package com.example.hellolatte.recycler;

import java.util.LinkedHashMap;
import java.util.LinkedList;

/**
 * Created by 57585 on 2019/2/26.
 */

public class MultipleEntityBuilder {

    private static final LinkedHashMap<Object, Object> FIELDS = new LinkedHashMap<>();

    public MultipleEntityBuilder() {
        FIELDS.clear();
    }

    public void setItemType(int itemType) {
        FIELDS.put(MultipleFields.ITEM_TYPE, itemType);
    }

    public void setField(Object key, Object value) {
        FIELDS.put(key, value);
    }

    public void setFields(LinkedHashMap<Object, Object> map) {
        FIELDS.putAll(map);
    }


    public MultipleItemEntity build() {
        return new MultipleItemEntity(FIELDS);
    }
}
