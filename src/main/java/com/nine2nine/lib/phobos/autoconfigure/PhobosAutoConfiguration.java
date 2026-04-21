package com.nine2nine.lib.phobos.autoconfigure;

import com.nine2nine.lib.phobos.PhobosProvider;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;

/**
 * {@link PhobosProvider} を自動登録する AutoConfiguration です。
 */
@AutoConfiguration
public class PhobosAutoConfiguration {

    /**
     * {@link PhobosProvider} が未定義の場合に Bean を登録します。
     *
     * @return {@link PhobosProvider} のインスタンス
     */
    @Bean
    @ConditionalOnMissingBean
    public PhobosProvider phobosProvider() {
        return new PhobosProvider();
    }
}
