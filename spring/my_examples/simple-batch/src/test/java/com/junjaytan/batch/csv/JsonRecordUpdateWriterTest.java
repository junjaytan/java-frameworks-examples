package com.junjaytan.batch.csv;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;

/**
 * Created by junjaytan on 3/28/16.
 */
public class JsonRecordUpdateWriterTest {
    @Test
    public void myTest() throws Exception {
        // mock EavItem
        EavItem mockedEavItem1 = mock(EavItem.class);

        mockedEavItem1.entity = "entity-A";
        mockedEavItem1.attribute = "attr-A1";
        mockedEavItem1.value = "value-A1";

        EavItem mockedEavItem2 = mock(EavItem.class);

        mockedEavItem2.entity = "entity-A";
        mockedEavItem2.attribute = "attr-A2";
        mockedEavItem2.value = "value-A2";

        EavItem mockedEavItem3 = mock(EavItem.class);
        mockedEavItem3.entity = "entity-B";
        mockedEavItem3.attribute = "attr-B1";
        mockedEavItem3.value = "value-B1";

        List listA = new ArrayList<>();
        listA.add(mockedEavItem1);
        listA.add(mockedEavItem2);

        List listB = new ArrayList<>();
        listB.add(mockedEavItem3);

        // list2 is a list of all EAV lists, where each EAV list represents an entity and its attribute-values
        List list2 = new ArrayList<>();
        list2.add(listA);
        list2.add(listB);

        JsonRecordUpdateWriter myTestWriter = new JsonRecordUpdateWriter();
        myTestWriter.file = "testFile";
        myTestWriter.updatetype = "insert";
        myTestWriter.write(list2);

    }

}
