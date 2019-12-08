# 说明
    无缝集成到springboot工程，只需简单配置，访问指定端点即可

# 使用
## 构建安装到本地仓库
    # 获取代码
    git clone https://github.com/thomasj-git/swagger-doc2pdf.git
    cd swagger-doc2pdf
    mvn -DskipTests=true package
       
    # 本地安装
    mvn install:install-file  \
    -Dfile=target\swagger-doc2pdf-1.0.jar  \
    -DgroupId=com.github.thomasj  \
    -DartifactId=swagger-doc2pdf \
    -Dversion=1.0 -Dpackaging=jar
       
    # 安装远程私库
    mvn deploy:deploy-file \
    -DgroupId=com.github.thomasj \
    -DartifactId=swagger-doc2pdf \
    -Dversion=1.0 \
    -Dpackaging=jar -Dfile=target\swagger-doc2pdf-1.0.jar \
    -Durl=${远程私库地址} \
    -DrepositoryId=${仓库ID}
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
![image](https://github.com/thomasj-git/swagger-doc2pdf/blob/master/src/main/resources/static/demo/export.png)
![image](https://github.com/thomasj-git/swagger-doc2pdf/blob/master/src/main/resources/static/demo/pdf-save.png)