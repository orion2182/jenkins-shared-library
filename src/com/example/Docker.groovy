package com.example

class Docker implements Serializable {
    
    def script

    Docker (script) {
        this.script = script
    }

    def buildDockerImage(String imageName) {
        script.echo "Building the docker Image..."
        script.withCredentials([script.usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
            script.sh """
                docker build -t ${imageName} .
                echo "\${PASS}" | docker login \${USER} --password-stdin 
                docker push ${imageName}
        }
    }
}

