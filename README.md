# spring-cloud-alibaba
基于alibaba版本的springcloud

## 项目说明
1. 服务注册与发现:nacos 
2. 服务配置中心:nacos 
3. 熔断:sentinel
4. 网关:gateway

## springboot版本
~~~
<parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.2.6.RELEASE</version>
        <relativePath/>
    </parent>
~~~
## 依赖管理
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

## 项目结构

- nacos-provider   服务提供者
- nacos-consumer    服务消费者
- nacos-feign       服务调度
- nacos-sentinel    服务降级熔断快速失败
- sentinel-dashboard    服务熔断仪表盘
- nacos-config  服务配置
- nacos-gateway 服务网关

## nacos注册中心说明
1. 下载地址：https://github.com/alibaba/nacos/releases
2. 启动: windows:进入bin目录点击startup.cmd 
    ubuntu: bash startup.sh -m standalone(以单机模式启动)
    页面地址:http://127.0.0.1:8848/nacos/index.html
    账号:nacos 密码: nacos

## sentinel 服务熔断说明
1. 下载地址: https://github.com/alibaba/Sentinel/releases
2. 启动 : java -jar sentinel-dashboard-1.7.2.jar --server.port=8900
3. 访问地址 : http://127.0.0.1:8900 账号:sentinel 密码: snetinel
* 特别说明需要先请求接口数据然后页面才会出现相应数据

## nacos配置中心说明
* Data ID必须要添加后缀例如:application.properties/bootstrap.yaml

### 参考地址
 * https://nacos.io/zh-cn/docs/quick-start.html
 * https://github.com/alibaba/spring-cloud-alibaba/tree/master/spring-cloud-alibaba-examples/nacos-example
 * https://github.com/alibaba/spring-cloud-alibaba/tree/master/spring-cloud-alibaba-examples/sentinel-example