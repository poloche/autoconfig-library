package com.example.autoconf;

import com.example.autoconf.properties.Data;
import com.example.autoconf.properties.LibraryProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(LibraryProperties.class)
public class LibraryAutoConfiguration {
    private Data data;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
