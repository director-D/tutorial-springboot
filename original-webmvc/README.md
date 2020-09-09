3

1: 打包
mvn -Dmaven.test.skip -U clean package


2：本地远程debug
java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005 -jar original-webmvc-1.0-SNAPSHOT-war-exec.jar