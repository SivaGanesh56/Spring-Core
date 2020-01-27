package com.phenom.org.multiFiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InstrumentConfig
{
    @Bean
    public Instrument instrument()
    {
        return new Instrument("Guitar");
    }
}
