package rodandoClassesNaoThreadSafe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;

public class RegistroDeMensagens {

        public static void main(String[] args) throws InterruptedException {
            /*
             * Para testar com Synchronized
             * Collection<String> mensagens = new ArrayList<String>();
            Thread thread = new Thread(new ProduzMensagens(0, 10000, mensagens));
            Thread thread1 = new Thread(new ProduzMensagens(10000, 20000, mensagens));
            Thread thread2 = new Thread(new ProduzMensagens(20000, 30000, mensagens));
			*/
            
            /*
             * Para testar com a classe Vector
             *
        	Vector<String> mensagens = new Vector<>(); 
            Thread thread = new Thread(new ClasseVector(0, 10000, mensagens));
            Thread thread1 = new Thread(new ClasseVector(10000, 20000, mensagens));
            Thread thread2 = new Thread(new ClasseVector(20000, 30000, mensagens));
            */
        	
        	/*
        	 * Para testar com a classe HashSet
        	 *
        	HashSet<String> mensagens =  new HashSet<>();
        	Thread thread = new Thread(new ClasseHashSet(0, 10000, mensagens));
            Thread thread1 = new Thread(new ClasseHashSet(10000, 20000, mensagens));
            Thread thread2 = new Thread(new ClasseHashSet(20000, 30000, mensagens));
            */
        	
        	/*
        	 * Para testar com a classe LinkedList
        	 */
        	LinkedList<String> mensagens = new LinkedList<>();
        	Thread thread = new Thread(new ClasseLinkedList(0, 10000, mensagens));
            Thread thread1 = new Thread(new ClasseLinkedList(10000, 20000, mensagens));
            Thread thread2 = new Thread(new ClasseLinkedList(20000, 30000, mensagens));
        	
            thread.start();
            thread1.start();
            thread2.start();

            // faz com que a thread que roda o main aguarde o fim dessas
            thread.join();
            thread1.join();
            thread2.join();

            System.out.println("Threads produtoras de mensagens finalizadas!");

            // verifica se todas as mensagens foram guardadas
            for (int i = 0; i < 30000; i++) {
                if (!mensagens.contains("Mensagem " + i)) {
                    throw new IllegalStateException("Não encontrei a mensagem: " + i);
                }
            }

            // verifica se alguma mensagem ficou nula
            if (mensagens.contains(null)) {
                throw new IllegalStateException("Não devia ter null aqui dentro!");
            }

            System.out.println("Fim da execução com sucesso");
        }
}