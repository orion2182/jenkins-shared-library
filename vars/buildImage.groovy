import com.example.Docker

def buildImage(String imageName) { 
    def docker = new Docker(this)
    docker.buildDockerImage(imageName)
}
