<<<<<<< HEAD
def call(String imageName) {
echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh "docker build -t $imageName ."
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh "docker push $imageName"
    }
}
=======
import com.example.Docker
>>>>>>> 157ada3 (docker groovy changes)

deff call(String imageName) {
      return new Docker(this).buildDockerImage(imageName)
}
