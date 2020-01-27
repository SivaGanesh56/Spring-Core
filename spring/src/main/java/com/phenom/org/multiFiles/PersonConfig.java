package com.phenom.org.multiFiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(InstrumentConfig.class)
public class PersonConfig
{
    @Value("#{instrument}")
    private Instrument instrument;

    @Bean
    public Person person()
    {
        return new Person(instrument);
    }
}
