# FullStackFinalProject

For Docker : 

You need to create mysql database with below commands

sh 'docker volume create cogdbsql_data'
sh 'docker network create cogdb_sql_net --driver=bridge'
sh 'docker run -p 3306:3306 --name=cogdb_sql --restart=always -v mysql_data:/var/lib/mysql --net=cogdb_sql_net -e MYSQL_ROOT_PASSWORD="pass@word1" -e MYSQL_DATABASE="cogdb" -e MYSQL_USER=dbuser -e MYSQL_PASSWORD=pass@word1 -d mysql:latest'