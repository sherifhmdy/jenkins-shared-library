def call(def input) {
    // node {
        sh '''
            mvn $input.goal ${input.params ? input.params : ' '}
        '''
    // }
}