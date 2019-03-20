@file:Suppress("ObjectPropertyName")

package tanvd.kosogor.utils

import org.gradle.api.Project
import org.gradle.api.plugins.ExtraPropertiesExtension
import org.gradle.api.tasks.SourceSetContainer
import org.gradle.kotlin.dsl.getByName

private inline fun <reified T : Any> Project.extByName(name: String): T = extensions.getByName<T>(name)

val Project._ext: ExtraPropertiesExtension
    get() = extByName("ext")

val Project._sourceSets: SourceSetContainer
    get() = extByName("sourceSets")
