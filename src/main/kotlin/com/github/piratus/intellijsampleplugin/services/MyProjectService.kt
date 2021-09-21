package com.github.piratus.intellijsampleplugin.services

import com.intellij.openapi.project.Project
import com.github.piratus.intellijsampleplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
