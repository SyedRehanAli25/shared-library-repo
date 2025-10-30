package com.company.utils

class GitUtils {
    def steps

    GitUtils(steps) {
        this.steps = steps
    }

    def getBranchName() {
        return steps.sh(script: "git rev-parse --abbrev-ref HEAD", returnStdout: true).trim()
    }
}

