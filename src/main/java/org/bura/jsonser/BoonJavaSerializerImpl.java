package org.bura.jsonser;


import org.boon.json.JsonSerializer;
import org.boon.json.implementation.JsonSimpleSerializerImpl;

/**
 * Created by rick on 12/29/13.
 */
public class BoonJavaSerializerImpl implements DataSerializer {
    JsonSerializer serializer = new JsonSimpleSerializerImpl ();

    @Override
    public Object serialize ( Object data ) {
        return serializer.serialize ( data );
    }
}
