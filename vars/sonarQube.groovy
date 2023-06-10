def call() {
    node {
        stage('QualityScan') {
            withSonarQubeEnv('sonarqube') {
                sh 'mvn clean verify sonar:sonar -Dsonar.projectKey=helloworld -Dsonar.projectName=helloworld'
            }
        }
    }
}