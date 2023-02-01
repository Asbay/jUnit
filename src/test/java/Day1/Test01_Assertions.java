package Day1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Test01_Assertions {

    @Test
    public void test(){   //main methodu olmadan calisiyo run var
        //main methodu junit icinde gömülü olarak geliyor
        //junit 5 ile beraber methodlar mutlaka publicile belirtilmesi zorunlulugu ortadan kalkti


    }
    // genel olarak test isimlendirmelerinde  "test" ile baslar
    @Test
    public void testLength(){ //String classindan gelen  length() methodu testi

        String kelime = "Merhaba Dünya";  // 13 karakter
        int anlikDeger = kelime.length();
        int beklenenDeger = 13;
        assertEquals(beklenenDeger,anlikDeger);

    }

    @Test
    public void testUpperCase(){

        String anlikDeger = "Merhaba".toUpperCase();
        //String beklenenDeger = "MERHABA";
        //assertEquals(beklenenDeger,anlikDeger);
       //hata aninda kullaniciya mesaj vermek istiyorsak
        String beklenenDeger = "MERHABA";
       assertEquals(beklenenDeger, anlikDeger,"UpperCase() methodu düzgün calismadi");
    }

    @Test
    void testToplama(){  //Math.addExact()
        int sayi1 =10;
        int sayi2= 5;
        int anlikDeger= Math.addExact(sayi1,sayi2);
        int beklenenDeger = 15;
        assertEquals(beklenenDeger, anlikDeger);

    }

    @Test
    void testContains(){

        assertEquals(false,"Mirac".contains("z"));
    }




}
