# spring-cloud-alibaba
基于alibaba的springcloud

##项目说明
1. 服务注册与发现:nacos 
2. 服务配置中心:nacos 
3. 熔断:sentinel
4. 网关:gateway

##springboot版本
~~~
<parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.2.6.RELEASE</version>
        <relativePath/>
    </parent>
~~~
##依赖管理
~~~
<dependencyManagement>
        <dependencies>
            <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-dependencies</artifactId>
                <version>Hoxton.SR1</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
            <dependency>
                <groupId>com.alibaba.cloud</groupId>
                <artifactId>spring-cloud-alibaba-dependencies</artifactId>
                <version>2.2.0.RELEASE</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>
~~~

##项目结构

- nacos-provider
- nacos-consumer
- nacos-feign
- nacos-sentinel
- sentinel-dashboard
- nacos-config
- nacos-gateway