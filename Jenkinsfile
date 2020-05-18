pipeline{
    agent any

    stages{
        stage ('Compile Stage') {
            steps{
                withMaven(maven: 'maven_3.6.3'){
                    sh 'maven clean compile'
                }

            }

        }

        stage ('Testing stage'){
            steps{
                withMaven(maven: 'maven_3.6.3'){
                    sh 'maven test'
                }

            }
        }
        stage ('Deployment stage'){
            steps{
                withMaven(maven: 'maven_3.6.3'){
                    sh 'maven deploy'
                }

            }
        }

    }
}
