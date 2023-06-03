def call(def input) {
    node {
        dir('mavenAction([goal: 'clean test'])'){
        sh "mvn $input.goal ${input.params ? input.params : ' '}"}
        
    }
}