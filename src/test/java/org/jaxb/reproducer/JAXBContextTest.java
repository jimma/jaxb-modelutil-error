package org.jaxb.reproducer;

import jakarta.xml.bind.JAXBContext;
import org.junit.Test;

public class JAXBContextTest {
    @Test
    public void testCreateJaxbContext() throws Exception {
        JAXBContext context = JAXBContext.newInstance(new Class[]{javax.xml.namespace.QName.class}, null);
    }
}
