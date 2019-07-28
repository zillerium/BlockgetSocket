   43  wget http://www-us.apache.org/dist/tomcat/tomcat-9/v9.0.19/bin/apache-tomcat-9.0.19.tar.gz
   44  wget http://www-us.apache.org/dist/tomcat/tomcat-9/v9.0.22/bin/apache-tomcat-9.0.22.tar.gz
   45  tar xzf apache-tomcat-9.0.19.tar.gz
   46  tar xzf apache-tomcat-9.0.22.tar.gz
   47  sudo mv apache-tomcat-9.0.19 /usr/local/apache-tomcat9
   48  sudo mv apache-tomcat-9.0.22 /usr/local/apache-tomcat9
   49  echo "export CATALINA_HOME="/usr/local/apache-tomcat9"" >> ~/.bashrc
   50  echo "export JAVA_HOME="/usr/lib/jvm/java-11-oracle"" >> ~/.bashrc
   51  echo "export JRE_HOME="/usr/lib/jvm/java-11-oracle"" >> ~/.bashrc
   52  source ~/.bashrc
   53  sudo vi ./webapps/manager/META-INF/context.xml
   54  whereis tomcat
   55  which tomcat
   56  cd /usr/local
   57  ll
   58  cd apache-tomcat9/
   59  ll
   60  sudo vi ./webapps/manager/META-INF/context.xml
   61  sudo vi ./webapps/host-manager/META-INF/context.xml
   62  sudo vi ./webapps/host-manager/META-INF/context.xml
   63  chmod +x ./bin/startup.sh
   64  ./bin/startup.sh
   65  netstat -tlpun
   66  ./bin/startup.sh
   67  netstat -tlpun
   68  ./bin/startup.sh
   69  netstat -tlpun

