- O arquivo das máquinas virtuais estavam divididos em três, uni os três em um só Vagrantfile.

- O arquivo 'sshd_config' enviado para as máquinas 'controlMachine', 'wordpress' e 'database' serve para mudar a 
	configuração do arquivo original que vem por padrão nas máquinas "ubuntu/focal64".
		Estas máquinas por padrão, na época, não permitia conexão entre as máquinas dentro do VirtualBox
			nem a adição (copy) de chaves ssh criadas com ssh-keygen.
			
- Elas já estão provisionadas com o básico, por exemplo, a máquina de controle (controlMachine) já tem o Ansible
	que foi instalado através do shell pelo Vagrantfile. Fiz isso porque fiz o curso numa máquina com S.O Windows
		ou seja, precisei além das máquinas 'wordpress' e 'database' uma máquina de controle com ubuntu e ansible
			'controlMachine' pois o Ansible não é compátivel com o Windows.
			
- Tentei deixar em rascunhos_das_aulas as versões do arquivo 'provisioning.yml' que iam sendo modificados durante
	as aulas, para que fosse mais fácil entender, caso a pessoa não execute no futuro todos os laboratórios.
	
- wordpress_com_ansible é a pasta que ficava dentro da máquina controlMachine, no local onde eu queria executar
	os comandos.