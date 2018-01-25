package com.junjaytan.java;

import static java.nio.charset.StandardCharsets.UTF_8;

import com.google.common.io.CharStreams;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * Example of zipping and unzipping content in Java.
 */
public class ZipExample
{
  public static void main( String[] args ) throws IOException {
    // Map of desired file names and content.
    Map<String, String> stuffToZip = new HashMap<String, String>() {{
      put("file1.txt",
          "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor.");
      put("file2.txt", "in voluptate velit esse cillum dolore eu fugiat nulla pariatur"); }};

    // Zipping
    ZipExample myZipExample = new ZipExample();
    byte[] zippedData = myZipExample.zipStuff(stuffToZip);

    // Unzipping
    Map<String, String> unzippedData = myZipExample.unzipStuff(zippedData);
    System.out.println("Unzipped contents are: ");
    for (Map.Entry<String, String> entry : unzippedData.entrySet()) {
      System.out.println("Filename: " + entry.getKey());
      System.out.println("Content: " + entry.getValue());
    }
  }

  public byte[] zipStuff(Map<String, String> dataMap) throws IOException {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

    // Try with resources
    try (ZipOutputStream zipOutputStream = new ZipOutputStream(byteArrayOutputStream)) {
      for (Map.Entry<String, String> entry : dataMap.entrySet()) {
        zipOutputStream.putNextEntry(new ZipEntry(entry.getKey()));
        zipOutputStream.write(entry.getValue().getBytes());
        zipOutputStream.closeEntry();
        System.out.println("Zipped content for file " + entry.getKey() + ".");
      }
    }
    return byteArrayOutputStream.toByteArray();
  }

  public Map<String, String> unzipStuff(byte[] zippedData) throws IOException {
    Map<String, String> unzippedDataMap = new HashMap<>();
    ZipInputStream zipInputStream = new ZipInputStream(new ByteArrayInputStream(zippedData));

    ZipEntry currentEntry;
    while ((currentEntry = zipInputStream.getNextEntry()) != null) {
      unzippedDataMap.put(
          currentEntry.getName(),
          CharStreams.toString(new BufferedReader(new InputStreamReader(zipInputStream, UTF_8))));
      zipInputStream.closeEntry();
    }
    zipInputStream.close();
    return unzippedDataMap;
  }
}
