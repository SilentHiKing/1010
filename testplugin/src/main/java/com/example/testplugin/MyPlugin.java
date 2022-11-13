package com.example.testplugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;


class MyPlugin implements Plugin<Project> {


    @Override
    public void apply(Project project) {
        System.out.println("helloworld");
        ViewDoubleClickPlugin.Companion.run(project);
        System.out.println("helloworld=end");
    }
}

