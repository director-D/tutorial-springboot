4


<!-- 本地直接启动的话 jsp 文件找不到，通过下面的插件 打成 war包之后启动就可以找到了 -->
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>