def call(def input) {
    node {
        sh '''
            cd $WORKSPACE
            mvn $input.goal ${input.params ? input.params : ' '}
        '''
    }
}