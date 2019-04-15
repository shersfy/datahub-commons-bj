# datahub-commons
### 公共模块
1. 公共模块发布到nexus仓库
2. 添加第三方依赖到nexus仓库

```
mvn deploy:deploy-file -DgroupId=com.gouuse -DartifactId=chardet -Dversion=1.0 -Dpackaging=jar -Dfile=chardet-1.0.jar -DrepositoryId=release -Durl=http://10.12.40.166:8081/nexus/content/repositories/releases/
mvn deploy:deploy-file -DgroupId=com.gouuse -DartifactId=cpdetector -Dversion=1.0.10 -Dpackaging=jar -Dfile=cpdetector_1.0.10.jar -DrepositoryId=release -Durl=http://10.12.40.166:8081/nexus/content/repositories/releases/
mvn deploy:deploy-file -DgroupId=com.gouuse -DartifactId=ojdbc6 -Dversion=6 -Dpackaging=jar -Dfile=ojdbc6.jar -DrepositoryId=release -Durl=http://10.12.40.166:8081/nexus/content/repositories/releases/
mvn deploy:deploy-file -DgroupId=com.gouuse -DartifactId=sqljdbc4 -Dversion=4 -Dpackaging=jar -Dfile=sqljdbc4.jar -DrepositoryId=release -Durl=http://10.12.40.166:8081/nexus/content/repositories/releases/
mvn deploy:deploy-file -DgroupId=com.gouuse -DartifactId=db2jcc4 -Dversion=10.1 -Dpackaging=jar -Dfile=db2jcc4-10.1.jar -DrepositoryId=release -Durl=http://10.12.40.166:8081/nexus/content/repositories/releases/

```
