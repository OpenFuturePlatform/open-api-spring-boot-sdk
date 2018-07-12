package io.openfuture.sdk.property

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.validation.annotation.Validated
import javax.validation.constraints.NotBlank

@Validated
@ConfigurationProperties(prefix = "open")
class OpenProperties {
    @field:NotBlank var token: String? = null
}