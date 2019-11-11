# FullStackFinalProject

Run application follow below steps: 
1.	run below commands on projectmanagerspa : 
npm install 
npm install node-sass@latest 
npm rebuild node-sass 
npm run build
copy files from dist/ projectmanagerspa to nginx/html folder
2.	run mvn clean package on projectmanager
3.	cd target
4.	java –jar  projectmanager.jar

copy below setting in conf/nginx.conf file 

server {
    listen       1000;
    server_name  localhost;

    location / {
        root   html;
        index  index.html index.htm;
		try_files $uri $uri/ /index.html;
    }

    error_page   500 502 503 504  /50x.html;
    location = /50x.html {
        root   html;
    }
}

Start nginx
Launch localhost:1000
