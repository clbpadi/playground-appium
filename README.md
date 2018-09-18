# Notes on local development
https://padiww.atlassian.net/wiki/spaces/~384053898/pages/651427858/AWS+Device+Farm

1. Start appium
1. Configure a target's capabilities
1. Launch the test

# General Device Farm docs
See https://docs.aws.amazon.com/devicefarm/latest/developerguide/test-types-android-appium-java-testng.html
See https://github.com/aws-samples/aws-device-farm-appium-tests-for-sample-app

# Packaging For AWS Device Farm
```
mvn clean package -DskipTests=true
```
