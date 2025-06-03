![image](https://github.com/user-attachments/assets/b6d388f9-f6f2-4791-a41f-6734bc7b5e58)![image](https://github.com/user-attachments/assets/3a1731b3-46af-41e1-86a8-02e3f69b46b2)# TryTasks
 Projeto de processos de software.

# Guia de Instalação e Execução

Aplicação desktop Java (**Swing**) distribuída em um instalador único gerado com **Install Creator**.  
Compatível com **Windows 10/11 (64-bit)**.

---

## ✨ Pré-requisitos

| Item | Descrição | Link oficial |
|------|-----------|--------------|
| **Java SE Development Kit 24 (JDK 24)** | Runtime/compilador necessário para executar o `.jar`. | <https://www.oracle.com/java/technologies/downloads/#jdk24-windows> |

> **Importante:** use **exclusivamente** a versão 24. Versões anteriores podem gerar o erro  
> `Unsupported class file major version`.

---

## ✨ Instalação
Acesse o link abaixo e baixe o instalador:
<https://drive.google.com/file/d/1GZP_E9dusomUEiCS2VGabVlkxfl7Jft5/view?usp=drive_link>

Após instalar, aceite todas as permissões e os termos.

---

## ✨ Execução
Com o aplicativo instalado, você poderá acessá-lo pelo atalho disponibilziado na área de trabalho.
Execute-o para iniciar a aplicação.

1. TELA INICIAL:
![image](https://github.com/user-attachments/assets/dfbc5eb3-6a3a-4281-b9b7-61f7acf76b69)
![image](https://github.com/user-attachments/assets/94290583-ec36-439e-894d-df1f507526eb)

   - A tela incial mostra suas tarefas pendentes e as tarefas concluídas. Caso não tenha nehuma, a lista estará vazia em ambos os status.
   - Ao alternar pelos status, você perceberá duas mudanças:
     A primeira é que o botão de editar some do status 'Concluídos', isso porque s[o é permitido editar as tarefas pendentes. Caso queira editar uma concluída, desmarque-a e edite ela na lista de pendentes e depois conclua denovo.
     A segunda é que as caixas de cada tarefa estarão marcadas na lista de concluídas.
   - Quando marcar a tarefa como concluído, ela será passada automaticamente para a lista de tarefas concluídas.
   - Ao clicar no botão no canto inferior direito, abrirá uma tela para realizar as inclusões de novas tarefas.
   - Ao clicar no botão "DEL", abrirá uma tela para realizar as exclusões de tarefas pendentes.
     
2. TELA DE CRIAÇÃO DE TAREFAS:
![image](https://github.com/user-attachments/assets/431d5ea6-9400-422c-9dd5-ac8517633624)

   - A tela de criação de tarefas oferece uma caixa de texto para escrever sobre sua tarefa e duas opções para finalizar a ação.
   - A primeira opção é de cancelar a operação, voltando à tela inicial.
   - A segunda opção é de concluir a operação, realizando a inclusão da tarefa na lista de pendentes e voltando à tela inicial.
