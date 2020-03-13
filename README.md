# springboot-log4j2-slack
This is a Slack Appender for SpringBoot2.x and log4j2.

Appender uses webclient to process web hooks.

## Configuration

Example
```xml
<?xml version="1.0" encoding="UTF-8"?>
<Configuration status="WARN" packages="com.github.underbell.slack.utils">
    <Appenders>
        <Slack name="LogToSlack"
               url="https://hooks.slack.com/services/xxxxxxxxxxxxxx"
               channel="#app-log"
               username="app">
            <ThresholdFilter level="warn" onMatch="ACCEPT" onMismatch="DENY"/>
        </Slack>

        <Async name="AsyncLogToSlack" includeLocation="true">
            <AppenderRef ref="LogToSlack"/>
        </Async>
    </Appenders>

    <Loggers>
        <Root level="info">
            <AppenderRef ref="AsyncLogToSlack"/>
        </Root>
    </Loggers>
</Configuration>
```