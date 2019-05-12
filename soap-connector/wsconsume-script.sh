#!/bin/bash
# My first script
set -x

export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64/
export PATH=/usr/lib/jvm/java-8-openjdk-amd64/:$PATH
bash /opt/wildfly/bin/wsconsume.sh -k -s /mount/Data/Projects/SOA/soap-connector/src -o /mount/Data/Projects/SOA/soap-connector/target http://localhost:8080/soapapp-ejb/StudentSOAPService?wsdl
