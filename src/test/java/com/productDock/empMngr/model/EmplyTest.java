package com.productDock.empMngr.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmplyTest {

    Emply emlyT=new Emply("Jovan","jocika@gmail.com","0038754828282","avatar7.png","111222");

    @Test
    void getImgURL() {
        String expected = "avatar6.png";
        String actual=emlyT.getImgURL();
        assertEquals(expected,actual);
    }
}