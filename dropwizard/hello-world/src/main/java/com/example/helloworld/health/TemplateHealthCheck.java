package com.example.helloworld.health;

/**
 * Created by junjaytan on 1/21/16.
 */
import com.codahale.metrics.health.HealthCheck;


/*
TemplateHealthCheck checks for two things: that the provided template is
actually a well-formed format string, and that the template actually
produces output with the given name.

If the string is not a well-formed format string (for example,
someone accidentally put Hello, %s% in the configuration file),
then String.format(String, Object...) will throw an
IllegalFormatException and the health check will implicitly fail.
If the rendered saying doesn’t include the test string, the health
check will explicitly fail by returning an unhealthy Result.
 */
public class TemplateHealthCheck extends HealthCheck {
    private final String template;

    public TemplateHealthCheck(String template) {
        this.template = template;
    }

    @Override
    protected Result check() throws Exception {
        final String saying = String.format(template, "TEST");
        if (!saying.contains("TEST")) {
            return Result.unhealthy("template doesn't include a name");
        }
        return Result.healthy();
    }
}
