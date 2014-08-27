package de.cologneintelligence.schulung;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

@Mojo(name = "release", defaultPhase = LifecyclePhase.PROCESS_SOURCES)
public class VersionfetcherMojo extends AbstractMojo {
    @Parameter(defaultValue = "${project}", required = true, readonly = true)
    private MavenProject project;

    public void execute()
            throws MojoExecutionException {
        project.getProperties().setProperty("newVersion", project.getVersion().replaceAll("-SNAPSHOT$", ""));
    }
}
