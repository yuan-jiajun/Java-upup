### CentOS7卸载OpenJDK安装Oracle JDK

1. 查看JDK安装版本

  ```
  [root@localhost ~]#java -version
  java version *1.7.0_51*
  OpenJDK Runtime Environment ( rhel-2.4.5.5.el7-x86_64 u51-b31)
  OpenJDK 64-Bit Server VM (build 24.51-b03, mixed mode)
  ```

2. 查找OpenJDK安装包

  ```
  rpm -qa | grep openjdk
  java-1.7.0-openjdk-headless-1.7.0.51-2.4.5.5.el7.x86_64
  java-1.7.0-openjdk-1.7.0.51-2.4.5.5.el7.x86_64
  ```

3. 卸载OpenJDK安装包

```
[root@localhost ~]#yum -y remove 上面搜出来的结果
```

4. 下载JDK安装包（[download link](https://www.oracle.com/java/technologies/oracle-java-archive-downloads.html)）
5. 安装JDK1.7

```
yum install jdk-7u65-linux-x64.rpm 或者
tar -zxvf xxxx.tar.gz -C /usr/java/jdkxxxxx
```

6. 配置环境变量

```
vim /etc/profile
在文件末尾添加如下内容
JAVA_HOME=/usr/java/jdkxxxxx
CLASSPATH=$JAVA_HOME/lib/
PATH=$PATH:$JAVA_HOME/bin
export PATH JAVA_HOME CLASSPATH
```

7. 查看安装结果

   ```
   [root@localhost ~]#source /etc/profile
   [root@localhost ~]#java -version
   java version "1.7.0_65"
   Java(TM) SE Runtime Environment (build 1.7.0_65-b17)
   Java HotSpot(TM) 64-Bit Server VM (build 24.65-b04.mixed mode)
   ```

   

   