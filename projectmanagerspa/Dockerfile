#stage - 1
FROM node:latest as node
LABEL maintainer="abranands@gmail.com"
WORKDIR /app
COPY . .
RUN npm install
RUN npm install node-sass@latest
RUN npm rebuild node-sass

RUN npm run build --prod --max_old_space_size=8192

#stage 2
FROM nginx:alpine
COPY --from=node /app/dist/projectmanagerspa /usr/share/nginx/html
COPY ./nginx/defaut.conf /etc/nginx/conf.d/default.conf

