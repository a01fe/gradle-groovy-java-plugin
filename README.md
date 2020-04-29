# Introduction

Gradle plugin that illustrates a problem with `vscode-java`.

In Gradle plugins that are implemented with a mix of Groovy and Java, `vscode-java` reports "*Class* cannot be resolved to a type" compilation errors for Groovy classes, even when the plugin compiles and builds correctly.

To demonstrate this, follow this script:

```bash
$ git clone git@github.com:a01fe/gradle-groovy-java-plugin.git    # Clone this repository
Cloning into 'gradle-groovy-java-plugin'...
remote: Enumerating objects: 29, done.
remote: Counting objects: 100% (29/29), done.
remote: Compressing objects: 100% (18/18), done.
Receiving objects: 100% (29/29), 57.98 KiB | 9.66 MiB/s, done.
remote: Total 29 (delta 0), reused 29 (delta 0), pack-reused 0
$ cd gradle-groovy-java-plugin                                    # Change directory to plugin project
$ ./gradlew build                                                 # Verify that Gradle can successfully build plugin

BUILD SUCCESSFUL in 2s
6 actionable tasks: 6 executed
$ cd test                                                         # Change directory to project using plugin
$ ./gradlew -q javaTask                                           # Run plugin task
Output from JavaTask
$
```

If you open `src/main/groovy/foo/task/JavaTask.java`, `vscode-java` reports "cannot be resolved" errors on all references to `JavaTaskSpec`.
