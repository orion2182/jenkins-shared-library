import com.example.Docker

deff call(String imageName) {
      return new Docker(this).buildDockerImage(imageName)
}
