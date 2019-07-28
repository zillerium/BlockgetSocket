   43  wget http://www-us.apache.org/dist/tomcat/tomcat-9/v9.0.19/bin/apache-tomcat-9.0.19.tar.gz\n
   44  wget http://www-us.apache.org/dist/tomcat/tomcat-9/v9.0.22/bin/apache-tomcat-9.0.22.tar.gz\n
   45  tar xzf apache-tomcat-9.0.19.tar.gz\n
   46  tar xzf apache-tomcat-9.0.22.tar.gz\n
   47  sudo mv apache-tomcat-9.0.19 /usr/local/apache-tomcat9\n
   48  sudo mv apache-tomcat-9.0.22 /usr/local/apache-tomcat9\n
   49  echo "export CATALINA_HOME="/usr/local/apache-tomcat9"" >> ~/.bashrc\n
   50  echo "export JAVA_HOME="/usr/lib/jvm/java-11-oracle"" >> ~/.bashrc\n
   51  echo "export JRE_HOME="/usr/lib/jvm/java-11-oracle"" >> ~/.bashrc\n
   52  source ~/.bashrc\n
   53  sudo vi ./webapps/manager/META-INF/context.xml\n
   54  whereis tomcat\n
   55  which tomcat\n
   56  cd /usr/local\n
   57  ll\n
   58  cd apache-tomcat9/\n
   59  ll\n
   60  sudo vi ./webapps/manager/META-INF/context.xml\n
   61  sudo vi ./webapps/host-manager/META-INF/context.xml\n
   62  sudo vi ./webapps/host-manager/META-INF/context.xml\n
   63  chmod +x ./bin/startup.sh\n
   64  ./bin/startup.sh\n
   65  netstat -tlpun\n
   66  ./bin/startup.sh\n
   67  netstat -tlpun\n
   68  ./bin/startup.sh\n
   69  netstat -tlpun\n

