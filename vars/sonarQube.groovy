def call() {
    // node {
        // withSonarQubeEnv('sonarqube') {
        //     sh 'mvn clean verify sonar:sonar -Dsonar.projectKey=helloworld -Dsonar.projectName=helloworld'
        // }
    // }
        stage 'SayeHello' {
            echo "hello"
        }
}