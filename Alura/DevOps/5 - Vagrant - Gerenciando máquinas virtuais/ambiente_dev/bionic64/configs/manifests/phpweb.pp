# O bloco abaixo se refere a executar um comando, ele está executando o update dos pacotes, 'apt-update' após a chave é apenas um "apelido"
exec { 'apt-update':
  command => '/usr/bin/apt-get update'
}

# O bloco abaixo, está instalando pacotes específicos, os nomes tem que estar corretos entre os colchetes. "Require" = Requer que seja executado o comando de update e "Ensure" = A garantia de que estejam instalados
package { ['php7.2', 'php7.2-mysql'] :
  require => Exec['apt-update'],
  ensure => installed,
}

# O bloco seguinte sobe/executa os programas informados, no caso o php7. O "run-php7" é só um "apelido". "Require" = Exige que o pacote com php7.2 esteja instalado. "Command" = Conexão do php com um IP e uma porta
# Lembrando que estamos falando pro php ir na pasta em comum com o Vagrant, encontrar a pasta src...O arquivo index.php ele acha automaticamente |||||||                    além do "target" (-t) que é página a ser testada
# 0.0.0.0 foi uma forma de configurarmos no arquivo do MySQL (mysql.cnf) que qualquer ip seria aceito.
exec { 'run-php7':
  require => Package['php7.2'],
   command => '/usr/bin/php -S 0.0.0.0:8888 -t /vagrant/src &'
 }