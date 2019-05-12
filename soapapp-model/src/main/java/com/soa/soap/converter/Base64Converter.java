package com.soa.soap.converter;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.Base64;

public class Base64Converter {

    public static String convertToBase64(String filePath) throws IOException {
        byte[] fileContent = FileUtils.readFileToByteArray(new File(filePath));
        return Base64.getEncoder().encodeToString(fileContent);
    }

    public static void convertBase64ToImage(String encodedString, String outputFileName) throws IOException {
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        FileUtils.writeByteArrayToFile(new File(outputFileName), decodedBytes);
    }

    public static void convertBase64ToString(String avatar) {
    }
}
