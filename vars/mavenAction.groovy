def call(def input) {
    node {
        dir('/var/jenkins_home/workspace/vscode-pipeline'){
        sh "mvn $input.goal ${input.params ? input.params : ' '}"}
        
    }
}