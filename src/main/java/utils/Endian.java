package utils;

import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class Endian {

    @Test
    public void test1() {
        byte[] bytes = "world".getBytes();
        ByteBuffer buf = ByteBuffer.wrap(bytes);

//        buf.order(ByteOrder.LITTLE_ENDIAN);
        buf.order(ByteOrder.BIG_ENDIAN);

        System.out.println((char) buf.get());
    }

//    @Test
//    public void test2() {
//        int integer = 0x1234;
//
//
//        buf.order(ByteOrder.LITTLE_ENDIAN);
//        buf.order(ByteOrder.BIG_ENDIAN);
//
//        System.out.println((char) buf.get());
//    }
}
