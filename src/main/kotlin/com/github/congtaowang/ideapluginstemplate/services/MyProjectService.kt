package com.github.congtaowang.ideapluginstemplate.services

import com.intellij.openapi.project.Project
import com.github.congtaowang.ideapluginstemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
