# 说明
    无缝集成到springboot工程，只需简单配置，访问指定端点即可

# 使用
## maven依赖最新版
    <dependency>
        <groupId>com.github.thomasj</groupId>
        <artifactId>swagger-doc2pdf</artifactId>
        <version>1.0</version>
    </dependency>

## 在application.properties中添加配置
    spring.thymeleaf.prefix=classpath:/static/
    spring.thymeleaf.suffix=.html
    
    
## 导入APIExportCtrl
    @Bean
    APIExportCtrl apiExportCtrl(){
        return new APIExportCtrl();
    }
    
## 访问端点
    http://localhost:8080/api-export
    然后通过chrome浏览器打印网页，另存为pdf即可，再借助其他工具将pdf转成word