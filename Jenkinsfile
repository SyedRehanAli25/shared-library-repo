@Library('shared-library-repo') _  // Make sure this matches the name configured in Jenkins

pipeline {
    agent any

    stages {
        stage('Test Shared Library') {
            steps {
                script {
                    
                    notify("Hello from shared library!")

                    
                    def branch = sh(script: "git rev-parse --abbrev-ref HEAD", returnStdout: true).trim()
                    echo "Current branch: ${branch}"
                }
            }
        }
    }
}
