import org.gradle.api.Plugin
import org.gradle.api.Project

class ShrinkResourcePlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        println("hello form build-in plugin")
    }
}