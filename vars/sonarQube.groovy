def analysis() {
    withSonarQubeEnv('sonarqube') {
        sh 'mvn clean verify sonar:sonar -Dsonar.projectKey=helloworld -Dsonar.projectName=helloworld'
    }
}

def qualityGate() {
    timeout(time: 1, unit: 'MINUTES') {
        waitForQualityGate(abortPipeline: true)
    }
}