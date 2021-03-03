#Adicionando um bem vindo ao jogo...
print("**************************")
print("Welcome to Divination Game")
print("**************************")

#Definindo o número secreto
numero_secreto = 7

#Esperando a entrada do jogador com seu número de escolha
chute_string = input("Digite o número ")

#Imprimindo o número que o jogador escolheu
print("Você digitou  ", chute_string)

#Convertendo o número de String para Int
chute = int(chute_string)

#Verificando agora se o número secreto é o mesmo do número escolhido
if (numero_secreto == chute):
    print("Você acertou!")
else:
    print("Você errou")

#Mensagem Final
print("Fim do jogo...")

