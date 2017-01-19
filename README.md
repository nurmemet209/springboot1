#springboot+tomcat+jsp
* 创建项目
    File-New-Project  
   
    ![](screenshot/create_project.png)
    ![](screenshot/create_project_1.png)
    ![](screenshot/create_project_2.png)
    ![](screenshot/create_project_3.png)  
    创建完之后项目目录结构如下
    ![](screenshot/create_project_4.png) 
    编辑gradle.build文件
    ```groovy
    group 'org.rk'
    version '1.0-SNAPSHOT'
    
    buildscript {
        ext {
            springBootVersion = '1.4.2.RELEASE'
        }
        repositories {
            mavenCentral()
        }
        dependencies {
            classpath("org.springframework.boot:spring-boot-gradle-plugin:${springBootVersion}")
        }
    }
    
    
    //用于编译好的源码打包成war文件
    apply plugin: 'war'
    //必须
    apply plugin: 'org.springframework.boot'
    
    
    
    war {
        baseName = 'SpringBoot'
        version = '0.0.1'
    }
    sourceCompatibility = 1.8
    
    repositories {
        mavenCentral()
    }
    
    dependencies {
        //spring-web
        compile('org.springframework.boot:spring-boot-starter-web')
        //jsp支持
        compile('org.apache.tomcat.embed:tomcat-embed-jasper')
        //jstl
        compile('javax.servlet:jstl')
        //tomcat外部tomcat容器中执行所需,用springboot运行可以不要
        providedRuntime("org.springframework.boot:spring-boot-starter-tomcat")
        //spring data-jpa
        compile group: 'org.springframework.boot', name: 'spring-boot-starter-data-jpa', version: '1.4.2.RELEASE'
        //mysql 驱动
        runtime('mysql:mysql-connector-java')
        testCompile('org.springframework.boot:spring-boot-starter-test')
    
    }
```



