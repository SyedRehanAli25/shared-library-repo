@Library('shared-library-repo') _

pipeline {
    agent any

    stages {
        stage('Get Branch Name') {
            steps {
                script {
                    // Pass the pipeline context (this) to the helper class
                    def gitUtils = new com.company.utils.GitUtils(this)
                    def branch = gitUtils.getBranchName()
                    echo "Current branch: ${branch}"
                }
            }
        }
    }
}
