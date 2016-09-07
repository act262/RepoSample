package com.github.act262.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * My Plugin Implementation
 * <br/>
 * 定义在resources/META-INF/xx.properties文件中
 * @author act262@gmail.com
 */
public class MyPluginImpl implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        println '---------- apply project ----------'

        project.task('testTask') << {
            println "Hello gradle plugin task"
        }
        project.task('testTask1') << {
            println 'test task1'
        }
    }
}
