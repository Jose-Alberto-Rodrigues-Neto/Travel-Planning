# Travel Planning

    Organize, planeje e viva sua melhor viagem.

Travel Planning é um aplicativo móvel projetado para facilitar a criação colaborativa de cronogramas de viagem. Com ele, grupos de viajantes podem planejar suas atividades, organizar prioridades e maximizar o tempo disponível, promovendo uma experiência de viagem mais dinâmica e democrática.

## Recursos Principais

- **Cronograma Colaborativo**: Todos os membros da viagem podem sugerir e adicionar atividades ao cronograma.
- **Gerenciamento de Prioridades**: Escolha e organize as atividades na ordem desejada para otimizar o tempo.
- **Notificações e Atualizações em Tempo Real**: Todos os participantes são notificados quando há alterações no cronograma.
- **Interface Intuitiva e Personalizável**: Adapte o planejamento ao estilo e preferências do grupo.
- **Acompanhamento em Tempo Real**: Veja o que está sendo realizado no cronograma enquanto a viagem acontece.

## Requisitos do Projeto

### Funcionais

1. Permitir que usuários criem contas e façam login.
2. Criar, editar e excluir viagens.
3. Convidar outros usuários para participarem de uma viagem.
4. Adicionar, editar e excluir atividades no cronograma.
5. Permitir votação ou feedback dos participantes sobre as atividades.
6. Sincronizar as alterações do cronograma em tempo real entre os participantes.
7. Notificar os usuários sobre atualizações no cronograma.
8. Visualizar o cronograma em uma interface gráfica clara e organizada.
9. Oferecer suporte a diferentes fusos horários para viagens internacionais.

### Não Funcionais

1. O aplicativo deve ser responsivo e funcionar em dispositivos móveis Android e IOS.
2. Garantir a segurança dos dados dos usuários com autenticação e criptografia.
3. Oferecer tempos de resposta rápidos, com carregamento de dados em menos de 2 segundos.
4. Escalabilidade para suportar um grande número de usuários simultâneos.
5. Interface intuitiva com navegação fácil para todas as idades.

## Tecnologias Utilizadas

- **Frontend**:
  - Kotlin Multiplatform com Jetpack Compose para interfaces responsivas e amigáveis.
  
- **Backend**:
  - Spring Boot para gerenciamento das APIs e lógica do servidor.
  - Docker para gerenciamento de ambientes de desenvolvimento e produção.
  
- **Comunicação**:
  - Retrofit para integração com o backend.
  - Sockets para comunicação em tempo real com o servidor.
  
- **Banco de Dados**:
  - SQLite para armazenamento local.
  - PostgreSQL ou Firebase (decidir dps) para armazenamento remoto e sincrono.
  
- **Ferramentas**:
  - Android Studio para desenvolvimento e testes.
  - IntelliJ IDEA para backend com Spring Boot.
  - Github Actions para CI/CD

## Como Usar

1. (DISPONÍVEL EM BREVE) Baixe e instale o aplicativo **Travel Planning** na Play Store.
2. Crie ou entre em uma viagem existente.
3. Convide os participantes através de links ou convites no aplicativo.
4. Adicione atividades sugeridas ao cronograma.
5. Organize as atividades conforme a ordem de preferência e o tempo disponível.
6. Curta a viagem com um planejamento eficiente e compartilhado!

## Instalação para Desenvolvimento

### Requisitos

- Android Studio
- IntelliJ IDEA com suporte a Spring Boot
- JDK 17+

### Passos

1. Clone o repositório:
   ```bash
   git clone "link do repositorio"
   ```

2. Configure o backend: (Backend vai estar separado)
   ```bash
   cd travel-planning/backend
   ./mvnw spring-boot:run
   ```

3. Configure o frontend:
   - Abra o projeto no Android Studio.
   - Compile e rode o aplicativo no emulador ou dispositivo físico.

4. Conecte o aplicativo ao backend local ajustando a URL base nas configurações do Retrofit.

5. Como rodar na web:
    ```bash
      ./gradlew wasmJsBrowserRun -t
    ```

## Contribuição

Contribuições são bem-vindas! Siga os passos abaixo para colaborar:

1. Faça um fork do repositório.
2. Crie um branch para sua feature ou correção:
   ```bash
   git checkout -b feature/nova-feature
   ```
3. Envie um pull request explicando suas alterações.

## Contato

Entre em contato para dúvidas ou sugestões:
- Email: seu-email@exemplo.com
- GitHub: [seu-usuario](https://github.com/seu-usuario)

---
Obrigado por usar o **Travel Planning**! Que sua próxima viagem seja inesquecível! 🌍✈️
