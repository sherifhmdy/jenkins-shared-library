def call() {
    // node {
        // withSonarQubeEnv('sonarqube') {
        //     sh 'mvn clean verify sonar:sonar -Dsonar.projectKey=helloworld -Dsonar.projectName=helloworld'
        // }
    // }
        pipeline {
            stages {
                stage('hi') {
                    steps {
                        echo "hi"
                    }
                }
            }
        }
}