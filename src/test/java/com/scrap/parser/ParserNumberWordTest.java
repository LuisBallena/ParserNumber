package com.scrap.parser;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by lballena on 19/01/2016.
 */
public class ParserNumberWordTest {

    @Test
    public void validarConvertNumberToWord(){
        Assert.assertEquals("VEINTIUNO",ParserNumberWord.convertNumberToWord(21));
        Assert.assertEquals("QUINIENTOS VEINTIUNO",ParserNumberWord.convertNumberToWord(521));
        Assert.assertEquals("CIENTO UNO",ParserNumberWord.convertNumberToWord(101));
        Assert.assertEquals("DOS MIL QUINIENTOS SETENTA Y OCHO",ParserNumberWord.convertNumberToWord(2578));
    }

    @Test
    public void validarConvertDecimalToWord(){
        Assert.assertEquals("VEINTIUNO CON 21/100",ParserNumberWord.convertDecimalToWord(21.21,"CON",false));
        Assert.assertEquals("VEINTIUNO PUNTO VEINTIUNO",ParserNumberWord.convertDecimalToWord(21.21, "PUNTO", true));
    }


}
