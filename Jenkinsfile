@Library('shared-library-repo') _
pipeline {
    agent any
    stages {
        stage('Test Shared Library') {
            steps {
                script {
                    notify("Hello from shared library!")
                    def branch = com.company.utils.GitUtils.getBranchName()
                    echo "Branch: ${branch}"
                }
            }
        }
    }
}
