# licensing-service
Spring Cloud Learning licensing-service
## What Is It?
Spring cloud components learning.
## Spring Cloud components
### Spring boot 2.1.4.RELEASE
### Config server
## Download & Installation
1. Download a Java SE Runtime Environment (JRE),release version 8 or later, from http://www.oracle.com/technetwork/java/javase/downloads/index.html
2. Download Apache maven
Download Apache maven 3.6.0 here
http://maven.apache.org/download.cgi
3. Set Java Home or JRE Home.
4. Set Maven Home.
5. Import project as Existing maven projects.
6. Use mvn clean install to install this project.
## 运行效果
通过下面url访问不同的profile参数
http://localhost:8888/licenseingservice/default
```json
{
    "name": "licenseingservice",
    "profiles": [
        "default"
    ],
    "label": null,
    "version": null,
    "state": null,
    "propertySources": [
        {
            "name": "file:///Users/zdm/eclipse-workspace/configuration-service/src/main/resources/licenseingservice/licenseingservice.properties",
            "source": {
                "spring.datasource.url": "jdbc:mysql://localhost:3306/default",
                "spring.datasource.username": "root",
                "spring.datasource.password": "3306",
                "spring.datasource.driver-class-name": "com.mysql.cj.jdbc.Driver"
            }
        }
    ]
}
```

http://localhost:8888/licenseingservice/dev
```json
{
    "name": "licenseingservice",
    "profiles": [
        "dev"
    ],
    "label": null,
    "version": null,
    "state": null,
    "propertySources": [
        {
            "name": "file:///Users/zdm/eclipse-workspace/configuration-service/src/main/resources/licenseingservice/licenseingservice-dev.yml",
            "source": {
                "tracer.property": "I am the dev",
                "spring.jpa.database": "Mysql"
            }
        },
        {
            "name": "file:///Users/zdm/eclipse-workspace/configuration-service/src/main/resources/licenseingservice/licenseingservice.properties",
            "source": {
                "spring.datasource.url": "jdbc:mysql://localhost:3306/default",
                "spring.datasource.username": "root",
                "spring.datasource.password": "3306",
                "spring.datasource.driver-class-name": "com.mysql.cj.jdbc.Driver"
            }
        }
    ]
}
```

http://localhost:8888/licenseingservice/prod
```json
{
    "name": "licenseingservice",
    "profiles": [
        "prod"
    ],
    "label": null,
    "version": null,
    "state": null,
    "propertySources": [
        {
            "name": "file:///Users/zdm/eclipse-workspace/configuration-service/src/main/resources/licenseingservice/licenseingservice-prod.yml",
            "source": {
                "tracer.property": "I am the default",
                "spring.jpa.database": "Mysql"
            }
        },
        {
            "name": "file:///Users/zdm/eclipse-workspace/configuration-service/src/main/resources/licenseingservice/licenseingservice.properties",
            "source": {
                "spring.datasource.url": "jdbc:mysql://localhost:3306/default",
                "spring.datasource.username": "root",
                "spring.datasource.password": "3306",
                "spring.datasource.driver-class-name": "com.mysql.cj.jdbc.Driver"
            }
        }
    ]
}
```


