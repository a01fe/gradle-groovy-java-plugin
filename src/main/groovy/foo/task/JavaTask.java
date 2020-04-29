package foo.task;

import foo.support.JavaTaskSpec;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.TaskAction;

public class JavaTask extends DefaultTask {

    @Input
    JavaTaskSpec spec;

    @TaskAction
    public void action() {
        System.out.println("Output from JavaTask");
    }

    public JavaTaskSpec getSpec() {
        return spec;
    }

    public void setSpec(JavaTaskSpec spec) {
        this.spec = spec;
    }
}
