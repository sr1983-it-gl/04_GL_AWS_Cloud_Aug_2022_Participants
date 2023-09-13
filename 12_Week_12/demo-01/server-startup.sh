#!/bin/bash
yum update -y
yum install httpd -y
service httpd start
chkconfig httpd on
IP_ADDR=$(curl https://checkip.amazonaws.com/)
echo "HTTPD Server Instance running at IP $IP_ADDR" > /var/www/html/index.html
