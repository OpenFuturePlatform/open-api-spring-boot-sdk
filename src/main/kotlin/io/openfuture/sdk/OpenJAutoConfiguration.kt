package io.openfuture.sdk

import io.openfuture.sdk.property.OpenProperties
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
@ConditionalOnClass(OpenJ::class)
@EnableConfigurationProperties(OpenProperties::class)
class OpenJAutoConfiguration(
        private val properties: OpenProperties
) {

    @Bean
    fun openJ() = OpenJ(properties.token!!)

}