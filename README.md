# Calculadora de Área e Perímetro de Figuras Geométricas  

## Descrição  
Este programa permite calcular a área e o perímetro de diferentes figuras geométricas:  
- Retângulo  
- Triângulo  
- Trapézio  
- Círculo  

O usuário pode incluir quantas figuras quiser e listar suas respectivas áreas e perímetros.  

## Funcionalidades  
- **Incluir figuras**: O usuário pode fornecer as dimensões das figuras e armazená-las no sistema.  
- **Calcular área e perímetro**: O programa calcula automaticamente a área e o perímetro das figuras cadastradas.  
- **Listar todas as figuras cadastradas**: Exibe os cálculos de todas as figuras inseridas.  
- **Menu interativo**: Interface de console simples para navegação.  

## Tecnologias Utilizadas  
- Java  
- Conceitos de Orientação a Objetos (POO)  
- Uso de classes abstratas e herança  

## Estrutura do Código  
O projeto é composto pelas seguintes classes:  
- **`Menu`**: Gerencia a interação com o usuário e apresenta o menu.  
- **`Forma`**: Classe abstrata que define os métodos `area()` e `perimetro()`.  
- **`Retangulo, Triangulo, Trapezio e Circulo`**: Implementam a classe `Forma` e calculam área e perímetro de cada figura.  

## Como Executar  
1. Clone o repositório do projeto para sua máquina.
2. Importe o projeto para sua IDE de preferência (Eclipse, IntelliJ, NetBeans, etc.).
3. Execute a classe `Main` diretamente pela IDE.
4. Utilize o menu para interagir com o sistema.
