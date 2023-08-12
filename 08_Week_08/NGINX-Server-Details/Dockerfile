FROM nginx:mainline-alpine
RUN rm /etc/nginx/conf.d/*
ADD helloworld.conf /etc/nginx/conf.d/
ADD nginx.png /usr/share/nginx/html/
ADD index.html /usr/share/nginx/html/