package com.nine2nine.lib.phobos.autoconfigure;

import com.nine2nine.lib.phobos.PhobosProvider;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

@AutoConfiguration
public class PhobosAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public PhobosProvider phobosProvider() {
        return new PhobosProvider();
    }
}
