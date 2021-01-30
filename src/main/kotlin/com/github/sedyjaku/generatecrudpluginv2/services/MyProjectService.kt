package com.github.sedyjaku.generatecrudpluginv2.services

import com.github.sedyjaku.generatecrudpluginv2.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
