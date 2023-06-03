def call(def input) {
    node {
        sh '''
            cd $input.directory
            mvn $input.goal ${input.params ? input.params : ' '}
        '''
    }
}