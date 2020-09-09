1


1: 第一种打包方式:
            <plugins>
                <plugin>
                    <groupId>org.springframework.boot</groupId>
                    <artifactId>spring-boot-maven-plugin</artifactId>
                    <configuration>
                        <mainClass>com.director.repo.DiveInSpringBootApplication</mainClass>
                    </configuration>
                </plugin>
            </plugins>

2: 关于条件装配
    可以使用 profile 或者 conditional             