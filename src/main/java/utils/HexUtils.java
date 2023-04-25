package utils;

import org.apache.commons.codec.DecoderException;
import org.apache.commons.codec.binary.Hex;

import java.nio.charset.StandardCharsets;

public class HexUtils {

    public static void main(String[] args) {

        try {
            System.out.println(new String(Hex.decodeHex("0f 00 02 00 dd 00 0c 00"), StandardCharsets.UTF_8));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
