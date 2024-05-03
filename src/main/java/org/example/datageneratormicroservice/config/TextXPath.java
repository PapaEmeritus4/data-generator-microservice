package org.example.datageneratormicroservice.config;

import com.jcabi.xml.XML;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public final class TextXPath {

    private final XML xml;
    private final String node;

    @Override
    public String toString() {
        return "TextPath{" +
                "xml=" + xml +
                ", node='" + node + '\'' +
                '}';
    }
}
