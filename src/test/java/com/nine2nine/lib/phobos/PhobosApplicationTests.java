package com.nine2nine.lib.phobos;

import com.nine2nine.lib.phobos.autoconfigure.PhobosAutoConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import static org.assertj.core.api.Assertions.assertThat;

class PhobosApplicationTests {

    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner().withConfiguration(
            org.springframework.boot.autoconfigure.AutoConfigurations.of(PhobosAutoConfiguration.class));

    @Test
    void autoConfigurationInjectsHelloWorldProvider() {
        contextRunner.run(context -> {
            assertThat(context).hasSingleBean(PhobosProvider.class);
            assertThat(context.getBean(PhobosProvider.class).getMessage()).isEqualTo("Hello, World!");
        });
    }
}
