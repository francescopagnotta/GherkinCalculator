pipeline{

   agent any

   stages {

        stage ('Compile Stage') {

            steps {

                withMaven {
                    bat 'mvn clean install'

                }
            }
        }
   stage ('Test Stage') {

            steps {

                withMaven {
                    bat 'mvn clean install'

                }
            }
        }

        stage ('Cucumber Reports') {

                    steps {
                     cucumber buildStatus: "UNSTABLE",
                        fileIncludePattern: "**/cucumber.json",
                        jsonReportDirectory: 'target'

                    }
                }
           }
   }
