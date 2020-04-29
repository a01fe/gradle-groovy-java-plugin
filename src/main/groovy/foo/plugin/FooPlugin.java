package foo.plugin;

import org.gradle.api.Project;

import foo.support.JavaTaskSpec;
import foo.task.JavaTask;

import org.gradle.api.Plugin;

public class FooPlugin implements Plugin<Project> {
    public void apply(Project project) {
        project.getTasks().register("javaTask", JavaTask.class, task -> {
            task.setSpec(new JavaTaskSpec());
        });
    }
}
