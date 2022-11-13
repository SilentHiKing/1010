package com.example.testplugin

import com.android.build.api.instrumentation.FramesComputationMode
import com.android.build.api.instrumentation.InstrumentationScope
import com.android.build.api.variant.AndroidComponentsExtension
import org.gradle.api.Plugin
import org.gradle.api.Project


class ViewDoubleClickPlugin : Plugin<Project> {

    companion object{
        fun run(project: Project){
            val androidComponents = project.extensions.getByType(AndroidComponentsExtension::class.java)
            androidComponents.onVariants { variant ->
                variant.instrumentation.transformClassesWith(
                    ViewDoubleClickClassVisitorFactory::class.java,
                    InstrumentationScope.PROJECT
                ) { params ->
                    params.config.set(ViewDoubleClickConfig())
                }
                variant.instrumentation.setAsmFramesComputationMode(
                    FramesComputationMode.COMPUTE_FRAMES_FOR_INSTRUMENTED_METHODS
                )
            }
        }
    }

    override fun apply(project: Project) {
        val androidComponents = project.extensions.getByType(AndroidComponentsExtension::class.java)
        androidComponents.onVariants { variant ->
            variant.instrumentation.transformClassesWith(
                ViewDoubleClickClassVisitorFactory::class.java,
                InstrumentationScope.PROJECT
            ) { params ->
                params.config.set(ViewDoubleClickConfig())
            }
            variant.instrumentation.setAsmFramesComputationMode(
                FramesComputationMode.COMPUTE_FRAMES_FOR_INSTRUMENTED_METHODS
            )
        }
    }

}