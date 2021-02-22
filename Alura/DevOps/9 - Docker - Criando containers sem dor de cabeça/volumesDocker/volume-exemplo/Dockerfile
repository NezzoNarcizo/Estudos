FROM node:latest
# MAINTAINER Nezzo Narcizo - "Deprecated" nas últimas versões do Docker
# Caso quisessemos setar uma variável de ambiente porderíamos utilizar, por exemplo: ENV NODE_ENV=production
ENV NODE_ENV=production
# Poderíamos utilizar variável de ambiente para outros valores do Dockerfile, por exemplo: ENV PORT=3000 ... Aí em EXPOSE, colocaríamos, por exemplo: EXPOSE $PORT
ENV PORT=3000
COPY . /var/www
WORKDIR /var/www
RUN npm install
ENTRYPOINT npm start
# Também poderíamos deixar o comando ENTRYPOINT como se fosse um json, ex: ENTRYPOINT ["npm", "start"] - Porém a documentação do Docker considera os dois modos certos.
EXPOSE 3000


