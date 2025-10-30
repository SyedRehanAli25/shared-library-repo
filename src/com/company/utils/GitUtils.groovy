package com.company.utils

class GitUtils {
    static def getBranchName() {
        return sh(script: "git rev-parse --abbrev-ref HEAD", returnStdout: true).trim()
    }
}
