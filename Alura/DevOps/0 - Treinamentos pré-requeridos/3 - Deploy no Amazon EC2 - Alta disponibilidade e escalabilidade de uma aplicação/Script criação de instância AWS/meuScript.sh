#!/bin/bash
#Importante Observar que deixar espaço entre "#" e o ínicio do comentário, deu problema na hora de colocar no textbox da Amazon
#Primeira providência: Atualizar conteúdo...
#Obs: Não precisamos colocar "sudo" pois o script executa como root.
#Obs2: Lembrando sempre que muitas instalações pedem o "yes", sendo assim já deixamos na linha de comando o -y, para confirmar todas as instalações.
yum update -y

#Segunda providência: Adicionaremos repositórios...
#Obs: A máquina por padrão aponta para alguns repositórios da AWS, porém temos outros que gostariamos que nossa máquina esteja utilizando
amazon-linux-extras install -y lamp-mariadb10.2-php7.2 php7.2

#Terceira providência: Instalar o Apache e o Banco de Dados...
yum install -y httpd mariadb-server

#Quarta providência: Inicializar o httpd (Apache) e ativar a opção para que ele seja iniciado toda vez que a máquina for reinicializada...
systemctl start httpd
systemctl enable httpd

#Quinta providência: Inicializar o mariadb (MySQL) e ativar a opção para que ele seja iniciado toda vez que a máquina for reinicializada...
systemctl start mariadb
systemctl enable mariadb

#Sexta providência: Configurações iniciais que devem ser feitas no httpd (Apache)...
#Obs: usermod -a -G apache ec2-user (Pegamos o usuário ec2-user e colocamos no grupo "apache" para que possamos com este usuário criar uma página ou conteúdo)
#Obs2: chown -R ec2-user:apache /var/www ("chmod" -R para ajustar as permissões para que tudo que esteja dentro do /var/www/ vai passar para o usuário ec2-user e para o grupo apache)
usermod -a -G apache ec2-user
chown -R ec2-user:apache /var/www